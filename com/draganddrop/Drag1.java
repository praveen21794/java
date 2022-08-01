package com.draganddrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AS\\eclipse-workspace\\Automation\\Driver c\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		WebElement from =driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement to = driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[2]"));
		WebElement from1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement to1 = driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[3]"));
		WebElement from2 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		WebElement to2 = driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[4]"));
		WebElement from3 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement to3 = driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[5]"));
		
		Actions ac = new Actions (driver);
		ac.dragAndDrop(from, to).perform();
		ac.dragAndDrop(from1, to1).perform();
		ac.dragAndDrop(from2, to2).perform();
		ac.dragAndDrop(from3, to3).perform();

}
}
