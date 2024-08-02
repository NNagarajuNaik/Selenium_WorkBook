package uploadingFile;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingSendKeys {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("http://demo.guru99.com/test/upload/");
        
		// we are uploading the file using send keys. we need to provide the file path
		// when you can see type as file
        driver.findElement (By.name("uploadfile_0")).sendKeys("C:\\Users\\nenav\\OneDrive\\Desktop\\Jira.txt");
        Thread.sleep(5000);

        driver.findElement(By.id("terms")).click();
        Thread.sleep(5000);
        
        driver.findElement(By.id("submitbutton")).click();
        Thread.sleep(5000);
        
        String msg = driver.findElement(By.id("res")).getText();
        
        System.out.println(msg);
        
        Thread.sleep(5000);
        driver.close();

	}

}
