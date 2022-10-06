package cucumber.framework.runner.jcadmin;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.jcadmin.JCAdminContactMessages;
import cucumber.framework.utils.Utils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JCAdminContactMessagesSearchNegativeImpl {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private static JCAdminContactMessages jcContact;
	String strDelay = Constants.GLOB_PARAM_DELAY;
	
	public JCAdminContactMessagesSearchNegativeImpl() {
		driver = JCAdminHooks.driver;
		extentTest = JCAdminHooks.extentTest;
		driver.get(Constants.URL_JCADMIN_LOGIN);
		jcContact = new JCAdminContactMessages();
	}
	
	/*=====================================*/
	/*Test Cari Data Negative Berdasar Nama*/
	/*=====================================*/
	@When("^(.*) Admin memilih opsi sorting berdasarkan Nama negative$")
	public void kode_admin_memilih_opsi_sorting_berdasarkan_nama_negative(String kode) {
	    jcContact.goToContactMessages();
	    jcContact.sortSelection("Nama");
	    extentTest.log(LogStatus.PASS, kode + " Admin memilih opsi sorting berdasarkan Nama negative");
	}

	@When("^(.*) Admin mencari (.*) pada kolom cari berdasar Nama negative$")
	public void kode_admin_mencari_cari_pada_kolom_cari_berdasar_nama_negative(String kode, String cari) {
	    jcContact.searchData(cari);
	    extentTest.log(LogStatus.PASS, kode + " Admin mencari " + cari + " pada kolom pencarian berdasar Nama negative");
	}

	@Then("^(.*) Admin menekan enter pada keyboard cari (.*) berdasar Nama negative$")
	public void kode_admin_menekan_enter_pada_keyboard_cari_data_berdasar_nama_negative(String kode, String data) {
		jcContact.tekanEnter();
		assertEquals(jcContact.getInvalidCariData(), "Total Search : 0 Data");
		extentTest.log(LogStatus.PASS, kode + " Admin menekan enter pada keyboard cari " + data + " berdasar Nama negative");
	}
	
	/*======================================*/
	/*Test Cari Data Negative Berdasar Email*/
	/*======================================*/
	@When("^(.*) Admin memilih opsi sorting berdasarkan Email negative$")
	public void kode_admin_memilih_opsi_sorting_berdasarkan_email_negative(String kode) {
		jcContact.goToContactMessages();
	    jcContact.sortSelection("Email");
	    extentTest.log(LogStatus.PASS, kode + " Admin memilih opsi sorting berdasarkan Email negative");
	}

	@When("^(.*) Admin mencari (.*) pada kolom cari berdasar Email negative$")
	public void kode_admin_mencari_cari_pada_kolom_cari_berdasar_email_negative(String kode, String cari) {
		jcContact.searchData(cari);
	    extentTest.log(LogStatus.PASS, kode + " Admin mencari " + cari + " pada kolom pencarian berdasar Email negative");
	}

	@Then("^(.*) Admin menekan enter pada keyboard cari (.*) berdasar Email negative$")
	public void kode_admin_menekan_enter_pada_keyboard_cari_data_berdasar_email_negative(String kode, String data) {
		jcContact.tekanEnter();
		assertEquals(jcContact.getInvalidCariData(), "Total Search : 0 Data");
		extentTest.log(LogStatus.PASS, kode + " Admin menekan enter pada keyboard cari " + data + " berdasar Email negative");
	}
	
	/*=============================================*/
	/*Test Cari Data Negative Berdasar Phone Number*/
	/*=============================================*/
	@When("^(.*) Admin memilih opsi sorting berdasarkan Phone Number negative$")
	public void kode_admin_memilih_opsi_sorting_berdasarkan_phone_number_negative(String kode) {
		jcContact.goToContactMessages();
	    jcContact.sortSelection("Phone Number");
	    extentTest.log(LogStatus.PASS, kode + " Admin memilih opsi sorting berdasarkan Phone Number negative");
	}

	@When("^(.*) Admin mencari (.*) pada kolom cari berdasar Phone Number negative$")
	public void kode_admin_mencari_cari_pada_kolom_cari_berdasar_phone_number_negative(String kode, String cari) {
		jcContact.searchData(cari);
	    extentTest.log(LogStatus.PASS, kode + " Admin mencari " + cari + " pada kolom cari berdasar Phone Number negative");
	}

	@Then("^(.*) Admin menekan enter pada keyboard cari (.*) berdasar Phone Number negative$")
	public void kode_admin_menekan_enter_pada_keyboard_cari_data_berdasar_phone_number_negative(String kode, String data) {
		jcContact.tekanEnter();
		assertEquals(jcContact.getInvalidCariData(), "Total Search : 0 Data");
		extentTest.log(LogStatus.PASS, kode + " Admin menekan enter pada keyboard cari " + data + " berdasar Phone Number negative");
	}
	
	/*========================================*/
	/*Test Cari Data Negative Berdasar Subject*/
	/*========================================*/
	@When("^(.*) Admin memilih opsi sorting berdasarkan Subject negative$")
	public void kode_admin_memilih_opsi_sorting_berdasarkan_subject_negative(String kode) {
		jcContact.goToContactMessages();
	    jcContact.sortSelection("Subject");
	    extentTest.log(LogStatus.PASS, kode + " Admin memilih opsi sorting berdasarkan Subject negative");
	}

	@When("^(.*) Admin mencari (.*) pada kolom cari berdasar Subject negative$")
	public void kode_admin_mencari_cari_pada_kolom_cari_berdasar_subject_negative(String kode, String cari) {
		jcContact.searchData(cari);
	    extentTest.log(LogStatus.PASS, kode + " Admin mencari " + cari + " pada kolom cari berdasar Subject negative");
	}

	@Then("^(.*) Admin menekan enter pada keyboard cari (.*) berdasar Subject negative$")
	public void kode_admin_menekan_enter_pada_keyboard_cari_data_berdasar_subject_negative(String kode, String data) {
		jcContact.tekanEnter();
		assertEquals(jcContact.getInvalidCariData(), "Total Search : 0 Data");
		extentTest.log(LogStatus.PASS, kode + " Admin menekan enter pada keyboard cari " + data + " berdasar Subject negative");
	}
	
	/*=======================================*/
	/*Test Cari Data Dengan Tekan Tombol Cari*/
	/*=======================================*/
	@When("^(.*) Admin membuka halaman admin dengan tombol cari$")
	public void kode_admin_membuka_halaman_admin_dengan_tombol_cari(String kode) {
	    jcContact.goToContactMessages();
	    extentTest.log(LogStatus.PASS, kode + " Admin membuka halaman admin dengan tombol cari");
	}
	
	@When("^(.*) Admin memilih obsional sorting berdasarkan (.*)$")
	public void kode_admin_memilih_obsional_sorting_berdasarkan_sorting(String kode, String sort) {
	    jcContact.sortSelection(sort);
	    extentTest.log(LogStatus.PASS, kode + " Admin memilih obsional sorting berdasarkan " + sort);
	}

	@When("^(.*) Admin memasukkan (.*) berupa (.*) tekan tombol cari$")
	public void kode_admin_memasukkan_sorting_berupa_input_tekan_tombol_cari(String kode, String sort, String input) {
	    jcContact.searchData(input);
	    extentTest.log(LogStatus.PASS, kode + " Admin memasukkan " + sort + " berupa " + input + " tekan tombol cari");
	}

	@Then("^(.*) Admin menekan tombol cari (.*) pada kolom pencarian berdasar (.*)$")
	public void kode_admin_menekan_tombol_cari_input_pada_kolom_pencarian_berdasar_sorting(String kode, String input, String sort) {
		jcContact.tekanBtnCari();
		Utils.delay(1, strDelay);
		if (sort.equals("Nama")) {
			assertEquals(jcContact.getValidNama(), input);
		} else if (sort.equals("Email")) {
			assertEquals(jcContact.getValidEmail(), input);
		} else if (sort.equals("Phone Number")) {
			assertEquals(jcContact.getValidPhoneNumber(), input);
		} else if (sort.equals("Subject")) {
			assertEquals(jcContact.getValidSubject(), input);
		} else {
			assertEquals(jcContact.getValidMessage(), input);
		}
		extentTest.log(LogStatus.PASS, kode + " Admin menekan tombol cari " + input + " pada kolom pencarian berdasar " + sort);
	}
}
