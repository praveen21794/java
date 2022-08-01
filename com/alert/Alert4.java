package com.alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert4 {
public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AS\\eclipse-workspace\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		WebElement alart = driver.findElement(By.xpath("//*[@class='login_button'][1]"));
		alart.click();
		WebElement login = driver.findElement(By.xpath("//*[@id='Button2']"));
		login.click();
       driver.switchTo().alert().accept();


}
}