package utills;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import Base.BaseClass;
import io.appium.java_client.android.AndroidDriver;

public class CommonUtils {

	public static AndroidDriver getAndroidDriver() {

		AndroidDriver driver = null;
		try {
			
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("deviceName",BaseClass.prop.getProperty("Register_email"));
			capabilities.setCapability("platformName",BaseClass.prop.getProperty("platformName"));
			capabilities.setCapability("appPackage",BaseClass.prop.getProperty("appPackage"));
			capabilities.setCapability("appActivity",BaseClass.prop.getProperty("appActivity"));
			capabilities.setCapability("platformVersion",BaseClass.prop.getProperty("platformVersion"));
			//capabilities.setCapability("noReset", true);
			capabilities.setCapability("skipDeviceInitialization",BaseClass.prop.getProperty("skipDeviceInitialization"));
			capabilities.setCapability("skipServerInstallation", BaseClass.prop.getProperty("skipServerInstallation"));
			capabilities.setCapability("app", BaseClass.prop.getProperty("app"));

			driver = new AndroidDriver(new URL(BaseClass.prop.getProperty("URL")), capabilities);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}

		catch (Exception e) {

			e.printStackTrace();
		}
		
		return driver;

	}

	
	
}
