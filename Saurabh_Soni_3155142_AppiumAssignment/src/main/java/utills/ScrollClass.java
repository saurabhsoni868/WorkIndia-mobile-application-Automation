package utills;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

import org.openqa.selenium.Dimension;

import Base.BaseClass;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class ScrollClass extends BaseClass{

public ScrollClass(AndroidDriver driver) {
		super(driver);
	
	}

public  void verticalSwipeByPercentage(double startPercentage, double endPercentage, double anchorPercentage) {
		
		Dimension size = driver.manage().window().getSize();
		int anchor = (int)(size.width * anchorPercentage);
		int startpoint = (int)(size.height * startPercentage);
		int endpoint = (int)(size.height * endPercentage);
		
		new TouchAction(driver).press(point(anchor,startpoint)).waitAction(waitOptions(ofMillis(1000))).moveTo(point(anchor,endpoint)).release().perform();
	}
	
	
}
