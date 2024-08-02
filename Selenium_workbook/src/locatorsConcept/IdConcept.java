package locatorsConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdConcept {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com/");
		
		Thread.sleep(3000);
		
		// to locate the webelement we are using id locator
		By loc = By.id("txtuId");
		
		// To retrive the single webelement we are using findElement()
		WebElement ele= driver.findElement(loc);
		
		// To enter data we are using sendKeys()
		ele.sendKeys("Admin");
		

	}

}
