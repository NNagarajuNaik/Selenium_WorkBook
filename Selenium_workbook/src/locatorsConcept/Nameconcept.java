package locatorsConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nameconcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://primusbank.qedgetech.com/");
		Thread.sleep(2000);
		
		WebElement username = driver.findElement(By.name("txtuId"));
		WebElement password = driver.findElement(By.name("txtPword"));
		WebElement login = driver.findElement(By.id("login"));
		
		//To send text we use sendKeys()
		username.sendKeys("Admin");
		Thread.sleep(1000);
		password.sendKeys("Admin");
		Thread.sleep(1000);
		
		// To click button/check box/ radio button we use click()
		login.click();
		
		Thread.sleep(2000);
		
		// close the browser
		driver.close();


	}

}
