package com.tmb.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.tmb.constants.FrameworkConstants;

public class BaseTest {
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.gecko.driver",FrameworkConstants.getFirepath());
		driver = new FirefoxDriver();
		driver.get("https://google.com");
	}
	@AfterMethod
	public void tesrDown()
	{
		driver.quit();

	}
}
