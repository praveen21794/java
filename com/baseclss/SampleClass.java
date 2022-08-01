package com.baseclss;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;

public class SampleClass extends BaseClass{
	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
		BaseClass.browserLaunch();
		BaseClass.getUrl("https://www.amazon.in/");
		BaseClass.windowMaximize();
		BaseClass.inputText(By.id("twotabsearchtextbox"), "iphone");
		BaseClass.click(By.id("nav-search-submit-button"));
		BaseClass.takesScreenshot("C:\\Users\\AS\\Desktop\\record\\base.jpeg");
		BaseClass.actions(By.xpath("(//div[@data-avar='desc'])[1]"));
		BaseClass.robotKeydown(2);
		BaseClass.robotKeyEnter();  
		BaseClass.click(By.xpath("//div[@id='nav-search-dropdown-card']"));
		BaseClass.dropdownSelect(By.cssSelector("select#searchDropdownBox"));
		BaseClass.close();
	}
	

}
