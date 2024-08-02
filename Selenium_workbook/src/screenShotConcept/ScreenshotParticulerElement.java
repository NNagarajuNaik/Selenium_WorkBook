package screenShotConcept;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotParticulerElement {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://primusbank.qedgetech.com/");
		Thread.sleep(3000);

		WebElement element = driver.findElement(By.xpath("//img[@src = 'images/TopFrame_01.jpg']"));

		File screenshot = element.getScreenshotAs(OutputType.FILE);
		
		Date date = new Date();
		DateFormat df = new SimpleDateFormat("YYYY_MM_dd  hh_mm_ss");
		String datef = df.format(date);
		
		File location = new File("./Screenshots/logo "+datef+".png");

		FileUtils.copyFile(screenshot, location);

		Thread.sleep(2000);
		driver.close();

	}

}
