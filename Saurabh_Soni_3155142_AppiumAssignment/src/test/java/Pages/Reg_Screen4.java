package Pages;

import org.apache.log4j.Logger;

import Base.BaseClass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Reg_Screen4 extends BaseClass {

	public Reg_Screen4(AndroidDriver driver) {
		super(driver);
	}
	
	
	public final static Logger logger = Logger.getLogger(Reg_Screen4.class);

	@AndroidFindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/et_skill_1")
	private AndroidElement skill;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.CheckBox")
	private AndroidElement typingspeed;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.CheckBox")
	private AndroidElement excel;

	@AndroidFindBy(id = "android:id/button1")
	private AndroidElement btn1;

	@AndroidFindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/et_course")
	private AndroidElement digree;

	@AndroidFindBy(xpath = "//android.widget.ListView/android.widget.CheckedTextView[11]")
	private AndroidElement bsc_Maths;

	@AndroidFindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/btn_done")
	private AndroidElement submit_button;

	@AndroidFindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/btn_english")
	private AndroidElement english;

	public void skills() {

		skill.click();
		
	}

	public void typingAndExcel() {

		typingspeed.click();
		excel.click();
		btn1.click();
		
		
		logger.info(prop.getProperty("office_skill"));
	}

	public void clickDigree() {

		digree.click();
		
	}
	
	public void selDigree() {
		bsc_Maths.click();
		
		logger.info(prop.getProperty("digree"));
	 }

	public void submitagin() {

		submit_button.click();
	}

	public void chooseLanguage() {

		english.click();
		
		logger.info(prop.getProperty("app_lang"));
	}

}
