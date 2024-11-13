package com.ghate.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.ghate.driver.Driver;

public class BaseTest {
	
	protected BaseTest()
	{
		
	}
	@BeforeMethod
	protected void setup() throws Exception
	{
		Driver.initDriver();
		
	}
	@AfterMethod
	protected void tesrDown()
	{
		Driver.quitDriver();
	}
}
