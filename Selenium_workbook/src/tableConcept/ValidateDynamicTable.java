package tableConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ValidateDynamicTable {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://primusbank.qedgetech.com/");
		Thread.sleep(2000);

		WebElement username = driver.findElement(By.id("txtuId"));
		WebElement password = driver.findElement(By.id("txtPword"));
		WebElement login = driver.findElement(By.id("login"));

		// To send text we use sendKeys()
		username.sendKeys("Admin");
		Thread.sleep(1000);
		password.sendKeys("Admin");
		Thread.sleep(1000);

		// To click btn we use click()
		login.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//img[@src = 'images/Branches_but.jpg']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("BtnNewBR")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("txtbName")).sendKeys("Testing");
		driver.findElement(By.id("txtAdd1")).sendKeys("Ameerpet");
		driver.findElement(By.id("txtZip")).sendKeys("12345");

		new Select(driver.findElement(By.id("lst_counrtyU"))).selectByVisibleText("INDIA");
		Thread.sleep(2000);

		new Select(driver.findElement(By.id("lst_stateI"))).selectByVisibleText("Andhra Pradesh");
		Thread.sleep(2000);

		new Select(driver.findElement(By.id("lst_cityI"))).selectByVisibleText("secundarabad");
		Thread.sleep(2000);

		driver.findElement(By.id("btn_insert")).click();
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();

		String expectedData = "Testing";

		List<WebElement> dataList = driver.findElements(By.xpath("(//table)[11]//td"));

		boolean result = false;

		for (WebElement data : dataList) {

			if (data.getText().contains(expectedData)) {

				result = true;
				break;

			}
		}

		if (result) {
			System.out.println(expectedData + " is there");
		} else {
			System.out.println(expectedData + " is not there");
		}

		Thread.sleep(2000);
		driver.close();

	}

}
