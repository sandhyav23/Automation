package com.cucumber.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address {
	WebDriver driver;
	public Address(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//input[@name='same']")
private WebElement checkbk;
@FindBy(xpath="(//li[text()='dddd s'])[1]")
private WebElement Delivery_Add;
@FindBy(xpath="(//li[text()='dddd s'])[2]")
private WebElement Billing_Add;
@FindBy(xpath="//span[text()='Proceed to checkout']")
private WebElement check2;
public WebElement getCheckbk() {
	return checkbk;
}
public WebElement getDelivery_Add() {
	return Delivery_Add;
}
public WebElement getBilling_Add() {
	return Billing_Add;
}
public WebElement getCheck2() {
	return check2;
}


}

