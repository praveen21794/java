package com.baseclss;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
public static WebDriver driver;
	
	
	
	public static void browserLaunch()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AS\\eclipse-workspace\\Automation\\Driver c\\chromedriver.exe");
        driver = new ChromeDriver();
	}
	
	public static void getUrl(String url)
	{
		driver.get(url);
	}
	
	public static void windowMaximize()
	{
		driver.manage().window().maximize();
	}
	
	public static void inputText(By by,String data)
	{
		driver.findElement(by).sendKeys(data);
	}
	
	public static void click(By by)
	{
		driver.findElement(by).click();
	}
	
	
	public static void takesScreenshot(String path) throws IOException
	{
		 TakesScreenshot scrShot =((TakesScreenshot)driver);
		 
	      File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

	      File DestFile=new File(path);

	     FileHandler.copy(SrcFile, DestFile);
	}
	
	
	public static void actions(By by)
	{
		Actions action = new Actions(driver);

        action.moveToElement(driver.findElement(by)).contextClick().perform();
	}
	
	public static void robotKeydown(int n) throws AWTException
	{
		Robot robot = new Robot(); 
		
		for (int i = n ; i<=n ;i++)
		{
			robot.keyPress(KeyEvent.VK_DOWN);
		}
	}
	
	public static void robotKeyEnter() throws AWTException
	{
		Robot robot = new Robot(); 
	   robot.keyPress(KeyEvent.VK_ENTER);
		
	}
	
	public static void jsExecutor(String a,By by) 
	{
		
		  JavascriptExecutor js = (JavascriptExecutor)driver; 	
		  js.executeScript("arguments[0].setAttribute('value', " + a + ")",driver.findElement(by));

	}
	
	
	public static void dropdownSelect(By by)
	{
		Select select = new Select(driver.findElement(by));
		select.selectByVisibleText("Baby");
		
	}
	
	public static void close()
	{
		driver.close();
	}
	
	 
	
}




