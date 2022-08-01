package com.locator.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator9 {
public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AS\\eclipse-workspace\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement name = driver.findElement(By.xpath("//*[@placeholder='First Name']"));
		name.sendKeys("123456");
		WebElement last = driver.findElement(By.xpath("//*[@placeholder='Last Name']"));
		last.sendKeys("123");
		WebElement email = driver.findElement(By.xpath("//*[@ng-model='EmailAdress']"));
		email.sendKeys("123@gmail.com");
		WebElement phone=driver.findElement(By.xpath("//*[@ng-model='Phone']"));
		phone.sendKeys("123123123");
		WebElement pass=driver.findElement(By.xpath("//*[@id='firstpassword']"));
		pass.sendKeys("333");
		
		WebElement pass1=driver.findElement(By.xpath("//*[@id='secondpassword']"));
		pass1.sendKeys("333");
		
		
		

}
}