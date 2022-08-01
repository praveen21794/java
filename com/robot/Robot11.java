package com.robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot11 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AS\\eclipse-workspace\\Automation\\Driver c\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		
		Actions ac = new Actions(driver);
		WebElement se1 = driver.findElement(By.xpath("//*[@name='keyword']"));
		
		se1.sendKeys("iphone 12");
		driver.findElement(By.xpath("//span[@class='searchTextSpan']")).click();
	
		
	//	WebElement ele = driver.findElement(By.xpath("//span[@class='catText']"));
		
	//	ac.contextClick(ele).build().perform();
	//	Robot r =new Robot();
	//	r.keyPress(KeyEvent.VK_DOWN);
	//	r.keyPress(KeyEvent.VK_DOWN);
	//	r.keyPress(KeyEvent.VK_ENTER);
	
		

}
}