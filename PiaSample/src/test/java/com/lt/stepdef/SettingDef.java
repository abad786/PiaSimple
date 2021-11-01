package com.lt.stepdef;

import com.lt.pages.SettingPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SettingDef {
	
	@When("I dismiss the alert of environment description by pressing OK button.")
	public void i_dismiss_the_alert_of_environment_description_by_pressing_ok_button() {
	 // new SettingPage().
	}

	@When("I click the up-right corner gear button to go to Settings page.")
	public void i_click_the_up_right_corner_gear_button_to_go_to_settings_page() {
     new SettingPage().clcikOnSetting();
	}

	@Then("I verify the Customer ID is saved correctly with {string}")
	public void i_verify_the_customer_id_is_saved_correctly_with(String id) {
	 new SettingPage().verifyCustId(id);
	}

	@Then("I click on change customer ID button")
	public void iClickOnChangeCustomerIDButton() {
	    
	}

	@Then("I click on cancel button")
	public void iClickOnCancelButton() {
	  
	}

	
}
