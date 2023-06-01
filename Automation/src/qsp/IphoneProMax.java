package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IphoneProMax {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}


	public static void main(String[] args)  {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
	    driver.findElement(By.name("q")).sendKeys("iphone 14");
	    
	    List<WebElement> allsugg=driver.findElements(By.xpath("//div[contains(text(),'iphone')]"));
		int count=allsugg.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			String a=allsugg.get(i).getText();
			System.out.println(a);
		}
		allsugg.get(0).click();
		driver.close();

	}

}
