package com.windowshandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling8 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AS\\eclipse-workspace\\Automation\\Driver c\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");

		String parent = driver.getWindowHandle();
		System.out.println(parent);
		

		Thread.sleep(1000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 8"+ Keys.ENTER);
		
		Thread.sleep(1000);
		
		Set<String> child = driver.getWindowHandles();
		System.out.println(child);
		
		for(String s : child)
		{
			if(!parent.equals(s))
				driver.switchTo().window(s);
		}
		driver.findElement(By.xpath("//*[@class='a-size-medium a-color-base a-text-normal']")).click();
		
		
	}

}
