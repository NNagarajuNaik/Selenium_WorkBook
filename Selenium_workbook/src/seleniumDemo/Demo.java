package seleniumDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	static FileInputStream fi;

	public static void main(String[] args) throws Throwable {

		try {
			fi = new FileInputStream("D:\\excel\\Finance.xlsx");
		} catch (Exception e) {
			e.printStackTrace();
		}

		Workbook wb = WorkbookFactory.create(fi);
		Sheet ws = wb.getSheet("user1");
		int rc = ws.getLastRowNum();

		System.out.println("No of rows are::" + rc);

		for (int i = 1; i <= rc; i++) {

			WebDriver driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
						
			driver.get("https://www.calculator.net/percent-calculator.html");
			Thread.sleep(500);
			if (wb.getSheet("user1").getRow(i).getCell(0).getCellType() == CellType.NUMERIC) {
				int celldata1 = (int) wb.getSheet("user1").getRow(i).getCell(0).getNumericCellValue();
				String percentage = String.valueOf(celldata1);
				if (wb.getSheet("user1").getRow(i).getCell(1).getCellType() == CellType.NUMERIC) {
					int celldata2 = (int) wb.getSheet("user1").getRow(i).getCell(1).getNumericCellValue();
					String amount = String.valueOf(celldata2);
					driver.findElement(By.name("cpar1")).sendKeys(percentage);
					driver.findElement(By.name("cpar2")).sendKeys(amount);
					driver.findElement(By.xpath("(//input[@value='Calculate'])[1]")).click();
					Thread.sleep(400);
					String results = driver.findElement(By.xpath("//p[@class='verybigtext']")).getText();
					ws.getRow(i).createCell(2).setCellValue(results);
					System.out.println(percentage + "     "+ amount + "      " + results);

				}
			}
			driver.close();
		}
		fi.close();
		FileOutputStream fo = new FileOutputStream("D://CalculationResults.xlsx");
		wb.write(fo);
		fo.close();
		wb.close();
	}
}
