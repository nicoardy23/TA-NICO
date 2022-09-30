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
	private static JCAdminAboutPage JCAbout;
	String strDelay = Constants.GLOB_PARAM_DELAY;
	
	public JCAdminAboutFindAndMoveTrainerImpl() {
		driver = JCAdminHooks.driver;
		extentTest = JCAdminHooks.extentTest;
		driver.get(Constants.URL_JCADMIN_LOGIN);
		JCAbout = new JCAdminAboutPage();
	}
	
	/*==========================*/
	/*Test cari trainer*/
	/*==========================*/
	@When("Admin memasukkan nama trainer yang ingin dicari")
	public void admin_memasukkan_nama_trainer_yang_ingin_dicari() {
		JCAbout.goToAbout();
	    JCAbout.cariTrainer("Anonim23");
	    extentTest.log(LogStatus.PASS, "Admin memasukkan nama trainer yang ingin dicari");
	}

	@When("Admin menekan tombol enter pada keyboard")
	public void admin_menekan_tombol_enter_pada_keyboard() {
	    JCAbout.tekanEnter();
	    extentTest.log(LogStatus.PASS, "Admin menekan tombol enter pada keyboard");
	}

	@Then("Admin dapat menemukan data trainer")
	public void admin_dapat_menemukan_data_trainer() {
	    assertTrue(JCAbout.getValidCari().contains("Anonim23"));
	    extentTest.log(LogStatus.PASS, "Admin dapat menemukan data trainer");
	}
	
	/*==========================*/
	/*Berpindah Halaman*/
	/*==========================*/
	@When("Admin menekan tombol halaman")
	public void admin_menekan_tombol_halaman() {
	    JCAbout.goToAbout();
	    JCAbout.pindahHalaman();
	    extentTest.log(LogStatus.PASS, "Admin menekan tombol halaman");
	}

	@Then("Halaman berpindah")
	public void halaman_berpindah() {
	    assertTrue(JCAbout.getValidPindah() != "1");
	    extentTest.log(LogStatus.PASS, "Halaman berpindah");
	}
}
