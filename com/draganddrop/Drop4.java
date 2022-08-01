package com.draganddrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drop4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AS\\eclipse-workspace\\Automation\\Driver c\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.gettyimages.in/");	
		
		
       Actions ac = new Actions (driver);
        
		WebElement editorial = driver.findElement(By.xpath("(//a[@target='_self'])[2]"));      
		ac.moveToElement(editorial).click().build().perform();
        	WebElement environment = driver.findElement(By.xpath("(//a[@target='_self'])[11]"));    
        	ac.moveToElement(environment).click().build().perform();
		
	}

}
