package com.draganddrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drop14 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AS\\eclipse-workspace\\Automation\\Driver c\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");	
		Actions ac = new Actions (driver);
driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		WebElement women = driver.findElement(By.xpath("//*[text()='Fashion']"));
       		ac.moveToElement(women).build().perform();
        
        	WebElement foot = driver.findElement(By.xpath("//*[text()='Women Footwear']"));
        	ac.moveToElement(foot).build().perform();
        
        	WebElement flat= driver.findElement(By.xpath("//*[text()='Women Flats']"));
        	ac.moveToElement(flat).click().build().perform();
	}

}
