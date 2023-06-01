package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintMtrListBox {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/barat/OneDrive/Desktop/hotel.html");
		WebElement MtrListBox = driver.findElement(By.id("mtr"));
		Select s=new Select(MtrListBox);
		List<WebElement> allOptions = s.getOptions();
		/*for(int i=0;i<allOptions.size();i++) {
			String text = allOptions.get(i).getText();
			System.out.println(text);
			Thread.sleep(2000);
			
		}*/
		
		}
		

	}
