package Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Util.Lib;

public class xbox extends Lib{

	public static void conditionText(WebDriver driver) throws IOException, InterruptedException {
		WebElement conditionText = findElem(driver, readProperty("conditionText"));
		WebElement condStatus = findElem(driver, readProperty("condStatus"));
		System.out.print(conditionText.getText() + " ");
		System.out.println(condStatus.getText());
		Thread.sleep(1000);
	}

	public static void addToCart(WebDriver driver) throws IOException, InterruptedException {
		WebElement addToCart = findElem(driver, readProperty("addToCart"));
		addToCart.click();
		Thread.sleep(1000);
	}

	public static void goToCart(WebDriver driver) throws IOException, InterruptedException {
		WebElement goToCart = findElem(driver, readProperty("goToCart"));
		goToCart.click();
		Thread.sleep(1000);
	}


}
