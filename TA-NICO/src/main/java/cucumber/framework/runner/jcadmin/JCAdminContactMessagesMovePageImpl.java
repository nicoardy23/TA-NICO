package cucumber.framework.runner.jcadmin;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.jcadmin.JCAdminContactMessages;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JCAdminContactMessagesMovePageImpl {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private static JCAdminContactMessages JCContact;
	String strDelay = Constants.GLOB_PARAM_DELAY;
	
	public JCAdminContactMessagesMovePageImpl() {
		driver = JCAdminHooks.driver;
		extentTest = JCAdminHooks.extentTest;
		driver.get(Constants.URL_JCADMIN_LOGIN);
		JCContact = new JCAdminContactMessages();
	}
	
	/*====================================*/
	/*Test Berpindah Halaman List Messages*/
	/*====================================*/
	@When("^(.*) Admin menekan tombol angka (.*) halaman Messages$")
	public void kode_admin_menekan_tombol_angka_angka_halaman_messages(String kode, String hlm) {
	    JCContact.goToContactMessages();
	    JCContact.pindahHalaman(hlm);
	    extentTest.log(LogStatus.PASS, kode + " Admin menekan tombol angka " + hlm + " halaman Messages");
	}

	@Then("^(.*) Halaman Messages berpindah ke (.*)$")
	public void kode_halaman_messages_berpindah_ke_angka(String kode, String hlm) {
		 assertTrue(JCContact.getValidPindah().equals(hlm));
		 extentTest.log(LogStatus.PASS, kode + " Halaman Messages berpindah ke " + hlm);
	}
}
