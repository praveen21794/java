package com.explicitywait.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\AS\\eclipse-workspace\\Automation\\Driver c\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://www.amazon.in");
			WebDriverWait wait =new WebDriverWait(driver,10);
			WebElement first = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='nav-line-2 ']")));
			String text=first.getText();
			System.out.println(text);
		
	}

}
