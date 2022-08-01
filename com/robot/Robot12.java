package com.robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot12 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AS\\eclipse-workspace\\Automation\\Driver c\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
          Actions ac =new Actions(driver);
		driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();
	
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys ("iphone");
		driver.findElement(By.xpath("//*[@class='L0Z3Pu']")).click();
		
	
		Thread.sleep(3000);
		WebElement red = driver.findElement(By.xpath("//img[@class='_396cs4 _3exPp9']"));
		ac.contextClick(red).build().perform();
		Robot r =new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
	
		
	
	}
}
