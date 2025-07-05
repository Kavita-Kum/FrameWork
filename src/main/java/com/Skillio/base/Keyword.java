package com.Skillio.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.Skillio.exceptions.InvalidBrowserNameException;

public class Keyword {

	public static RemoteWebDriver driver;

	public static void openBrowserName(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		} else {
			throw new InvalidBrowserNameException(browserName);
		}
		System.out.println(browserName + "Browser is launched sucessfully.....");
	}
	public static void closeBrowser() {
		driver.close();
	}

	public static void quitAllWindow() {
		driver.quit();
	}

	private static WebElement getWebElement(String locatorType,String locator) {
		WebElement e=null;
		
		if(locatorType.equalsIgnoreCase("id")) {
			e=driver.findElement(By.xpath(locator));
		} else if (locatorType.equalsIgnoreCase("class")) {
			e=driver.findElement(By.xpath(locator));
		} else if (locatorType.equalsIgnoreCase("name")) {
			e=driver.findElement(By.xpath(locator));
		}else if(locatorType.equalsIgnoreCase("cssselector")) {
			e=driver.findElement(By.xpath(locator));
		}else if(locatorType.equalsIgnoreCase("tagname")) {
			e=driver.findElement(By.xpath(locator));
		}if(locatorType.equalsIgnoreCase("linktext")) {
			e=driver.findElement(By.xpath(locator));
		}if(locatorType.equalsIgnoreCase("partiallinktext")) {
			e=driver.findElement(By.xpath(locator));
		}
		return e;
	}
	
	public static void enterText(String locatorType, String locator, String textToEnter) {
		getWebElement(locatorType,locator).sendKeys(textToEnter);
	}

	public static void launchurl(String url) {
		driver.get(url);
		System.out.println("url is launched successfully...");
	}

	public static void clickOnElements(String locatorType, String locator) {
		getWebElement(locatorType,locator).click();
	}

	
}