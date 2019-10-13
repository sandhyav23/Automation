package com.cucumber.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summary_page {
	WebDriver driver;
	public Summary_page(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//a[text()='Printed Summer Dress']")
    private WebElement description;
	@FindBy(xpath="//span[text()='Proceed to checkout']")
	private WebElement checkout;
	public WebElement getDescription() {
		return description;
	}
	public WebElement getCheckout() {
		return checkout;
	}
	
    
}
