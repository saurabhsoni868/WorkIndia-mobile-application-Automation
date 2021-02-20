package StepDefinations;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.cucumber.listener.Reporter;
import com.google.common.io.Files;

import Base.BaseClass;
import Pages.Reg_Screen1;
import Pages.Reg_Screen2;
import Pages.Reg_Screen3;
import Pages.Reg_Screen4;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import utills.AppiumServer;
import utills.CommonUtils;
import utills.ScrollClass;

public class RegistrationStepDef {

	public static AndroidDriver<MobileElement> driver;

	Reg_Screen1 reg_1 = null;
	Reg_Screen2 reg_2 = null;
	Reg_Screen3 reg_3 = null;
	Reg_Screen4 reg_4 = null;

	@SuppressWarnings("unchecked")

	@Before
	public void startAppium() {

		driver = CommonUtils.getAndroidDriver();
	}

	@After
	public void stopAppium(Scenario scenario) throws IOException {

		if (scenario.isFailed()) {

			String screenshotName = scenario.getName().replaceAll(" ", "_");
			
			//This takes a screenshot from the driver at save it to the specified location
			//File sourcePath = ((TakesScreenshot) testContext.getWebDriverManager().getDriver()).getScreenshotAs(OutputType.FILE);

			 TakesScreenshot scrShot =((TakesScreenshot)driver);
			File sourcePath = scrShot.getScreenshotAs(OutputType.FILE);

			 //Building up the destination path for the screenshot to save
			//Also make sure to create a folder 'screenshots' with in the cucumber-report folder
			File destinationPath = new File(System.getProperty("user.dir") + "/cucumber-reports/screenshots/" + screenshotName + ".png");

			 //Copy taken screenshot from source location to destination location
			FileUtils.copyFile(sourcePath, destinationPath);

			 //This attach the specified screenshot to the test
			Reporter.addScreenCaptureFromPath(destinationPath.toString());
		}

		driver.quit();
		}

	

	@Given("^User has already on Registration page$")
	public void user_has_already_on_Registration_page() throws Throwable {

//		        // change the screen orientation to landscape
//				driver.rotate(ScreenOrientation.LANDSCAPE);
//				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//
//				// change the screen orientation to portrait
//				driver.rotate(ScreenOrientation.PORTRAIT);
//				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	}

	@When("^User enter the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_the_and(String arg1, String arg2) throws Throwable {
		reg_1 = new Reg_Screen1(driver);

		String actual_text = driver.findElement(By.xpath(
				"//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[1]"))
				.getText().trim();

		Assert.assertEquals(actual_text, "Job Search");

		reg_1.fillName(arg1);
		reg_1.fillMobileNum(arg2);

	}

	@When("^User click on Submit button$")
	public void user_click_on_Submit_button() throws Throwable {

		reg_1 = new Reg_Screen1(driver);
		reg_1.submit();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}

	@Then("^User should move to Next Registration Page$")
	public void user_should_move_to_Next_Registration_Page() throws Throwable {

	}

	// ----------------------------------------------------------------------------------------//

	@Given("^User should be on Choose City Page$")
	public void user_should_be_on_Choose_City_Page() throws Throwable {

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	}

	@When("^User select DELHI$")
	public void user_select_DELHI() throws Throwable {
		reg_2 = new Reg_Screen2(driver);
		reg_2.chooseCity();

	}

	@Then("^User enter Area \"([^\"]*)\"$")
	public void user_enter_Area(String arg1) throws Throwable {
		reg_2 = new Reg_Screen2(driver);
		reg_2.fillArea(arg1);

	}

	@Then("^User click on the Submit button$")
	public void user_click_on_the_Submit_button() throws Throwable {
		reg_2 = new Reg_Screen2(driver);
		reg_2.submitagin();
	}

	@Then("^User should be moved to next Page$")
	public void user_should_be_moved_to_next_Page() throws Throwable {

	}

	// --------------------------------------------------------------------------------------------//

	@Given("^User should be on Please fill more Details$")
	public void user_should_be_on_Please_fill_more_Details() throws Throwable {

	}

	@When("^User Select Gender , Qualifications , school medium and Fluency in english$")
	public void user_Select_Gender_Qualifications_school_medium_and_Fluency_in_english() throws Throwable {

		reg_3 = new Reg_Screen3(driver);

		String actual_text = driver.findElement(By.id("in.workindia.nileshdungarwal.workindiaandroid:id/tv_my_gender"))
				.getText().trim();

		Assert.assertEquals(actual_text, "My Gender *");

		reg_3.selectGender();
		reg_3.selectQualification();
		reg_3.selectQualificationMed();
		reg_3.selectEnglishFluen();

	}

	@When("^About Experience , Age and Area of Interest$")
	public void about_Experience_Age_and_Area_of_Interest() throws Throwable {

		ScrollClass obj1 = new ScrollClass(driver);
		obj1.verticalSwipeByPercentage(0.70, 0.10, 0.50);

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		reg_3 = new Reg_Screen3(driver);
		reg_3.fresher();
		reg_3.ageSel();
		reg_3.interests();

	}

	@When("^Click on Submit Button$")
	public void click_on_Submit_Button() throws Throwable {

		ScrollClass obj1 = new ScrollClass(driver);
		obj1.verticalSwipeByPercentage(0.70, 0.10, 0.50);

		reg_3 = new Reg_Screen3(driver);
		reg_3.submitagin();

	}

	@Then("^Choose your Area of Skills and Digree$")
	public void choose_your_Area_of_Skills_and_Digree() throws Throwable {

		reg_4 = new Reg_Screen4(driver);

		Assert.assertTrue(
				driver.findElement(By.id("in.workindia.nileshdungarwal.workindiaandroid:id/tv_profile_heading"))
						.getText().contains("Aapke Bare Me Bataye"));

		reg_4.skills();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		reg_4.typingAndExcel();
		reg_4.clickDigree();
		reg_4.selDigree();
	}

	@Then("^Click on Submit button$")
	public void click_on_Submit_button() throws Throwable {

		reg_4 = new Reg_Screen4(driver);
		reg_4.submitagin();

	}

	@Then("^Choose Language$")
	public void choose_Language() throws Throwable {

		reg_4 = new Reg_Screen4(driver);
		reg_4.chooseLanguage();
		Thread.sleep(4000);
	}

}
