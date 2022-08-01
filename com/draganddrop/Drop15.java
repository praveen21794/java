package com.draganddrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drop15 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AS\\eclipse-workspace\\Automation\\Driver c\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.sprint.com/");	
		Actions ac = new Actions (driver);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='x']")).click();	
		driver.findElement(By.xpath("//button[@class='phx-modal__close']")).click();
		
		WebElement myacc = driver.findElement(By.xpath("//button[@class='unav-account__toggle']"));
		ac.moveToElement(myacc).click().build().perform();
		
		WebElement bpay = driver.findElement(By.xpath("//a[text()='Bill pay']"));
		ac.moveToElement(bpay).click().build().perform();
}
}