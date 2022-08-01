package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Task7 {
public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AS\\eclipse-workspace\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI&CTA_FLAG=DEPOSIT&ITM=nli_cms_FD_Primer_FDHigherInterestRate_INVES");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.id("UserId_Text"));
		username.click();
		WebElement username1=driver.findElement(By.name("AuthenticationFG.USER_PRINCIPAL"));
		username1.sendKeys("Janani");
	WebElement password=driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
	password.sendKeys("12345");
		}}
