package Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Util.Lib;

public class shoppingcart extends Lib{
	public static void subTotal(WebDriver driver) throws IOException, InterruptedException {
		WebElement subTotalText = findElem(driver, readProperty("subTotalText"));
		WebElement subTotalPrice = findElem(driver, readProperty("subTotalPrice"));
		System.out.print(subTotalText.getText() + " ");
		System.out.println(subTotalPrice.getText());
		Thread.sleep(1000);
	}
	
	public static void shippingPrice(WebDriver driver) throws IOException, InterruptedException {
		WebElement shippingText = findElem(driver, readProperty("shippingText"));
		WebElement shippingPrice = findElem(driver, readProperty("shippingPrice"));
		System.out.print(shippingText.getText() + ": ");
		System.out.println(shippingPrice.getText());
		Thread.sleep(1000);
	}
	
	public static void totalPrice(WebDriver driver) throws IOException, InterruptedException {
		WebElement totalText = findElem(driver, readProperty("totalText"));
		WebElement totalPrice = findElem(driver, readProperty("totalPrice"));
		System.out.print(totalText.getText() + " ");
		System.out.println(totalPrice.getText());
		takeScreenShot(driver, "01");
		Thread.sleep(1000);
	}


}
