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

public class JCAdminAboutFindAndEditImpl {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private static JCAdminAboutPage JCAbout;
	String strDelay = Constants.GLOB_PARAM_DELAY;
	
	public JCAdminAboutFindAndEditImpl() {
		driver = JCAdminHooks.driver;
		extentTest = JCAdminHooks.extentTest;
		driver.get(Constants.URL_JCADMIN_LOGIN);
		JCAbout = new JCAdminAboutPage();
	}
	
	/*==========================*/
	/*Cari dan Edit Trainer*/
	/*==========================*/
	
	/*------ Edit Foto ------*/
	@When("Admin mencari nama trainer dan menekan enter foto cari edit")
	public void admin_mencari_nama_trainer_dan_menekan_enter_foto_cari_edit() {
		JCAbout.goToAbout();
	    JCAbout.cariTrainer("Anonim23");
	    JCAbout.tekanEnter();
	    extentTest.log(LogStatus.PASS, "Admin mencari nama trainer dan menekan enter foto cari edit");
	}

	@When("Admin menekan kotak profile trainer foto cari edit")
	public void admin_menekan_kotak_profile_trainer_foto_cari_edit() {
	    JCAbout.editDataTrainer();
	    extentTest.log(LogStatus.PASS, "Admin menekan kotak profile trainer foto cari edit");
	}

	@When("Admin mengubah foto trainer cari edit")
	public void admin_mengubah_foto_trainer_cari_edit() {
		JCAbout.editFotoTrainer();
		extentTest.log(LogStatus.PASS, "Admin mengubah foto trainer cari edit");
	}

	@Then("Admin menekan tombol simpan dan data tersimpan foto cari edit")
	public void admin_menekan_tombol_simpan_dan_data_tersimpan_foto_cari_edit() {
		JCAbout.simpanData();
		assertTrue(JCAbout.getValidTambah().contains("berhasil di update"));
		extentTest.log(LogStatus.PASS, "Admin menekan tombol simpan dan data tersimpan foto cari edit");
	}

	/*------ Edit Nama ------*/
	@When("Admin mencari nama trainer dan menekan enter nama cari edit")
	public void admin_mencari_nama_trainer_dan_menekan_enter_nama_cari_edit() {
		JCAbout.goToAbout();
	    JCAbout.cariTrainer("Anonim23");
	    JCAbout.tekanEnter();
	    extentTest.log(LogStatus.PASS, "Admin mencari nama trainer dan menekan enter nama cari edit");
	}

	@When("Admin menekan kotak profile trainer nama cari edit")
	public void admin_menekan_kotak_profile_trainer_nama_cari_edit() {
		JCAbout.editDataTrainer();
		extentTest.log(LogStatus.PASS, "Admin menekan kotak profile trainer nama cari edit");
	}

	@When("Admin mengubah nama trainer cari edit")
	public void admin_mengubah_nama_trainer_cari_edit() {
		JCAbout.editNamaTrainer();
		extentTest.log(LogStatus.PASS, "Admin mengubah nama trainer cari edit");
	}

	@Then("Admin menekan tombol simpan dan data tersimpan nama cari edit")
	public void admin_menekan_tombol_simpan_dan_data_tersimpan_nama_cari_edit() {
		JCAbout.simpanData();
		assertTrue(JCAbout.getValidTambah().contains("berhasil di update"));
		extentTest.log(LogStatus.PASS, "Admin menekan tombol simpan dan data tersimpan nama cari edit");
	}

	/*------ Edit Jabatan ------*/
	@When("Admin mencari nama trainer dan menekan enter jabatan cari edit")
	public void admin_mencari_nama_trainer_dan_menekan_enter_jabatan_cari_edit() {
		JCAbout.goToAbout();
	    JCAbout.cariTrainer("Anonim23");
	    JCAbout.tekanEnter();
	    extentTest.log(LogStatus.PASS, "Admin mencari nama trainer dan menekan enter jabatan cari edit");
	}

	@When("Admin menekan kotak profile trainer jabatan cari edit")
	public void admin_menekan_kotak_profile_trainer_jabatan_cari_edit() {
		JCAbout.editDataTrainer();
		extentTest.log(LogStatus.PASS, "Admin menekan kotak profile trainer jabatan cari edit");
	}

	@When("Admin mengubah jabatan trainer cari edit")
	public void admin_mengubah_jabatan_trainer_cari_edit() {
		JCAbout.editJabatanTrainer();
		extentTest.log(LogStatus.PASS, "Admin mengubah jabatan trainer cari edit");
	}

	@Then("Admin menekan tombol simpan dan data tersimpan jabatan cari edit")
	public void admin_menekan_tombol_simpan_dan_data_tersimpan_jabatan_cari_edit() {
		JCAbout.simpanData();
		assertTrue(JCAbout.getValidTambah().contains("berhasil di update"));
		extentTest.log(LogStatus.PASS, "Admin menekan tombol simpan dan data tersimpan jabatan cari edit");
	}

	/*------ Edit Profile ------*/
	@When("Admin mencari nama trainer dan menekan enter profile cari edit")
	public void admin_mencari_nama_trainer_dan_menekan_enter_profile_cari_edit() {
		JCAbout.goToAbout();
	    JCAbout.cariTrainer("Anonim23");
	    JCAbout.tekanEnter();
	    extentTest.log(LogStatus.PASS, "Admin mencari nama trainer dan menekan enter profile cari edit");
	}

	@When("Admin menekan kotak profile trainer profile cari edit")
	public void admin_menekan_kotak_profile_trainer_profile_cari_edit() {
		JCAbout.editDataTrainer();
		extentTest.log(LogStatus.PASS, "Admin menekan kotak profile trainer profile cari edit");
	}

	@When("Admin mengubah profile trainer cari edit")
	public void admin_mengubah_profile_trainer_cari_edit() {
		JCAbout.editProfileTrainer();
		extentTest.log(LogStatus.PASS, "Admin mengubah profile trainer cari edit");
	}

	@Then("Admin menekan tombol simpan dan data tersimpan profile cari edit")
	public void admin_menekan_tombol_simpan_dan_data_tersimpan_profile_cari_edit() {
		JCAbout.simpanData();
		assertTrue(JCAbout.getValidTambah().contains("berhasil di update"));
		extentTest.log(LogStatus.PASS, "Admin menekan tombol simpan dan data tersimpan profile cari edit");
	}
}
