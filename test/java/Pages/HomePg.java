package Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Util.Lib;

public class HomePg extends Lib{

	public static void printTitle(WebDriver driver) {
		System.out.println("Title: " + getTitle(driver));

	}

	public static void searchBox(WebDriver driver) throws IOException, InterruptedException {
		WebElement searchBox = findElem(driver, readProperty("searchBox"));
		searchBox.sendKeys("xbox one");
		Thread.sleep(1000);
	}

	public static void searchButton(WebDriver driver) throws IOException, InterruptedException {
		WebElement searchButton = findElem(driver, readProperty("searchButton"));
		searchButton.click();
		Thread.sleep(1000);
	}


	
	}
	

