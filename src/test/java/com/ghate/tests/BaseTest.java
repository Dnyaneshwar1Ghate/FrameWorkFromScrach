package com.ghate.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.ghate.driver.Driver;

public class BaseTest {
	
	protected BaseTest()
	{
		
	}
	@BeforeMethod
	public void setup()
	{
		Driver.initDriver();
		
	}
	@AfterMethod
	public void tesrDown()
	{
		Driver.quitDriver();
	}
}
