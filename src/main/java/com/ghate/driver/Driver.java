package com.ghate.driver;

import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.ghate.constants.FrameworkConstants;

public class Driver {

	private static WebDriver driver;
	
	
	
	
	public static void initDriver()
	{
		if(Objects.isNull(driver))
		{
			System.setProperty("webdriver.gecko.driver",FrameworkConstants.getFirepath());
			driver = new FirefoxDriver();
			DriverManager.setDriver(driver);
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
