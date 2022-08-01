package com.draganddrop;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drop5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AS\\eclipse-workspace\\Automation\\Driver c\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shopclues.com/wholesale.html");	
		Actions ac = new Actions (driver);
		WebElement mob =driver.findElement(By.xpath("//a[text()='Mobiles & More']"));
		ac.moveToElement(mob).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Smartphones & Tablets']")).click();
		Set<String> childwindow=driver.getWindowHandles();
		List<String> l=new ArrayList<>(childwindow);
		driver.switchTo().window(l.get(1));
		driver.findElement(By.xpath("//label[@for='Above 5000']")).click();
		
		

}
}