package sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThirdScript {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome driver","C:\\Users\\AS\\eclipse-workspace\\Automation\\Driver\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	WebElement username=driver.findElement(By.id("email"));
	WebElement password=driver.findElement(By.id("pass"));
	username.sendKeys("Java");
	password.sendKeys("12345");

}
}