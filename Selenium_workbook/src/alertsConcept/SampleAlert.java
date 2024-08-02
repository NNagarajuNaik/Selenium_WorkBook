package alertsConcept;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleAlert {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new FirefoxDriver();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

		Thread.sleep(5000);

		// To handle alert we are creating alert variable
		Alert alert = driver.switchTo().alert();

		// To read alert msg we use getText()
		String alertmsg = alert.getText();

		System.out.println(alertmsg);

		// To select ok we are using accept()
		alert.accept();
		
		Thread.sleep(2000);
		
		String expectedText = "clicked an alert";
		String actualText = driver.findElement(By.id("result")).getText();
		
		if (actualText.contains(expectedText)) {
			System.out.println("I handle the alert");
		} else {
			System.out.println("I did not handle the alert");
		}
		
		Thread.sleep(4000);

		driver.close();

	}

}
