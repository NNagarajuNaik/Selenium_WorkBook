package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchDifferntBrowser {

	static WebDriver driver;

	static void launch(String browser) throws Throwable {

		if (browser.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();

			Thread.sleep(5000);

			driver.close();

		} else if (browser.equalsIgnoreCase("firefox")) {

			driver = new FirefoxDriver();

			Thread.sleep(5000);

			driver.close();

		} else if (browser.equalsIgnoreCase("edge")) {

			driver = new EdgeDriver();

			Thread.sleep(5000);

			driver.close();

		} else {
			System.out.println("provide valid browser");
		}

		/*
		 * switch ("chrome") { case "chrome": driver = new ChromeDriver(); break;
		 * 
		 * case "firefox": driver = new FirefoxDriver(); break;
		 * 
		 * case "edge": driver = new EdgeDriver(); break;
		 * 
		 * default: System.out.println("provide valid browser"); break; }
		 */

	}

	public static void main(String[] args) throws Throwable {

		launch("edge");

	}

}
