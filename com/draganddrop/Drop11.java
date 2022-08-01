package com.draganddrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drop11 {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\AS\\eclipse-workspace\\Automation\\Driver c\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in/");	
			Actions ac = new Actions (driver);
			WebElement signin = driver.findElement(By.xpath("//span[text()='Hello, Sign in']"));
			ac.moveToElement(signin).build().perform();
			
			WebElement start = driver.findElement(By.xpath("//a[text()='Start here.']"));
		    ac.moveToElement(start).click().build().perform();
		    
		    driver.findElement(By.name("customerName")).sendKeys("praveen");
		    driver.findElement(By.name("email")).sendKeys("1234567");
		    driver.findElement(By.name("secondaryLoginClaim")).sendKeys("praveen@gmail.com");
		    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("333rrr");
			

	}

}
