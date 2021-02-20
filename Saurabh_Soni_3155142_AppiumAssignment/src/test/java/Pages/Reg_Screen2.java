package Pages;

import org.apache.log4j.Logger;

import Base.BaseClass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Reg_Screen2 extends BaseClass {

	public Reg_Screen2(AndroidDriver driver) {
		super(driver);
	}
	
	
	public final static Logger logger = Logger.getLogger(Reg_Screen2.class);

	@AndroidFindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/rb_delhi")
	private AndroidElement cityname;

	@AndroidFindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/act_auto_complete")
	private AndroidElement area_name;

	@AndroidFindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/btn_done")
	private AndroidElement submit_button;

	public void chooseCity() {

		cityname.click();

		logger.info(prop.getProperty("city"));
	}

	public void fillArea(String area) {

		area_name.sendKeys(area);
		
		logger.info(prop.getProperty("all_Det"));
	}

	public void submitagin() {

		submit_button.click();
		logger.info(prop.getProperty("subBtnClick"));
	}

}
