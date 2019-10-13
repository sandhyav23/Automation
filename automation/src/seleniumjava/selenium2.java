package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selenium2 {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		WebElement signin=driver.findElement(By.xpath("//a[@class='login']"));
		signin.click();
		Thread.sleep(3000);
		
		WebElement email=driver.findElement(By.xpath("//input[@id='email_create']"));
		email.sendKeys("rty@gmail.com");
		Thread.sleep(3000);
		
		WebElement createacct=driver.findElement(By.xpath("//i[@class='icon-user left']"));
		createacct.click();
		Thread.sleep(3000);
		
		WebElement radio2=driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		radio2.click();
		Thread.sleep(3000);
		
		WebElement firstname =driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		firstname.sendKeys("sandhya");
		Thread.sleep(3000); 
		
		//WebElement Lastname =driver.findElement(By.xpath("(//input[@name='customer_lastname']"));
		//	Lastname.sendKeys("V");
		
		
		WebElement pass =driver.findElement(By.xpath("(//input[@id='passwd']"));
		pass.sendKeys("SANDHYA");
		Thread.sleep(3000);
		
		WebElement date=driver.findElement(By.xpath("//select[@id='days']"));
		Select se=new Select(date);
		se.selectByIndex(18);
		
		WebElement month=driver.findElement(By.xpath("//select[@id='months']"));
		Select se1=new Select(month);
		se1.selectByValue("9");
		
		
		WebElement year=driver.findElement(By.xpath("//select[@id='years']"));
		Select se2=new Select(year);
		se2.selectByValue("1996");
		
		WebElement check=driver.findElement(By.xpath("//input[@id=\"newsletter\"]"));
		check.click();
		Thread.sleep(3000);
		
		WebElement company=driver.findElement(By.xpath("//input[@id='company']"));
		company.sendKeys("CTS");
		Thread.sleep(3000);
		
		WebElement address=driver.findElement(By.xpath("//input[@id='address1']"));
		address.sendKeys("193,Kamarajapuram");
		Thread.sleep(3000);
		
		WebElement address2=driver.findElement(By.xpath("//input[@id='address2']"));
		address2.sendKeys("Nungambakkam");
		Thread.sleep(3000);
		
		WebElement City=driver.findElement(By.xpath("//input[@id='city']"));
		City.sendKeys("Chennai");
		Thread.sleep(3000);
		
		WebElement State=driver.findElement(By.xpath("//select[@id='id_state']"));
		Select s1=new Select(State);
		s1.selectByIndex(2);
		
		WebElement postal=driver.findElement(By.xpath("//input[@id='postcode']"));
		postal.sendKeys("00001");
		
		WebElement con=driver.findElement(By.xpath("//select[@id='id_country']"));
		Select s2=new Select(con);
		s2.selectByValue("21");
		
		WebElement ADD=driver.findElement(By.xpath("//textarea[@id='other']"));
		ADD.sendKeys("9941390228");
		Thread.sleep(3000);
		
		WebElement home=driver.findElement(By.xpath("//textarea[@name='other']"));
		home.sendKeys("123444");
		Thread.sleep(3000);
		
		WebElement mobile=driver.findElement(By.xpath("//input[@id='phone_mobile']"));
		mobile.sendKeys("9090345678");
		Thread.sleep(3000);
		
		WebElement Dadd=driver.findElement(By.xpath("//input[@id='alias']"));
		Dadd.sendKeys("kamarajapuram");
		Thread.sleep(3000);
		
		WebElement reg=driver.findElement(By.xpath("//span[text()='Register']"));
		reg.click();
		
	}	
		
	}
	
	
	
	


