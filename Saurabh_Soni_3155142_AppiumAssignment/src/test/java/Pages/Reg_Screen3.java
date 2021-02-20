package Pages;

import org.apache.log4j.Logger;

import Base.BaseClass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Reg_Screen3 extends BaseClass {

	public Reg_Screen3(AndroidDriver driver) {
		super(driver);
	}
	
	
	public final static Logger logger = Logger.getLogger(Reg_Screen3.class);

	@AndroidFindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/rg_male")
	private AndroidElement gender_male;

	@AndroidFindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/rb_graduate")
	private AndroidElement gradu_Quali;

	@AndroidFindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/cb_hindi")
	private AndroidElement hindi_medium;

	@AndroidFindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/rg_eng_level_2")
	private AndroidElement english_lev;

	@AndroidFindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/cb_fresher")
	private AndroidElement fresh;

	@AndroidFindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/et_age")
	private AndroidElement open_Age;

	@AndroidFindBy(xpath = "//android.widget.TextView[9]")
	private AndroidElement sel_Age;

	@AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.CheckBox")
	private AndroidElement interest1;

	@AndroidFindBy(xpath = "//android.widget.FrameLayout[2]/android.widget.CheckBox")
	private AndroidElement interest2;

	@AndroidFindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/btn_done")
	private AndroidElement submit_button;

	public void selectGender() {
		gender_male.click();
		
		logger.info(prop.getProperty("gen"));
	}

	public void selectQualification() {

		gradu_Quali.click();
		
		logger.info(prop.getProperty("quali"));
	}

	public void selectQualificationMed() {

		hindi_medium.click();
		
		logger.info(prop.getProperty("edu_med"));
	}

	public void selectEnglishFluen() {

		english_lev.click();
		
		logger.info(prop.getProperty("eng_flu"));
	}

	public void fresher() {

		fresh.click();
		
		logger.info(prop.getProperty("experience"));
	}

	public void ageSel() throws InterruptedException {

		open_Age.click();
		
		
		sel_Age.click();
		logger.info(prop.getProperty("age"));
	}

	public void interests() {

		interest1.click();
		interest2.click();
		
		logger.info(prop.getProperty("interest"));
	}

	public void submitagin() {

		submit_button.click();
		logger.info(prop.getProperty("subBtnClick"));
	}

}
