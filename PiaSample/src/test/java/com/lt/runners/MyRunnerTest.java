package com.lt.runners;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

import org.apache.logging.log4j.ThreadContext;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.lt.utils.DriverManager;
import com.lt.utils.GlobalParams;
import com.lt.utils.ServerManager;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"
                , "html:target/cucumber/report.html"
                , "summary"
                , "me.jvt.cucumber.report.PrettyReports:target/Pixel3/cucumber-html-reports"}
        ,features = {"src/test/resources"}
        ,glue = {"com.lt.stepdef"}
        ,snippets = CAMELCASE
        ,dryRun=true
        ,monochrome=true
        ,tags = "@test"

)

public class MyRunnerTest {

    @BeforeClass
    public static void initialize() throws Exception {
       GlobalParams params = new GlobalParams();
        params.initializeGlobalParams();
		ThreadContext.put("ROUTINGKEY", params.getPlatformName() + "_" +
		  params.getDeviceName());
		 

		
		  new ServerManager().startServer(); 
		 
		  new DriverManager().initializeDriver();
		 
    }

    @AfterClass
    public static void quit(){
        DriverManager driverManager = new DriverManager();
        if(driverManager.getDriver() != null){
            driverManager.getDriver().quit();
            
            driverManager.setDriver(null);
        }
		
		
		  ServerManager serverManager = new ServerManager();
		  if(serverManager.getServer() != null){ serverManager.getServer().stop(); }
		 
		 
    }
}
