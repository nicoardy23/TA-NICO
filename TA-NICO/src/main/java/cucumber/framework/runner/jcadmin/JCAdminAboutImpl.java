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

public class JCAdminAboutImpl {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private JCAdminAboutPage JCAbout;
	String strDelay = Constants.GLOB_PARAM_DELAY;
	
	public JCAdminAboutImpl() {
		driver = JCAdminHooks.driver;
		extentTest = JCAdminHooks.extentTest;
		driver.get(Constants.URL_JCADMIN_LOGIN);
		JCAbout = new JCAdminAboutPage();
	}
	
	/*==========================*/
	/*Test Membuka halaman About*/
	/*==========================*/
	@Given("Admin login dan membuka halaman about")
	public void admin_login_dan_membuka_halaman_about() {
		JCAbout.goToAbout();
	}

	@Then("Halaman about terbuka")
	public void halaman_about_terbuka() {
	    assertEquals(JCAbout.getValidAbout(), "List Trainer");
	}
	
	/*====================================================*/
	/*Test menambah data dengan status Active dan No Active*/
	/*====================================================*/
	@When("Admin klik tombol tambah")
	public void admin_klik_tombol_tambah() {
		admin_login_dan_membuka_halaman_about();
		JCAbout.tambahTrainer();
	}

	@When("Admin mengisi data foto nama jabatan dan profile")
	public void admin_mengisi_data_foto_nama_jabatan_dan_profile() {
	    JCAbout.fotoTrainer("C:\\Users\\NEXSOFT\\Desktop\\Test TA\\error-wait.GIF");
	    JCAbout.namaTrainer("Anonim23");
	    JCAbout.jabatanTrainer("Trainer");
	    JCAbout.profileTrainer("Cuma buat testing");
	}

	@When("^Admin memberi publish (.*)$")
	public void admin_memberi_publish_status(String stat) {
	    JCAbout.statusTrainer(stat);
	}

	@When("Admin menekan tombol simpan")
	public void admin_menekan_tombol_simpan() {
		JCAbout.simpanData();
	}

	@Then("Data trainer ditambahkan")
	public void data_trainer_ditambahkan() {
		assertTrue(JCAbout.getValidTambah().contains("berhasil"));
	}

	/*==========================*/
	/*Test cari trainer*/
	/*==========================*/
	@When("Admin memasukkan nama trainer yang ingin dicari")
	public void admin_memasukkan_nama_trainer_yang_ingin_dicari() {
		admin_login_dan_membuka_halaman_about();
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
	/*Test edit data trainer*/
	/*==========================*/
	@When("Admin menekan kotak profile trainer publish")
	public void admin_menekan_kotak_profile_trainer_publish() {
	    admin_login_dan_membuka_halaman_about();
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
		admin_login_dan_membuka_halaman_about();
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
		admin_login_dan_membuka_halaman_about();
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
		admin_login_dan_membuka_halaman_about();
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
		admin_login_dan_membuka_halaman_about();
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
	
	/*==========================*/
	/*Berpindah Halaman*/
	/*==========================*/
	@When("Admin menekan tombol halaman")
	public void admin_menekan_tombol_halaman() {
	    admin_login_dan_membuka_halaman_about();
	    JCAbout.pindahHalaman();
	}

	@Then("Halaman berpindah")
	public void halaman_berpindah() {
	    assertTrue(JCAbout.getValidPindah() != "1");
	}
}
