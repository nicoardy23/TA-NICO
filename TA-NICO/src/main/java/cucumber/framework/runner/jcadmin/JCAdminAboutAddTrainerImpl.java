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

public class JCAdminAboutAddTrainerImpl {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private static JCAdminAboutPage JCAbout;
	String strDelay = Constants.GLOB_PARAM_DELAY;
	
	public JCAdminAboutAddTrainerImpl() {
		driver = JCAdminHooks.driver;
		extentTest = JCAdminHooks.extentTest;
		driver.get(Constants.URL_JCADMIN_LOGIN);
		JCAbout = new JCAdminAboutPage();
	}
	
	/*==========================*/
	/*Test Membuka halaman About*/
	/*==========================*/
	@Given("Admin login dan membuka halaman about")
	public static void admin_login_dan_membuka_halaman_about() {
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
}
