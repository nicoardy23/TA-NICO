package cucumber.framework.runner.jcadmin;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.jcadmin.JCAdminBlogPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JCAdminBlogFindAndEditNegativeImpl {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private static JCAdminBlogPage jcBlog;
	String strDelay = Constants.GLOB_PARAM_DELAY;
	
	public JCAdminBlogFindAndEditNegativeImpl() {
		driver = JCAdminHooks.driver;
		extentTest = JCAdminHooks.extentTest;
		driver.get(Constants.URL_JCADMIN_LOGIN);
		jcBlog = new JCAdminBlogPage();
	}
	
	/*============================*/
	/*Test Edit Blog Mengubah Foto*/
	/*============================*/
	@When("BL001N Admin mencari judul blog dan menekan tombol enter edit foto")
	public void bl001n_admin_mencari_judul_blog_dan_menekan_tombol_enter_edit_foto() {
	    jcBlog.goToBlog();
	    jcBlog.cariJudulBlog("Ayam Terbang");
	    jcBlog.tekanEnter();
	    extentTest.log(LogStatus.PASS, "BL001N Admin mencari judul blog dan menekan tombol enter edit foto");
	}

	@When("BL001N Admin menekan kotak blog edit foto")
	public void bl001n_admin_menekan_kotak_blog_edit_foto() {
		jcBlog.tekanKotakBlog();
		extentTest.log(LogStatus.PASS, "BL001N Admin menekan kotak blog edit foto");
	}

	@When("BL001N Admin mengubah foto blog edit foto")
	public void bl001n_admin_mengubah_foto_blog_edit_foto() {
	    jcBlog.pilihFotoUlang(".\\src\\main\\resources\\gambarnico\\maung_1664337134914.raw");
	    extentTest.log(LogStatus.PASS, "BL001N Admin mengubah foto blog edit foto");
	}

	@Then("BL001N Admin menekan button simpan blog edit foto")
	public void bl001n_admin_menekan_button_simpan_blog_edit_foto() {
	    jcBlog.klikSimpan();
	    assertTrue(jcBlog.getValidFoto().contains("maung_1664337134914.raw"));
	    extentTest.log(LogStatus.PASS, "BL001N Admin menekan button simpan blog edit foto");
	}
	
	/*=============================*/
	/*Test Edit Blog Mengubah Judul*/
	/*=============================*/
	@When("BL002N Admin mencari judul blog dan menekan tombol enter edit judul")
	public void bl002n_admin_mencari_judul_blog_dan_menekan_tombol_enter_edit_judul() {
		jcBlog.goToBlog();
		jcBlog.cariJudulBlog("Ayam Terbang");
		jcBlog.tekanEnter();
		extentTest.log(LogStatus.PASS, "BL002N Admin mencari judul blog dan menekan tombol enter edit judul");
	}

	@When("BL002N Admin menekan kotak blog edit judul")
	public void bl002n_admin_menekan_kotak_blog_edit_judul() {
		jcBlog.tekanKotakBlog();
		extentTest.log(LogStatus.PASS, "BL001N Admin menekan kotak blog edit judul");
	}

	@Then("BL002N Admin mengubah judul blog edit judul")
	public void bl002n_admin_mengubah_judul_blog_edit_judul() {
	    jcBlog.editJudulBlog("Ayam Hutan");
	    extentTest.log(LogStatus.PASS, "BL002N Admin mengubah judul blog edit judul");
	}
	
	/*==============================*/
	/*Test Edit Blog Mengubah Status*/
	/*==============================*/
	@When("^(.*) Admin mencari judul blog lalu menekan tombol enter edit (.*)$")
	public void kode_admin_mencari_judul_blog_lalu_menekan_tombol_enter_edit_status(String kode, String status) {
		jcBlog.goToBlog();
		if (status.equals("publish No Active") || status.equals("set to home Yes")) {
			jcBlog.cariJudulBlog("Ayam Berenang");
		} else {			
			jcBlog.cariJudulBlog("Ayam Terbang");
		}
		jcBlog.tekanEnter();
		extentTest.log(LogStatus.PASS, kode + "Admin mencari judul blog lalu menekan tombol enter edit status");
	}

	@When("^(.*) Admin menekan kotak blog edit status$")
	public void kode_admin_menekan_kotak_blog_edit_status(String kode) {
		jcBlog.tekanKotakBlog();
		extentTest.log(LogStatus.PASS, kode + "Admin menekan kotak blog edit status");
	}

	@When("^(.*) Admin mengubah status (.*) menjadi (.*)$")
	public void kode_admin_mengubah_status_status_menjadi_ubah(String kode, String status, String ubah) {
		if (status.equals("publish Active") || status.equals("publish No Active")) {
			jcBlog.editPublish(ubah);
		} else {
			jcBlog.editSetTop(ubah);
		}
	    extentTest.log(LogStatus.PASS, kode + " Admin mengubah status " + status + " menjadi " + ubah);
	}

	@Then("^(.*) Admin menekan tombol simpan edit status (.*) menjadi (.*)$")
	public void kode_admin_menekan_tombol_simpan_edit_status_status_menjadi_ubah(String kode, String status, String ubah) {
		jcBlog.klikSimpan();
		if (status.equals("publish Active") || status.equals("publish No Active")) {
			assertEquals(jcBlog.getValidStatusPublish(), ubah);
		} else {
			assertEquals(jcBlog.getValidStatusSetTop(), ubah);
		}
	    extentTest.log(LogStatus.PASS, kode + "Admin menekan tombol simpan edit status " + status + " menjadi " + ubah);
	}
	
	/*===============================*/
	/*Test Edit Blog Mengubah Content*/
	/*===============================*/
	@When("^(.*) Admin mencari judul blog dan menekan enter edit (.*)$")
	public void kode_admin_mencari_judul_blog_dan_menekan_enter_edit_case(String kode, String kasus) {
	    jcBlog.goToBlog();
	    jcBlog.cariJudulBlog("Ayam Terbang");
		jcBlog.tekanEnter();
		extentTest.log(LogStatus.PASS, kode + " Admin mencari judul blog dan menekan enter edit " + kasus);
	}

	@When("^(.*) Admin menekan kotak blog edit isi (.*)$")
	public void kode_admin_menekan_kotak_blog_edit_isi_case(String kode, String kasus) {
		jcBlog.tekanKotakBlog();
		extentTest.log(LogStatus.PASS, kode + " Admin menekan kotak blog edit isi " + kasus);
	}

	@When("^(.*) Admin mengubah value (.*) menjadi (.*)$")
	public void kode_admin_mengubah_value_case_menjadi_ubah(String kode, String kasus, String ubah) {
	    if (kasus.equals("Content")) {
			jcBlog.editContentBody(ubah);
		} else {
			jcBlog.editContentPreview(ubah);
		}
	    extentTest.log(LogStatus.PASS, kode + " Admin mengubah value " + kasus + " menjadi " + ubah);
	}

	@When("^(.*) Admin menekan tombol simpan blog edit (.*)$")
	public void kode_admin_menekan_tombol_simpan_blog_edit_case(String kode, String kasus) {
	    jcBlog.klikSimpan();
	    extentTest.log(LogStatus.PASS, kode + " Admin menekan tombol simpan blog edit " + kasus);
	}

	@When("^(.*) Admin menekan menu Blog$")
	public void kode_admin_menekan_menu_blog(String kode) {
	    jcBlog.goToBlog();
	    extentTest.log(LogStatus.PASS, kode + " Admin menekan menu Blog");
	}

	@Then("^(.*) Admin menekan kotak blog untuk validasi (.*) bernilai (.*)$")
	public void kode_admin_menekan_kotak_blog_untuk_validasi_case_bernilai_ubah(String kode, String kasus, String ubah) {
		jcBlog.tekanKotakBlog();
		if (kasus.equals("Content")) {
			assertEquals(jcBlog.getValidContentPreview(), ubah);
		} else {
			assertEquals(jcBlog.getValidContentBody(), ubah);
		}
		extentTest.log(LogStatus.PASS, kode + " Admin menekan kotak blog untuk validasi " + kasus + " bernilai " + ubah);
	}
	
	/*===============================*/
	/*Test Edit Content Invalid Input*/
	/*===============================*/
	@When("^(.*) Admin mencari judul blog dan menekan enter invalid Content Preview$")
	public void kode_admin_mencari_judul_blog_dan_menekan_enter_invalid_content_preview(String kode) {
		jcBlog.goToBlog();
	    jcBlog.cariJudulBlog("Ayam Terbang");
		jcBlog.tekanEnter();
		extentTest.log(LogStatus.PASS, kode + " Admin mencari judul blog dan menekan enter invalid Content Preview");
	}

	@When("^(.*) Admin menekan kotak blog invalid Content Preview$")
	public void kode_admin_menekan_kotak_blog_invalid_content_preview(String kode) {
		jcBlog.tekanKotakBlog();
		extentTest.log(LogStatus.PASS, kode + " Admin menekan kotak blog invalid Content Preview");
	}

	@When("^(.*) Admin mengubah isi Content Preview (.*)$")
	public void kode_admin_mengubah_isi_content_preview_ubah(String kode, String ubah) {
		jcBlog.editContentPreview(ubah);
		extentTest.log(LogStatus.PASS, kode + " Admin mengubah isi Content Preview " + ubah);
	}

	@Then("^(.*) Admin menekan tombol simpan blog invalid Content Preview$")
	public void kode_admin_menekan_tombol_simpan_blog_invalid_content_preview(String kode) {
		jcBlog.klikSimpan();
		if (kode.equals("BL011N")) {
			assertTrue(jcBlog.getInvalidInputContent().contains("Karakter (<|>|'|\") tidak diizinkan"));
		} else {
			assertTrue(jcBlog.getInvalidInputContent().contains("Harap isi content perview"));
		}
	    extentTest.log(LogStatus.PASS, kode + " Admin menekan tombol simpan blog invalid Content Preview");
	}
}
