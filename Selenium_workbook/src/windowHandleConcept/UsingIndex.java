package windowHandleConcept;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UsingIndex {

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

		// getting all opened windows using getWindowHandles()
		Set<String> windows = driver.getWindowHandles();

		// To store set collection into arraylist class
		ArrayList<String> windowlist = new ArrayList<String>(windows);

		driver.switchTo().window(windowlist.get(1)); 
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		driver.findElement(By.xpath("//span[text()='Create new account']")).click();

		Thread.sleep(5000);
		
		driver.quit();

	}

}
