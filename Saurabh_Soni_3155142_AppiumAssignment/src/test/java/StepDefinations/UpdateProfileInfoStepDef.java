package StepDefinations;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import Pages.ProfileInfoUpdateScreen;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import utills.CommonUtils;

public class UpdateProfileInfoStepDef {

	AndroidDriver<MobileElement> driver = RegistrationStepDef.driver;

	ProfileInfoUpdateScreen profileinfo = null;

	//public Scenario scenario;

	@Then("^User will Click on Profile Icon, User Will Click On My Profile Icon$")
	public void user_will_Click_on_Profile_Icon_User_Will_Click_On_My_Profile_Icon() throws Throwable {
		profileinfo = new ProfileInfoUpdateScreen(driver);
		profileinfo.ClickOnProfile();
	}

	@Then("^User Will Select Qualification$")
	public void user_Will_Select_Qualification() throws Throwable {
		profileinfo = new ProfileInfoUpdateScreen(driver);
		
		String actual_text = driver.findElement(By.xpath("//*[@text='Upload Your Own Resume']")).getText().trim();

		Assert.assertEquals(actual_text, "Upload Your Own Resume");
		
		profileinfo.UpdateQualification();
	}

	@Then("^User will click on Back button$")
	public void user_will_click_on_Back_button() throws Throwable {
		profileinfo = new ProfileInfoUpdateScreen(driver);
		profileinfo.PressBackButton();

	}

}
