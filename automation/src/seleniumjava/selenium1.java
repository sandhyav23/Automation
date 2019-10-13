package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class selenium1 {
	public static WebDriver driver;

	public static void ChromeLaunch() {
	/*	System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();*/
		
		//username
		//WebElement signin=driver.findElement(By.xpath("//a[@class='login']"));
		//signin.click();
		
		
		//password
		//x	WebElement PassWord=driver.findElement(By.id("pass"));
		//PassWord.sendKeys("Abc@123");
		//System.out.println("Password got entered");
		
//		System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
//		driver = new FirefoxDriver();
//		driver.get("https://www.facebook.com");
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement day=driver.findElement(By.xpath("//select[@title='Day']"));
		Select se=new Select(day);
		se.selectByIndex(29);
		
		WebElement month=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select se1=new Select(month);
		se1.selectByVisibleText("May");
		
		WebElement year=driver.findElement(By.xpath("//select[@title='Year']"));
		Select se2=new Select(year);
		
		se2.selectByValue("1996");
		
		
		
		
		//username
		//WebElement usernameone=driver.findElement(By.id("email"));
		//usernameone.sendKeys("abc@gmail.com");
		//System.out.println("username got entered");
		
		//password
		/*WebElement PassWordone=driver.findElement(By.id("pass"));
		PassWordone.sendKeys("Abc@123");
		System.out.println("Password got entered");*/
	
		
		
	}

	public static void main(String args[]) {
		ChromeLaunch();
		System.out.println("Browser has been launched successfully");
		
	}
}
