package com.tmb.tests;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;



public class LoginpageTest extends BaseTest {

	@Test
	void test1() throws InterruptedException
	{	
		driver.findElement(By.name("q")).sendKeys("Automation",Keys.ENTER);
		Thread.sleep(3000);
	}
	@Test
	void test2() throws InterruptedException
	{
		driver.findElement(By.name("q")).sendKeys("Testing mini bytes",Keys.ENTER);
		Thread.sleep(3000);
	}

}
