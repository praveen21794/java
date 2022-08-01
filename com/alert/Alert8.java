package com.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert8 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AS\\eclipse-workspace\\Automation\\Driver c\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.switchTo().frame(0);
		WebElement login = driver.findElement(By.name("fldLoginUserId"));
        login.sendKeys("123");
		driver.findElement(By.xpath("//*[@class=\'btn btn-primary login-btn\']")).click();
		WebElement pass = driver.findElement(By.id("fldPasswordDispId"));
		pass.sendKeys("hai");
		
		
		
		
	}

}
