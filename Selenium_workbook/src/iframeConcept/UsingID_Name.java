package iframeConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsingID_Name {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.dofactory.com/html/iframe/id");
		Thread.sleep(5000);

		Actions ac = new Actions(driver);
		ac.sendKeys(Keys.PAGE_DOWN).perform();
		ac.sendKeys(Keys.PAGE_DOWN).perform();

		// switching iframe based on ID  or  name
		driver.switchTo().frame("wikiframe");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Wikipedia']")).click();
		
		Thread.sleep(5000);

		String expecteddata = "This article is about the online encyclopedia.";
		String actualData = driver.findElement(By.xpath("//div[contains(text(),'the online encyclopedia.')]"))
				.getText();

		if (actualData.contains(expecteddata)) {
			System.out.println("I Handle the first frame");
		} else {
			System.out.println("I did not Handle the first frame");
		}
		
		
		driver.close();

	}

}
