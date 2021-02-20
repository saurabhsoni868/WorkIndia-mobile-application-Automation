package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;

import Pages.FiterPage;
import Pages.JobSearchPage;
import Pages.SelectedJobPage;
import cucumber.api.java.en.Then;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import utills.ScrollClass;

public class FindJobStepDef {

	AndroidDriver<MobileElement> driver = RegistrationStepDef.driver;
	JobSearchPage obj1 = null;
	FiterPage obj2 = null;
	SelectedJobPage obj3 = null;

	@Then("^User clicks on Jobs and Filters option$")
	public void user_clicks_on_Jobs_and_Filters_option() throws Throwable {
		JobSearchPage obj1 = new JobSearchPage(driver);
		obj1.clickJobOrFilter();
	}

	@Then("^User chooses the Interested Areas$")
	public void user_chooses_the_Interested_Areas() throws Throwable {
		FiterPage obj2 = new FiterPage(driver);
		
		
		String actual_text = driver.findElement(By.xpath("//android.widget.LinearLayout/android.widget.TextView"))
				.getText().trim();

		Assert.assertEquals(actual_text, "I Am Interested In");
		
		
		obj2.chooseInterestedAreas();
		ScrollClass obj1 = new ScrollClass(driver);
		obj1.verticalSwipeByPercentage(0.70, 0.10, 0.50);
	}

	@Then("^User selects Experience and Qualification level$")
	public void user_selects_Experience_and_Qualification_level() throws Throwable {
		
		
		String actual_text = driver.findElement(By.xpath("//*[@text='I Am Fresher/Experience']")).getText().trim();

		Assert.assertEquals(actual_text, "I Am Fresher/Experience");
		
		FiterPage.selectExperience();
	}

	@Then("^User selects the Gender$")
	public void user_selects_the_Gender() throws Throwable {
		FiterPage.selectGender();
	}

	@Then("^User clicks on Apply button$")
	public void user_clicks_on_Apply_button() throws Throwable {
		FiterPage.clickApply();
	}

	@Then("^User choose a job among filtered options$")
	public void user_choose_a_job_among_filtered_options() throws Throwable {
		FiterPage.clickSelectedJob();
	}

	@Then("^User clicks on Back button$")
	public void user_clicks_on_Back_button() throws Throwable {
		ScrollClass obj1 = new ScrollClass(driver);
		obj1.verticalSwipeByPercentage(0.70, 0.10, 0.50);
		SelectedJobPage obj3 = new SelectedJobPage(driver);
		obj3.clickBackbtn();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
}
