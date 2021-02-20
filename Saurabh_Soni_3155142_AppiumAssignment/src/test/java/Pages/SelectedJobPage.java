package Pages;
import org.apache.log4j.Logger;

import Base.BaseClass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SelectedJobPage extends BaseClass {

	public SelectedJobPage(AndroidDriver driver) {
		super(driver);
	}
	
	
	public final static Logger logger = Logger.getLogger(SelectedJobPage.class);

	@AndroidFindBy(xpath = "//*[@class='android.widget.ImageButton']")
	private AndroidElement back_button;

	public void clickBackbtn() {
		back_button.click();
		
		logger.info(prop.getProperty("back_btn"));
	}

}
