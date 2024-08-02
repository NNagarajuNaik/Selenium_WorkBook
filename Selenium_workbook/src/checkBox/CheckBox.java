package checkBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBox {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://practice.expandtesting.com/checkboxes");
		Thread.sleep(2000);

		// Finding check boxes
		WebElement checkbox1 = driver.findElement(By.xpath("//input[@id='checkbox1']"));

		// selecting check boxes which are not selected
		if (!checkbox1.isSelected()) {
			
			// to check the check box we are using click()
			checkbox1.click();
			
			System.out.println("Selected the check box");
			
			Thread.sleep(2000);
		}		
		
		// de-selecting check boxes which are selected
		if (checkbox1.isSelected()) {
			
			// to un-check the check box we are using click()
			checkbox1.click();
			
			System.out.println("De-selected the check box");
			Thread.sleep(2000);
		}
		
		driver.close();


	}

}
