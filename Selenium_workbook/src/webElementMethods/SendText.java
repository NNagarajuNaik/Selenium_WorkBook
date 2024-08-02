package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendText {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://primusbank.qedgetech.com/");
		Thread.sleep(2000);

		WebElement username = driver.findElement(By.id("txtuId"));
		WebElement password = driver.findElement(By.id("txtPword"));

		WebElement login = driver.findElement(By.id("login"));

		// To send text we use sendKeys()
		username.sendKeys("Admin");
		Thread.sleep(2000);

		password.sendKeys("Admin");
		Thread.sleep(2000);

		// To click btn we use click()
		login.click();

		Thread.sleep(3000);
		
		WebElement ele = driver.findElement(By.xpath("//font[contains(text(),'to Admin')]"));
		
		// To validate webelement is displayed or not we use isDisplayed()
		if (ele.isDisplayed()) {
			System.out.println("Admin page is opened");
		} else {

			System.out.println("This page is not opened");
		}
		
		Thread.sleep(2000);
		driver.close();

	}

}
