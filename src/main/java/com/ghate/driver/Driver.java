package com.ghate.driver;

import java.util.Objects;

import org.openqa.selenium.firefox.FirefoxDriver;

import com.ghate.constants.FrameworkConstants;

public class Driver {
	
	private Driver()
	{
		
	}
	
	
	public static void initDriver()
	{
		
		
		if(Objects.isNull(DriverManager.getDriver()))
		{
			System.setProperty("webdriver.gecko.driver",FrameworkConstants.getFirepath());
			
			DriverManager.setDriver(new FirefoxDriver());
			DriverManager.getDriver().get("https://google.com");
		}
	}

	public static void quitDriver()
	{
		if(Objects.nonNull(DriverManager.getDriver()))
		{
			DriverManager.getDriver().quit();
			DriverManager.unLoad();
			
			
		}
	}

}
