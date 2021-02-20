package Pages;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;

import Base.BaseClass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class JobSearchPage extends BaseClass {

	public JobSearchPage(AndroidDriver driver) {
		super(driver);
	}
	
	
	public final static Logger logger = Logger.getLogger(JobSearchPage.class);

	@AndroidFindBy(xpath = "//android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ImageView")
	private AndroidElement job_button;

	@AndroidFindBy(xpath = "//*[@text='Filter']")
	private AndroidElement filter_option;

	public void clickJobOrFilter() {
		job_button.click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		filter_option.click();
		
		logger.info(prop.getProperty("job_fil"));
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
}
