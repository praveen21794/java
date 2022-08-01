package com.draganddrop;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drop3 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AS\\eclipse-workspace\\Automation\\Driver c\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.flipkart.com");
		
     driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		Actions ac = new Actions (driver);
		
		String parentwindow= driver.getWindowHandle();
		
		Thread.sleep(1000);
		WebElement home = driver.findElement(By.xpath("//*[text()='Home']"));
		ac.moveToElement(home).build().perform();
		
		Thread.sleep(1000);
		WebElement kid = driver.findElement(By.xpath("//*[text()='Kids Furniture']"));
		ac.moveToElement(kid).build().perform();
		
		Thread.sleep(1000);
		WebElement chair = driver.findElement(By.xpath("//*[text()=\"Kids' Chairs\"]"));
		ac.moveToElement(chair).click().build().perform();
		
		Thread.sleep(1000);
		WebElement first = driver.findElement(By.xpath("//*[text()='sunbaby MAGIC BEAR CHAIR Plastic Chair']"));
		ac.moveToElement(first).click().build().perform();
		
		Set<String> childwindow = driver.getWindowHandles();
		List<String> l= new ArrayList<>(childwindow);
		driver.switchTo().window(l.get(1));
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();

}
}