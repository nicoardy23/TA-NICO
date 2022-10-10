package cucumber.framework.page.jcadmin;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;

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

public class JCAdminBlogPage  extends JCAdminLoginPage{
	private WebDriver driver;
	private String strDelay = Constants.GLOB_PARAM_DELAY;

	public JCAdminBlogPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
		super.LoginPage("ucen1315@gmail.com", "a");
	}
	
	/*----- Extras Nico -----*/
	public static String driverWaitTxt(WebDriver driver, int delays, WebElement element) {
		return new WebDriverWait(driver, Duration.ofSeconds(delays))
				.until(ExpectedConditions.visibilityOf(element)).getText();
	}

	public static void driverWaitClick(WebDriver driver, int delays, WebElement element) {
		new WebDriverWait(driver, Duration.ofSeconds(delays))
				.until(ExpectedConditions.visibilityOf(element)).click();
	}
	/*-----------------------*/
	
	@FindBy(linkText = "Home")
	private WebElement btnHome;
	@FindBy (xpath = "//li[6]//a[1]")
	private WebElement btnBlog;
	@FindBy (linkText = "Tambah")
	private WebElement btnTambahBlog;
	
	@FindBy(xpath= "/html[1]/body[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/input[1]")
	private WebElement uploadXpathAbs;
	@FindBy(xpath="//input[@name='uploadedFile']")
	private WebElement uploadXpathRef;
	@FindBy(xpath="//input[@type='file']")
	private WebElement uploadXpathRef2;
	@FindBy(xpath ="//figure[1]//a[1]//img[1]")
	private WebElement blogPertama;
	
	@FindBy(id = "judul")
	private WebElement judulBlog;
	@FindBy(id = "exampleFormControlSelect9")
	private WebElement optPublish;
	@FindBy(name = "set_top")
	private WebElement optSetTop;
	@FindBy(xpath ="/html[1]/body[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[5]/div[1]/textarea[1]")
	private WebElement bodyPreview;
	@FindBy(xpath = "//form[@id='frmregister']/div[2]/div/div[6]/div/div/div[3]/div")
	private WebElement fieldBody;
	@FindBy(xpath="//input[@name='mysubmit']")
	private WebElement btnEditSubmit;
	
	/*----- Extras Nico -----*/
	@FindBy(xpath = "//input[@placeholder='Search Judul']")
	private WebElement cariJudul;
	@FindBy(xpath = "//img[@alt='Image description']")
	private WebElement tapKotakBlog;
	@FindBy(xpath = "//input[@value='Pilih Gambar Ulang']")
	private WebElement pilihGambarUlang;
	@FindBy(xpath = "//input[@id='filename']")
	private WebElement getValueFoto;
	@FindBy(xpath = "//input[@id='judul']")
	private WebElement editJudul;
	@FindBy(xpath = "//textarea[@name='body_preview']")
	private WebElement editBodyPreview;
	@FindBy(xpath = "//div[@role='textbox']")
	private WebElement editBodyField;
	@FindBy(xpath = "//div[@class='alert alert-danger mt-2']")
	private WebElement invalidInput;
	
	
	public void tambahBlogBaru() {
		this.btnBlog.click();
		this.btnTambahBlog.click();
		Utils.fullScroll();
		System.out.println("ini tambah baru");
	}
	public void goToBlog() {
		this.btnHome.click();
		this.btnBlog.click();
	}
	public void tekanTambahBlog() {
		this.btnTambahBlog.click();
	}
	public void clickUpload() {
		this.uploadXpathAbs.click();
	}
	
	/*
	 * EDIT JUDUL BLOG
	 */
	public void clickPertama() {
		this.blogPertama.click();
	}
	public void editJudul() {
		this.judulBlog.click();
		Utils.clearField();
		Utils.delay(3, strDelay);
		this.judulBlog.sendKeys("ini adalah judul blog pertama cucumber");
	}
	public void klikSimpanEditJudul() {
		this.btnEditSubmit.click();
	}
	
	/*
	 * EDIT BODY PREVIEW
	 */
	public void editBodyPreview() {
		Utils.setengahScroll("400");
		this.bodyPreview.click();
		Utils.delay(3, strDelay);
		clearField();
		Utils.delay(2, strDelay);
		this.bodyPreview.sendKeys("ini adalah body preview blog pertama cucumer");
		Utils.delay(3, strDelay);
	}
	public void klikSimpanEditBody() {
//		Utils.setengahScroll("2000");
		Utils.scrollFullMouse(200);
		this.btnEditSubmit.click();
		Utils.delay(2, strDelay);
	}
	public void clearField() {
		try {
			Robot rbtclr = new Robot();
			rbtclr.keyPress(KeyEvent.VK_CONTROL);
			rbtclr.keyPress(KeyEvent.VK_A);
			rbtclr.keyRelease(KeyEvent.VK_CONTROL);
			rbtclr.keyRelease(KeyEvent.VK_A);
			rbtclr.keyPress(KeyEvent.VK_BACK_SPACE);
			rbtclr.keyRelease(KeyEvent.VK_BACK_SPACE);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/*----- Extras Nico -----*/
	public void cariJudulBlog(String cari) {
		Utils.delay(2, strDelay);
		this.cariJudul.sendKeys(cari);
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
	
	public void tekanKotakBlog() {
		Utils.littleScroll();
		Utils.delay(2, strDelay);
		driverWaitClick(driver, 10, tapKotakBlog);
	}
	
	public void pilihFotoUlang(String foto) {
		Utils.littleScroll();
		Utils.delay(2, strDelay);
		driverWaitClick(driver, 10, pilihGambarUlang); 
		File upFile = new File(foto);
		Utils.delay(2, strDelay);
		Utils.uploadFoto(upFile);
	}
	
	public void klikSimpan() {
		Utils.fullScroll();
		Utils.delay(2, strDelay);
		driverWaitClick(driver, 10, btnEditSubmit); 
	}
	
	public String getValidFoto() {
		Utils.delay(2, strDelay);
		return this.getValueFoto.getAttribute("value");
	}
	
	public void editJudulBlog(String judul) {
		Utils.littleScroll();
		Utils.delay(2, strDelay);
		this.editJudul.sendKeys(judul);
	}
	
	public void editPublish(String status) {
		Utils.delay(2, strDelay);
		Select selc = new Select(this.optPublish);
		selc.selectByVisibleText(status);
	}
	
	public void editSetTop(String set) {
		Utils.delay(2, strDelay);
		Select selc = new Select(this.optSetTop);
		selc.selectByVisibleText(set);
	}
	
	public String getValidStatusPublish() {
		Select selc = new Select(this.optPublish);
		String get = selc.getFirstSelectedOption().getText();
		return get;
	}
	
	public String getValidStatusSetTop() {
		Select selc = new Select(this.optSetTop);
		String get = selc.getFirstSelectedOption().getText();
		return get;
	}
	
	public void editContentPreview(String content) {
		Utils.delay(2, strDelay);
		this.editBodyPreview.clear();
		Utils.delay(2, strDelay);
		this.editBodyPreview.sendKeys(content);
	}
	
	public void editContentBody(String content) {
		Utils.delay(2, strDelay);
		this.editBodyField.clear();
		Utils.delay(2, strDelay);
		this.editBodyField.sendKeys(content);
	}
	
	public String getValidContentPreview() {
		return driverWaitTxt(driver, 10, editBodyField);
	}
	
	public String getValidContentBody() {
		return driverWaitTxt(driver, 10, editBodyField);
	}
	
	public String getInvalidInputContent() {
		Utils.littleScroll();
		return driverWaitTxt(driver, 10, invalidInput);
	}
	
}
//driver.get("https://dev.ptdika.com/web_jc_v2/admin/blogs");
//driver.findElement(By.linkText("Tambah")).click();
//driver.findElement(By.name("uploadedFile")).click();
//driver.findElement(By.name("uploadedFile")).clear();
//driver.findElement(By.name("uploadedFile")).sendKeys("C:\\fakepath\\Screenshot 2022-09-27 150653.png");
//driver.findElement(By.id("judul")).click();
//driver.findElement(By.id("judul")).clear();
//driver.findElement(By.id("judul")).sendKeys("Perkembangan Game Mario");
//driver.findElement(By.id("exampleFormControlSelect9")).click();
//new Select(driver.findElement(By.id("exampleFormControlSelect9"))).selectByVisibleText("No Active");
//driver.findElement(By.name("set_top")).click();
//driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Set To Home :'])[1]/following::option[1]")).click();
//driver.findElement(By.name("body_preview")).clear();
//driver.findElement(By.name("body_preview")).sendKeys("Ini adalah konten preview");
//driver.findElement(By.xpath("//form[@id='frmregister']/div[2]/div/div[6]/div/div/div[3]/div")).click();
//// ERROR: Caught exception [unknown command [editContent]]
//driver.findElement(By.name("mysubmit")).click();driver.get("https://dev.ptdika.com/web_jc_v2/admin/blogs");
//driver.findElement(By.linkText("Tambah")).click();
//driver.findElement(By.name("uploadedFile")).click();
//driver.findElement(By.name("uploadedFile")).clear();
//driver.findElement(By.name("uploadedFile")).sendKeys("C:\\fakepath\\Screenshot 2022-09-27 150653.png");
//driver.findElement(By.id("judul")).click();
//driver.findElement(By.id("judul")).clear();
//driver.findElement(By.id("judul")).sendKeys("Perkembangan Game Mario");
//driver.findElement(By.id("exampleFormControlSelect9")).click();
//new Select(driver.findElement(By.id("exampleFormControlSelect9"))).selectByVisibleText("No Active");
//driver.findElement(By.name("set_top")).click();
//driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Set To Home :'])[1]/following::option[1]")).click();
//driver.findElement(By.name("body_preview")).clear();
//driver.findElement(By.name("body_preview")).sendKeys("Ini adalah konten preview");
//driver.findElement(By.xpath("//form[@id='frmregister']/div[2]/div/div[6]/div/div/div[3]/div")).click();
//// ERROR: Caught exception [unknown command [editContent]]
//driver.findElement(By.name("mysubmit")).click();