package qsp;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildTabParentTab {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		driver.findElement(By.xpath("(//div[@class='popup_menu_icon'])[4]")).click();
		driver.findElement(By.xpath("//a[text()='About your actiTIME']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Read Service Agreement']")).click();
		Thread.sleep(2000);
		Set<String> allwh = driver.getWindowHandles();
		for(String wh:allwh)
		{
			driver.switchTo().window(wh);	
			String title = driver.getTitle();
			System.out.println(title);
		}
		driver.findElement(By.xpath("//a[text()='Terms of Service (Online)']")).click();
		List<WebElement> a = driver.findElements(By.xpath("//h2"));
		int count = a.size();
		for(int i=1;i<count;i++)
		{
			String text = a.get(i).getText();
			System.out.println(text);
		}
		for(String wh:allwh)
		{
			Thread.sleep(2000);
			driver.switchTo().window(wh);
			String title = driver.getTitle();
			
			if(title.contains("actiTIME Online Terms of Service"))
			{
				driver.close();
			}
			if(title.contains("actiTIME - Enter Time-Track"))
			{
				driver.close();
			}
		}
	}

}
