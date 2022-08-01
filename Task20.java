import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task20 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AS\\eclipse-workspace\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement userName=driver.findElement(By.xpath("//input[@type='text']"));
		WebElement passWord=driver.findElement(By.xpath("//input[@type='password']"));
		userName.sendKeys("Janani");
		passWord.sendKeys("123");
	}}