package Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.HomePg;
import Pages.SearchResult;
import Pages.shoppingcart;
import Pages.xbox;



public class test {
public WebDriver driver;
	
	@Before
	public void initialize() {

		System.out.println("this is before class annotation!!!!!");
		System.getProperty("webdriver,chrome,driver", 
				"/Users/gazifarhana/eclipse-workspace1/eBay/chromedriver");

		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	@org.junit.Test

	public void testtt() throws InterruptedException, IOException {

		System.out.println("test!!!!!!!!");
		HomePg.printTitle(driver);
		HomePg.searchBox(driver);
		HomePg.searchButton(driver);

		SearchResult.sortOption(driver);
		SearchResult.newlyListed(driver);
		SearchResult.firstItem(driver);

		xbox.conditionText(driver);
		xbox.addToCart(driver);
		xbox.goToCart(driver);
		
		shoppingcart.subTotal(driver);
		shoppingcart.shippingPrice(driver);
		shoppingcart.totalPrice(driver);
	}


	@After
	public void teardown() {
		System.out.println("this is after class annotation!!!");
		System.out.println("test finished!!!!!");
		driver.manage().deleteAllCookies();
		driver.close();

	}
}
