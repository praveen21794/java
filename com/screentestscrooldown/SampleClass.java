package com.screentestscrooldown;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleClass {

	public static WebDriver driver;
	
	public static void browserLaunch(){
		
		WebDriver driver =new ChromeDriver();
		
	}
	
	public static void getUrl(String s)	{
	driver.get(s);
		
	}
	public static void window() {
		driver.manage().window().maximize();
	}
	public static void tt() {
	
	}
}
