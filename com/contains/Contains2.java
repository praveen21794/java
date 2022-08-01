package com.contains;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Contains2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AS\\eclipse-workspace\\Automation\\Driver c\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com/");
		WebElement type = driver.findElement(By.name("q"));
		type.sendKeys("aiite");
		WebElement search = driver.findElement(By.xpath("//span[contains(text(),'Aiite Academy')]"));
		Actions ac = new Actions(driver);
		
		ac.click().perform();
		
		
		
		
		
		
	
		
				
		

}
}