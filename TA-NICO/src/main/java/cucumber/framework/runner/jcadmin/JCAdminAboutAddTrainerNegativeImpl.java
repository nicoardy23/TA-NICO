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

public class JCAdminAboutAddTrainerNegativeImpl {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private static JCAdminAboutPage jcAbout;
	String strDelay = Constants.GLOB_PARAM_DELAY;
	
	public JCAdminAboutAddTrainerNegativeImpl() {
		driver = JCAdminHooks.driver;
		extentTest = JCAdminHooks.extentTest;
		driver.get(Constants.URL_JCADMIN_LOGIN);
		jcAbout = new JCAdminAboutPage();
	}
	
	/*============================================*/
	/*Test Tambah Data Ekstensi Foto Selain Gambar*/
	/*============================================*/
	@When("^(.*) Admin klik tombol tambah trainer foto selain ekstensi gambar$")
	public void kode_admin_klik_tombol_tambah_trainer_foto_selain_ekstensi_gambar(String kode) {
		jcAbout.goToAbout();
		jcAbout.tambahTrainer();
		extentTest.log(LogStatus.PASS, kode + " Admin klik tombol tambah trainer foto selain ekstensi gambar");
	}

	@When("^(.*) Admin memasukkan (.*) trainer selain ekstensi gambar$")
	public void kode_admin_memasukkan_foto_trainer_selain_ekstensi_gambar(String kode, String foto) {
		jcAbout.tambahFotoTrainerAbs(foto);
		;
		extentTest.log(LogStatus.PASS, kode + " Admin memasukkan " + foto + " trainer selain ekstensi gambar");
	}

	@When("^(.*) Admin mengisi nama jabatan profile dan publish no active trainer selain ekstensi gambar$")
	public void kode_admin_mengisi_nama_jabatan_profile_dan_publish_no_active_trainer_selain_ekstensi_gambar(String kode) {
		jcAbout.namaTrainer("Zanonim23TestInvalidFoto");
		jcAbout.jabatanTrainer("Trainer");
	    jcAbout.profileTrainer("Cuma buat testing invalid foto");
		jcAbout.statusTrainer("No Active");
		extentTest.log(LogStatus.PASS, kode + " Admin mengisi nama jabatan profile dan publish no active trainer selain ekstensi gambar");
	}

	@Then("^(.*) Admin menekan tombol simpan trainer foto selain ekstensi gambar$")
	public void kode_admin_menekan_tombol_simpan_trainer_foto_selain_ekstensi_gambar(String kode) {
		jcAbout.simpanData();
		assertTrue(jcAbout.getInvalidImageType().contains("The supplied file is not a supported image type"));
		extentTest.log(LogStatus.PASS, kode + " Admin menekan tombol simpan trainer foto selain ekstensi gambar");
	}
	
	/*===================================*/
	/*Test Tambah Data Invalid Input Nama*/
	/*===================================*/
	@When("AB004N Admin klik tombol tambah trainer invalid input nama")
	public void ab004n_admin_klik_tombol_tambah_trainer_invalid_input_nama() {
		jcAbout.goToAbout();
		jcAbout.tambahTrainer();
		extentTest.log(LogStatus.PASS,"AB004N Admin klik tombol tambah trainer invalid input nama");
	}

	@When("AB004N Admin memasukkan foto trainer invalid input nama")
	public void ab004n_admin_memasukkan_foto_trainer_invalid_input_nama() {
		jcAbout.tambahFotoTrainerAbs(".\\src\\main\\resources\\gambarnico\\error-wait.gif");
		extentTest.log(LogStatus.PASS, "AB004N Admin memasukkan foto trainer invalid input nama");
	}

	@When("AB004N Admin mengisi nama trainer invalid input nama")
	public void ab004n_admin_mengisi_nama_trainer_invalid_input_nama() {
	    jcAbout.namaTrainer("Zanonim23><");
	    extentTest.log(LogStatus.PASS, "AB004N Admin mengisi nama trainer invalid input nama");
	}
	
