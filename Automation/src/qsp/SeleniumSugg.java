package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSugg { 
			static {
				System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			}

			public static void main(String[] args) throws InterruptedException {
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.google.com/");
				driver.findElement(By.name("q")).sendKeys("selenium");
				Thread.sleep(2000);
				List<WebElement> allsugg=driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
				int count=allsugg.size();
				System.out.println(count);
				for(int i=0;i<count;i++)
				{
					String text=allsugg.get(i).getText();
					System.out.println(text);
				}
			allsugg.get(count-1).click();
			Thread.sleep(2000);
			driver.close();

			}}
				

			

