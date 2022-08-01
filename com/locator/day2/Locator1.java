package com.locator.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AS\\eclipse-workspace\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement login=driver.findElement(By.id("email"));
		login.sendKeys("praveen@gmail.com");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("123456");
		
		
	}

}
