package webElementMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Toclick {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://primusbank.qedgetech.com/");
		Thread.sleep(2000);
		
		WebElement btn = driver.findElement(By.xpath("(//table[@id='Table_07']//img)[3]"));
		
		// To click btn we use click()
		btn.click();
		
		Thread.sleep(5000);
		
		WebElement ele = driver.findElement(By.xpath("//font[text()='Personal Banking']"));
		
		// To validate webelement is displayed or not we use isDisplayed()
		if (ele.isDisplayed()) {
			System.out.println("Personal Banking is opened");
		} else {

			System.out.println("This page is not opened");
		}
		
		Thread.sleep(2000);
		driver.close();


	}

}
