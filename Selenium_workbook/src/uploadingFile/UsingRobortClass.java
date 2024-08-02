package uploadingFile;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UsingRobortClass {

	public static void main(String[] args) throws Throwable {
		
		 
//		 * https://the-internet.herokuapp.com/upload
//		 * http://demo.guru99.com/test/upload/
//		 * https://opensource-demo.orangehrmlive.com/
//		 * http://www.fileconvoy.com/
//		 * https://filebin.net/
//		 *  https://uploadfiles.io/
		

		String path = "C:\\Users\\nenav\\OneDrive\\Desktop\\Jira.txt";
		
		WebDriver driver = new FirefoxDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://ufile.io/");
		
        driver.findElement (By.id("upload-window")).click();
        Thread.sleep(5000);
		
		Robot robot = new Robot();
		robot.setAutoDelay(3000);
		
		StringSelection selection = new StringSelection(path);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		
		// press ctrl+v
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.setAutoDelay(3000);
		
		// release ctrl+v
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		// press enter
		robot.setAutoDelay(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(5000);
		driver.close();
	}

}
