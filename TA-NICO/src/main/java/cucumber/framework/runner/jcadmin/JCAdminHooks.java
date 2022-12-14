package cucumber.framework.runner.jcadmin;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.connection.DriverSingleton;
import cucumber.framework.constant.Constants;
import cucumber.framework.scenariotest.jcadmin.JCAdminTesting;
import cucumber.framework.utils.Utils;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class JCAdminHooks {
	public static WebDriver driver;
	public static ExtentTest extentTest;
	public static ExtentReports reports = new ExtentReports("target/jcadmin/extentreport/jcadmin-about-contact-messages-outline-xr.html");
	private static JCAdminTesting[] tests = JCAdminTesting.values();
	//All
//	private static final int[] DATA_OUTLINE = {1,2,8,3,1,1,1,1,1,1,1,1,5,2,1,1,1,1,3,3,3,1,1,1,1,2,1,1,6,2,2,1,5,5,2,1,4,4,4,4,5};
	
	//About
//	private static final int[] DATA_OUTLINE = {1,2,8,1,1,2,1,1,1,1};
	private static final int[] DATA_OUTLINE = {3,1,1,1,1,1,1,5,3,3,3,1,1,1,1,2};

	//Blog
//	private static final int[] DATA_OUTLINE = {1,1,6,2,2};

	//Contact Messages
//	private static final int[] DATA_OUTLINE = {1,5,5,2,1};
//	private static final int[] DATA_OUTLINE = {4,4,4,4,5};
	private String testReport = "";
	
	@Before
	public void setUp() {		
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		testReport = tests[Utils.testCount].getTestName();
		extentTest = reports.startTest(testReport);		
		if(Utils.countOutline==DATA_OUTLINE[Utils.testCount])
		{
			Utils.countOutline=0;
			Utils.testCount++;
		}
		Utils.countOutline++;
	}
	
	@AfterStep
	public void getResultStatus(Scenario scenario) throws IOException {
		if(scenario.isFailed()) {
			String screenshotPath = Utils.getScreenshot(driver, "JCAdmin_SceneOutlineHooks"+scenario.getName().replace(" ", "_"));
			extentTest.log(LogStatus.FAIL, scenario.getName()+"\n"
					+extentTest.addScreenCapture(screenshotPath));;
		}
	}
	
	@After
	public void closeObject() {
		reports.endTest(extentTest);
		reports.flush();
	}
	
	
	
//	@AfterTest
	@AfterAll
	public static void closeBrowser() {
		delay(2);
		DriverSingleton.closeObjectInstance();
	}
	
	public static void delay(int detik) {
		try {
			Thread.sleep(1000*detik);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void scroll(int vertical) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,"+vertical+")");
	}
}
