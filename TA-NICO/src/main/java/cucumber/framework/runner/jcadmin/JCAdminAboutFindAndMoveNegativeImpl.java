package cucumber.framework.runner.jcadmin;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.jcadmin.JCAdminAboutPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JCAdminAboutFindAndMoveNegativeImpl {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private static JCAdminAboutPage jcAbout;
	String strDelay = Constants.GLOB_PARAM_DELAY;
	
	public JCAdminAboutFindAndMoveNegativeImpl() {
		driver = JCAdminHooks.driver;
		extentTest = JCAdminHooks.extentTest;
		driver.get(Constants.URL_JCADMIN_LOGIN);
		jcAbout = new JCAdminAboutPage();
	}
	
	/*============================================*/
	/*Test Cari Data Dengan Nama 500 Karakter Full*/
	/*============================================*/
	@When("^(.*) Admin mencari (.*) pada kolom pencarian (.*)$")
	public void kode_admin_mencari_cari_pada_kolom_pencarian_case(String kode, String cari, String kasus) {
		jcAbout.goToAbout();
	    jcAbout.cariTrainer(cari);
	    extentTest.log(LogStatus.PASS, "AB010N Admin mencari nama trainer pada kolom pencarian " + kasus);
	}

	@When("^(.*) Admin menekan tombol enter pada keyboard (.*)$")
	public void kode_admin_menekan_tombol_enter_pada_keyboard_case(String kode, String kasus) {
		jcAbout.tekanEnter();
	    extentTest.log(LogStatus.PASS, kode + " Admin menekan tombol enter pada keyboard " + kasus);
	}

	@Then("^(.*) Admin menemukan (.*) atau tidak (.*)")
	public void kode_admin_menemukan_cari_atau_tidak_case(String kode, String cari, String kasus) {
		if (kasus.equals("sebagian nama500 karakter")) {
			assertTrue(jcAbout.getValidNamaTrainerLength().contains(cari));
		} else {
			assertTrue(jcAbout.getInvalidNamaTrainerLength().contains("Total Search : 0 Data"));
		}
	    extentTest.log(LogStatus.PASS, kode + " AB010N Admin menemukan " + cari + " atau tidak " + kasus);
	}
	
	

}
