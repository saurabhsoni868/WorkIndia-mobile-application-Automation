package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BaseClass {
	
	protected AndroidDriver driver;
	
	 public BaseClass(AndroidDriver driver) {
	  this.driver = driver;
	  PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	 }
	 
	 
	 
	 // Code To Use Property File--------------------------------------------------------

		static File file = new File("./Resources/propertiesFile/configuration.properties");
		static FileInputStream fi = null;
		public static Properties prop = new Properties();
		static {
			try {
				fi = new FileInputStream(file);

			} catch (FileNotFoundException e) {
				e.printStackTrace();

			}
			try {
				prop.load(fi);
			} catch (IOException el) {
				el.printStackTrace();

			}
		}

}
