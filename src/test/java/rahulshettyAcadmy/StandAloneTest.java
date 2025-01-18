package rahulshettyAcadmy;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StandAloneTest {
	public static void main(String[] args) {

			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://rahulshettyacademy.com/client");
			
			driver.findElement(By.id("userEmail")).sendKeys("dnyaneshwarghate1010@gmail.com");
			driver.findElement(By.id("userPassword")).sendKeys("Dghate@2025");
			
			driver.findElement(By.id("login")).click();
			
			List<WebElement> products =driver.findElements(By.cssSelector(".mb-3"));
			System.out.println(products.size());
			WebElement pro=products.stream().filter(product->product.findElement(By.cssSelector("b")).getText().equals("IPHONE 13 PRO")).findFirst().orElse(null);
			
			pro.findElement(By.cssSelector(".card-body button:last-of-type")).click();
			
		
		
	}

}
