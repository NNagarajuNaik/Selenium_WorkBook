package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws Throwable {

		// To launch firefox browser
		WebDriver driver = new FirefoxDriver();

		// to enter url in same page we use to()
		driver.get("https://www.facebook.com/");

		// To wait for 2sec
		Thread.sleep(2000);

		// To click btn we use click()
		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		Thread.sleep(2000);

		WebElement day = driver.findElement(By.xpath("//select[@id = 'day']"));

		// To select drop down we are using select class
		Select dayList = new Select(day);

		// selecting drop down option using index
		dayList.selectByValue("10");

		Thread.sleep(3000);
		
		WebElement month = driver.findElement(By.xpath("//select[@name= 'birthday_month']"));
		Select monthList = new Select(month);

		// selecting drop down option using value
		monthList.selectByIndex(8);

		Thread.sleep(3000);
		
		WebElement year = driver.findElement(By.xpath("//select[@name= 'birthday_year']"));
		Select yearList = new Select(year);
		
		// selecting drop down option using text
		yearList.selectByVisibleText("2008");

		Thread.sleep(5000);
		driver.close();

	}

}
