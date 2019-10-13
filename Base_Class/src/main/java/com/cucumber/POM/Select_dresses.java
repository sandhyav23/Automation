package com.cucumber.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_dresses {
	WebDriver driver;
	public Select_dresses(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);			
	}
	@FindBy(xpath="//span[text()='dddd s']")
	private WebElement ver;
	@FindBy(xpath="(//a[@title='Dresses'])[2]")
	private WebElement dressbt;
	@FindBy(xpath="(//a[@title='Summer Dresses'])[2]")
	private WebElement summerbt;
	@FindBy(xpath="(//img[@title='Printed Summer Dress'])[2]")
	private WebElement fullimg;
	//@FindBy(xpath="(//span[text()='Quick view'])[1]")
	//private WebElement Quickbt;
	@FindBy(id="bigpic")
	private WebElement verifyimg;
	@FindBy(xpath="//i[@class='icon-plus']")
	private WebElement Plusbt;
	@FindBy(xpath="//select[@id='group_1']")
	private WebElement sizedrop;
	@FindBy(xpath="//a[@id='color_11']")
	private WebElement color;
	@FindBy(xpath="//button[@class='exclusive']")
	private WebElement addtocart;
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement checko;
	public WebElement getDressbt() {
		return dressbt;
	}
	public WebElement getSummerbt() {
		return summerbt;
	}
	public WebElement getVer() {
		return ver;
	}
	//public WebElement getQuickbt() {
	//	return Quickbt;
	//}
	public WebElement getVerifyimg() {
		return verifyimg;
	}
	public WebElement getFullimg() {
		return fullimg;
	}
	public WebElement getPlusbt() {
		return Plusbt;
	}
	public WebElement getSizedrop() {
		return sizedrop;
	}
	public WebElement getColor() {
		return color;
	}
	public WebElement getAddtocart() {
		return addtocart;
	}
	public WebElement getChecko() {
		return checko;
	}
	
	
	

}
