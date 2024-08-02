package tableConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateData {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		Thread.sleep(3000);

		// to get all data in a table
		List<WebElement> allData = driver.findElements(By.xpath("//table[@id = 'customers']//td"));

		boolean result = false;

		for (WebElement data : allData) {

			if (data.getText().contains("Francisco Chang")) {

				result = true;
				break;

			}
		}

		if (result) {
			System.out.println("Francisco Chang is there");
		} else {
			System.out.println("Francisco Chang is not there");
		}

		Thread.sleep(3000);
		driver.close();

	}

}
