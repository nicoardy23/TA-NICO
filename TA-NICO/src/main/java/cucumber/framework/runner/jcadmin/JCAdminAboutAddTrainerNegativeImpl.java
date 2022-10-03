package cucumber.framework.runner.jcadmin;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.jcadmin.JCAdminAboutPage;

public class JCAdminAboutAddTrainerNegativeImpl {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private static JCAdminAboutPage JCAbout;
	String strDelay = Constants.GLOB_PARAM_DELAY;
	
	public JCAdminAboutAddTrainerNegative() {
		driver = JCAdminHooks.driver;
		extentTest = JCAdminHooks.extentTest;
		driver.get(Constants.URL_JCADMIN_LOGIN);
		JCAbout = new JCAdminAboutPage();
	}
}
