package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Task8 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\AS\\eclipse-workspace\\Automation\\Driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://netbanking.hdfcbank.com/netbanking/");
			driver.manage().window().maximize();
			WebElement cusid=driver.findElement(By.id("lablefield ibvt"));
			cusid.sendKeys("1111");
}}

