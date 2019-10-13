package com.cucumber.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping_page {
	WebDriver driver;
	public Shipping_page(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="cgv")
	private WebElement ch;
	
	@FindBy(xpath="//button[@name='processCarrier']") //proceed to checkout button
	private WebElement check3;
	public WebElement getCh() {
		return ch;
	}

	public WebElement getCheck3() {
		return check3;
	}
	
	

}
