package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyAlignment {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/barat/OneDrive/Desktop/Sample%20HTML.html");
	driver.findElement(By.xpath("//input[@type=\"text\"][1]")).sendKeys(Keys.CONTROL+"ac");
driver.findElement(By.xpath("//input[@type=\"text\"][2]")).sendKeys(Keys.CONTROL+"av");
	}

}
