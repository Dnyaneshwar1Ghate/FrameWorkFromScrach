package rahulshettyAcadmy;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;
import rahulShettyAcadmey.pageobjects.landingPage;
import rahulShettyAcadmey.pageobjects.productCatlog;

public class StandAloneTest {
	public static void main(String[] args) {

		String proDuctName = "IPHONE 13 PRO";

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		landingPage lp = new landingPage(driver);
		lp.goTo();
		lp.loginApplication("dnyaneshwarghate1010@gmail.com", "Dghate@2025");
		
		productCatlog pc=new productCatlog(driver);
		List<WebElement> products=pc.getProductList();
		pc.addProductToCart(proDuctName);		

		driver.findElement(By.cssSelector("[routerlink*='cart']")).click();

		List<WebElement> cartProducts = driver.findElements(By.cssSelector(".cartSection h3"));
		Boolean match = cartProducts.stream()
				.anyMatch(cartProduct -> cartProduct.getText().equalsIgnoreCase(proDuctName));
		Assert.assertTrue(match);
		driver.findElement(By.cssSelector(".totalRow button")).click();

		Actions a = new Actions(driver);
		a.sendKeys(driver.findElement(By.cssSelector("[placeholder='Select Country']")), "india").build().perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results")));

		driver.findElement(By.xpath("(//button[contains(@class,'ta-item')])[2]")).click();

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(1085, 700)");

		driver.findElement(By.cssSelector(".action__submit ")).click();

		String conformMessge = driver.findElement(By.cssSelector(".hero-primary")).getText();
		Assert.assertTrue(conformMessge.equalsIgnoreCase("Thankyou for the order."));

		driver.quit();

	}

}
