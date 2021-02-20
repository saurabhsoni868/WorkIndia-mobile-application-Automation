package Pages;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;

import Base.BaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ProfileInfoUpdateScreen extends BaseClass {

	
	public ProfileInfoUpdateScreen(AndroidDriver  driver) {
		super(driver);
	}
	
	
	public final static Logger logger = Logger.getLogger(ProfileInfoUpdateScreen.class);
	
	@AndroidFindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/navigation_ham_menu")
	private AndroidElement profileIcon;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout[2]/android.widget.LinearLayout")
	private AndroidElement myProfileIcon;

	@AndroidFindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/ll_qualification")
	private AndroidElement Qualification;

	@AndroidFindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/rb_hsc")
	private AndroidElement SelectedQualification;

	@AndroidFindBy(id = "android:id/button1")
	private AndroidElement SelectedQualificationBtn;

	@AndroidFindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/ll_back")
	private AndroidElement BackButton;

	public void ClickOnProfile() {
		profileIcon.click();
		
		logger.info(prop.getProperty("prof_btn"));
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		myProfileIcon.click();
		
		logger.info(prop.getProperty("my_pro"));
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}


	public void UpdateQualification() {
		Qualification.click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		SelectedQualification.click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		SelectedQualificationBtn.click();
		
		logger.info(prop.getProperty("upd_qual"));
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}

	public void PressBackButton() {
		BackButton.click();
	}
}
