package cucumber.framework.runner.jcadmin;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.jcadmin.JCAdminAboutPage;
import cucumber.framework.page.jcadmin.JCAdminContactMessages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JCAdminContactMessagesGetMessageImpl {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private static JCAdminContactMessages jcContact;
	String strDelay = Constants.GLOB_PARAM_DELAY;
	
	public JCAdminContactMessagesGetMessageImpl() {
		driver = JCAdminHooks.driver;
		extentTest = JCAdminHooks.extentTest;
		driver.get(Constants.URL_JCADMIN_LOGIN);
		jcContact = new JCAdminContactMessages();
	}
	
	/*=====================================*/
	/*Test Membuka Halaman Contact Messages*/
	/*=====================================*/
	@Given("CO001P Admin login dan membuka halaman Contact Messages")
	public void co001p_admin_login_dan_membuka_halaman_contact_messages() {
		jcContact.goToContactMessages();
		extentTest.log(LogStatus.PASS, "CO001P Admin login dan membuka halaman Contact Messages");
	}

	@Then("CO001P Halaman about terbuka")
	public void co001p_halaman_about_terbuka() {
		assertEquals(jcContact.getValidCoMes(), "Data Contact Messages");
	    extentTest.log(LogStatus.PASS, "CO001P Halaman about terbuka");
	}

	/*====================================*/
	/*Test Menampilkan Data Dengan Sorting*/
	/*====================================*/
	@When("^(.*) Admin membuka halaman Contact Messages$")
	public void kode_admin_membuka_halaman_contact_messages(String kode) {
	    jcContact.goToContactMessages();
	    extentTest.log(LogStatus.PASS, kode + "Admin membuka halaman Contact Messages");
	}
	
	@When("^(.*) Admin memilih sorting berdasarkan (.*)$")
	public void kode_admin_memilih_sorting_berdasarkan_sorting(String kode, String sort) {
		if (sort.equals("Nama")) {
			jcContact.sortSelection("Email");
			jcContact.sortSelection(sort);
		} else {
			jcContact.sortSelection(sort);
		}
	    extentTest.log(LogStatus.PASS, kode + " Admin memilih sorting berdasarkan " + sort);
	}

	@Then("^(.*) Admin mendapat data yang disorting berdasarkan (.*)$")
	public void kode_admin_mendapat_data_yang_disorting_berdasarkan_sorting(String kode, String sort) {
	    if (sort.equals("Nama")) {
			assertFalse(jcContact.getValidNama().contains("zzozoo"));
		} else if (sort.equals("Email")) {
			assertEquals(jcContact.getValidEmail(), "1@gm.com");
		} else if (sort.equals("Phone Number")) {
			assertEquals(jcContact.getValidPhoneNumber(), "0");
		} else if (sort.equals("Subject")) {
			assertEquals(jcContact.getValidSubject(), "0000011111zzzozooo");
		} else {
			assertEquals(jcContact.getValidMessage(), "000011111");
		}
	    extentTest.log(LogStatus.PASS, kode + " Admin mendapat data yang disorting berdasarkan " + sort);
	}
	
	

}
