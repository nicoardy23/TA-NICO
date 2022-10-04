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
//	@FindBy(xpath = "//a[normalize-space()='2']")
//	private WebElement btnPageTwo;
	
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
	
	public void goToContactMessages() {
		Utils.delay(2, strDelay);
		this.btnAbout.click();
	}
	
	public void sortSelection(String select) {
		Utils.delay(1, strDelay);
		Select selc = new Select(this.sortSelect);
		selc.selectByVisibleText(select);
	}
	
	public void tekanEnter() {
		Utils.delay(1, strDelay);
		try {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		} catch (Exception e) {
			System.out.println("Next");
		}
	}
	
	public void searchData(String data) {
		Utils.delay(1, strDelay);
		this.search.sendKeys(data);
	}
	
	public String getValidCoMes() {
		return driverWaitTxt(driver, 3, validContactMessages);
	}
	
	public String getValidNama() {
		return driverWaitTxt(driver, 3, validNama);
	}
	
	public String getValidEmail() {
		return driverWaitTxt(driver, 3, validEmail);
	}
	
	public String getValidPhoneNumber() {
		return driverWaitTxt(driver, 3, validPhoneNumber);
	}
	
	public String getValidSubject() {
		return driverWaitTxt(driver, 3, validSubject);
	}
	
	public String getValidMessage() {
		return driverWaitTxt(driver, 3, validMessage);
	}
	
//	public void pindahHalaman() {
//		Utils.fullScroll();
//		Utils.delay(1, strDelay);
//		this.pindahHalaman.click();
//	}
	
	public void pindahHalaman(String link) {
		Utils.fullScroll();
		Utils.delay(1, strDelay);
		driver.findElement(By.linkText(link)).click();
	}
	
	public String getValidPindah() {
		Utils.fullScroll();
		return driverWaitTxt(driver, 5, validPindahHalaman);
	}
}
