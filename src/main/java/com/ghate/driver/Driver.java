package com.ghate.driver;

import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.ghate.constants.FrameworkConstants;

public class Driver {

	public static WebDriver driver;
	public static void initDriver()
	{
		if(Objects.isNull(driver))
		{
			System.setProperty("webdriver.gecko.driver",FrameworkConstants.getFirepath());
			driver = new FirefoxDriver();
			driver.get("https://google.com");
		}
	}

	public static void quitDriver()
	{
		if(Objects.nonNull(driver))
		{
			driver.quit();
			driver=null;
			
		}
	}

}
