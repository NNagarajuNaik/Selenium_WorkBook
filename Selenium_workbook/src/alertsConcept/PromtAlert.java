package alertsConcept;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromtAlert {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(5000);

		// To handle alert we are creating alert variable
		Alert alert = driver.switchTo().alert();

		// To read alert msg we use getText()
		String alertmsg = alert.getText();
		System.out.println(alertmsg);

		// To pass text in alert
		alert.sendKeys("Sri Digitech");
		
		// To select ok we are using accept()
		alert.accept();
		Thread.sleep(5000);
		
		String result = driver.findElement(By.id("result")).getText();
		System.out.println(result);

		driver.close();



	}

}
