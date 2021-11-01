package com.lt.stepdef;

import com.lt.pages.SignUpPage;

import io.cucumber.java.en.When;

public class SignUpDef {

	@When("I enter customer id as {string}")
	public void i_enter_customer_id_as(String id) {
	   new SignUpPage().enterCustomerId(id);
	}

	@When("I click on Sign Up Button")
	public void i_click_on_sign_up_button() {
	   new SignUpPage().clickOnSignUp();
	}

	

}
