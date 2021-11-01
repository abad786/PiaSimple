package com.lt.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

import java.io.IOException;
import java.net.URL;
import java.util.Properties;

public class DriverManager {
    TestUtils utils = new TestUtils();
    AppiumDriver<MobileElement> driver = null;

    public AppiumDriver<MobileElement> getDriver(){
        return this.driver;
    }

    public void setDriver(AppiumDriver<MobileElement> driver){
       this.driver= driver;
    }

    public void initializeDriver() throws Exception {
        Properties props = new PropertyManager().getProps();

        if(driver == null){
            try{
                utils.log().info("initializing Appium driver");
                switch(props.get("platformName").toString()){
                    case "android":
                        driver = new AndroidDriver<MobileElement>(new URL("https://localhost:4723/wd/hub"), new CapabilitiesManager().getCaps());
                        System.out.println(driver);
                        break;
                    case "iOS":
                        driver = new IOSDriver<MobileElement>(new URL("https://localhost:4723/wd/hub"), new CapabilitiesManager().getCaps());
                        break;
                }
                if(driver == null){
                    throw new Exception("driver is null. ABORT!!!");
                }
                utils.log().info("Driver is initialized");
                this.setDriver(driver);
            } catch (IOException e) {
                e.printStackTrace();
                utils.log().fatal("Driver initialization failure. ABORT !!!!" + e.toString());
                throw e;
            }
        }

       
    }
    public static void main(String ar[]) throws Exception
    {
    	new DriverManager().initializeDriver();
    }
}
