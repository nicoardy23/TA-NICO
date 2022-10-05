package cucumber.framework.runner.jcadmin;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.jcadmin.JCAdminAboutPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JCAdminAboutEditTrainerNegativeImpl {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private static JCAdminAboutPage jcAbout;
	String strDelay = Constants.GLOB_PARAM_DELAY;
	
	public JCAdminAboutEditTrainerNegativeImpl() {
		driver = JCAdminHooks.driver;
		extentTest = JCAdminHooks.extentTest;
		driver.get(Constants.URL_JCADMIN_LOGIN);
		jcAbout = new JCAdminAboutPage();
	}
	
	/*===========================================================*/
	/*Test Edit Foto Trainer Negative Dengan Format Selain Gambar*/
	/*===========================================================*/
	@When("^(.*) Admin menekan kotak profile trainer negative (.*)$")
	public void kode_admin_menekan_kotak_profile_trainer_negative_case(String kode, String kasus) {
	    jcAbout.goToAbout();
		jcAbout.editDataTrainer();
		extentTest.log(LogStatus.PASS, kode + " Admin menekan kotak profile trainer negative " + kasus);
	}

	@When("^(.*) Admin mengganti foto trainer negative dengan (.*)$")
	public void kode_admin_mengganti_foto_trainer_negative_dengan_foto(String kode, String foto) {
	    jcAbout.fotoTrainerOutline(foto);
	    extentTest.log(LogStatus.PASS, kode + " Admin mengganti foto trainer negative dengan " + foto);
	}

	@Then("^(.*) Admin menekan tombol simpan trainer negative (.*)$")
	public void kode_admin_menekan_tombol_simpan_trainer_negative_case(String kode, String kasus) {
	    jcAbout.simpanData();
	    assertTrue(jcAbout.getInvalidImageType().contains("The supplied file is not a supported image type"));
	    extentTest.log(LogStatus.PASS, kode + " Admin menekan tombol simpan trainer negative " + kasus);
	}
}
