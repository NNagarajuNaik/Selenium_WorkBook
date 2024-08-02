package radioBtn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new FirefoxDriver();

		// to enter url in same page we use to()
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);

		// To click btn we use click()
		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		Thread.sleep(2000);

		// To find radio btn
		WebElement element = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));

		// to select radio btn we use click()
		element.click();
		Thread.sleep(2000);

		// to find an element is selected or not we use isSelected()
		
		boolean result = element.isSelected();
		
		if (result) {
			System.out.println("Radio btn is selected");
		} else {

			System.out.println("Radio btn is not selected");
		}
		
		System.out.println(driver.findElement(By.xpath("(//input[@type='radio'])[1]")).isSelected());
		
		Thread.sleep(2000);
		driver.close();

	}
}
