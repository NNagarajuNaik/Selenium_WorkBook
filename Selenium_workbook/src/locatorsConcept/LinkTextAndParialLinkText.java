package locatorsConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTextAndParialLinkText {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new FirefoxDriver();

		driver.get("https://adactinhotelapp.com/");
		Thread.sleep(2000);

		// need to provide entire text for linktext()
		WebElement link = driver.findElement(By.linkText("Forgot Password?"));

		boolean linkvalidate1 = link.isDisplayed();

		System.out.println("Using linktext() " + linkvalidate1);

		// need to provide partial text for partialLinkText()
		WebElement link1 = driver.findElement(By.partialLinkText("Forgot"));

		boolean linkvalidate2 = link1.isDisplayed();

		System.out.println("Using partialLinkText() " + linkvalidate2);

		Thread.sleep(2000);
		driver.close();

	}
}
