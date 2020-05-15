package com.maxhire.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	WebDriver driver;
	String browser;
	String url;
	String username;
	String password;
	int timeout;
	int pollingInMilli;
	
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
		
		driver = getDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@AfterTest
	public void tearDown() {
		if(driver!=null) {
			driver.quit();
		}
	}
	
	
	protected WebDriver getDriver() {
		WebDriver webDriver = null;
		if("chrome".equalsIgnoreCase(browser)) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			webDriver = new ChromeDriver();
		}
		if("ie".equalsIgnoreCase(browser)) {
			System.setProperty("webdriver.ie.driver", "./drivers/InternerExplorerdriver.exe");
			webDriver = new InternetExplorerDriver();
		}
		return webDriver;		
	}

}
