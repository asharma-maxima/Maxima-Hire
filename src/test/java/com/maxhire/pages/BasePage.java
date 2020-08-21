package com.maxhire.pages;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
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

	private static final int TIMEOUT = 30;
	private static final int POLLING = 100;

	@FindBy(xpath = "//button[@class='btn dropdown-toggle btn-secondary btn-sm']")
	WebElement bas_add_button;

	@FindBy(xpath = "//a[contains(text(),'Job')]")
	WebElement bas_addJob_icon;

	@FindBy(xpath = "//a[contains(text(),'Candidate')]")
	WebElement bas_addCandidate_icon;
	
	@FindBy(xpath="//span[contains(text(),'Job')]")
	WebElement bas_jobDetailsPage_link;
	
	@FindBy(xpath="//span[contains(text(),'Candidate')]")
	WebElement bas_candidateDetailsPage_link;
	
	@FindBy(xpath="//ul[@class='dropdown-menu show']//a[@class='dropdown-item'][contains(text(),'User')]")
	WebElement bas_addUser_icon;
	
	@FindBy(xpath="//span[text()='Users']")
	private WebElement bas_userDetailspage_link;
	
	@FindBy(xpath="//a[contains(text),'Comments']")
	private WebElement bas_commentsTab_tab;
	
	@FindBy(xpath="//div[@placeholder='Enter text...']")
	private WebElement bas_enterText_input;
	
	@FindBy(xpath="//input[@placeholder='Add participants']")
	private WebElement bas_addParticipants_dropDown;
	
	@FindBy(xpath="//button[@class='btn btn-primary btn-sm post_button']")
	private WebElement bas_postComments_button;
	
	
	
	
	
	
	
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
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File("./screenshots/" + testCaseName + "/" + fileName + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	protected void clickUsingJavascript(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
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
	
	protected void verifyTitle(WebElement element, String expectedTitle) {
		String actualText = element.getText();
		System.out.println("Actual Text: "+actualText);
		System.out.println("Expected Title: "+expectedTitle);
		assertEquals(actualText, expectedTitle);
	
	}
	
	protected WebElement getElementByXpath(String xpath) {
		WebElement element;
		
		element= driver.findElement(By.xpath(xpath));
		return element;
	}
	
	protected void selectDate(String field, String date) throws Exception {
		String[] dateArray = date.split("-");
		System.out.println("date array- "+Arrays.toString(dateArray));
		
		//click on date field
		Thread.sleep(2000);
		getElementByXpath("//div[text()='"+field+"']/following-sibling::div/input").click();
		
		//click on year for opening year's list
		//Thread.sleep(2000);
		getElementByXpath("//div/div[@class='vdatetime-popup__year']").click();
		
		//click on required year
		//Thread.sleep(2000);
		WebElement year = getElementByXpath("//div[@class='vdatetime-year-picker']/div/div[normalize-space()='"+dateArray[2]+"']");
		scrollIntoView(year);
		year.click();
		
		//click on ok button
		//Thread.sleep(2000);
		getElementByXpath("//div[@class='vdatetime-popup__actions']/div[text()='Ok']").click();
		
		//click on month for opening month's list
		//Thread.sleep(2000);
		getElementByXpath("//div/div[@class='vdatetime-popup__date']").click();
		
		//click on required month
		//Thread.sleep(2000);
		WebElement month = getElementByXpath("//div[@class='vdatetime-month-picker']/div/div[normalize-space()='"+dateArray[1]+"']");
		scrollIntoView(month);
		month.click();
		
		//click on ok button
		//Thread.sleep(2000);
		getElementByXpath("//div[@class='vdatetime-popup__actions']/div[text()='Ok']").click();
		
		//click on date
		//Thread.sleep(2000);
		getElementByXpath("//div[@class='vdatetime-calendar__month']/div//span[text()='"+dateArray[0]+"']").click();
		
		//click on ok button
		//Thread.sleep(2000);
		getElementByXpath("//div[@class='vdatetime-popup__actions']/div[text()='Ok']").click();
		

	}
}
	
