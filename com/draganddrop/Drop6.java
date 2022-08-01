package com.draganddrop;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drop6 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AS\\eclipse-workspace\\Automation\\Driver c\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shopclues.com/wholesale.html");	
		Actions ac = new Actions (driver);
		
		String parentwindow = driver.getWindowHandle();
		Thread.sleep(2000);
		WebElement sport =driver.findElement(By.xpath("//a[text()='Sports & More']"));
		ac.moveToElement(sport).build().perform();
		
		WebElement gainers = driver.findElement(By.xpath("//a[text()='Weight Gainers']"));
		ac.moveToElement(gainers).click().build().perform();
		
		Set<String> childwindow = driver.getWindowHandles();
		List<String> l=new ArrayList<>(childwindow);
		driver.switchTo().window(l.get(1));
		
			
		WebElement product1 = driver.findElement(By.xpath("(//div[@class='prd_p_section new_prd_section'])[1]"));
		ac.moveToElement(product1).click().build().perform();
	
		Set<String> childwindow2 = driver.getWindowHandles();
		List<String> l1=new ArrayList<>(childwindow2);
		driver.switchTo().window(l1.get(2));
		
		WebElement cart = driver.findElement(By.xpath("//*[text()='Add To Cart']"));
		ac.moveToElement(cart).click().build().perform();
		
		WebElement cicon = driver.findElement(By.xpath("//a[@class='cart_ic']"));
		ac.moveToElement(cicon).click().build().perform();
		
		Thread.sleep(3000);
		WebElement viewc = driver.findElement(By.xpath("//a[text()='View Cart']"));
		ac.moveToElement(viewc).click().build().perform();
		WebElement total = driver.findElement(By.xpath("//*[@id=\"gt-cart-price\"]/p[2]"));
		String ad=total.getText();
		System.out.println(ad);

}
}