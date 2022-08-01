package com.draganddrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drop16 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AS\\eclipse-workspace\\Automation\\Driver c\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.sprint.com/");	
		Actions ac = new Actions (driver);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='x']")).click();	
		driver.findElement(By.xpath("//button[@class='phx-modal__close']")).click();
		
		WebElement plans = driver.findElement(By.xpath("//span[text()='Plans Menu']"));
		ac.moveToElement(plans).build().perform();
		
		WebElement bpay = driver.findElement(By.xpath("//a[text()='Unlimited Age 55+']"));
		ac.moveToElement(bpay).click().build().perform();
	
		
}
}