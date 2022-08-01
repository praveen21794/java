package com.contains;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contains13 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AS\\eclipse-workspace\\Automation\\Driver c\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.className("_2KpZ6l _2doB4z")).click();
		driver.switchTo().frame(0);
		
		WebElement login = driver.findElement(By.xpath("//*[@class='_2IX_2- VJZDxU']"));
		login.click();
	login.sendKeys("789789789");
	String attri1 = login.getAttribute("value");
		System.out.println(attri1);
		WebElement pass = driver.findElement(By.xpath("//*[@class='_2IX_2- _3mctLh VJZDxU']"));
		pass.sendKeys("87654321");
		String attri2 = pass.getAttribute("value");
		System.out.println(attri2);

	}

}
