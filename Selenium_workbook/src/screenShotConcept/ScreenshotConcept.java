package screenShotConcept;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenshotConcept {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("http://primusbank.qedgetech.com/");
		Thread.sleep(2000);

		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();

		Thread.sleep(5000);

		JavascriptExecutor js  = (JavascriptExecutor) driver;
		// to highlight background colour
		WebElement msg = driver.findElement(By.xpath("//font[contains(text(),'to Admin')]"));
		
		js.executeScript("arguments[0].setAttribute('style','background:lime')", msg);
		Thread.sleep(5000);

		// converting WebElement interface into TakesScreenshot interface
		TakesScreenshot scr = (TakesScreenshot) driver;

		// taking screenshot in file format using getScreenshotAs()
		File screenshotfile = scr.getScreenshotAs(OutputType.FILE);

		/*
		 * To save screenshot we need to use FileUtils class for this we need to add
		 * common.io jar file Download common.io jar file 1. open URL
		 * https://commons.apache.org/io/download_io.cgi 2. click
		 * commons-io-2.16.1-bin.zip 3. extract zip file 4. add jar file to our project
		 */

		// saving screenshot file
		FileUtils.copyFile(screenshotfile,
				new File("D:\\2 o clock Batch 05-24\\Selenium_workbook\\Screenshots\\homepage.png"));

		// single line to take screenshot
		// FileUtils. copyFile(((TakesScreenshot)driver). getScreenshotAs
		// (OutputType.FILE), new
		// File("D:\\eclipse-workspace\\Selenium_Workbook\\adminpage.png"));

		Thread.sleep(3000);
		driver.close();

	}

}
