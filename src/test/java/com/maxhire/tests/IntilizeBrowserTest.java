package com.maxhire.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IntilizeBrowserTest {
	
	public WebDriver driver;
	
	public void intilizeBrowser() throws IOException 
	{
		Properties prop=new Properties();
		FileInputStream file=new FileInputStream("");
		prop.load(file);
		String browserName=prop.getProperty("browser");
		
if(browserName.equals("Chrome"))
{
	System.setProperty("WebDriver.Chrome.driver", "C:\\Suppi\\chromedriver.exe");
	 new ChromeDriver();
	
}
		
else if(browserName.equals("Firefox"))	
{
	System.setProperty("WebDriver.gecko.driver", "C:\\Suppi\\geckodriver.exe");
	 	
	new FirefoxDriver();
	}

else if(browserName.equals("IE"))	
{
	System.setProperty("WebDriver.ie.driver", "C:\\Suppi\\MicrosoftWebDriver.exe");
	
	new InternetExplorerDriver();
		
}

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
}


