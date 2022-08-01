package com.locator.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator8 {
public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AS\\eclipse-workspace\\Automation\\Driver c\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/?hl=en) login page");
		WebElement location = driver.findElement(By.xpath("//*[@aria-label='Phone number, username, or email']"));
		location.sendKeys("123456");
		WebElement pass = driver.findElement(By.xpath("//*[@type='password']"));
		pass.sendKeys("123");
		
		

}
}