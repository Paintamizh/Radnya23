package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BBC {
static {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bbc.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//h2[text()='Latest Business News']"));
		List<WebElement> news = driver.findElements(By.xpath("//h2[text()='Latest Business News']/..//h3"));
		int count = news.size();
		System.out.println(count);
		
		for(int i=0;i<count;i++) {
			String bbc = news.get(i).getText();
			System.out.println(bbc);
		}

	}

}
