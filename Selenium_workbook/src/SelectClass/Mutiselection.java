package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mutiselection {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("http://ironspider.ca/forms/dropdowns.htm");
		
		Thread.sleep(2000);
		
		WebElement w = driver.findElement(By.name("coffee2"));
		
		Select s = new Select(w);
		
		// to know multiple option selection we are using isMultiple()
		boolean b1 = s.isMultiple();
		System.out.println(b1);
		
		s.selectByIndex(1);
		Thread.sleep(2000);
		
		s.selectByValue("skim");
		Thread.sleep(2000);
		
		s.selectByVisibleText("Cream");
		Thread.sleep(5000);
		
		// to de-select drop down options
		s.deselectByIndex(1);
		Thread.sleep(2000);
		
		s.deselectByValue("skim");
		Thread.sleep(2000);
		
		s.deselectByVisibleText("Cream");
		Thread.sleep(5000);
		
		driver.close();


	}

}
