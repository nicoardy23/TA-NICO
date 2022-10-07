package cucumber.framework.page.jcadmin;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
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

public class JCAdminContactMessages extends JCAdminLoginPage{
	private WebDriver driver;
	private String strDelay = Constants.GLOB_PARAM_DELAY;

	public JCAdminContactMessages() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
		super.LoginPage("ucen1315@gmail.com", "a");
	}
	
	public static String driverWaitTxt(WebDriver driver, int delays, WebElement element) {
		return new WebDriverWait(driver, Duration.ofSeconds(delays))
				.until(ExpectedConditions.visibilityOf(element)).getText();
	}
	
	/*----- Main -----*/
	@FindBy(linkText = "Contact Messages")
	private WebElement btnAbout;
	@FindBy(name = "st")
	private WebElement sortSelect;
	@FindBy(name = "cari")
	private WebElement search;
	@FindBy(xpath = "//div[@class='faq-form']//*[name()='svg']")
	private WebElement btnSearch;
	@FindBy(linkText = "3")
	private WebElement pindahHalaman;
	@FindBy(css = "li[class='active page-item'] a[class='page-link']")
	private WebElement validPindahHalaman;	
	@FindBy(xpath = "//a[@aria-label='Next']")
	private WebElement btnNextPage;
	@FindBy(xpath = "//a[normalize-space()='4']")
	private WebElement getValidPage;
	
	/*----- Validasi -----*/
	@FindBy(xpath = "//h3[normalize-space()='Data Contact Messages']")
	private WebElement validContactMessages;
	@FindBy(xpath = "//div[@id='pageWrapper']/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div/table/tbody/tr/td")
	private WebElement validNama;
	@FindBy(xpath = "//div[@id='pageWrapper']/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div/table/tbody/tr/td[2]")
	private WebElement validEmail;
	@FindBy(xpath = "//div[@id='pageWrapper']/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div/table/tbody/tr/td[3]")
	private WebElement validPhoneNumber;
	@FindBy(xpath = "//div[@id='pageWrapper']/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div/table/tbody/tr/td[4]")
	private WebElement validSubject;
	@FindBy(xpath = "//div[@id='pageWrapper']/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div/table/tbody/tr/td[5]")
	private WebElement validMessage;
	@FindBy(xpath = "//b[normalize-space()='Total Search : 0 Data']")
	private WebElement invalidCari;
	
	public void goToContactMessages() {
		Utils.delay(2, strDelay);
		this.btnAbout.click();
	}
	
	public void sortSelection(String select) {
		Utils.delay(2, strDelay);
		Select selc = new Select(this.sortSelect);
		selc.selectByVisibleText(select);
	}
	
	public void tekanEnter() {
		Utils.delay(3, strDelay);
		try {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		} catch (Exception e) {
			System.out.println("Next");
		}
	}
	
	public void tekanBtnCari() {
		Utils.delay(2, strDelay);
		this.btnSearch.click();
	}
	
	public void searchData(String data) {
		Utils.delay(2, strDelay);
		this.search.sendKeys(data);
	}
	
	public String getValidCoMes() {
		return driverWaitTxt(driver, 10, validContactMessages);
	}
	
	public String getValidNama() {
		return driverWaitTxt(driver, 10, validNama);
	}
	
	public String getValidEmail() {
		return driverWaitTxt(driver, 10, validEmail);
	}
	
	public String getValidPhoneNumber() {
		return driverWaitTxt(driver, 10, validPhoneNumber);
	}
	
	public String getValidSubject() {
		return driverWaitTxt(driver, 10, validSubject);
	}
	
	public String getValidMessage() {
		return driverWaitTxt(driver, 10, validMessage);
	}
	
	public String getInvalidCariData() {
		return driverWaitTxt(driver, 10, invalidCari);
	}
	
//	public void pindahHalaman() {
//		Utils.fullScroll();
//		Utils.delay(2, strDelay);
//		this.pindahHalaman.click();
//	}
	
	public void pindahHalaman(String link) {
		Utils.fullScroll();
		Utils.delay(2, strDelay);
		driver.findElement(By.linkText(link)).click();
	}
	
	public String getValidPindah() {
		Utils.fullScroll();
		return driverWaitTxt(driver, 10, validPindahHalaman);
	}
	
	public void btnNextPage() {
		Utils.fullScroll();
		
		Utils.delay(2, strDelay);
		this.btnNextPage.click();
	}
	
	public String getValidPageAct() {
		return driverWaitTxt(driver, 10, getValidPage);
	}
	
	public String getValPage(int page) {
//		String get = this.getValidPage.getText();
//		Integer parse = Integer.parseInt(get);
		Integer next = page + 3;
		WebElement impl = driver.findElement(By.xpath("//a[normalize-space()='" + next.toString() + "']"));
		return driverWaitTxt(driver, 10, impl);
	}
}
