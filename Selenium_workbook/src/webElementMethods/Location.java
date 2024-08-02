package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Location {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://primusbank.qedgetech.com/");

		Thread.sleep(2000);
		WebElement un = driver.findElement(By.tagName("marquee"));

		// To get location of an element; x-axis & y-axis
		
		Point l = un.getLocation();
		
		int x = l.getX();
		int y = l.getY();

		System.out.println("x-axis: " + x);
		System.out.println("y-axis: " + y);

		Thread.sleep(1000);
		driver.close();

	}

}
