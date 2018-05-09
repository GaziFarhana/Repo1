package Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Util.Lib;

public class SearchResult extends Lib {
	
	
	public static void sortOption(WebDriver driver) throws IOException, InterruptedException {
		WebElement sortOption = findElem(driver, readProperty("sortOption"));
		Actions ac = new Actions(driver);
		ac.moveToElement(sortOption).build().perform();
		Thread.sleep(1000);
	}

	public static void newlyListed(WebDriver driver) throws IOException, InterruptedException {
		WebElement newlyListed = findElem(driver, readProperty("newlyListed"));
		Actions ac = new Actions(driver);
		ac.click(newlyListed).build().perform();
		Thread.sleep(1000);
	}

	public static void firstItem(WebDriver driver) throws IOException, InterruptedException {
		WebElement firstItem = findElem(driver, readProperty("firstItem"));
		firstItem.click();
		Thread.sleep(1000);
	}
	
}
