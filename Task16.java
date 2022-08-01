import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task16 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AS\\eclipse-workspace\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		List<WebElement>text=driver.findElements(By.xpath("//*[contains(text(),'Orange')]"));
		
	//	String text2=webElement.getText();
		
		for(int i=0;i<text.size();i++) {
			
			String text2=text.get(i).getText();
			System.out.println(text2);
		}
	}}
	


	
