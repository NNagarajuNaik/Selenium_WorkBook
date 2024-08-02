package actionClassConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEvents {

	WebDriver driver;
	Actions ac;

	MouseEvents() throws Throwable {
		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(3000);
		ac = new Actions(driver);
		
	}

	void doubleclick1() throws Throwable {

		ac.doubleClick(driver.findElement(By.xpath("//a[text()='Draggable']"))).perform();
		Thread.sleep(5000);
	}

	void mouseover() throws Throwable {

		driver.navigate().to("https://www.flipkart.com/");
		ac.moveToElement(driver.findElement(By.xpath("//span[text()='Fashion']"))).perform();
		Thread.sleep(5000);

	}

	void hold() throws Throwable {

		driver.navigate().to("https://jqueryui.com/droppable/");
		Thread.sleep(5000);
		// switching to frame
		driver.switchTo().frame(0);

		ac.clickAndHold(driver.findElement(By.xpath("//p[text()='Drag me to my target']"))).perform();
		Thread.sleep(5000);
		ac.release(driver.findElement(By.xpath("//p[text()='Drag me to my target']"))).perform();
		Thread.sleep(5000);

		// switch to parent frame
		driver.switchTo().defaultContent();
	}

	void rightClick() throws Throwable {

		ac.contextClick(driver.findElement(By.xpath("//a[text()='Draggable']"))).perform();
		Thread.sleep(5000);
	}

	void dragAndDrop1() throws Throwable {

		// switching to frame
		driver.switchTo().frame(0);

		Thread.sleep(2000);
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement dst = driver.findElement(By.id("droppable"));

		ac.dragAndDrop(src, dst).build().perform();
		Thread.sleep(5000);
		
		driver.switchTo().defaultContent();
	}

	public static void main(String[] args) throws Throwable {

		MouseEvents mouse = new MouseEvents();

		//mouse.doubleclick1();

		mouse.mouseover();

		mouse.hold();

		mouse.dragAndDrop1();
		
		mouse.rightClick();

		mouse.driver.close();

	}

}
