package com.screentestscrooldown;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot10 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AS\\eclipse-workspace\\Automation\\Driver c\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://www.flipkart.com");
	
		
		driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();
	
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys ("iphone");
		driver.findElement(By.xpath("//*[@class='L0Z3Pu']")).click();
		
	
		Thread.sleep(3000);
		WebElement red = driver.findElement(By.xpath("//img[@class='_396cs4 _3exPp9']"));
		red.click();
		
		Thread.sleep(3000);
		TakesScreenshot as= (TakesScreenshot)driver;
		File source = as.getScreenshotAs(OutputType.FILE);
		File dest =new File("C:\\Users\\AS\\Desktop\\scree.jpeg");
		FileHandler.copy(source, dest);
	}



}
