package com.maxhire.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.maxhire.tests.BaseTest;

public class BrowserUtil {
	
	private static BrowserUtil browserInstance =null;
	private WebDriver driver;
	
	private BrowserUtil() {
		if ("chrome".equalsIgnoreCase(BaseTest.browser)) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		if ("ie".equalsIgnoreCase(BaseTest.browser)) {
			System.setProperty("webdriver.ie.driver", "./drivers/InternerExplorerdriver.exe");
			driver = new InternetExplorerDriver();
		}
	}
	
	public static BrowserUtil getBrowserInstance() {
		if(browserInstance==null) {
			browserInstance= new BrowserUtil();
		}
		return browserInstance;
	}

	public WebDriver getDriver() {
		return driver;
	}

}