	@When("AB004N Admin mengisi jabatan profile dan publish no active trainer invalid input nama")
	public void ab004n_admin_mengisi_jabatan_profile_dan_publish_no_active_trainer_invalid_input_nama() {
		jcAbout.jabatanTrainer("Trainer");
	    jcAbout.profileTrainer("Cuma buat testing");
		jcAbout.statusTrainer("No Active");
		extentTest.log(LogStatus.PASS, "AB004N Admin mengisi jabatan profile dan publish no active trainer invalid input nama");
	}

	@Then("AB004N Admin menekan tombol simpan trainer invalid input nama")
	public void ab004n_admin_menekan_tombol_simpan_trainer_invalid_input_nama() {
		jcAbout.simpanData();
		assertTrue(jcAbout.getInvalidInput().contains("Karakter (<|>|'|\") tidak diizinkan"));
		extentTest.log(LogStatus.PASS, "AB004N Admin menekan tombol simpan trainer invalid input nama");
	}
	
	/*======================================*/
	/*Test Tambah Data Invalid Input Jabatan*/
	/*======================================*/
	@When("AB005N Admin klik tombol tambah trainer invalid input jabatan")
	public void ab005n_admin_klik_tombol_tambah_trainer_invalid_input_jabatan() {
		jcAbout.goToAbout();
		jcAbout.tambahTrainer();
		extentTest.log(LogStatus.PASS,"AB005N Admin klik tombol tambah trainer invalid input jabatan");
	}

	@When("AB005N Admin memasukkan foto dan nama trainer invalid input jabatan")
	public void ab005n_admin_memasukkan_foto_dan_nama_trainer_invalid_input_jabatan() {
		jcAbout.tambahFotoTrainerAbs(".\\src\\main\\resources\\gambarnico\\error-wait.gif");
		jcAbout.namaTrainer("Zanonim23");
		extentTest.log(LogStatus.PASS, "AB005N Admin memasukkan foto dan nama trainer invalid input jabatan");
	}

	@When("AB005N Admin mengisi jabatan trainer invalid input jabatan")
	public void ab005n_admin_mengisi_jabatan_trainer_invalid_input_jabatan() {
		jcAbout.jabatanTrainer("Trainer<>'");
		extentTest.log(LogStatus.PASS, "AB005N Admin mengisi jabatan trainer invalid input jabatan");
	}

	@When("AB005N Admin mengisi profile dan publish no active trainer invalid input jabatan")
	public void ab005n_admin_mengisi_profile_dan_publish_no_active_trainer_invalid_input_jabatan() {
		jcAbout.profileTrainer("Cuma buat testing");
		jcAbout.statusTrainer("No Active");
		extentTest.log(LogStatus.PASS, "AB005N Admin mengisi profile dan publish no active trainer invalid input jabatan");
	}

	@Then("AB005N Admin menekan tombol simpan trainer invalid input jabatan")
	public void ab005n_admin_menekan_tombol_simpan_trainer_invalid_input_jabatan() {
		jcAbout.simpanData();
		assertTrue(jcAbout.getInvalidInput().contains("Karakter (<|>|'|\") tidak diizinkan"));
		extentTest.log(LogStatus.PASS, "AB005N Admin menekan tombol simpan trainer invalid input jabatan");
	}
	
	/*======================================*/
	/*Test Tambah Data Invalid Input Profile*/
	/*======================================*/
	@When("AB006N Admin klik tombol tambah trainer invalid input profile")
	public void ab006n_admin_klik_tombol_tambah_trainer_invalid_input_profile() {
		jcAbout.goToAbout();
		jcAbout.tambahTrainer();
		extentTest.log(LogStatus.PASS,"AB006N Admin klik tombol tambah trainer invalid input profile");
	}

	@When("AB006N Admin memasukkan foto nama dan jabatan trainer invalid input profile")
	public void ab006n_admin_memasukkan_foto_nama_dan_jabatan_trainer_invalid_input_profile() {
		jcAbout.tambahFotoTrainerAbs(".\\src\\main\\resources\\gambarnico\\error-wait.gif");
		jcAbout.namaTrainer("Zanonim23");
		jcAbout.jabatanTrainer("Trainer");
		extentTest.log(LogStatus.PASS, "AB006N Admin memasukkan foto nama dan jabatan trainer invalid input profile");
	}

	@When("AB006N Admin mengisi profile trainer invalid input profile")
	public void ab006n_admin_mengisi_profile_trainer_invalid_input_profile() {
		jcAbout.profileTrainer("Cuma buat testing<>");
		extentTest.log(LogStatus.PASS,"AB006N Admin mengisi profile trainer invalid input profile");
	}

