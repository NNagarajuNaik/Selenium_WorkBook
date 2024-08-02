package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Size {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://primusbank.qedgetech.com/");

		Thread.sleep(2000);
		WebElement un = driver.findElement(By.tagName("marquee"));

		// To get the size of an element; height & width
		Dimension s = un.getSize();

		int h = s.getHeight();
		int w = s.getWidth();

		System.out.println("Height: " + h);
		System.out.println("Width: " + w);

		Thread.sleep(1000);
		driver.close();

	}

}
