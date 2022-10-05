package cucumber.framework.runner.jcadmin;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.jcadmin.JCAdminAboutPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JCAdminAboutFindAndMoveTrainerImpl {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private static JCAdminAboutPage jcAbout;
	String strDelay = Constants.GLOB_PARAM_DELAY;
	
	public JCAdminAboutFindAndMoveTrainerImpl() {
		driver = JCAdminHooks.driver;
		extentTest = JCAdminHooks.extentTest;
		driver.get(Constants.URL_JCADMIN_LOGIN);
		jcAbout = new JCAdminAboutPage();
	}
	
	/*=================*/
	/*Test cari trainer*/
	/*=================*/
	@When("AB012P Admin memasukkan nama trainer yang ingin dicari")
	public void ab012p_admin_memasukkan_nama_trainer_yang_ingin_dicari() {
		jcAbout.goToAbout();
	    jcAbout.cariTrainer("Zanonim23");
	    extentTest.log(LogStatus.PASS, "AB012P Admin memasukkan nama trainer yang ingin dicari");
	}

	@When("AB012P Admin menekan tombol enter pada keyboard")
	public void ab012p_admin_menekan_tombol_enter_pada_keyboard() {
	    jcAbout.tekanEnter();
	    extentTest.log(LogStatus.PASS, "AB012P Admin menekan tombol enter pada keyboard");
	}

	@Then("AB012P Admin dapat menemukan data trainer")
	public void ab012p_admin_dapat_menemukan_data_trainer() {
	    assertTrue(jcAbout.getValidCari().contains("nonim23"));
	    extentTest.log(LogStatus.PASS, "AB012P Admin dapat menemukan data trainer");
	}
	
	/*=================*/
	/*Berpindah Halaman*/
	/*=================*/
	@When("AB013P Admin menekan tombol halaman trainer")
	public void ab013p_admin_menekan_tombol_halaman_trainer() {
	    jcAbout.goToAbout();
	    jcAbout.pindahHalaman();
	    extentTest.log(LogStatus.PASS, "AB013P Admin menekan tombol halaman");
	}

	@Then("AB013P Halaman trainer berpindah")
	public void ab013p_halaman_trainer_berpindah() {
	    assertTrue(jcAbout.getValidPindah() != "1");
	    extentTest.log(LogStatus.PASS, "AB013P Halaman berpindah");
	}
}
