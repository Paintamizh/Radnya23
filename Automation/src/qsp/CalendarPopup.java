package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalendarPopup {
	static {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		Thread.sleep(2000);
		driver.findElement(By.id("policynumber")).sendKeys("123");
		driver.findElement(By.id("dob")).click();
		WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select s=new Select(month);
		s.selectByIndex(7);
		WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select s1=new Select(year);
        s1.selectByValue("1992");
        driver.findElement(By.xpath("//a[text()='14']")).click();
        driver.findElement(By.id("alternative_number")).sendKeys("9845098450");
        driver.findElement(By.id("renew_policy_submit")).click();
        boolean text = driver.findElement(By.id("policynumberError")).isDisplayed();
        if(text==true)
        	System.out.println("is displayed");
        else
        	System.out.println("is not displayed");
	}

}
