package windowHandleConcept;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadOpenedWindows {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(5000);

		WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Get Connected with us')]"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[contains(@href,'https://www.facebook.com/IRCTCofficial')]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(@href,'https://t.me/IRCTC_Official')]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(@href,'https://whatsapp.com/channel')]")).click();
		Thread.sleep(3000);

		// getting all opened windows using getWindowHandles()
		Set<String> windows = driver.getWindowHandles();

		// handling windows using looping
		for (String window : windows) {

			// switch to another window
			driver.switchTo().window(window);
			
			// to get current window title
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			Thread.sleep(5000);
			
			System.out.println();
			driver.close();
			
		}


	}

}
