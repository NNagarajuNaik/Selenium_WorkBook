package screenShotConcept;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenshotWithDate {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("http://primusbank.qedgetech.com/");
		Thread.sleep(2000);

		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();

		Thread.sleep(5000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		// to highlight background colour
		WebElement msg = driver.findElement(By.xpath("//font[contains(text(),'to Admin')]"));

		js.executeScript("arguments[0].setAttribute('style','background:lime')", msg);
		Thread.sleep(5000);

		// converting WebElement interface into TakesScreenshot interface
		TakesScreenshot scr = (TakesScreenshot) driver;

		// taking screenshot in file format using getScreenshotAs()
		File screenshotfile = scr.getScreenshotAs(OutputType.FILE);

		
		Date date = new Date();
		DateFormat df = new SimpleDateFormat("YYYY_MM_dd  hh_mm_ss");
		String datef = df.format(date);

		File file = new File("D:\\2 o clock Batch 05-24\\Selenium_workbook\\Screenshots\\homepage "+datef+".png");

		// saving screenshot file
		FileUtils.copyFile(screenshotfile, file);

		Thread.sleep(3000);
		driver.close();

	}

}
