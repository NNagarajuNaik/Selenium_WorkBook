package locatorsConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CssSelector {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new FirefoxDriver();

		driver.get("https://adactinhotelapp.com/");
		Thread.sleep(2000);

		// cssSelector() Syntax: tagname [attributename = 'attributevalue']
		WebElement link = driver.findElement(By.cssSelector("input[name = 'username']"));

		boolean linkvalidate1 = link.isDisplayed();

		System.out.println("Using linktext() " + linkvalidate1);

		// cssSelector() Syntax: # attributevalue
		WebElement link1 = driver.findElement(By.cssSelector("#username"));

		boolean linkvalidate2 = link1.isDisplayed();

		System.out.println("Using partialLinkText() " + linkvalidate2);

		Thread.sleep(2000);
		driver.close();

	}

}
