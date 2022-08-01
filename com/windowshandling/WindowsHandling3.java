package com.windowshandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AS\\eclipse-workspace\\Automation\\Driver c\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.homedepot.com/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@class='SearchBox__input']")).sendKeys("ceiling fan" + Keys.ENTER) ;
		Thread.sleep(1000);
		
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		js.executeScript("window.scrollBy(0,1000)");
		
		driver.findElement(By.xpath("//div[@data-testid='product-pod_image-wrapper'])[1]")).click();
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,900)");
		
		driver.findElement(By.xpath("//span[@class='bttn_content'])[3]")).click();
		Thread.sleep(15000);
		
		
		Set<String> child = driver.getWindowHandles();
		System.out.println(child);
		
		for(String s : child)
		{
			if(!parent.equals(s))
				driver.switchTo().window(s);
	}
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		driver.findElement(By.xpath("//span[text()='Add protection plan']")).click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("//div[@claass='col_12-12 cartTotalBox_cartTotalText']")).getText());
	}

}
