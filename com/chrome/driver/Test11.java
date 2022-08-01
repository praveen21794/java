package com.chrome.driver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Test11 {

public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\AS\\eclipse-workspace\\Automation\\Driver c\\Driver1\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.get("https://www.amazon.in/");
driver.manage().window().maximize();
String Parent = driver.getWindowHandle();
//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//WebElement menu = driver.findElement(By.xpath("//span[@class=\"hm-icon-label\"]"));
//menu.click();
JavascriptExecutor java=(JavascriptExecutor)driver;
Actions actions=new Actions(driver);
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 13max");
driver.findElement(By.id("nav-search-submit-button")).click();
driver.findElement(By.xpath("//a[@class=\"a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal\"][1]")).click();
//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//WebElement element = driver.findElement(By.id("buy-now-button"));
java.executeScript("window.scroll.(0,1000)", "");
Set<String> child = driver.getWindowHandles();
System.out.println(child);
for(String s:child) {
	
	if(!Parent.equals(s))
		driver.switchTo().window(s);
	
}
driver.findElement(By.id("add-to-cart-button")).click();


}
}

