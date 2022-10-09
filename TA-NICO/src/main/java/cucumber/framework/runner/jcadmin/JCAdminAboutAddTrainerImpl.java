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

public class JCAdminAboutAddTrainerImpl {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private static JCAdminAboutPage jcAbout;
	String strDelay = Constants.GLOB_PARAM_DELAY;
	
	public JCAdminAboutAddTrainerImpl() {
		driver = JCAdminHooks.driver;
		extentTest = JCAdminHooks.extentTest;
		driver.get(Constants.URL_JCADMIN_LOGIN);
		jcAbout = new JCAdminAboutPage();
	}
	
	/*==========================*/
	/*Test Membuka halaman About*/
	/*==========================*/
	@Given("AB001P Admin login dan membuka halaman about")
	public void admin_login_dan_membuka_halaman_about() {
		jcAbout.goToAbout();
		extentTest.log(LogStatus.PASS, "AB001P Admin login dan membuka halaman about");
	}

	@Then("AB001P Halaman about terbuka")
	public void halaman_about_terbuka() {
	    assertEquals(jcAbout.getValidAbout(), "List Trainer");
	    extentTest.log(LogStatus.PASS, "AB001P Halaman about terbuka");
	}
	
	/*=====================================================*/
	/*Test menambah data dengan status Active dan No Active*/
	/*=====================================================*/
	@When("^(.*) Admin klik tombol tambah trainer$")
	public void kode_admin_klik_tombol_tambah_trainer(String kode) {
		jcAbout.goToAbout();
		jcAbout.tambahTrainer();
		extentTest.log(LogStatus.PASS, kode + " Admin klik tombol tambah trainer");
	}

	@When("^(.*) Admin mengisi data foto nama jabatan dan profile trainer$")
	public void kode_admin_mengisi_data_foto_nama_jabatan_dan_profile_trainer(String kode) {
		jcAbout.tambahFotoTrainerAbs(".\\src\\main\\resources\\gambarnico\\error-wait.gif");
	    jcAbout.namaTrainer("Zanonim23");
	    jcAbout.jabatanTrainer("Trainer");
	    jcAbout.profileTrainer("Cuma buat testing");
	    extentTest.log(LogStatus.PASS, kode + " Admin mengisi data foto nama jabatan dan profile");
	}

	@When("^(.*) Admin memberi publish (.*)$")
	public void kode_admin_memberi_publish_status(String kode, String stat) {
		jcAbout.statusTrainer(stat);
	    extentTest.log(LogStatus.PASS, kode + " Admin memberi publish " + stat);
	}

	@When("^(.*) Admin menekan tombol simpan trainer$")
	public void kode_admin_menekan_tombol_simpan_trainer(String kode) {
		jcAbout.simpanData();
		extentTest.log(LogStatus.PASS, kode + " Admin menekan tombol simpan");
	}

	@Then("^(.*) Data trainer ditambahkan$")
	public void kode_data_trainer_ditambahkan(String kode) {
		assertTrue(jcAbout.getValidTambah().contains("berhasil"));
		extentTest.log(LogStatus.PASS, kode + " Data trainer ditambahkan");
	}
	
	/*==============================================*/
	/*Menambah Trainer dengan Berbagai Format Gambar*/
	/*==============================================*/
	@When("^(.*) Admin klik tombol tambah trainer berbagai foto$")
	public void kode_admin_klik_tombol_tambah_trainer_berbagai_foto(String kode) {
		jcAbout.goToAbout();
		jcAbout.tambahTrainer();
		extentTest.log(LogStatus.PASS, kode + " Admin klik tombol tambah trainer berbagai foto");
	}

	@When("^(.*) Admin memasukkan file (.*) trainer$")
	public void kode_admin_memasukkan_file_foto_trainer(String kode, String foto) {
		jcAbout.tambahFotoTrainerAbs(foto);
		extentTest.log(LogStatus.PASS, kode + " Admin memasukkan file " + foto + " trainer");
	}

	@When("^(.*) Admin mengisi data trainer dengan status status no active$")
	public void kode_admin_mengisi_data_trainer_dengan_status_status_no_active(String kode) {
		jcAbout.namaTrainer("TestFoto23");
	    jcAbout.jabatanTrainer("Trainer");
	    jcAbout.profileTrainer("Cuma buat testing foto");
	    jcAbout.statusTrainer("No Active");
	    extentTest.log(LogStatus.PASS, kode + " Admin mengisi data trainer dengan status status no active");
	}

	
	@When("^(.*) Admin menekan tombol simpan trainer berbagai foto$")
	public void kode_admin_menekan_tombol_simpan_trainer_berbagai_foto(String kode) {
		jcAbout.simpanData();
		extentTest.log(LogStatus.PASS, kode + " Admin menekan tombol simpan trainer berbagai foto");
	}

	@Then("^(.*) Data trainer ditambahkan berbagai gambar$")
	public void kode_data_trainer_ditambahkan_berbagai_gambar(String kode) {
		assertTrue(jcAbout.getValidTambah().contains("berhasil"));
		extentTest.log(LogStatus.PASS, kode + " Data trainer ditambahkan");
	}
}
