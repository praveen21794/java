package com.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AS\\eclipse-workspace\\Automation\\Driver c\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		WebElement user = driver.findElement(By.xpath("//*[@class='_2IX_2- VJZDxU']"));
		WebElement pass = driver.findElement(By.xpath("//*[@class='_2IX_2- _3mctLh VJZDxU']"));
		WebElement login = driver.findElement(By.xpath("//*[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		js.executeScript("arguments[0].setAttribute('value','praveen')",user);
		js.executeScript("arguments[0].setAttribute('value','abcd12')",pass);
		js.executeScript("arguments[0].click()",login);

	}

}
