package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowserAndClose {

	public static void main(String[] args) throws Throwable {

		// To launch chrome browser
		WebDriver driver = new ChromeDriver();

		// To wait 5 sec
		Thread.sleep(5000);

		// closing the browser
		driver.close();

		// To launch firefox browser
		driver = new FirefoxDriver();

		// To wait 5 sec
		Thread.sleep(5000);

		// closing the browser
		driver.close();
	}

}
