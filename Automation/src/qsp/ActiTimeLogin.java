package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLogin {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(13000);
		int Y1=driver.findElement(By.xpath("(//input[@type='radio'])[1]")).getLocation().getY();
		int Y2=driver.findElement(By.xpath("(//input[@type='radio'])[2]")).getLocation().getY();
		int Y3=driver.findElement(By.xpath("(//input[@type='radio'])[3]")).getLocation().getY();
		if(Y1==Y2&&Y2==Y3&&Y3==Y1)
		{
			System.out.println("gender radio button is properly aligned");

		}
		else
		{
		System.out.println("not aligned properly");	
		}
		
		

	}

}
