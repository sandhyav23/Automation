package seleniumjava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium3 {
	public static WebDriver driver ;
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		WebElement signin=driver.findElement(By.xpath("//a[@class='login']"));
		signin.click();
		Thread.sleep(3000);
	
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("Sandhya23@gmail.com");
		Thread.sleep(3000);
		
		WebElement pass=driver.findElement(By.xpath("//input[@id='passwd']"));
		pass.sendKeys("Sandyvino");
		Thread.sleep(3000);
		
		WebElement Signin2=driver.findElement(By.xpath("//i[@class='icon-lock left']"));
		Signin2.click();
		Thread.sleep(3000);
		
		//span[text()='Sandya V']
		String st="Sandya V";
		WebElement name = driver.findElement(By.xpath("//span[text()='Sandya V']"));
		String s= name.getText();
		boolean equals=st.equals(s);
		System.out.println("valid" +equals);
		
		WebElement search = driver.findElement(By.xpath("//input[@name='search_query']"));
		if(search.isDisplayed()&&search.isEnabled())
		{
			search.sendKeys("Dress");
		}
		WebElement searchb= driver.findElement(By.xpath("//button[@name='submit_search']"));
		searchb.click();
		
		WebElement drop= driver.findElement(By.xpath("//select[@id='selectProductSort']"));
		Select s1=new Select(drop);
		s1.selectByVisibleText("Price: Lowest first");
		
		//WebElement results = driver.findElement(By.xpath("//div[contains(@class,\"content_price\")]"));
		//String rel = results.getText();
		//System.out.println("Price:"+rel);
		
		//String val=rel.toString();
		//System.out.println("string"+val);
		
		
		
		
		
		
		
		
//		for(int i=0;i<results.size();i++)
//		{
//			System.out.println("success"+results.size());
//		}
//		
		
		}
		
		
		//body[@id='my-account']
		//WebElement options= driver.findElement(By.id("//li[contains(text(),'T-shirts')]"));
		//options.click();
	
		
	}



