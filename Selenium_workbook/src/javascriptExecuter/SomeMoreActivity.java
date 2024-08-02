package javascriptExecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SomeMoreActivity {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("http://primusbank.qedgetech.com/");
		Thread.sleep(2000);

		WebElement username = driver.findElement(By.id("txtuId"));
		WebElement password = driver.findElement(By.id("txtPword"));
		WebElement login = driver.findElement(By.id("login"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// send Text

		// username.sendKeys("Admin");
		js.executeScript("arguments[0].value= 'Admin' ", username);
		Thread.sleep(5000);

		// password.sendKeys("Admin")
		js.executeScript("arguments[0].value=  'Admin' ", password);
		Thread.sleep(5000);

		// click
		//login.click();
		js.executeScript("arguments[0].click()", login);
		Thread.sleep(5000);

		// Highlight web element
		// css colours website: https://www.w3.org/wiki/CSS/Properties/color/keywords
		
		WebElement msg = driver.findElement(By.xpath("//font[contains(text(),'to Admin')]"));
		
		// To highlight  border
		js.executeScript("arguments[0].setAttribute('style','border:4px solid magenta')", msg);
		Thread.sleep(5000);
		
		// to highlight background colour
		js.executeScript("arguments[0].setAttribute('style','background:lime')", msg);
		Thread.sleep(5000);

		driver.close();

	}

}
