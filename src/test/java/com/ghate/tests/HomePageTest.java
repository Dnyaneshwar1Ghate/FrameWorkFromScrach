package com.ghate.tests;

import java.util.List;
import java.util.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


import com.ghate.driver.DriverManager;

public final class HomePageTest extends BaseTest {
	private HomePageTest()
	{
		
	}
	/*@Test
	void test2() throws Exception
	{
		Driver.initDriver();
		DriverManager.getDriver().findElement(By.name("q")).sendKeys("All About Testing",Keys.ENTER);
		Thread.sleep(3000);
	}*/
	@Test
	public void TestCase1()
	{
		DriverManager.getDriver().findElement(By.name("q")).sendKeys("Testing mini bytes - Youtube",Keys.ENTER);
		String title=DriverManager.getDriver().getTitle();
		Assert.assertTrue(Objects.nonNull(title));
		Assert.assertTrue(title.toLowerCase().contains("google search"));
		Assert.assertTrue(title.toLowerCase().matches("\\w.*"+"gooel.com search"));
		Assert.assertTrue(title.length()>15);
		Assert.assertTrue(title.length()<100);
		List<WebElement> elements=DriverManager.getDriver().findElements(By.xpath("//h3/spam"));
		Assert.assertEquals(elements.size(),10);
		
		boolean isElementPresetn=false;
		
		for(WebElement elem : elements)
		{
			
			if(elem.getText().equalsIgnoreCase("Testing mini bytes -youtube"))
			{
				isElementPresetn=true;
				break;
			}
			
		}
		Assert.assertTrue(isElementPresetn,"Testing mini bytes -youtube");
		
		
	}
	
	
	

}
