package com.alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert6 {
public static void main(String[] args) {
	

	System.setProperty("webdriver.chrome.driver","C:\\Users\\AS\\eclipse-workspace\\Automation\\Driver c\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://paytm.com/");
	//WebElement login = driver.findElement(By.xpath("//*[@class='phx-button phx-button--primary']"));
	//login.click();
//driver.switchTo().alert().accept();

}
}
