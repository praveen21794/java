package org.seleTest1;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mozillatest {
	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\AS\\eclipse-workspace\\Automation\\Driver\\geckodriver.exe" );
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
       driver.navigate().refresh();
       
 
       
     

}
}