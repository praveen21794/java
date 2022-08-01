package com.draganddrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drop8 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AS\\eclipse-workspace\\Automation\\Driver c\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.homedepot.com/");	
		Actions ac = new Actions (driver);
		String parentwindow= driver.getWindowHandle();
		WebElement alldep = driver.findElement(By.xpath("//a[text()='All Departments']"));
		ac.moveToElement(alldep).build().perform();
		
		WebElement paint = driver.findElement(By.xpath("//a[text()='Paint']"));
		ac.moveToElement(paint).build().perform();
		
		WebElement intpaint = driver.findElement(By.xpath("//a[text()='Interior Paint']"));
		ac.moveToElement(intpaint).build().perform();
		
		WebElement cpaint = driver.findElement(By.xpath("//a[text()='Ceiling Paint']"));
		ac.moveToElement(cpaint).click().build().perform();
		
	}

}
