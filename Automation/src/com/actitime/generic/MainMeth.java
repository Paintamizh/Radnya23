package com.actitime.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainMeth {
		static {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.actitime.com/login.do");
		LoginPage l= new LoginPage(driver);
		l.SetLogin("admin1","manager1");
		Thread.sleep(5000);
		l.SetLogin("admin","manager");
		
			
		}
	}


