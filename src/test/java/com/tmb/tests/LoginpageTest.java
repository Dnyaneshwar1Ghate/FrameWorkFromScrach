package com.tmb.tests;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.tbb.driver.Driver;



public class LoginpageTest extends BaseTest {

	private LoginpageTest()
	{
		
	}
	
	@Test
	void test1() throws InterruptedException
	{	
		Driver.driver.findElement(By.name("q")).sendKeys("Automation",Keys.ENTER);
		Thread.sleep(3000);
	}
	

}
