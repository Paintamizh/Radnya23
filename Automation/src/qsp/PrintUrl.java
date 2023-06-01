package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintUrl {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/");
		String text=driver.findElement(By.tagName("a")).getAttribute("href");
		System.out.println(text);
		driver.close();
	

	}

}
