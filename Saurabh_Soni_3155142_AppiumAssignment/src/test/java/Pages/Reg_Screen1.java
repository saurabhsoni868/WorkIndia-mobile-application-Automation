package Pages;

import org.apache.log4j.Logger;

import Base.BaseClass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Reg_Screen1 extends BaseClass {

	public Reg_Screen1(AndroidDriver driver) {
		super(driver);
	}
	
	
	
	public final static Logger logger = Logger.getLogger(Reg_Screen1.class);

	@AndroidFindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/et_name")
	private AndroidElement name;

	@AndroidFindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/et_number")
	private AndroidElement number;

	@AndroidFindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/btn_submit")
	private AndroidElement button;

	public void fillName(String username) {

		name.sendKeys(username);
		logger.info(prop.getProperty("Name_Enter"));
		
	}

	public void fillMobileNum(String num) {

		number.sendKeys(num);
		logger.info(prop.getProperty("phone_Entered"));
	}

	public void submit() {

		button.click();
		logger.info(prop.getProperty("subBtnClick"));
	}

}
