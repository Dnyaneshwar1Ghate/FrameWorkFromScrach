package com.ghate.driver;

import org.openqa.selenium.WebDriver;

public class DriverManager {

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
	public static Object manage() {
		// TODO Auto-generated method stub
		return null;
	}
}
