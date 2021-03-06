package com.cucumber.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.cucumber.POM.Address;
import com.cucumber.POM.Loginpage;
import com.cucumber.POM.Logout;
import com.cucumber.POM.Payment_page;
import com.cucumber.POM.Select_dresses;
import com.cucumber.POM.Shipping_page;
import com.cucumber.POM.Summary_page;
import com.cucumber.baseclass.Base;
import com.cucumber.runner.TestRunner;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends Base {
	public static WebDriver driver=TestRunner.driver;

	@Given("^Launch the automation practise web application$")
	public void launch_the_automation_practise_web_application() throws Throwable {
		Loginpage lp = new Loginpage(driver);
		getUrl("http://automationpractice.com/index.php");

	}

	@When("^user click on the sign In button in the home page$")
	public void user_click_on_the_sign_In_button_in_the_home_page() throws Throwable {
		Loginpage lp = new Loginpage(driver);
		clickElement(lp.getLoginbt());
		/*
		 * clickElement(lp.getLoginbt());// lp.getLoginbt().click(); throw new
		 * PendingException();
		 */
	}

	@When("^user should enter the email id in the email Id feild$")
	public void user_should_enter_the_email_id_in_the_email_Id_feild() throws Throwable {
		Loginpage lp = new Loginpage(driver);
		setkey(lp.getEmailbt(), "cccc@gmail.com");
		// sendkeysActions(lp.getEmailbt(),"cccc@gmail.com");
	}

	@When("^User should enter the password in the password feild$")
	public void user_should_enter_the_password_in_the_password_feild() throws Throwable {
		Loginpage lp = new Loginpage(driver);
		setkey(lp.getPassbt(), "11111");
		// sendkeysActions(lp.getPassbt(), "11111");
	}

	@When("^the user should click on the sign in button in the create account page$")
	public void the_user_should_click_on_the_sign_in_button_in_the_create_account_page() throws Throwable {
		Loginpage lp = new Loginpage(driver);
		clickElement(lp.getSignbt());
	}

	@Given("^User should be in home page$")
	public void user_should_be_in_home_page() throws Throwable {
		Select_dresses sd = new Select_dresses(driver);
		elementisDisplayed(sd.getVer());
	}

	/*
	 * @Then("^Validate the user name$") public void validate_the_user_name() throws
	 * Throwable { // Write code here that turns the phrase above into concrete
	 * actions  }
	 */

	@When("^User should click on the dress button$")
	public void user_should_click_on_the_dress_button() throws Throwable {
		Select_dresses sd = new Select_dresses(driver);
		mouseOver(sd.getDressbt());
		clickElement(sd.getDressbt());
		
	}

	@When("^User shoud click on the summer dresses$")
	public void user_shoud_click_on_the_summer_dresses() throws Throwable {
		Select_dresses sd = new Select_dresses(driver);
		mouseOver(sd.getSummerbt());
		//clickElement(sd.getSummerbt());
		
	}

	/*@When("^user should click on the Quick view$")
	public void user_should_click_on_the_Quick_view() throws Throwable {
		Select_dresses sd = new Select_dresses(driver); 
		mouseOver(sd.getFullimg());
		clickElement(sd.getQuickbt());
		
	}*/

	@Then("^user should verify the select dress is displayed in the page$")
	public void user_should_verify_the_select_dress_is_displayed_in_the_page() throws Throwable {
		Select_dresses sd = new Select_dresses(driver);
		elementisDisplayed(sd.getVerifyimg());
		clickElement(sd.getFullimg());
		
	}

	@Then("^the user should select the quantity$")
	public void the_user_should_select_the_quantity() throws Throwable {
		Select_dresses sd = new Select_dresses(driver);
		clickElement(sd.getPlusbt());
		
	}

	@Then("^the user should select the color$")
	public void the_user_should_select_the_color() throws Throwable {
		Select_dresses sd = new Select_dresses(driver);
		clickElement(sd.getColor());
		
	}

	@Then("^the user should select the size$")
	public void the_user_should_select_the_size() throws Throwable {
		Select_dresses sd = new Select_dresses(driver);
		dropdown(sd.getSizedrop(),"1", "S");
	
		
	}

	@Then("^User should click on the add to cart button$")
	public void user_should_click_on_the_add_to_cart_button() throws Throwable {
		Select_dresses sd = new Select_dresses(driver);
		clickElement(sd.getAddtocart());
		
	}

	/*
	 * @Then("^User should verify whether the placed order is correct$") public void
	 * user_should_verify_whether_the_placed_order_is_correct() throws Throwable {
	 * Select_dresses sd=new Select_dresses(driver);
	 * 
	 *  }
	 */

	@Then("^the user should click on the proceed to checkout button$")
	public void the_user_should_click_on_the_proceed_to_checkout_button() throws Throwable {
		Select_dresses sd = new Select_dresses(driver);
		clickElement(sd.getChecko());
		
	}

	@Given("^user should verify the the description$")
	public void user_should_verify_the_the_description() throws Throwable {
		Summary_page sum = new Summary_page(driver);
		elementisDisplayed(sum.getDescription());
		
	}

	/*
	 * @Then("^the user should verify the given feilds are correct$") public void
	 * the_user_should_verify_the_given_feilds_are_correct() throws Throwable { //
	 * Write code here that turns the phrase above into concrete actions throw new
	 * PendingException(); }
	 */

	@Then("^the user should click on the proceed to check out$")
	public void the_user_should_click_on_the_proceed_to_check_out() throws Throwable {
		Summary_page sum = new Summary_page(driver);
		clickElement(sum.getCheckout());
		
	}

	@When("^user should click on the address checkbox$")
	public void user_should_click_on_the_address_checkbox() throws Throwable {
		Address ad = new Address(driver);
		clickElement(ad.getCheckbk());
		
	}

	@Then("^user should verify the billing address and delivery address$")
	public void user_should_verify_the_billing_address_and_delivery_address() throws Throwable {
		Address ad = new Address(driver);
		elementisDisplayed(ad.getBilling_Add());
		elementisDisplayed(ad.getDelivery_Add());

		
	}

	@Given("^user should click on the proceed to checkout button$")
	public void user_should_click_on_the_proceed_to_checkout_button() throws Throwable {
		Address ad = new Address(driver);
		clickElement(ad.getCheck2());
		
	}

	@Given("^the user should  check the checkox of the terms of services$")
	public void the_user_should_check_the_checkox_of_the_terms_of_services() throws Throwable {
		Shipping_page shp = new Shipping_page(driver);
		clickElement(shp.getCh());
		
	}

	/*
	 * @Then("^the user should click on the proceed to second check out") public
	 * void the_user_should_click_on_the_proceed_to_second_check_out() {
	 * Shipping_page shp=new Shipping_page(driver); clickElement(shp.getCheck3()); }
	 */

	@Then("^the user should click on the proceed to  second check out$")
	public void the_user_should_click_on_the_proceed_to_second_check_out() throws Throwable {
		Shipping_page shp = new Shipping_page(driver);
		clickElement(shp.getCheck3());
		
	}

	@When("^user should click the pay by bank wire$")
	public void user_should_click_the_pay_by_bank_wire() throws Throwable {
		Payment_page pg = new Payment_page(driver);
		clickElement(pg.getPayment());
		
	}

	@When("^the user should click on the confirm my order button$")
	public void the_user_should_click_on_the_confirm_my_order_button() throws Throwable {
		Payment_page pg = new Payment_page(driver);
		clickElement(pg.getConfirmation());
		
	}

	@Given("^user shoud click on the log out button$")
	public void user_shoud_click_on_the_log_out_button() throws Throwable {
		Logout lo = new Logout(driver);
		clickElement(lo.getLogbt());
		
	}

}
