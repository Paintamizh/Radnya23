package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Excc {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.vtiger.com/");
		Actions a=new Actions(driver);
		WebElement reso = driver.findElement(By.partialLinkText("(//a[contains(.,'Resources')])[1]"));
		a.moveToElement(reso).perform();

	}

}
