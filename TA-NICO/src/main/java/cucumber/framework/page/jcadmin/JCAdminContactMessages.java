package cucumber.framework.page.jcadmin;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.framework.connection.DriverSingleton;
import cucumber.framework.constant.Constants;

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
	
//	driver.get("https://dev.ptdika.com/web_jc_v2/index.php/admin");
//    driver.findElement(By.linkText("Contact Messages")).click();
//    driver.get("https://dev.ptdika.com/web_jc_v2/admin/contact");
//    driver.findElement(By.name("st")).click();
//    new Select(driver.findElement(By.name("st"))).selectByVisibleText("Email");
//    driver.findElement(By.xpath("//div[@id='pageWrapper']/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div/table/tbody/tr/td[2]")).click();
//    driver.findElement(By.name("st")).click();
//    new Select(driver.findElement(By.name("st"))).selectByVisibleText("Phone Number");
//    driver.findElement(By.xpath("//div[@id='pageWrapper']/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div/table/tbody/tr/td[3]")).click();
//    driver.findElement(By.name("st")).click();
//    new Select(driver.findElement(By.name("st"))).selectByVisibleText("Nama");
//    driver.findElement(By.xpath("//div[@id='pageWrapper']/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div/table/tbody/tr/td")).click();
//    driver.findElement(By.xpath("//div[@id='pageWrapper']/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div/table/tbody/tr[4]/td")).click();
//    driver.findElement(By.name("st")).click();
//    new Select(driver.findElement(By.name("st"))).selectByVisibleText("Subject");
//    driver.findElement(By.xpath("//div[@id='pageWrapper']/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div/table/tbody/tr/td[4]")).click();
//    driver.findElement(By.name("st")).click();
//    new Select(driver.findElement(By.name("st"))).selectByVisibleText("Message");
//    driver.findElement(By.xpath("//div[@id='pageWrapper']/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div/table/tbody/tr/td[5]")).click();
//    driver.findElement(By.name("st")).click();
//    new Select(driver.findElement(By.name("st"))).selectByVisibleText("Nama");
//    driver.findElement(By.name("cari")).click();
//    driver.findElement(By.name("cari")).clear();
//    driver.findElement(By.name("cari")).sendKeys("Zanonim");
//    driver.findElement(By.name("frmTest")).submit();
//    driver.findElement(By.xpath("//div[@id='pageWrapper']/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div/table/tbody/tr/td")).click();
//    driver.findElement(By.name("st")).click();
//    new Select(driver.findElement(By.name("st"))).selectByVisibleText("Email");
//    driver.findElement(By.name("cari")).click();
//    driver.findElement(By.name("cari")).clear();
//    driver.findElement(By.name("cari")).sendKeys("zanonim@gmail.com");
//    driver.findElement(By.name("frmTest")).submit();
//    driver.findElement(By.xpath("//div[@id='pageWrapper']/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div/table/tbody/tr/td[2]")).click();
//    driver.findElement(By.name("st")).click();
//    new Select(driver.findElement(By.name("st"))).selectByVisibleText("Phone Number");
//    driver.findElement(By.name("cari")).click();
//    driver.findElement(By.name("cari")).clear();
//    driver.findElement(By.name("cari")).sendKeys("087087087");
//    driver.findElement(By.name("frmTest")).submit();
//    driver.findElement(By.xpath("//div[@id='pageWrapper']/div[2]/div[2]/div/div[2]/div/div/div")).click();
//    driver.findElement(By.name("st")).click();
//    new Select(driver.findElement(By.name("st"))).selectByVisibleText("Phone Number");
//    driver.findElement(By.name("cari")).click();
//    driver.findElement(By.name("cari")).clear();
//    driver.findElement(By.name("cari")).sendKeys("87087087");
//    driver.findElement(By.name("frmTest")).submit();
//    driver.findElement(By.xpath("//div[@id='pageWrapper']/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div/table/tbody/tr/td[3]")).click();
//    driver.findElement(By.xpath("//div[@id='pageWrapper']/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div/table/tbody/tr/td")).click();
//    driver.findElement(By.name("cari")).click();
//    driver.findElement(By.name("frmTest")).submit();
//    driver.findElement(By.xpath("//div[@id='pageWrapper']/div[2]/div[2]/div/div[2]/div/div/div/div[2]/form/div/div[4]")).click();
//    driver.findElement(By.name("cari")).clear();
//    driver.findElement(By.name("cari")).sendKeys("");
//    driver.findElement(By.name("st")).click();
//    driver.findElement(By.name("st")).click();
//    new Select(driver.findElement(By.name("st"))).selectByVisibleText("Subject");
//    driver.findElement(By.name("cari")).click();
//    driver.findElement(By.name("cari")).clear();
//    driver.findElement(By.name("cari")).sendKeys("zanonim");
//    driver.findElement(By.name("frmTest")).submit();
//    driver.findElement(By.xpath("//div[@id='pageWrapper']/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div/table/tbody/tr/td[4]")).click();
//    driver.findElement(By.xpath("//div[@id='pageWrapper']/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div/table/tbody/tr/td")).click();
//    driver.findElement(By.name("st")).click();
//    new Select(driver.findElement(By.name("st"))).selectByVisibleText("Message");
//    driver.findElement(By.name("cari")).click();
//    driver.findElement(By.name("cari")).clear();
//    driver.findElement(By.name("cari")).sendKeys("blablabla");
//    driver.findElement(By.name("frmTest")).submit();
//    driver.findElement(By.xpath("//div[@id='pageWrapper']/div[2]/div[2]/div/div[2]/div/div/div")).click();
}
