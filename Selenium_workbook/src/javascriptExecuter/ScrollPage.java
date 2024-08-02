package javascriptExecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollPage {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.railyatri.in/");
		Thread.sleep(2000);

		/*
		 * Type casting: converting one data type to another data type is known as type
		 * casting
		 */

		JavascriptExecutor js =  (JavascriptExecutor) driver;

		// scroll to specific location

		js.executeScript("window.scrollTo(200,300)");
		Thread.sleep(5000);

//		js.executeAsyncScript("window.scrollTo(400,500)");
//		Thread.sleep(2000);

		// scroll top to bottom
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(5000);

		// scroll bottom to top
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		Thread.sleep(5000);

		// scroll up to an element
		WebElement element = driver.findElement(By.xpath("//p[text()='Popular Bus Routes']"));

		js.executeScript("arguments[0].scrollIntoView(true)", element);
		Thread.sleep(5000);

		driver.close();

	}

}
