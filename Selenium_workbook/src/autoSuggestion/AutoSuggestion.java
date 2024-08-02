package autoSuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		Thread.sleep(2000);
		
		// To get address of all the suggestions
		List<WebElement> allSuggestions = driver.findElements(By.xpath("//li[@role='presentation']"));
		
		// To count number of suggestions
		System.out.println(allSuggestions.size());

		for (WebElement webElement : allSuggestions) {
			
			System.out.println(webElement.getText());
		}
		
		// To print all the suggestions
		for (WebElement suggestion : allSuggestions) {
			
			if(suggestion.getText().contains("selenium download")) {
				
				suggestion.click();				
				break;
			}
		}
		
		
		Thread.sleep(2000);
		driver.close();


	}

}
