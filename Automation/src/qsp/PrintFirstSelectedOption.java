package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintFirstSelectedOption {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/barat/OneDrive/Desktop/hotel.html");
		WebElement CpListBox = driver.findElement(By.id("CP"));
		Select s=new Select(CpListBox);
		Thread.sleep(2000);
		WebElement fsoption = s.getFirstSelectedOption();
		Thread.sleep(2000);
		String text = fsoption.getText();
		System.out.println(text);
		Thread.sleep(2000);
		driver.close();
		
		
		

	}

}
