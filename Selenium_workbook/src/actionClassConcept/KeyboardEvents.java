package actionClassConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEvents {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://google.com");
		Thread.sleep(5000);
		
		//create object for actions class
		Actions ac = new Actions(driver);
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		//press down arrow for three times
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(5000);
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(5000);
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(5000);
		ac.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(5000);
		
		// To press pageDown
		ac.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(5000);
		ac.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(5000);
		ac.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(5000);
		
		ac.sendKeys(Keys.PAGE_UP).perform();
		Thread.sleep(5000);
		ac.sendKeys(Keys.PAGE_UP).perform();
		Thread.sleep(5000);
		ac.sendKeys(Keys.PAGE_UP).perform();
		Thread.sleep(3000);		
		
		// tab event

		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(3000);
		
		ac.sendKeys(Keys.TAB).perform();
		Thread.sleep(3000);
		ac.sendKeys(Keys.TAB).perform();
		Thread.sleep(3000);
		ac.sendKeys(Keys.TAB).perform();
		Thread.sleep(3000);
		ac.sendKeys(Keys.TAB).perform();
		Thread.sleep(3000);
		
		// To click enter in keyboard
		ac.sendKeys(Keys.ENTER).perform();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("abcdefg");
		Thread.sleep(3000);
		
		//To click Backsapce in keyboard
		ac.sendKeys(Keys.BACK_SPACE).perform();
		ac.sendKeys(Keys.BACK_SPACE).perform();
		ac.sendKeys(Keys.BACK_SPACE).perform();
		
		// Esc event
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		ac.sendKeys(Keys.ESCAPE).perform();
		Thread.sleep(3000);

		driver.close();

	}

}
