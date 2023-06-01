package qsp;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeTestData {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		WebDriver driver=new ChromeDriver();
		FileInputStream fis=new FileInputStream("./data/actitime.xlsx");
		Workbook w = WorkbookFactory .create(fis);
		String data = w.getSheet("login").getRow(0).getCell(1).getStringCellValue();
		String data1 = w.getSheet("login").getRow(1).getCell(1).getStringCellValue();
		String data2 = w.getSheet("login").getRow(2).getCell(1).getStringCellValue();
		driver.get(data);
		driver.findElement(By.id ("username")).sendKeys(data1);
		driver.findElement(By.name("pwd")).sendKeys(data2);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		

	}

}
