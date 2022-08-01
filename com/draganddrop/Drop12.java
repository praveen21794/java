package com.draganddrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drop12 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AS\\eclipse-workspace\\Automation\\Driver c\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");	
		Actions ac = new Actions (driver);
		
		WebElement all = driver.findElement(By.xpath("(//span[text()='All'])[2]"));
		ac.moveToElement(all).click().build().perform();
		
		WebElement men = driver.findElement(By.xpath("//*[@data-ref-tag='nav_em_1_1_1_15']"));
		ac.moveToElement(men).click().build().perform();
		
		WebElement sun = driver.findElement(By.xpath("(//a[text()='Sunglasses'])[1]"));
		ac.moveToElement(sun).click().build().perform();

	}

}
