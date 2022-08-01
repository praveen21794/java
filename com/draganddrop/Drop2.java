package com.draganddrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drop2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AS\\eclipse-workspace\\Automation\\Driver c\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.amazon.iN");
		Actions ac= new Actions(driver);

		WebElement cat = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		ac.moveToElement(cat).click().build().perform();
		
		WebElement mob= driver.findElement(By.xpath("(//span[@class='nav-a-content'])[2]"));
		ac.moveToElement(mob).build().perform();
		
		WebElement pow=driver.findElement(By.xpath("//a[text()='Power Banks']"));
		ac.moveToElement(pow).build().perform();

}
}