package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.vtiger.com/");
	WebElement resource = driver.findElement(By.id("navbarPages"));
		Actions a=new Actions(driver);
		a.contextClick(resource).perform();
		driver.findElement(By.xpath("(//a[contains(text(),'Customers')])[1]"));
		WebElement click = driver.findElement(By.id("loginspan"));
		Actions b=new Actions(driver);
	b.doubleClick(click).perform();
	 String title = driver.getTitle();
	 
	if(title.contains("Login"))
	{
		System.out.println("IS DISPLAYED");
	}

	}

}
