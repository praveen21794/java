package com.draganddrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drop10 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AS\\eclipse-workspace\\Automation\\Driver c\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");	
		Actions ac = new Actions (driver);
		Thread.sleep(4000);
		WebElement wom = driver.findElement(By.xpath("(//span[@class='catText'])[2]"));
	    ac.moveToElement(wom).build().perform();
	    
	    WebElement heel = driver.findElement(By.xpath("//span[text()='Heels']"));
	    ac.moveToElement(heel).click().build().perform();

	}

}
