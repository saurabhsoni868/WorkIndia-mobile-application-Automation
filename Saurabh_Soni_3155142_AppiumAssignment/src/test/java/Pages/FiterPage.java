package Pages;
import org.apache.log4j.Logger;

import Base.BaseClass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class FiterPage extends BaseClass {

	public FiterPage(AndroidDriver driver) {
		super(driver);
	}

	
	public final static Logger logger = Logger.getLogger(FiterPage.class);
	
	@AndroidFindBy(xpath = "//android.widget.GridView/android.widget.FrameLayout[1]/android.widget.CheckBox")
	private AndroidElement interested_field2;

	@AndroidFindBy(xpath = "//*[@text='Business Development']")
	private AndroidElement interested_field1;

	@AndroidFindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/cb_fresher")
	private static AndroidElement experience_level;

	@AndroidFindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/rg_male")
	private static AndroidElement gender;

	@AndroidFindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/btn_apply")
	private static AndroidElement apply_button;

	@AndroidFindBy(xpath = "//android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout")
	private static AndroidElement selected_job;

	public void chooseInterestedAreas() {
		interested_field1.click();
		interested_field2.click();
		logger.info(prop.getProperty("interest"));
	}

	public static void selectExperience() {
		experience_level.click();
		logger.info(prop.getProperty("experience"));
	}

	public static void selectGender() {
		gender.click();
		logger.info(prop.getProperty("gen"));
	}

	public static void clickApply() {
		apply_button.click();
		logger.info(prop.getProperty("apply_btn"));
	}

	public static void clickSelectedJob() {
		selected_job.click();
	}
}
