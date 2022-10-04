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
	private static JCAdminAboutPage JCAbout;
	String strDelay = Constants.GLOB_PARAM_DELAY;
	
	public JCAdminAboutEditInputTrainerNegativeImpl() {
		driver = JCAdminHooks.driver;
		extentTest = JCAdminHooks.extentTest;
		driver.get(Constants.URL_JCADMIN_LOGIN);
		JCAbout = new JCAdminAboutPage();
	}
	
	/*=====================================*/
	/*Test Edit Input Data Trainer Negative*/
	/*=====================================*/
	@When("^(.*) Admin menekan kotak profile trainer inputan negative (.*)$")
	public void kode_admin_menekan_kotak_profile_trainer_inputan_negative_case(String kode, String kasus) {
		JCAbout.goToAbout();
	    JCAbout.editDataTrainer();
	    extentTest.log(LogStatus.PASS, kode + " Admin menekan kotak profile trainer inputan negative " + kasus);
	}

	@When("^(.*) Admin mengubah inputan (.*) trainer negative menjadi (.*)$")
	public void kode_admin_mengubah_inputan_case_trainer_negative_menjadi_input(String kode, String kasus, String input) {
		if (kasus.equals("Nama")) {
			JCAbout.editNamaInvalid(input);
		} else if (kasus.equals("Jabatan")) {
			JCAbout.editJabatanInvalid(input);
		} else {
			JCAbout.editProfileInvalid(input);
		}
	    extentTest.log(LogStatus.PASS, kode + " Admin mengubah inputan " + kasus + " trainer negative menjadi " + input);
	}

	@Then("^(.*) Admin menekan tombol simpan data trainer inputan negative (.*)$")
	public void kode_admin_menekan_tombol_simpan_data_trainer_inputan_negative_case(String kode, String kasus) {
		JCAbout.simpanData();
	    assertTrue(JCAbout.getInvalidInput().contains("Karakter (<|>|'|\") tidak diizinkan"));
	    extentTest.log(LogStatus.PASS, kode + " Admin menekan tombol simpan data trainer inputan negative " + kasus);
	}
	
}
