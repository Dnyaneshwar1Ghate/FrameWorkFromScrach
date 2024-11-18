package com.ghate.tests;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.ghate.driver.DriverManager;
public final class LoginpageTest extends BaseTest {

	private LoginpageTest()
	{
		}

	@Test
	void test1() throws InterruptedException
	{	
		DriverManager.getDriver().findElement(By.name("q")).sendKeys("Automation",Keys.ENTER);
		Thread.sleep(3000);
	}
	

}
