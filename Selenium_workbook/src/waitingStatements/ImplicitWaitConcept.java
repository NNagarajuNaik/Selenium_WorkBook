package waitingStatements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplicitWaitConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();

		// To provide implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.xpath("//div[@class='px-1   flex flex-middle nmx-1 pb-1']")).click();

		Thread.sleep(5000);
		
		driver.close();

	}

}
