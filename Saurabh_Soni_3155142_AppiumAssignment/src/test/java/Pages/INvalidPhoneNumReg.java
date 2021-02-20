package Pages;

import java.util.List;

import org.apache.log4j.Logger;

import Base.BaseClass;
import cucumber.api.DataTable;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class INvalidPhoneNumReg extends BaseClass {

	
	public final static Logger logger = Logger.getLogger(INvalidPhoneNumReg.class);
	
	public INvalidPhoneNumReg(AndroidDriver  driver) {
		super(driver);
	}
	
	@AndroidFindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/et_name")
	private AndroidElement name;

	@AndroidFindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/et_number")
	private AndroidElement number;
	
	
	public void enterInvalidNumber(DataTable userNameMob) {
		
		List<List<String>> data = userNameMob.raw();
		name.sendKeys(data.get(0).get(0));
		
		logger.info(prop.getProperty("Name_Enter"));
		
		number.sendKeys(data.get(0).get(1));
		
		logger.info(prop.getProperty("inv_phn"));
	}
	
}
