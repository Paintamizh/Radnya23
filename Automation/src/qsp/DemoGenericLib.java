package qsp;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoGenericLib {
static
{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		ActitimeGeneric	a=new ActitimeGeneric();
		 String url = a.getPropertyData("url");
		 driver.get(url);
		 String us = a.getPropertyData("username");
		 String pw = a.getPropertyData("password");
		 driver.findElement(By.id ("username")).sendKeys(us);
			driver.findElement(By.name("pwd")).sendKeys(pw);
			driver.findElement(By.xpath("//div[text()='Login ']")).click();
		 
		 

	}

}
