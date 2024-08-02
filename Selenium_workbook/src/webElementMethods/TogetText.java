package webElementMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TogetText {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://primusbank.qedgetech.com/");
		Thread.sleep(2000);
		
		List<WebElement> paras = driver.findElements(By.xpath("//p"));
		
		for (WebElement para : paras) {
			
			// to get text we are using getText()
			String ele = para.getText();
			
			System.out.println(ele);
		}

		Thread.sleep(2000);
		driver.close();
	}

}
