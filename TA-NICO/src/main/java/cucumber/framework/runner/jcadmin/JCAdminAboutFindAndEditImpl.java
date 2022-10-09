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
	private static JCAdminAboutPage jcAbout;
	String strDelay = Constants.GLOB_PARAM_DELAY;
	
	public JCAdminAboutFindAndEditImpl() {
		driver = JCAdminHooks.driver;
		extentTest = JCAdminHooks.extentTest;
		driver.get(Constants.URL_JCADMIN_LOGIN);
		jcAbout = new JCAdminAboutPage();
	}
	
	/*==========================*/
	/*Cari dan Edit Trainer*/
	/*==========================*/
	
	/*------ Edit Foto ------*/
	@When("AB024N Admin mencari nama trainer dan menekan enter foto cari edit")
	public void admin_mencari_nama_trainer_dan_menekan_enter_foto_cari_edit() {
		jcAbout.goToAbout();
	    jcAbout.cariTrainer("Anonim23");
	    jcAbout.tekanEnter();
	    extentTest.log(LogStatus.PASS, "AB024N Admin mencari nama trainer dan menekan enter foto cari edit");
	}

	@When("AB024N Admin menekan kotak profile trainer foto cari edit")
	public void admin_menekan_kotak_profile_trainer_foto_cari_edit() {
	    jcAbout.editDataTrainer();
	    extentTest.log(LogStatus.PASS, "AB024N Admin menekan kotak profile trainer foto cari edit");
	}

	@When("AB024N Admin mengubah foto trainer cari edit")
	public void admin_mengubah_foto_trainer_cari_edit() {
		jcAbout.editFotoTrainer();
		extentTest.log(LogStatus.PASS, "AB024N Admin mengubah foto trainer cari edit");
	}

	@Then("AB024N Admin menekan tombol simpan dan data trainer tersimpan foto cari edit")
	public void admin_menekan_tombol_simpan_dan_data_trainer_tersimpan_foto_cari_edit() {
		jcAbout.simpanData();
		assertTrue(jcAbout.getValidTambah().contains("berhasil di update"));
		extentTest.log(LogStatus.PASS, "AB024N Admin menekan tombol simpan dan data tersimpan foto cari edit");
	}

	/*------ Edit Nama ------*/
	@When("AB025N Admin mencari nama trainer dan menekan enter nama cari edit")
	public void admin_mencari_nama_trainer_dan_menekan_enter_nama_cari_edit() {
		jcAbout.goToAbout();
	    jcAbout.cariTrainer("Anonim23");
	    jcAbout.tekanEnter();
	    extentTest.log(LogStatus.PASS, "AB025N Admin mencari nama trainer dan menekan enter nama cari edit");
	}

	@When("AB025N Admin menekan kotak profile trainer nama cari edit")
	public void admin_menekan_kotak_profile_trainer_nama_cari_edit() {
		jcAbout.editDataTrainer();
		extentTest.log(LogStatus.PASS, "AB025N Admin menekan kotak profile trainer nama cari edit");
	}

	@When("AB025N Admin mengubah nama trainer cari edit")
	public void admin_mengubah_nama_trainer_cari_edit() {
		jcAbout.editNamaTrainer();
		extentTest.log(LogStatus.PASS, "AB025N Admin mengubah nama trainer cari edit");
	}

	@Then("AB025N Admin menekan tombol simpan dan data trainer tersimpan nama cari edit")
	public void admin_menekan_tombol_simpan_dan_data_trainer_tersimpan_nama_cari_edit() {
		jcAbout.simpanData();
		assertTrue(jcAbout.getValidTambah().contains("berhasil di update"));
		extentTest.log(LogStatus.PASS, "AB025N Admin menekan tombol simpan dan data tersimpan nama cari edit");
	}

	/*------ Edit Jabatan ------*/
	@When("AB026N Admin mencari nama trainer dan menekan enter jabatan cari edit")
	public void admin_mencari_nama_trainer_dan_menekan_enter_jabatan_cari_edit() {
		jcAbout.goToAbout();
	    jcAbout.cariTrainer("Anonim23");
	    jcAbout.tekanEnter();
	    extentTest.log(LogStatus.PASS, "AB026N Admin mencari nama trainer dan menekan enter jabatan cari edit");
	}

	@When("AB026N Admin menekan kotak profile trainer jabatan cari edit")
	public void admin_menekan_kotak_profile_trainer_jabatan_cari_edit() {
		jcAbout.editDataTrainer();
		extentTest.log(LogStatus.PASS, "AB026N Admin menekan kotak profile trainer jabatan cari edit");
	}

	@When("AB026N Admin mengubah jabatan trainer cari edit")
	public void admin_mengubah_jabatan_trainer_cari_edit() {
		jcAbout.editJabatanTrainer();
		extentTest.log(LogStatus.PASS, "AB026N Admin mengubah jabatan trainer cari edit");
	}

	@Then("AB026N Admin menekan tombol simpan dan data trainer tersimpan jabatan cari edit")
	public void admin_menekan_tombol_simpan_dan_data_trainer_tersimpan_jabatan_cari_edit() {
		jcAbout.simpanData();
		assertTrue(jcAbout.getValidTambah().contains("berhasil di update"));
		extentTest.log(LogStatus.PASS, "AB026N Admin menekan tombol simpan dan data tersimpan jabatan cari edit");
	}

	/*------ Edit Profile ------*/
	@When("AB027N Admin mencari nama trainer dan menekan enter profile cari edit")
	public void admin_mencari_nama_trainer_dan_menekan_enter_profile_cari_edit() {
		jcAbout.goToAbout();
	    jcAbout.cariTrainer("Anonim23");
	    jcAbout.tekanEnter();
	    extentTest.log(LogStatus.PASS, "AB027N Admin mencari nama trainer dan menekan enter profile cari edit");
	}

	@When("AB027N Admin menekan kotak profile trainer profile cari edit")
	public void admin_menekan_kotak_profile_trainer_profile_cari_edit() {
		jcAbout.editDataTrainer();
		extentTest.log(LogStatus.PASS, "AB027N Admin menekan kotak profile trainer profile cari edit");
	}

	@When("AB027N Admin mengubah profile trainer cari edit")
	public void admin_mengubah_profile_trainer_cari_edit() {
		jcAbout.editProfileTrainer();
		extentTest.log(LogStatus.PASS, "AB027N Admin mengubah profile trainer cari edit");
	}

	@Then("AB027N Admin menekan tombol simpan dan data trainer tersimpan profile cari edit")
	public void admin_menekan_tombol_simpan_dan_data_trainer_tersimpan_profile_cari_edit() {
		jcAbout.simpanData();
		assertTrue(jcAbout.getValidTambah().contains("berhasil di update"));
		extentTest.log(LogStatus.PASS, "AB027N Admin menekan tombol simpan dan data tersimpan profile cari edit");
	}
	
	/*------ Edit Publish ------*/
	@When("^(.*) Admin menekan kotak profile trainer publish cari edit$")
	public void admin_menekan_kotak_profile_trainer_publish_cari_edit(String kode) {
		jcAbout.goToAbout();
	    jcAbout.cariTrainer("Zanonim23");
	    jcAbout.tekanEnter();
	    jcAbout.editDataTrainer();
	    extentTest.log(LogStatus.PASS, kode + " Admin menekan kotak profile trainer publish cari edit");
	}

	@When("^(.*) Admin mengganti status publish trainer cari edit ke (.*)$")
	public void admin_mengganti_status_publish_trainer_cari_edit_ke_status(String kode, String stat) {
		jcAbout.statusTrainer(stat);
	    extentTest.log(LogStatus.PASS, kode + " Admin mengganti status publish cari edit ke " + stat);
	}

	@When("^(.*) Admin menekan tombol simpan publish trainer cari edit$")
	public void admin_menekan_tombol_simpan_publish_trainer_cari_edit(String kode) {
		jcAbout.simpanData();
		extentTest.log(LogStatus.PASS, kode + " Admin menekan tombol simpan publish cari edit");
	}

	@Then("^(.*) Status publish cari edit trainer berubah menjadi (.*)$")
	public void status_publish_cari_edit_trainer_berubah_menjadi_status(String kode, String stat) {
		assertTrue(jcAbout.getValidTambah().contains("berhasil di update"));
		extentTest.log(LogStatus.PASS, kode + " Status publish edit cari trainer berubah menjadi " + stat);
	}
	

}
