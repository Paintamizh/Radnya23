package qsp;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllLinksForEach {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		System.out.println("ENTER THE URL");
		Scanner S=new Scanner(System.in);
		String url=S.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		
		List<WebElement> allLinks=driver.findElements(By.xpath("//a"));
		int count=allLinks.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			String a=allLinks.get(i).getText();
			System.out.println(a);
		}
		driver.close();


	}

}


