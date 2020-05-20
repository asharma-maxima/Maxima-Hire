package com.maxhire.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.maxhire.utils.BrowserUtil;

public class BaseTest {
	static WebDriver driver;
	public static String browser;
	static String url;
	static String username;
	static String password;
	static int timeout;
	static int pollingInMilli;

	@BeforeTest
	public void launchApplication() {
		File file = new File("./resources/application.properties");
		try {
			FileInputStream fis = new FileInputStream(file);
			Properties prop = new Properties();
			prop.load(fis);
			browser = prop.getProperty("browser");
			url = prop.getProperty("url");
			username = prop.getProperty("username");
			password = prop.getProperty("password");
			timeout = Integer.valueOf(prop.getProperty("timeout"));
			pollingInMilli = Integer.valueOf(prop.getProperty("pollingInMilli"));

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BrowserUtil browserUtil = BrowserUtil.getBrowserInstance();
		driver = browserUtil.getDriver();
		//driver = getDriver();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
	}

	@AfterTest
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}

//	protected WebDriver getDriver() {
//		WebDriver webDriver = null;
//		if ("chrome".equalsIgnoreCase(browser)) {
//			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//			webDriver = new ChromeDriver();
//		}
//		if ("ie".equalsIgnoreCase(browser)) {
//			System.setProperty("webdriver.ie.driver", "./drivers/InternerExplorerdriver.exe");
//			webDriver = new InternetExplorerDriver();
//		}
//		return webDriver;
//	}

}
