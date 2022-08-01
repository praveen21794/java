package com.contains;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Contains14 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AS\\eclipse-workspace\\Automation\\Driver c\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		WebElement login = driver.findElement(By.xpath("//*[@class='_2IX_2- VJZDxU']"));
		login.click();
	login.sendKeys("789789789");
	String attri1 = login.getAttribute("value");
		System.out.println(attri1);
		WebElement pass = driver.findElement(By.xpath("//*[@class='_2IX_2- _3mctLh VJZDxU']"));
		pass.sendKeys("87654321");
		String attri2 = pass.getAttribute("value");
		System.out.println(attri2);

	}

}
