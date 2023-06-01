package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConformationPopup {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert a = driver.switchTo().alert();
		a.dismiss();
		String s="you pressed cancel";
		WebElement text = driver.findElement(By.id("demo"));
		String t=text.getText();
		if(t.equals(s))
			System.out.println(t);
		else
			System.out.println("you pressed ok");
		

	}

}
