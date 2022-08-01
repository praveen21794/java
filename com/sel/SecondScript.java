package com.sel;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SecondScript {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver","C:\\Users\\AS\\eclipse-workspace\\Automation\\Driver\\IEDriverServer_Win32_4.0.0\\IEDriverServer.exe");
	InternetExplorerDriver ie = new InternetExplorerDriver();
		ie.get("http://demo.automationtesting.in/Register.html");
	}
	
}
