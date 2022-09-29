package cucumber.framework.page.jcadmin;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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
	
	@FindBy(xpath = "//ul[@id='simple-bar']/div/div[2]/div/div/div/li[5]/a/span")
	private WebElement btnAbout;
	@FindBy(linkText = "Tambah")
	private WebElement btnTambahTrainer;
	@FindBy(name = "cari")
	private WebElement btnCariTrainer;
	@FindBy(linkText = "2")
	private WebElement pindahHalaman;
	
	// Tambah
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
//	@FindBy(xpath = "//input[@name='mysubmit']")
//	private WebElement btnUpdate;
	
	// Edit
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

	// Validasi	
	@FindBy(xpath = "//h3[normalize-space()='List Trainer']")
	private WebElement validAbout;
	@FindBy(xpath = "//alert[@class='alert alert-success']")
	private WebElement validTambah;
	

	public void goToAbout() {
		Utils.delay(1, strDelay);
		this.btnAbout.click();
	}
	
	public void tambahTrainer() {
		Utils.delay(1, strDelay);
		this.btnTambahTrainer.click();
	}
	
	public void fotoTrainer(String foto) {
		Utils.delay(1, strDelay);
		this.tambahFotoTrainer.sendKeys(foto);
	}
	
	public void namaTrainer(String nama) {
		Utils.delay(1, strDelay);
		this.tambahNamaTrainer.sendKeys(nama);
	}
	
	public void jabatanTrainer(String jabatan) {
		Utils.delay(1, strDelay);
		this.tambahJabatanTrainer.sendKeys(jabatan);
	}
	
	public void profileTrainer(String profile) {
		Utils.delay(1, strDelay);
		this.tambahProfileTrainer.sendKeys(profile);
	}
	
	public void statusTrainer(String status) {
		Utils.delay(1, strDelay);
		Select selc = new Select(this.tambahStatusPublish);
		selc.selectByVisibleText(status);
	}
	
	public void simpanData() {
		Utils.fullScroll();
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Utils.delay(1, strDelay);
		this.btnSubmit.click();
	}
	
	public String getValidAbout() {
		Utils.delay(1, strDelay);
		return this.validAbout.getText();
	}

	public String getValidTambah() {
		Utils.delay(1, strDelay);
		return this.validTambah.getText();
	}
	
	
	public void cariTrainer(String cari) {
		Utils.delay(1, strDelay);
		this.btnCariTrainer.sendKeys(cari);
	}
	
	public void tekanEnter() throws AWTException {
		Utils.delay(1, strDelay);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public String getValidCari() {
		Utils.delay(1, strDelay);
		return this.ambilProfilTrainer.getText();
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
		this.editNamaTrainer.sendKeys("Anonim23");
	}
	
	public void editJabatanTrainer() {
		this.editJabatanTrainer.clear();
		this.editJabatanTrainer.sendKeys("Trainer Magang");
	}
	
	public void editProfileTrainer() {
		this.editProfileTrainer.clear();
		this.editProfileTrainer.sendKeys("Testing trainer baru");
	}
	
//	public void updateData() {
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//		Utils.delay(2, strDelay);
//		this.btnUpdate.click();
//	}
	
	public void gantiStatus(String status) {
		this.tambahStatusPublish.sendKeys(status);
	}
	
	public String getValidStatus() {
		return this.tambahStatusPublish.getText();
	}
}