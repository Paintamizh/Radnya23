package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class WiproJobs {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("Wipro jobs"+Keys.ENTER);
       List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
      int count = alllinks.size();
      System.out.println(count);
       for(int i=0;i<count;i++)
       {
    	   String link = alllinks.get(i).getAttribute("href");
    	   System.out.println(link);
       }

	}

}
