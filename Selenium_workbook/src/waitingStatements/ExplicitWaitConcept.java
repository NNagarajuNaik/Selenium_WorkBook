package waitingStatements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConcept {

	public static void main(String[] args) throws Throwable {
		

		WebDriver driver = new FirefoxDriver();

		// To provide implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.cleartrip.com/");

		// To use Explicit wait we are creating WebDriverWait object
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		WebElement element = driver.findElement(By.xpath("//div[@class='px-1   flex flex-middle nmx-1 pb-1']"));
		
		wait.until(ExpectedConditions.visibilityOf(element)).click();

		Thread.sleep(5000);
		
		driver.close();


	}

}
