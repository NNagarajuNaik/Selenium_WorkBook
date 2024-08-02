package actionClassConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(4000);

		Actions action = new Actions(driver);

		// To double click
		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Draggable')]"));
		action.doubleClick(element).build().perform();
		Thread.sleep(4000);

		
//		// To right click
//		action.contextClick(driver.findElement(By.xpath("//a[contains(text(),'Themes')]"))).build().perform();
//		Thread.sleep(3000);
//		action.sendKeys(Keys.ESCAPE).build().perform();
//		Thread.sleep(2000);
		
		// click and hold
		driver.findElement(By.xpath("//a[contains(text(),'Droppable')]")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		action.clickAndHold(driver.findElement(By.xpath("//div[@id='draggable']"))).build().perform();
		Thread.sleep(3000);
        action.release(driver.findElement(By.xpath("//div[@id='draggable']"))).perform();
        
        
        // drag and drop
        WebElement dragElement = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement dropElement = driver.findElement(By.xpath("//div[@id='droppable']"));
        
        action.dragAndDrop(dragElement,dropElement);
        Thread.sleep(3000);
        
        driver.switchTo().defaultContent();
        
        driver.navigate().to("https://www.flipkart.com/");
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);
        action.sendKeys(Keys.ESCAPE).perform();
        Thread.sleep(4000);
        
		action.moveToElement(driver.findElement(By.xpath("//span[text()='Fashion']"))).build().perform();
		
		Thread.sleep(4000);
		driver.close();

	}

}
