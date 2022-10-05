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

public class JCAdminAboutEditTrainerImpl {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private JCAdminAboutPage jcAbout;
	String strDelay = Constants.GLOB_PARAM_DELAY;
	
	public JCAdminAboutEditTrainerImpl() {
		driver = JCAdminHooks.driver;
		extentTest = JCAdminHooks.extentTest;
		driver.get(Constants.URL_JCADMIN_LOGIN);
		jcAbout = new JCAdminAboutPage();
	}
	
	/*==========================*/
	/*Test edit data trainer*/
	/*==========================*/
	
	/*------ Edit Publish ------*/
	@When("^(.*) Admin menekan kotak profile trainer publish$")
	public void kode_admin_menekan_kotak_profile_trainer_publish(String kode) {
		jcAbout.goToAbout();
	    jcAbout.editDataTrainer();
	    extentTest.log(LogStatus.PASS, kode + " Admin menekan kotak profile trainer publish");
	}

	@When("^(.*) Admin mengganti status publish trainer ke (.*)$")
	public void kode_admin_mengganti_status_publish_trainer_ke_status(String kode, String stat) {
	    jcAbout.gantiStatus(stat);
	    extentTest.log(LogStatus.PASS, kode + " Admin mengganti status publish ke " + stat);
	}

	@When("^(.*) Admin menekan tombol simpan publish trainer")
	public void kode_admin_menekan_tombol_simpan_publish_trainer(String kode) {
	    jcAbout.simpanData();
	    extentTest.log(LogStatus.PASS, kode + " Admin menekan tombol simpan publish");
	}

	@Then("^(.*) Status publish trainer berubah menjadi (.*)$")
	public void kode_status_publish_trainer_berubah_menjadi_status(String kode, String stat) {
		assertTrue(jcAbout.getValidTambah().contains("berhasil di update"));
		extentTest.log(LogStatus.PASS, kode + " Status publish trainer berubah menjadi "+stat);
	}
	
	/*------ Edit Foto ------*/
	@When("AB016P Admin menekan kotak profile trainer foto")
	public void ab016p_admin_menekan_kotak_profile_trainer_foto() {
		jcAbout.goToAbout();
	    jcAbout.editDataTrainer();
	    extentTest.log(LogStatus.PASS, "AB016P Admin menekan kotak profile trainer foto");
	}

	@When("AB016P Admin mengubah foto trainer")
	public void ab016p_admin_mengubah_foto_trainer() {
		jcAbout.editFotoTrainer();
		extentTest.log(LogStatus.PASS, "AB016P Admin mengubah foto trainer");
	}

	@Then("AB016P Admin menekan tombol simpan dan data trainer tersimpan foto")
	public void ab016p_admin_menekan_tombol_simpan_dan_data_trainer_tersimpan_foto() {		jcAbout.simpanData();
		assertTrue(jcAbout.getValidTambah().contains("berhasil di update"));
		extentTest.log(LogStatus.PASS, "AB016P Admin menekan tombol simpan dan data trainer tersimpan foto");
	}

	/*------ Edit Nama ------*/
	@When("AB017P Admin menekan kotak profile trainer nama")
	public void ab017p_admin_menekan_kotak_profile_trainer_nama() {
		jcAbout.goToAbout();
	    jcAbout.editDataTrainer();
	    extentTest.log(LogStatus.PASS, "AB017P Admin menekan kotak profile trainer nama");
	}

	@When("AB017P Admin mengubah nama trainer")
	public void ab017p_admin_mengubah_nama_trainer() {
		jcAbout.editNamaTrainer();
		extentTest.log(LogStatus.PASS, "AB017P Admin mengubah nama trainer");
	}

	@Then("AB017P Admin menekan tombol simpan dan data trainer tersimpan nama")
	public void ab017p_admin_menekan_tombol_simpan_dan_data_trainer_tersimpan_nama() {		jcAbout.simpanData();
		assertTrue(jcAbout.getValidTambah().contains("berhasil di update"));
		extentTest.log(LogStatus.PASS, "AB017P Admin menekan tombol simpan dan data tersimpan nama");
	}

	/*------ Edit Jabatan ------*/
	@When("AB018P Admin menekan kotak profile trainer jabatan")
	public void ab018p_admin_menekan_kotak_profile_trainer_jabatan() {
		jcAbout.goToAbout();
	    jcAbout.editDataTrainer();
	    extentTest.log(LogStatus.PASS, "AB018P Admin menekan kotak profile trainer jabatan");
	}

	@When("AB018P Admin mengubah jabatan trainer")
	public void ab018p_admin_mengubah_jabatan_trainer() {
		jcAbout.editJabatanTrainer();
		extentTest.log(LogStatus.PASS, "AB018P Admin mengubah jabatan trainer");
	}

	@Then("AB018P Admin menekan tombol simpan dan data trainer tersimpan jabatan")
	public void ab018p_admin_menekan_tombol_simpan_dan_data_trainer_tersimpan_jabatan() {		jcAbout.simpanData();
		assertTrue(jcAbout.getValidTambah().contains("berhasil di update"));
		extentTest.log(LogStatus.PASS, "AB018P Admin menekan tombol simpan dan data tersimpan jabatan");
	}

	/*------ Edit Profile ------*/
	@When("AB019P Admin menekan kotak profile trainer profile")
	public void ab019p_admin_menekan_kotak_profile_trainer_profile() {
		jcAbout.goToAbout();
	    jcAbout.editDataTrainer();
	    extentTest.log(LogStatus.PASS, "AB019P Admin menekan kotak profile trainer profile");
	}

	@When("AB019P Admin mengubah profile trainer")
	public void ab019p_admin_mengubah_profile_trainer() {
	    jcAbout.editProfileTrainer();
	    extentTest.log(LogStatus.PASS, "AB019P Admin mengubah profile trainer");
	}

	@Then("AB019P Admin menekan tombol simpan dan data trainer tersimpan profile")
	public void ab019p_admin_menekan_tombol_simpan_dan_data_trainer_tersimpan_profile() {		jcAbout.simpanData();
		assertTrue(jcAbout.getValidTambah().contains("berhasil di update"));
		extentTest.log(LogStatus.PASS, "AB019P Admin menekan tombol simpan dan data tersimpan profile");
	}
	
}
