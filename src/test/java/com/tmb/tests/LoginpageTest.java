package com.tmb.tests;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.tmb.constants.FrameworkConstants;



public class LoginpageTest  {
	@Test
	void test1() throws InterruptedException
	{
		
		System.setProperty("webdriver.gecko.driver",FrameworkConstants.getFirepath());
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Automation",Keys.ENTER);
		Thread.sleep(3000);
		driver.quit();
		
	}
	@Test
	void test2() throws InterruptedException
	{
		
		System.setProperty("webdriver.gecko.driver",FrameworkConstants.getFirepath());
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Testing mini bytes",Keys.ENTER);
		Thread.sleep(3000);
		driver.quit();
		
	}

}