	@When("AB006N Admin mengisi publish no active trainer invalid input profile")
	public void ab006n_admin_mengisi_publish_no_active_trainer_invalid_input_profile() {
		jcAbout.statusTrainer("No Active");
		extentTest.log(LogStatus.PASS, "AB006N Admin mengisi publish no active trainer invalid input profile");
	}

	@Then("AB006N Admin menekan tombol simpan trainer invalid input profile")
	public void ab006n_admin_menekan_tombol_simpan_trainer_invalid_input_profile() {
		jcAbout.simpanData();
		assertTrue(jcAbout.getInvalidInput().contains("Karakter (<|>|'|\") tidak diizinkan"));
		extentTest.log(LogStatus.PASS, "AB006N Admin menekan tombol simpan trainer invalid input profile");
	}
	
	/*=========================================*/
	/*Test Tambah Data Dengan Nama 500 Karakter*/
	/*=========================================*/
	@When("AB007N Admin klik tombol tambah trainer input nama500 karakter")
	public void ab007n_admin_klik_tombol_tambah_trainer_input_nama500_karakter() {
		jcAbout.goToAbout();
		jcAbout.tambahTrainer();
		extentTest.log(LogStatus.PASS,"AB007N Admin klik tombol tambah trainer input nama500 karakter");
	}

	@When("AB007N Admin memasukkan foto trainer input nama500 karakter")
	public void ab007n_admin_memasukkan_foto_trainer_input_nama500_karakter() {
		jcAbout.tambahFotoTrainerAbs(".\\src\\main\\resources\\gambarnico\\error-wait.gif");
		extentTest.log(LogStatus.PASS, "AB007N Admin memasukkan foto trainer input nama500 karakter");
	}

	@When("AB007N Admin mengisi nama trainer dengan input500 karakter")
	public void ab007n_admin_mengisi_nama_trainer_dengan_input500_karakter() {
		jcAbout.namaTrainer("NicoArdyTestPanjangggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggg");
	    extentTest.log(LogStatus.PASS, "AB007N Admin mengisi nama trainer dengan input500 karakter");
	}

	@When("AB007N Admin mengisi jabatan profile dan publish no active trainer input nama500 karakter")
	public void ab007n_admin_mengisi_jabatan_profile_dan_publish_no_active_trainer_input_nama500_karakter() {
		jcAbout.jabatanTrainer("Trainer");
	    jcAbout.profileTrainer("Cuma buat testing");
		jcAbout.statusTrainer("No Active");
		extentTest.log(LogStatus.PASS, "AB007N Admin mengisi jabatan profile dan publish no active trainer input nama500 karakter");
	}

	@Then("AB007N Admin menekan tombol simpan dan cari trainer input nama500 karakter")
	public void ab007n_admin_menekan_tombol_simpan_dan_cari_trainer_input_nama500_karakter() {
		jcAbout.simpanData();
		jcAbout.cariTrainer("NicoArdyTestPanjanggg");
		jcAbout.tekanEnter();
		assertEquals(jcAbout.getValidNamaTrainerLength(), "NicoArdyTestPanjangggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggg");
		extentTest.log(LogStatus.PASS, "AB007N Admin menekan tombol simpan dan cari trainer input nama500 karakter");
	}
	
	/*============================================*/
	/*Test Tambah Data Dengan Jabatan 500 Karakter*/
	/*============================================*/
	@When("AB008N Admin klik tombol tambah trainer input jabatan500 karakter")
	public void ab008n_admin_klik_tombol_tambah_trainer_input_jabatan500_karakter() {
		jcAbout.goToAbout();
		jcAbout.tambahTrainer();
		extentTest.log(LogStatus.PASS,"AB008N Admin klik tombol tambah trainer input jabatan500 karakter");
	}

	@When("AB008N Admin memasukkan foto dan nama trainer input jabatan500 karakter")
	public void ab008n_admin_memasukkan_foto_dan_nama_trainer_input_jabatan500_karakter() {
		jcAbout.tambahFotoTrainerAbs(".\\src\\main\\resources\\gambarnico\\error-wait.gif");
		jcAbout.namaTrainer("NicoArdyTestJabatanPanjang");
		extentTest.log(LogStatus.PASS, "AB008N Admin memasukkan foto dan nama trainer input jabatan500 karakter");
	}

