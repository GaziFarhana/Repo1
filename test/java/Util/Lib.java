package Util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Lib {

	public static String getTitle(WebDriver driver) {
		String title = driver.getTitle();
		return title;
	}

	public static WebElement findElem(WebDriver driver, String xpath) {
		WebElement elem = driver.findElement(By.xpath(xpath));
		return elem;
	}

	public static String readProperty(String key) throws IOException {
		File file = new File("/Users/gazifarhana/eclipse-workspace1/eBay/Locator.Properties");
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);
		String locator = prop.getProperty(key);
		return locator;
	}

	public static String readExcel(WebDriver driver, int col, int row) {
		return null;
	}

	public static void takeScreenShot(WebDriver driver, String name) throws IOException {
		try {
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("/Users/gazifarhana/eclipse-workspace1/eBay/eBay"+name+".png"));
		} catch (Exception e) {
			System.out.println("Could not take Screenshot");
		}
	}
}
