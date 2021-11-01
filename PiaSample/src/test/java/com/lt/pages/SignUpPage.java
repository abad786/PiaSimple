package com.lt.pages;

import com.lt.utils.TestUtils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SignUpPage extends BasePage{
	TestUtils utils = new TestUtils();
	
@AndroidFindBy(id = "eu.nets.pia.sample:id/customer_id_et")
private MobileElement idTextField;

@AndroidFindBy(id = "eu.nets.pia.sample:id/sign_up_btn")
private MobileElement signUp;

public SignUpPage enterCustomerId(String id)
{
	System.out.println("Customer ID");
	sendKeys(idTextField, id, "Sign Up with" +id);
	return this;
	}

public SignUpPage clickOnSignUp()
{
	click(signUp, "Click On Sign Up Button");
  return this;	
}
}
