package com.screentestscrooldown;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot11 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AS\\eclipse-workspace\\Automation\\Driver c\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys ("motorola" +  Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@class='a-size-medium a-color-base a-text-normal'][1]")).click();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		File Destination = new File("C:\\Users\\AS\\Desktop\\record\\screenshot.jpeg");
		FileHandler.copy(Source,Destination); 
	}


}
