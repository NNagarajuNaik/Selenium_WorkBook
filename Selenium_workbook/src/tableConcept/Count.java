package tableConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Count {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		Thread.sleep(3000);

		// to get all tables
		List<WebElement> table = driver.findElements(By.xpath("//table"));

		// to get all rows in a table 1
		List<WebElement> rowsOne = driver.findElements(By.xpath("//table[@id = 'customers']//tr"));

		// to get all header in a table 1. By using headers we count number of coloums
		List<WebElement> headerOne = driver.findElements(By.xpath("//table[@id = 'customers']//th"));

		// to get all data in a table 1
		List<WebElement> dataOne = driver.findElements(By.xpath("//table[@id = 'customers']//td"));

		// to get all rows in a table 2
		List<WebElement> rowsTwo = driver.findElements(By.xpath("//table[@summary = 'Sample Table']//tr"));

		// to get all header in a table 2. By using headers we count number of coloums
		List<WebElement> headerTwo = driver.findElements(By.xpath("//table[@summary = 'Sample Table']//th"));

		// to get all data in a table 2
		List<WebElement> dataTwo = driver.findElements(By.xpath("//table[@summary = 'Sample Table']//td"));

		System.out.println("Number of tables :"+table.size());
		
		System.out.println("Number of rows in table 1: " + rowsOne.size());
		System.out.println("Number of Coloums in table 1: " + headerOne.size());
		System.out.println("Number of data in table 1: " + dataOne.size());
		
		System.out.println();
		
		System.out.println("Number of rows in table 2: " + rowsTwo.size());
		System.out.println("Number of Coloums in table 2: " + headerTwo.size());
		System.out.println("Number of data in table 2: " + dataTwo.size());

		Thread.sleep(3000);
		driver.close();

	}

}
