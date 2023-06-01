package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectListBox {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/barat/OneDrive/Desktop/hotel.html");
		WebElement mtrListBox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrListBox);
		s.selectByIndex(0);
		Thread.sleep(2000);
		s.selectByVisibleText("vada");
		Thread.sleep(2000);
		s.selectByValue("d");
		Thread.sleep(2000);
		s.deselectByIndex(2);
		Thread.sleep(2000);
		s.deselectByVisibleText("dosa");
		Thread.sleep(2000);
		s.deselectByValue("i");
		Thread.sleep(2000);
		System.out.println(s.isMultiple());
		driver.close();
		

	}

}
