package com.draganddrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drop13 {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\AS\\eclipse-workspace\\Automation\\Driver c\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");	
	Actions ac = new Actions (driver);
	
	WebElement signin = driver.findElement(By.xpath("//span[text()='Hello, Sign in']"));
	ac.moveToElement(signin).build().perform();
	
	WebElement start = driver.findElement(By.xpath("//a[text()='Start here.']"));
    ac.moveToElement(start).click().build().perform();
    
    WebElement alr = driver.findElement(By.xpath("(//a[@class='a-link-emphasis'])[1]"));
    ac.moveToElement(alr).click().build().perform();
    
    WebElement id = driver.findElement(By.xpath("//input[@class='a-input-text a-span12 auth-autofocus auth-required-field']"));
    id.sendKeys("12345678");
    
    driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
}
}