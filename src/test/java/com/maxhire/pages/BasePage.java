package com.maxhire.pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	protected WebDriver driver;
	private WebDriverWait wait;

	private static final int TIMEOUT = 5;
	private static final int POLLING = 100;

	@FindBy(xpath = "//button[@class='btn dropdown-toggle btn-secondary btn-sm']")
	WebElement bas_add_button;

	@FindBy(xpath = "//a[contains(text(),'Job')]")
	WebElement bas_addJob_icon;

	@FindBy(xpath = "//a[contains(text(),'Candidate')]")
	WebElement bas_addCandidate_icon;

	@FindBy(xpath = "//div[@class='save activate']//a[@aria-label='Save']")
	WebElement bas_saveChanges_icon;

	@FindBy(xpath = "//div[@class='save activate']//a[@aria-label='Cancel']")
	WebElement bas_cancelChanges_icon;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, TIMEOUT, POLLING);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, TIMEOUT), this);
	}

	protected void waitForElementToAppear(WebElement element) {
		// wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	protected void waitForElementToDisappear(WebElement element) {
		// wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
		wait.until(ExpectedConditions.invisibilityOf(element));
	}

	protected void waitForTextToDisappear(WebElement element, String text) {
		// wait.until(ExpectedConditions.not(ExpectedConditions.textToBe(locator,
		// text)));
		wait.until(ExpectedConditions.not(ExpectedConditions.textToBePresentInElement(element, text)));
	}
	
	protected void takeScreenshot(String testCaseName, String fileName) {
		File srcFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File("./screenshots/"+testCaseName+"/"+fileName+".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	protected void clickUsingJavascript(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;	
		js.executeScript("arguments[0].click();", element);
	}
	
	protected void scrollUp() {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,250)");
	}
	
	protected void scrollDown() {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,-250)");
	}
	
	protected void scrollIntoView(WebElement element) {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView();", element);
	}

}
