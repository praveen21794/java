package com.draganddrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drop7 {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\AS\\eclipse-workspace\\Automation\\Driver c\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.homedepot.com/");	
	Actions ac = new Actions (driver);
	String parentwindow= driver.getWindowHandle();
	WebElement alldep = driver.findElement(By.xpath("//a[text()='All Departments']"));
	ac.moveToElement(alldep).build().perform();
	
	WebElement hc = driver.findElement(By.xpath("//a[text()='Heating & Cooling']"));
	ac.moveToElement(hc).build().perform();
	
	WebElement aircon = driver.findElement(By.xpath("//a[text()='Air Conditioners']"));
	ac.moveToElement(aircon).build().perform();
	
	WebElement port = driver.findElement(By.xpath("//a[text()='Portable Air Conditioners']"));
	ac.moveToElement(port).click().build().perform();

}
}