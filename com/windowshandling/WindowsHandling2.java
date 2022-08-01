package com.windowshandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AS\\eclipse-workspace\\Automation\\Driver c\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		Thread.sleep(1000);
		driver.findElement(By.id("inputValEnter")).sendKeys("iphone7" + Keys.ENTER);
		Thread.sleep(1000);
		
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		driver.findElement(By.xpath("//p[@title=Apple iphone 7 3D Back Covers By Tweakmod'])[1]")).click();
		
		Set<String> child = driver.getWindowHandles();
		System.out.println(child);
		
		for(String s : child)
		{
			if(!parent.equals(s))
				driver.switchTo().window(s);
	}
driver.findElement(By.xpath("//span[@text()='add to cart']")).click();
System.out.println(driver.findElement(By.xpath("//*[@class='you-pay']")).getText());
}
}