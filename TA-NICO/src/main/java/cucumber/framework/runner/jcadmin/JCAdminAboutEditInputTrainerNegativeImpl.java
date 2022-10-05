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

public class JCAdminAboutEditInputTrainerNegativeImpl {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private static JCAdminAboutPage jcAbout;
	String strDelay = Constants.GLOB_PARAM_DELAY;
	
	public JCAdminAboutEditInputTrainerNegativeImpl() {
		driver = JCAdminHooks.driver;
		extentTest = JCAdminHooks.extentTest;
		driver.get(Constants.URL_JCADMIN_LOGIN);
		jcAbout = new JCAdminAboutPage();
	}
	
	/*=============================================*/
	/*Test Edit Input Data Trainer Invalid Negative*/
	/*=============================================*/
	@When("^(.*) Admin menekan kotak profile trainer inputan negative (.*)$")
	public void kode_admin_menekan_kotak_profile_trainer_inputan_negative_case(String kode, String kasus) {
		jcAbout.goToAbout();
	    jcAbout.editDataTrainer();
	    extentTest.log(LogStatus.PASS, kode + " Admin menekan kotak profile trainer inputan negative " + kasus);
	}

	@When("^(.*) Admin mengubah inputan (.*) trainer negative menjadi (.*)$")
	public void kode_admin_mengubah_inputan_case_trainer_negative_menjadi_input(String kode, String kasus, String input) {
		if (kasus.equals("Nama")) {
			jcAbout.editNamaInvalid(input);
		} else if (kasus.equals("Jabatan")) {
			jcAbout.editJabatanInvalid(input);
		} else {
			jcAbout.editProfileInvalid(input);
		}
	    extentTest.log(LogStatus.PASS, kode + " Admin mengubah inputan " + kasus + " trainer negative menjadi " + input);
	}

	@Then("^(.*) Admin menekan tombol simpan data trainer inputan negative (.*)$")
	public void kode_admin_menekan_tombol_simpan_data_trainer_inputan_negative_case(String kode, String kasus) {
		jcAbout.simpanData();
	    assertTrue(jcAbout.getInvalidInput().contains("Karakter (<|>|'|\") tidak diizinkan"));
	    extentTest.log(LogStatus.PASS, kode + " Admin menekan tombol simpan data trainer inputan negative " + kasus);
	}
	
	/*==================================================*/
	/*Test Edit Input Data Trainer Negative 500 Karakter*/
	/*==================================================*/
	@When("^(.*) Admin menekan kotak profile trainer negative500 karakter (.*)$")
	public void kode_admin_menekan_kotak_profile_trainer_negative500_karakter_case(String kode, String kasus) {
	    jcAbout.goToAbout();
	    jcAbout.editDataTrainer();
	    extentTest.log(LogStatus.PASS, kode + " Admin menekan kotak profile trainer negative500 karakter " + kasus);
	}

	@When("^(.*) Admin mengubah inputan (.*) trainer negative menjadi500 karakter (.*)$")
	public void kode_admin_mengubah_inputan_case_trainer_negative_menjadi500_karakter_input(String kode, String kasus, String input) {
		if (kasus.equals("Nama")) {
			jcAbout.editNamaInvalid(input);
		} else if (kasus.equals("Jabatan")) {
			jcAbout.editJabatanInvalid(input);
		} else {
			jcAbout.editProfileInvalid(input);
		}
	    extentTest.log(LogStatus.PASS, kode + " Admin mengubah inputan " + kasus + " trainer negative menjadi500 karakter " + input);
	}

	@When("^(.*) Admin menekan tombol simpan input500 karakter data trainer negative (.*)$")
	public void kode_admin_menekan_tombol_simpan_input500_karakter_data_trainer_negative_case(String kode, String kasus) {
		jcAbout.simpanData();
	    extentTest.log(LogStatus.PASS, kode + " Admin menekan tombol simpan input500 karakter data trainer negative " + kasus);
	}
	
	@When("^(.*) Admin mencari sebagian nama trainer dengan inputan500 karakter (.*)$")
	public void kode_admin_mencari_sebagian_nama_trainer_dengan_inputan500_karakter_case(String kode, String kasus) {
	   if (kasus.equals("Nama")) {
		   jcAbout.cariTrainer("GantiNamaTrainerrrr");
	   } else {
		   jcAbout.cariTrainer("");
	   }
	   extentTest.log(LogStatus.PASS, kode + " Admin mencari sebagian nama trainer dengan inputan500 karakter " + kasus);
	}
	

	@Then("^(.*) Admin menekan tombol enter (.*) karakter pada keyboard (.*)$")
	public void kode_admin_menekan_tombol_enter_input_karakter_pada_keyboard_case(String kode, String input,  String kasus) {
		jcAbout.tekanEnter();
		if (kasus.equals("Nama")) {
			assertEquals(jcAbout.getValidNamaTrainerLength(), input);
		} else if (kasus.equals("Jabatan")) {
			assertEquals(jcAbout.getValidJabatanTrainerLength(), input);
		} else {
			assertEquals(jcAbout.getValidProfileTrainerLength(), input);
		}
		extentTest.log(LogStatus.PASS, kode + " Admin menekan tombol enter " + kasus + " karakter pada keyboard " + input);
	}
}
