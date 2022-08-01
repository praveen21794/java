package com.alert;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert7 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AS\\eclipse-workspace\\Automation\\Driver c\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		WebElement user = driver.findElement(By.name("DUMMY1"));
		user.sendKeys("123");
		user.click();
		WebElement id = driver.findElement(By.name("AuthenticationFG.USER_PRINCIPAL"));
		id.sendKeys("12345");
		id.click();
		WebElement pass = driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
		pass.sendKeys("321");
		
		
		
		
	
	}
}
