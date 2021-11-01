package com.lt.stepdef;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before
	 public static void initialize() throws Exception {
			/*
			 * GlobalParams params = new GlobalParams(); params.initializeGlobalParams();
			 * 
			 * ThreadContext.put("ROUTINGKEY", params.getPlatformName() + "_" +
			 * params.getDeviceName());
			 * 
			 * new ServerManager().startServer(); new DriverManager().initializeDriver();
			 */
    }
	
	

	@After
	 public static void quit(){
       /* DriverManager driverManager = new DriverManager();
        if(driverManager.getDriver() != null){
            driverManager.getDriver().quit();
            driverManager.setDriver(null);
        }
        ServerManager serverManager = new ServerManager();
        if(serverManager.getServer() != null){
            serverManager.getServer().stop();
        }*/
    }
	
}
