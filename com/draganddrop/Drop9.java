package com.draganddrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drop9 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AS\\eclipse-workspace\\Automation\\Driver c\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");	
		Actions ac = new Actions (driver);
		WebElement mob = driver.findElement(By.xpath("//span[text()='Mobile & Accessories']"));
	    ac.moveToElement(mob).build().perform();
	    
	    WebElement cover = driver.findElement(By.xpath("//span[text()='Printed Back Covers']"));
	    ac.moveToElement(cover).click().build().perform();

	}

}
