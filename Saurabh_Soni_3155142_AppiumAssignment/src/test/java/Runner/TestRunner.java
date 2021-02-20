package Runner;

import java.sql.Driver;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import utills.AppiumServer;

@CucumberOptions(
		features = "src/test/java/Features",        // location of feature files
		glue = {"StepDefinations"},				  //  location of step definition files 
		plugin = {"pretty","html:test-out",
				  "junit:junit_xml/junit.xml" , 
				  "com.cucumber.listener.ExtentCucumberFormatter:Report/Extent_Test_report.html"},    // PlugIn that is used to generate different type of report
		monochrome = true,						//  to get the result in to the console
		dryRun = false,                         // used for mapping the feature files steps with all the methods of step definition
		strict = true,                          // it will fail the execution if all the steps of feature file don't have their step definition method
		tags= {"@tag1 ,@tag2 ,@tag3 ,@tag4 ,@tag5 ,@tag6"}
		)

public class TestRunner extends AbstractTestNGCucumberTests {
	
	@BeforeSuite
	public void startAppium() {
		AppiumServer.start();
	}

	@AfterSuite
	public void stopAppium() {
		AppiumServer.stop();
		
	}

}
