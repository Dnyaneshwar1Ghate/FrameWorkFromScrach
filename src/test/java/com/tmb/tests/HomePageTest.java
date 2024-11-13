package com.tmb.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {
	@Test
	void test3() throws InterruptedException
	{
		driver.findElement(By.name("q")).sendKeys("All About Testing",Keys.ENTER);
		Thread.sleep(3000);
	}

}
