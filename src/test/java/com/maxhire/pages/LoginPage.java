package com.maxhire.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	@FindBy(xpath = "//input[@placeholder='Email address']")
	private WebElement mail_add;

	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement password;

	@FindBy(xpath = "//button[@class='signin btn btn-primary']")
	private WebElement login_btn;
	
	@FindBy(xpath = "//div[@class='text-logo-md']")
	private WebElement title_text;

	public WebElement getMail_add() {
		return mail_add;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin_btn() {
		return login_btn;
	}

	public WebElement getTitle_text() {
		return title_text;
	}

	public LoginPage(WebDriver driver) {
		super(driver);

	}
	
	public void login(String username, String password){
		waitForElementToAppear(mail_add);
		boolean isPresent = getMail_add().isDisplayed();
		System.out.println("email address field is present "+isPresent);
		getMail_add().sendKeys(username);
		getPassword().sendKeys(password);
		getLogin_btn().click();
		System.out.println("Login Done");
	}
	
	public void verifyLoginPageTitle(String expectedTitle) {
		waitForElementToAppear(title_text);
		verifyTitle(title_text, expectedTitle);
	}

//	public static void main(String[] args) {

}
