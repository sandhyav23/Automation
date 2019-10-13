package com.cucumber.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_page {
	WebDriver driver;
	public Payment_page(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@class=\"bankwire\"]")
	private WebElement payment;
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement confirmation;
	public WebElement getPayment() {
		return payment;
	}
	public WebElement getConfirmation() {
		return confirmation;
	}
	
	
	
}
