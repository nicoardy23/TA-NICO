
package cucumber.framework.page.jcadmin;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.framework.connection.DriverSingleton;
import cucumber.framework.constant.Constants;
import cucumber.framework.utils.Utils;

public class JCAdminAboutPage extends JCAdminLoginPage {
	private WebDriver driver;
	private String strDelay = Constants.GLOB_PARAM_DELAY;

	public JCAdminAboutPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
		super.LoginPage("ucen1315@gmail.com", "a");
	}
	
	public static String driverWaitTxt(WebDriver driver, int delays, WebElement element) {
		return new WebDriverWait(driver, Duration.ofSeconds(delays))
				.until(ExpectedConditions.visibilityOf(element)).getText();
	}
	
	/*----- Main -----*/
	@FindBy(xpath = "//ul[@id='simple-bar']/div/div[2]/div/div/div/li[5]/a/span")
	private WebElement btnAbout;
	@FindBy(linkText = "Tambah")
	private WebElement btnTambahTrainer;
	@FindBy(xpath = "//input[@placeholder='Search Nama Peserta']")
	private WebElement btnCariTrainer;
	@FindBy(linkText = "3")
	private WebElement pindahHalaman;
	@FindBy(css = "li[class='active page-item'] a[class='page-link']")
	private WebElement validPindahHalaman;	
	
	/*----- Tambah -----*/
	@FindBy(name = "uploadedFile")
	private WebElement tambahFotoTrainer;
	@FindBy(name = "nama_trainer")
	private WebElement tambahNamaTrainer;
	@FindBy(name = "jabatan")
	private WebElement tambahJabatanTrainer;
	@FindBy(name = "isi_profil")
	private WebElement tambahProfileTrainer;
	@FindBy(id = "exampleFormControlSelect9")
	private WebElement tambahStatusPublish;
	@FindBy(name = "mysubmit")
	private WebElement btnSubmit;
	
	/*----- Edit -----*/
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[4]/figure[1]/a[1]/div[1]")
	private WebElement ambilProfilTrainer;
	@FindBy(xpath = "//figure[1]//a[1]//img[1]")
	private WebElement tekanProfilTrainer;
	@FindBy(xpath = "//input[@id='filename']")
	private WebElement editFotoTrainer;
	@FindBy(xpath = "//input[@placeholder='Nama Trainer']")
	private WebElement editNamaTrainer;
	@FindBy(xpath = "//input[@placeholder='Jabatan']")
	private WebElement editJabatanTrainer;
	@FindBy(xpath = "//textarea[@name='isi_profil']")
	private WebElement editProfileTrainer;
	@FindBy(xpath = "//input[@value='Pilih Gambar Ulang']")
	private WebElement editFotoTrainerOutline;

	/*----- Validasi -----*/
	@FindBy(xpath = "//h3[normalize-space()='List Trainer']")
	private WebElement validAbout;
	@FindBy(xpath = "//alert[@class='alert alert-success']")
	private WebElement validTambah;
	@FindBy(xpath = "//div[@class='alert alert-danger mt-2']")
	private WebElement invalidInput;
//	@FindBy(xpath = "//p[contains(text(),'NicoArdyTestPanjangggggggggggggggggggggggggggggggg')]")
//	private WebElement validNamaLength;
	@FindBy(xpath = "//figure[1]//a[1]//div[1]//p[2]")
	private WebElement validNamaLength;
	@FindBy(xpath = "//figure[1]//a[1]//div[1]//p[3]")
	private WebElement validJabatanLength;
