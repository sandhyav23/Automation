package com.mav.sp.Sccc;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen_sc {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\charles spurgeon\\Desktop\\eclipse\\JDK\\Sccc\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	TakesScreenshot ts=(TakesScreenshot) driver;
	File sourcefile=ts.getScreenshotAs(OutputType.FILE);
	File destinationfile=new File("C:\\Users\\charles spurgeon\\Desktop\\eclipse\\JDK\\Sccc\\Destination\\test.png");
	FileUtils.copyFile(sourcefile, destinationfile);
	
	}
}
