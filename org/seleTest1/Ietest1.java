package org.seleTest1;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Ietest1 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.ie.driver","C:\\Users\\AS\\eclipse-workspace\\Automation\\Driver\\IEDriverServer_Win32_4.0.0\\IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.automationtesting.in/Register.html\r\n");
        	
       
}
}