package qsp;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseSpecificBrowser {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		System.out.println("Enter the title of the browser");
		Scanner Sc=new Scanner(System.in);
		String eTitle = Sc.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.id("apple-signin-button")).click();
		driver.findElement(By.id("login-facebook-button")).click();
		Set<String> allWh = driver.getWindowHandles();
		for(String Wh:allWh) {
			driver.switchTo().window(Wh);
			String title = driver.getTitle();
			if(title.contains(eTitle)) {
				driver.close();
			}

		}
	}
}

