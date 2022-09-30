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

public class JCAdminAboutEditTrainerImpl {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private JCAdminAboutPage JCAbout;
	private static JCAdminAboutAddTrainerImpl add;
	String strDelay = Constants.GLOB_PARAM_DELAY;
	
	public JCAdminAboutEditTrainerImpl() {
		driver = JCAdminHooks.driver;
		extentTest = JCAdminHooks.extentTest;
		driver.get(Constants.URL_JCADMIN_LOGIN);
		JCAbout = new JCAdminAboutPage();
		add = new JCAdminAboutAddTrainerImpl();
	}
	
	/*==========================*/
	/*Test edit data trainer*/
	/*==========================*/
	@When("Admin menekan kotak profile trainer publish")
	public void admin_menekan_kotak_profile_trainer_publish() {
	    add.admin_login_dan_membuka_halaman_about();
	    JCAbout.editDataTrainer();
	}

	@When("^Admin mengganti status publish ke (.*)$")
	public void admin_mengganti_status_publish_ke_status(String stat) {
	    JCAbout.gantiStatus(stat);
	}

	@When("Admin menekan tombol simpan publish")
	public void admin_menekan_tombol_simpan_publish() {
	    JCAbout.simpanData();
	}

	@Then("^Status publish trainer berubah menjadi (.*)$")
	public void status_publish_trainer_berubah_menjadi_status(String stat) {
		assertTrue(JCAbout.getValidTambah().contains("berhasil di update"));
	}
	
	// Edit foto
	@When("Admin menekan kotak profile trainer foto")
	public void admin_menekan_kotak_profile_trainer_foto() {
		add.admin_login_dan_membuka_halaman_about();
	    JCAbout.editDataTrainer();
	}

	@When("Admin mengubah foto trainer")
	public void admin_mengubah_foto_trainer() {
		JCAbout.editFotoTrainer();
	}

	@Then("Admin menekan tombol simpan dan data tersimpan foto")
	public void admin_menekan_tombol_simpan_dan_data_tersimpan_foto() {
		JCAbout.simpanData();
		assertTrue(JCAbout.getValidTambah().contains("berhasil di update"));
	}

	// Edit nama
	@When("Admin menekan kotak profile trainer nama")
	public void admin_menekan_kotak_profile_trainer_nama() {
		add.admin_login_dan_membuka_halaman_about();
	    JCAbout.editDataTrainer();
	}

	@When("Admin mengubah nama trainer")
	public void admin_mengubah_nama_trainer() {
		JCAbout.editNamaTrainer();
	}

	@Then("Admin menekan tombol simpan dan data tersimpan nama")
	public void admin_menekan_tombol_simpan_dan_data_tersimpan_nama() {
		JCAbout.simpanData();
		assertTrue(JCAbout.getValidTambah().contains("berhasil di update"));
	}

	// Edit jabatan
	@When("Admin menekan kotak profile trainer jabatan")
	public void admin_menekan_kotak_profile_trainer_jabatan() {
		add.admin_login_dan_membuka_halaman_about();
	    JCAbout.editDataTrainer();
	}

	@When("Admin mengubah jabatan trainer")
	public void admin_mengubah_jabatan_trainer() {
		JCAbout.editJabatanTrainer();
	}

	@Then("Admin menekan tombol simpan dan data tersimpan jabatan")
	public void admin_menekan_tombol_simpan_dan_data_tersimpan_jabatan() {
		JCAbout.simpanData();
		assertTrue(JCAbout.getValidTambah().contains("berhasil di update"));
	}

	// Edit profile
	@When("Admin menekan kotak profile trainer profile")
	public void admin_menekan_kotak_profile_trainer_profile() {
		add.admin_login_dan_membuka_halaman_about();
	    JCAbout.editDataTrainer();
	}

	@When("Admin mengubah profile trainer")
	public void admin_mengubah_profile_trainer() {
	    JCAbout.editProfileTrainer();
	}

	@Then("Admin menekan tombol simpan dan data tersimpan profile")
	public void admin_menekan_tombol_simpan_dan_data_tersimpan_profile() {
		JCAbout.simpanData();
		assertTrue(JCAbout.getValidTambah().contains("berhasil di update"));
	}
	
}
