package com.ghate.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.ghate.driver.Driver;

public final class HomePageTest extends BaseTest {
	private HomePageTest()
	{
		
	}
	@Test
	void test3() throws InterruptedException
	{
		Driver.initDriver();
		Driver.driver.findElement(By.name("q")).sendKeys("All About Testing",Keys.ENTER);
		Thread.sleep(3000);
	}

}
