package com.contains;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contains12 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AS\\eclipse-workspace\\Automation\\Driver c\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		WebElement name = driver.findElement(By.id("firstName"));
		name.sendKeys("praveen");
		String attri1 = name.getAttribute("value");
		System.out.println(attri1);
		WebElement lastname = driver.findElement(By.id("lastName"));
		lastname.sendKeys("kumar");
		String attri2 = lastname.getAttribute("value");
		System.out.println(attri2);
		WebElement email= driver.findElement(By.id("username"));
		email.sendKeys("praveen321321");
		String attri3 = email.getAttribute("value");
		System.out.println(attri3);
		WebElement pass = driver.findElement(By.name("Passwd"));
		pass.sendKeys("12345");
		String attri4 = pass.getAttribute("value");
		System.out.println(attri4);
		WebElement lastpass= driver.findElement(By.name("ConfirmPasswd"));
		lastpass.sendKeys("12345");
		String attri5 = lastpass.getAttribute("value");
		System.out.println(attri5);
		
		
	}

}
