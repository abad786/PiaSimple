package com.lt.utils;

import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

public class CapabilitiesManager {
	TestUtils utils = new TestUtils();

	public DesiredCapabilities getCaps() throws IOException {
		DesiredCapabilities caps = new DesiredCapabilities();

		Properties props = new PropertyManager().getProps();
		try {
			utils.log().info("getting capabilities");
			System.out.println(props.get("androidAutomationName"));
			System.out.println(props.get("androidAppPackage"));
			System.out.println(props.get("androidAppActivity"));
			System.out.println(props.get("androidAppLocation"));

			switch (props.get("platformName").toString()) {
			case "android":

				caps.setCapability(MobileCapabilityType.PLATFORM_NAME, props.get("platformName").toString());
				caps.setCapability(MobileCapabilityType.APP, props.get("androidAppLocation").toString());
				caps.setCapability(MobileCapabilityType.UDID, props.get("UDID").toString());
				caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, props.get("androidAutomationName").toString());
				//caps.setCapability("activityName", props.get("androidAppActivity").toString());
				//caps.setCapability("packageName", props.get("androidAppPackage").toString());
				break;

			case "ios":
				break;
			}
			caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 30);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return caps;
	}

}
