package com.locator.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AS\\eclipse-workspace\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		WebElement first = driver.findElement(By.xpath("//*[@name='DUMMY1']"));
		first.click();
		WebElement input = driver.findElement(By.xpath("//*[@title='User Id']"));
		input.sendKeys("praveen");
		WebElement pass = driver.findElement(By.xpath("//*[@class='login-input-password']"));
		pass.sendKeys("12345");
		driver.close();
		
		

}
}