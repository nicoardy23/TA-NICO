package cucumber.framework.utils;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import cucumber.framework.connection.DriverSingleton;

public class Utils {

	public static WebDriver driver = DriverSingleton.getDriver();
	public static int testCount = 0;
	public static int countOutline = 1;
	
	public static String getScreenshot(WebDriver driver, String screenshotName) throws IOException {
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir")+"/FailedTestScreenshot/"
				+screenshotName+"_"+dateName+".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		return destination;
	}
	
	public static void delay(int detik, String delays) {
		if(delays.equals("y"))
		{
			try {
				Thread.sleep(1000*detik);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
	}
	
	public static void fullScroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	
	public static void littleScroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)","");
	}
	
	public static void zoomOut(int nilai) {
		try {
			Robot rob = new Robot();
			for (int i = 0; i < nilai; i++) {
				rob.keyPress(KeyEvent.VK_CONTROL);
				rob.keyPress(KeyEvent.VK_SUBTRACT);
				rob.keyRelease(KeyEvent.VK_SUBTRACT);
				rob.keyRelease(KeyEvent.VK_CONTROL);
			}
		} catch (Exception e) {
			System.out.println("ERROR : zoomOut method");
		}
	}
	
	public static void zoomIn(int nilai) {
		try {
			Robot rob = new Robot();
			for (int i = 0; i < nilai; i++) {
				rob.keyPress(KeyEvent.VK_CONTROL);
				rob.keyPress(KeyEvent.VK_ADD);
				rob.keyRelease(KeyEvent.VK_ADD);
				rob.keyRelease(KeyEvent.VK_CONTROL);
			}
		} catch (Exception e) {
			System.out.println("ERROR : zoomIn Method");
		}
	}
	
	public static void uploadFoto(File foto) {
		try {
			// creating object of Robot class
			Robot rb = new Robot();
			String absFoto = foto.getAbsolutePath();
			
			// copying File path to Clipboard
			StringSelection str = new StringSelection(absFoto);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
			
			// press Contol+V for pasting
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_V);
			
			// release Contol+V for pasting
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyRelease(KeyEvent.VK_V);
			
			// for pressing and releasing Enter
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Next");
		}
	}
}