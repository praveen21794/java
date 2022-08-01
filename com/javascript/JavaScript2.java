package com.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript2{
	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\AS\\eclipse-workspace\\Automation\\Driver c\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://toolsqa.com/");
			Thread.sleep(2000);
			driver.switchTo().frame(1);
			driver.findElement(By.xpath("//*[@id='advertisement-image')")).click();
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollby(0,4000)");
			Thread.sleep(2000);
			js.executeScript("window.scrollby(0,-4000");
		
	}
	
}
