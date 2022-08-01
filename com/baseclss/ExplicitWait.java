package com.baseclss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty ("webdriver.chrome.driver","C:\\Users\\AS\\eclipse-workspace\\Automation\\Driver c\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(); 
	driver.get("http://demo.automationtesting.in/Alerts.html" );
	driver.manage().window().maximize() ;
	
    WebElement confirmAlert = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
    confirmAlert.click();
    
   
      WebDriverWait wait = new WebDriverWait(driver,5);
    if(wait.until(ExpectedConditions.alertIsPresent())==null)
       System.out.println("alert was not present");
   else
       System.out.println("alert was present");
	
    driver.switchTo().alert().accept();
	
    driver.close();
    
    
	}

}
