package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeightAndWidth {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement login=driver.findElement(By.name("username"));
		int h1 =login.getSize().getHeight();
		int w1 =login.getSize().getWidth();
		WebElement login1=driver.findElement(By.name("pwd"));
		int  h2 =login1.getSize().getHeight();
		int w2 =login1.getSize().getWidth();
		if(h1==h2&&w1==w2)
		{
			System.out.println("un and pwd textbox present in actitime is equal");
		}
		else
		{
			System.out.println("un and pwd textbox present in actitime is not equal");
		}
		driver.close();
	}
		
		

	}


