package com.tbb.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.tmb.constants.FrameworkConstants;

public class Driver {

	public static WebDriver driver;
	public static void initDriver()
	{
		if(driver==null)
		{
			System.setProperty("webdriver.gecko.driver",FrameworkConstants.getFirepath());
			driver = new FirefoxDriver();
			driver.get("https://google.com");
		}
	}

	public static void quitDriver()
	{
		driver.quit();
	}

}
