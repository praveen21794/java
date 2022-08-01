package com.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {
public static void main(String[] args)throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AS\\eclipse-workspace\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" http://demo.automationtesting.in/Alerts.html");
		WebElement alart = driver.findElement(By.xpath("//*[@onclick='alertbox()']"));
		alart.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		WebElement alart1 = driver.findElement(By.xpath("//*[@href='#CancelTab']"));
		alart1.click();
		WebElement alart3 = driver.findElement(By.xpath("//*[@onclick='confirmbox()']"));
		alart3.click();
		driver.switchTo().alert().dismiss();
	    WebElement alart4 = driver.findElement(By.xpath("//*[@href='#Textbox']"));
	    alart4.click();
	    WebElement alart5 = driver.findElement(By.xpath("//*[@onclick='promptbox()']"));
	    alart5.click();
	    Alert alert2 = driver.switchTo().alert();
	    System.out.println(alert2.getText());
	    alert2.sendKeys("PRAVEEN");
	    alert2.accept();
	    
		
}
}