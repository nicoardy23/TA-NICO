package cucumber.framework.runner.jcadmin;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.jcadmin.JCAdminAboutPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JCAdminAboutFindAndMoveTrainer {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private static JCAdminAboutPage JCAbout;
	private static JCAdminAboutAddTrainerImpl add;
	String strDelay = Constants.GLOB_PARAM_DELAY;
	
	public JCAdminAboutFindAndMoveTrainer() {
		driver = JCAdminHooks.driver;
		extentTest = JCAdminHooks.extentTest;
		driver.get(Constants.URL_JCADMIN_LOGIN);
		JCAbout = new JCAdminAboutPage();
		add = new JCAdminAboutAddTrainerImpl();
	}
	
	/*==========================*/
	/*Test cari trainer*/
	/*==========================*/
	@When("Admin memasukkan nama trainer yang ingin dicari")
	public void admin_memasukkan_nama_trainer_yang_ingin_dicari() {
		add.admin_login_dan_membuka_halaman_about();
	    JCAbout.cariTrainer("Anonim23");
	}

	@When("Admin menekan tombol enter pada keyboard")
	public void admin_menekan_tombol_enter_pada_keyboard() throws AWTException {
	    JCAbout.tekanEnter();
	}

	@Then("Admin dapat menemukan data trainer")
	public void admin_dapat_menemukan_data_trainer() {
	    assertTrue(JCAbout.getValidCari().contains("Anonim23"));
	}
	
	/*==========================*/
	/*Berpindah Halaman*/
	/*==========================*/
	@When("Admin menekan tombol halaman")
	public void admin_menekan_tombol_halaman() {
	    add.admin_login_dan_membuka_halaman_about();
	    JCAbout.pindahHalaman();
	}

	@Then("Halaman berpindah")
	public void halaman_berpindah() {
	    assertTrue(JCAbout.getValidPindah() != "1");
	}
}
