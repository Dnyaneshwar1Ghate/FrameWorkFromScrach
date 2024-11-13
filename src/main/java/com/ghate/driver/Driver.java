package com.ghate.driver;

import java.util.Objects;

import org.openqa.selenium.firefox.FirefoxDriver;

import com.ghate.constants.FrameworkConstants;
import com.ghate.util.ReadPropertyFile;

public class Driver {
	
	private Driver()
	{
		
	}
	
	
	public static void initDriver() throws Exception
	{
		
		
		if(Objects.isNull(DriverManager.getDriver()))
		{
			System.setProperty("webdriver.gecko.driver",FrameworkConstants.getFirepath());
			
			DriverManager.setDriver(new FirefoxDriver());
			Thread.sleep(3000);
			DriverManager.getDriver().get(ReadPropertyFile.getValue("URL"));
			Thread.sleep(3000);
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
