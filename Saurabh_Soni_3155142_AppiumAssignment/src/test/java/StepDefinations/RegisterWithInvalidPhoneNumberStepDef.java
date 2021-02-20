package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;

import Pages.INvalidPhoneNumReg;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class RegisterWithInvalidPhoneNumberStepDef {

	AndroidDriver<MobileElement> driver = RegistrationStepDef.driver;
	INvalidPhoneNumReg InvalidReg = null;
	
	@When("^User Enters Name and Mobile_num$")
	public void user_Enters_Name_and_Mobile_num(DataTable arg1) throws Throwable {
	   
		InvalidReg = new INvalidPhoneNumReg(driver);
		
		InvalidReg.enterInvalidNumber(arg1);
		
String actual_text = driver.findElement(By.xpath("//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[1]")).getText().trim();
		
		Assert.assertEquals(actual_text,"Job Search1");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
	}

	@Then("^the User will not be Registered$")
	public void the_User_will_not_be_Registered() throws Throwable {
	   
		
		
		
	}
	
	
	
}
