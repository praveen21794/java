import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task17 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AS\\eclipse-workspace\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://leafground.com/pages/Link.html");
		WebElement home=driver.findElement(By.linkText("Go to Home Page"));
		home.click();
		driver.navigate().back();
		WebElement find=driver.findElement(By.xpath(("(//a[@link='blue'])[2]")));
		String attribute=find.getAttribute("herf");
		System.out.println(attribute);
		WebElement broken = driver.findElement(By.linkText("Verify am I broken?"));
		broken.click();
		String title=driver.getTitle();
		if(title.contains("404")) {
			System.out.println("i am broken link");
			}
       driver.navigate().back();
		WebElement home1=driver.findElement(By.linkText("Go to Home Page"));
		home1.click();
		driver.navigate().back();
		List<WebElement> tagName=driver.findElements(By.tagName("a"));
		Integer size=tagName.size();
		System.out.println(size);
		}}



		
	
		
		