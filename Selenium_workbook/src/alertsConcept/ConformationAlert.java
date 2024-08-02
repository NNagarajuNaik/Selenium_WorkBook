package alertsConcept;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ConformationAlert {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new FirefoxDriver();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Thread.sleep(5000);

		// To handle alert we are creating alert variable
		Alert alert = driver.switchTo().alert();

		// To read alert msg we use getText()
		String alertmsg = alert.getText();

		System.out.println(alertmsg);

		// To select ok we are using accept()
//		alert.accept();
//		Thread.sleep(5000);
//		
//		String okResult = driver.findElement(By.id("result")).getText();
//		System.out.println(okResult);

		// To select cancel we use dismiss()
		alert.dismiss();
		Thread.sleep(5000);

		String cancelResult = driver.findElement(By.id("result")).getText();
		System.out.println(cancelResult);

		driver.close();

	}

}