//	@FindBy(xpath = "//p[contains(text(),'NicoArdyTestProfilePanjanggggggggggggggggggggggggg')]")
//	private WebElement validProfileLength;
	@FindBy(xpath = "//figure[1]//a[1]//div[1]//p[4]")
	private WebElement validProfileLength;
	@FindBy(xpath = "//div[@class='header']//p[1]")
	private WebElement invalidImageType;
	@FindBy(xpath = "//b[normalize-space()='Total Search : 0 Data']")
	private WebElement invalidNamaLength;
	

	public void goToAbout() {
		Utils.delay(2, strDelay);
		this.btnAbout.click();
	}
	
	public void tambahTrainer() {
		Utils.delay(2, strDelay);
		this.btnTambahTrainer.click();
	}
	
	public void fotoTrainer(String foto) {
		Utils.delay(2, strDelay);
		this.tambahFotoTrainer.sendKeys(foto);
	}
	
	public void tambahFotoTrainerAbs(String foto) {
		File upFile = new File(foto);
		String paste = upFile.getAbsolutePath();
		Utils.delay(2, strDelay);
		this.tambahFotoTrainer.sendKeys(paste);
	}
	
	public void fotoTrainerOutline(String foto) {
		Utils.littleScroll();
		Utils.delay(2, strDelay);
		this.editFotoTrainerOutline.click();
		File upFile = new File(foto);
		Utils.delay(2, strDelay);
		Utils.uploadFoto(upFile);
	}
	
	public void namaTrainer(String nama) {
		Utils.delay(2, strDelay);
		this.tambahNamaTrainer.sendKeys(nama);
	}
	
	public void jabatanTrainer(String jabatan) {
		Utils.delay(2, strDelay);
		this.tambahJabatanTrainer.sendKeys(jabatan);
	}
	
	public void profileTrainer(String profile) {
		Utils.delay(2, strDelay);
		this.tambahProfileTrainer.sendKeys(profile);
	}
	
	public void statusTrainer(String status) {
		Utils.delay(2, strDelay);
		Select selc = new Select(this.tambahStatusPublish);
		selc.selectByVisibleText(status);
	}
	
	public void simpanData() {
		Utils.fullScroll();;
		Utils.delay(2, strDelay);
		this.btnSubmit.click();
	}
	
	public String getValidAbout() {
		Utils.delay(2, strDelay);
		return driverWaitTxt(driver, 10, validAbout);
	}

	public String getValidTambah() {
		Utils.delay(2, strDelay);
		return driverWaitTxt(driver, 10, validTambah);
	}
	
	
	public void cariTrainer(String cari) {
		Utils.delay(2, strDelay);
		this.btnCariTrainer.click();
		Utils.delay(2, strDelay);
		this.btnCariTrainer.sendKeys(cari);
	}
	
	public void tekanEnter() {
		Utils.delay(2, strDelay);
		try {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		} catch (Exception e) {
			System.out.println("Next");
		}
	}
	
	public String getValidCari() {
		Utils.delay(2, strDelay);
		return driverWaitTxt(driver, 10, ambilProfilTrainer);
	}
	
	public void editDataTrainer() {
		this.tekanProfilTrainer.click();
	}
	
	public void editFotoTrainer() {
		this.editFotoTrainer.clear();
		this.editFotoTrainer.sendKeys("C:\\Users\\NEXSOFT\\Desktop\\Test TA\\mnk.PNG");
	}
	
	public void editNamaTrainer() {
		this.editNamaTrainer.clear();
		this.editNamaTrainer.sendKeys("Zanonim23");
	}
	
	public void editJabatanTrainer() {
		this.editJabatanTrainer.clear();
		this.editJabatanTrainer.sendKeys("Trainer Magang");
	}
	
	public void editProfileTrainer() {
		this.editProfileTrainer.clear();
		this.editProfileTrainer.sendKeys("Testing trainer baru");
	}
	
	public void editNamaInvalid(String input) {
		this.editNamaTrainer.clear();
		this.editNamaTrainer.sendKeys(input);
	}
	
	public void editJabatanInvalid(String input) {
		this.editJabatanTrainer.clear();
		this.editJabatanTrainer.sendKeys(input);
	}
	
	public void editProfileInvalid(String input) {
		this.editProfileTrainer.clear();
		this.editProfileTrainer.sendKeys(input);
	}
	
	
	public void pindahHalaman() {
		Utils.fullScroll();
		Utils.delay(2, strDelay);
		this.pindahHalaman.click();
	}
	
	public String getValidPindah() {
		Utils.fullScroll();
		return driverWaitTxt(driver, 10, validPindahHalaman);
	}
	
	public void gantiStatus(String status) {
		this.tambahStatusPublish.sendKeys(status);
	}
	
	public String getValidStatus() {
		return driverWaitTxt(driver, 10, tambahStatusPublish);
	}
	
	public String getInvalidInput() {
		return driverWaitTxt(driver, 10, invalidInput);
	}
	
	public String getValidNamaTrainerLength() {
		return driverWaitTxt(driver, 10, validNamaLength);
	}
	
	public String getValidJabatanTrainerLength() {
		return driverWaitTxt(driver, 10, validJabatanLength);
	}
	
	public String getValidProfileTrainerLength() {
		return driverWaitTxt(driver, 10, validProfileLength);
	}

	public String getInvalidNamaTrainerLength() {
		return driverWaitTxt(driver, 10, invalidNamaLength);
	}
	
	public String getInvalidImageType() {
		return driverWaitTxt(driver, 10, invalidImageType);
	}
	
    //li[class='active page-item'] a[class='page-link']
	//div[class='page-body'] li:nth-child(1) a:nth-child(1)
}
