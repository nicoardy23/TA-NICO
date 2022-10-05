package cucumber.framework.runner.jcadmin;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.jcadmin.JCAdminContactMessages;
import cucumber.framework.utils.Utils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JCAdminContactMessagesSearchMessagesImpl {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private static JCAdminContactMessages jcContact;
	String strDelay = Constants.GLOB_PARAM_DELAY;
	
	public JCAdminContactMessagesSearchMessagesImpl() {
		driver = JCAdminHooks.driver;
		extentTest = JCAdminHooks.extentTest;
		driver.get(Constants.URL_JCADMIN_LOGIN);
		jcContact = new JCAdminContactMessages();
	}
	
	/*==========================================*/
	/*Test Cari Data Message Berdasarkan sorting*/
	/*==========================================*/
	@When("^(.*) Admin membuka halaman Contact Messages cari$")
	public void kode_admin_membuka_halaman_contact_messages_cari(String kode) {
		jcContact.goToContactMessages();
	    extentTest.log(LogStatus.PASS, kode + "Admin membuka halaman Contact Messages cari");
	}

	@When("^(.*) Admin memilih sorting cari berdasarkan (.*)$")
	public void kode_admin_memilih_sorting_cari_berdasarkan_sorting(String kode, String sort) {
		jcContact.sortSelection(sort);
		extentTest.log(LogStatus.PASS, kode + " Admin memilih sorting cari berdasarkan " + sort);
	}

	@When("^(.*) Admin mencari (.*) trainer dan menekan enter pada keyboard cari$")
	public void kode_admin_mencari_data_trainer_dan_menekan_enter_pada_keyboard_cari(String kode, String data) {
		jcContact.searchData(data);
		Utils.delay(1, strDelay);
	    jcContact.tekanEnter();
	    extentTest.log(LogStatus.PASS, kode + " Admin mencari " + data + " trainer dan menekan enter pada keyboard cari");
	}

	@Then("^(.*) Admin mendapat data (.*) yang disorting dengan (.*)$")
	public void kode_admin_mendapat_data_yang_disorting_dengan_sorting(String kode, String data, String sort) {
		if (sort.equals("Nama")) {
			assertEquals(jcContact.getValidNama(), data);
		} else if (sort.equals("Email")) {
			assertEquals(jcContact.getValidEmail(), data);
		} else if (sort.equals("Phone Number")) {
			assertEquals(jcContact.getValidPhoneNumber(), data);
		} else if (sort.equals("Subject")) {
			assertEquals(jcContact.getValidSubject(), data);
		} else {
			assertEquals(jcContact.getValidMessage(), data);
		}
	    extentTest.log(LogStatus.PASS, kode + " Admin mendapat " + data + " yang disorting dengan " + sort);
	}
	
}
