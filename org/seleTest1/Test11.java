package org.seleTest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test11 {
	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AS\\eclipse-workspace\\Automation\\Driver\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        WebElement username =driver.findElement(By.name("email"));
        username.sendKeys("abc");
      WebElement pass=  driver.findElement(By.id("pass"));
      pass.sendKeys("123");
        
      WebElement login=driver.findElement(By.name("login"));
      
       login.click();
       WebElement username1 =driver.findElement(By.name("email"));
       username1.sendKeys("abc");
     
	}

}
