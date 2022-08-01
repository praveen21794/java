package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task10 {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\AS\\eclipse-workspace\\Automation\\Driver\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.snapdeal.com/login");
				driver.manage().window().maximize();
				WebElement uname=driver.findElement(By.id("userName"));
				uname.sendKeys("selenium@123");
				}}
	