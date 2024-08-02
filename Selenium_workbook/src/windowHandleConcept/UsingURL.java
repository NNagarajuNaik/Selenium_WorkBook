package windowHandleConcept;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UsingURL {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(5000);

		WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Get Connected with us')]"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[contains(@href,'https://www.facebook.com/IRCTCofficial/')]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[contains(@href,'https://instagram.com/irctc.official')]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[contains(@href,'https://www.linkedin.com/company/irctcofficial')]")).click();
		Thread.sleep(3000);

		Set<String> windows = driver.getWindowHandles();

		String ExpectedUrl = "https://www.facebook.com/";

		for (String window : windows) {

			driver.switchTo().window(window);
			Thread.sleep(5000);
			
			String actualUrl = driver.getCurrentUrl();
			System.out.println(actualUrl);

			if (actualUrl.contains(ExpectedUrl)) {

				System.out.println("I switch to facebook window");
				Thread.sleep(2000);
				System.out.println(driver.getTitle());
				System.out.println(driver.getCurrentUrl());

				driver.findElement(By.xpath("//span[text()='Create new account']")).click();

				Thread.sleep(5000);
			}
			System.out.println();

		}
		Thread.sleep(5000);
		
		driver.quit();

	}
}