	@When("AB008N Admin mengisi jabatan trainer dengan input jabatan500 karakter")
	public void ab008n_admin_mengisi_jabatan_trainer_dengan_input_jabatan500_karakter() {
		jcAbout.jabatanTrainer("NicoArdyTestJabatanPanjanggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggg");
		extentTest.log(LogStatus.PASS, "AB008N Admin mengisi jabatan trainer dengan input jabatan500 karakter");
	}

	@When("AB008N Admin mengisi profile dan publish no active trainer input jabatan500 karakter")
	public void ab008n_admin_mengisi_profile_dan_publish_no_active_trainer_input_jabatan500_karakter() {
		jcAbout.profileTrainer("Cuma buat testing");
		jcAbout.statusTrainer("No Active");
		extentTest.log(LogStatus.PASS, "AB008N Admin mengisi profile dan publish no active trainer input jabatan500 karakter");
	}

	@Then("AB008N Admin menekan tombol simpan dan cari trainer input jabatan500 karakter")
	public void ab008n_admin_menekan_tombol_simpan_dan_cari_trainer_input_jabatan500_karakter() {
		jcAbout.simpanData();
		jcAbout.cariTrainer("NicoArdyTestJabatanPanjang");
		jcAbout.tekanEnter();
		assertEquals(jcAbout.getValidJabatanTrainerLength(), "NicoArdyTestJabatanPanjanggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggg");
		extentTest.log(LogStatus.PASS, "AB008N Admin menekan tombol simpan dan cari trainer input jabatan500 karakter");
	}
	
	/*============================================*/
	/*Test Tambah Data Dengan Profile 500 Karakter*/
	/*============================================*/
	@When("AB009N Admin klik tombol tambah trainer input profile500 karakter")
	public void ab009n_admin_klik_tombol_tambah_trainer_input_profile500_karakter() {
		jcAbout.goToAbout();
		jcAbout.tambahTrainer();
		extentTest.log(LogStatus.PASS,"AB009N Admin klik tombol tambah trainer input profile500 karakter");
	}

	@When("AB009N Admin memasukkan foto nama dan jabatan trainer input profile500 karakter")
	public void ab009n_admin_memasukkan_foto_nama_dan_jabatan_trainer_input_profile500_karakter() {
		jcAbout.tambahFotoTrainerAbs(".\\src\\main\\resources\\gambarnico\\error-wait.gif");
		jcAbout.namaTrainer("NicoArdyTestProfilePanjang");
		jcAbout.jabatanTrainer("TestProfilePanjang");
		extentTest.log(LogStatus.PASS, "AB009N Admin memasukkan foto nama dan jabatan trainer input profile500 karakter");
	}

	@When("AB009N Admin mengisi profile trainer dengan input profile500 karakter")
	public void ab009n_admin_mengisi_profile_trainer_dengan_input_profile500_karakter() {
		jcAbout.profileTrainer("NicoArdyTestProfilePanjanggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggg");
		extentTest.log(LogStatus.PASS, "AB009N Admin mengisi profile trainer dengan input profile500 karakter");
	}

	@When("AB009N Admin memilih publish no active trainer input profile500 karakter")
	public void ab009n_admin_memilih_publish_no_active_trainer_input_profile500_karakter() {
		jcAbout.statusTrainer("No Active");
		extentTest.log(LogStatus.PASS, "AB009N Admin memilih publish no active trainer input profile500 karakter");
	}

	@Then("AB009N Admin menekan tombol simpan dan cari trainer input profile500 karakter")
	public void ab009n_admin_menekan_tombol_simpan_dan_cari_trainer_input_profile500_karakter() {
		jcAbout.simpanData();
		jcAbout.cariTrainer("NicoArdyTestProfilePanjang");
		jcAbout.tekanEnter();
		assertEquals(jcAbout.getValidProfileTrainerLength(), "NicoArdyTestProfilePanjanggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggg");
		extentTest.log(LogStatus.PASS, "AB009N Admin menekan tombol simpan dan cari trainer input profile500 karakter");
	}
}
