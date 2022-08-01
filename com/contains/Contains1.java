package com.contains;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contains1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AS\\eclipse-workspace\\Automation\\Driver c\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/ ");
		WebElement login = driver.findElement(By.id("email"));
		login.sendKeys("12345");
		String attri1 = login.getAttribute("value");
		System.out.println(attri1);
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("54321");
		String attri2 = pass.getAttribute("value");
		System.out.println(attri2);

}
}