package com.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert5 {
public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AS\\eclipse-workspace\\Automation\\Driver c\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.sprint.com/");
		Thread.sleep(3000);
		WebElement close = driver.findElement(By.xpath("//*[@aria-label='Close'][2]"));
		close.click();
		driver.switchTo().frame(0);
      // Alert al=driver.switchTo().alert();
      // al.accept();
		
		
		
		//WebElement login = driver.findElement(By.xpath("//*[@class='phx-button phx-button--primary']"));
	//	login.click();
	//driver.switchTo().alert().accept();
	    //Thread.sleep(3000);
		//WebElement alart = driver.findElement(By.xpath(""));
		//alart.click();
		//driver.switchTo().alert().dismiss();
		//WebElement login = driver.findElement(By.xpath("//*[@class='phx-button phx-button--primary']"));
//	login.click();
     //  driver.switchTo().alert().accept();

}	


}
