package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoB {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		DemoA.testA(driver);
		WebDriver driver1=new EdgeDriver();
		DemoA.testA(driver1);
		WebDriver driver2=new FirefoxDriver();
		DemoA.testA(driver2);

	}
	
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.edge.driver","./driver/msedgedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}

}
