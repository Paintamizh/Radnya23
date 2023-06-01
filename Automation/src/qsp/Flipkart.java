package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
static {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone 14 pro max"+Keys.ENTER);
	List<WebElement> product = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 14 Pro Max ')]"));
List<WebElement> Price = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 14 Pro Max ')]/../../div[2]/div[1]/div[1]/div[1]"));
	for(int i=0;i<product.size();i++)
	{
		String ProductName = product.get(i).getText();
		String Amount= Price.get(i).getText();
		System.out.println(ProductName + "==>" + Amount);
	}
	}

}
