package com.lt.pages;

import com.lt.utils.TestUtils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SettingPage extends BasePage {
	TestUtils utils = new TestUtils();

@AndroidFindBy(accessibility = "Settings")
private MobileElement settings;

@AndroidFindBy(id = "eu.nets.pia.sample:id/customer_id_label")
private MobileElement cutomerIdLabel;

@AndroidFindBy(id = "eu.nets.pia.sample:id/change_customer_id")
private MobileElement changeCustId;

@AndroidFindBy(id = "android:id/button2")
private MobileElement cancelBut;

public SettingPage clcikOnSetting()
{
	click(settings, "Clicking On Setting Button");
	return this;}

public SettingPage verifyCustId(String expectedCusId)
{
	String custId=getText(cutomerIdLabel, "Fetching the Customer ID");
	assert(custId.equalsIgnoreCase(expectedCusId));
	return this;
}

public SettingPage clickOnChangeCustID()
{
	click(changeCustId, "Clicking on Change cutomer");
	return this;}

public SettingPage clickOnCancelButton()
{
	click(cancelBut, "Clicking On Cancel Button");
	return this;}
}



