import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task021 {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AS\\eclipse-workspace\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.manage().window().maximize();
	WebElement userName=driver.findElement(By.xpath("//input[@type='text'])[1]"));
	WebElement passWord=driver.findElement(By.xpath("//input[@type='text'])[2]"));
	userName.sendKeys("Janani");
	passWord.sendKeys("Jaanu");
	}}