package com.ghate.driver;

import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.ghate.constants.FrameworkConstants;

public class Driver {

	private static WebDriver driver;
	
	private static ThreadLocal<WebDriver> dr=new ThreadLocal<>();
	
	public static WebDriver getDriver()
	{
		return dr.get();
		
	}
	public static void setDriver(WebDriver driverref)
	{
		dr.set(driverref);
	}
	
	public static void unLoad()
	{
		dr.remove();
	}
	
	
	public static void initDriver()
	{
		if(Objects.isNull(driver))
		{
			System.setProperty("webdriver.gecko.driver",FrameworkConstants.getFirepath());
			driver = new FirefoxDriver();
			setDriver(driver);
			getDriver().get("https://google.com");
		}
	}

	public static void quitDriver()
	{
		if(Objects.nonNull(getDriver()))
		{
			getDriver().quit();
			unLoad();
			
		}
	}

}
