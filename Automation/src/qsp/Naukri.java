package qsp;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.findElement(By.id("login_Layer")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("rtamizh14@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Radnya@23");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//div[@class='nI-gNb-drawer__bars']")).click();
		driver.findElement(By.xpath("//a[text()='View & Update Profile']")).click();
		File f=new File("./data/Paintamizh.docx");
		String abpath=f.getAbsolutePath();
		driver.findElement(By.id("attachCV")).sendKeys(abpath);
		


	}

}
