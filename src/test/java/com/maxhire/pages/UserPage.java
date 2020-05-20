package com.maxhire.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserPage extends BasePage {

	@FindBy(xpath = "//span[text()='Users']")
	private WebElement user_tab;

	@FindBy(xpath = "//a[@class='nav-link dropdown-toggle']//em")
	private WebElement user_profileName;

	@FindBy(xpath = "//ul[contains(@class,'dropdown-menu dropdown')]//li//a")
	private List<WebElement> user_profileName_dropDown_list;

	@FindBy(xpath = "//a[text()='Add User']")
	private WebElement user_addUser_button;

	@FindBy(xpath = "//input[@placeholder='First Name']//preceding::option")
	private List<WebElement> user_firstNameSalutation_list;

	@FindBy(xpath = "//input[@placeholder='First Name']")
	private WebElement user_firstName_textBox;

	@FindBy(xpath = "//input[@placeholder='Email']")
	private WebElement user_email_textBox;

	@FindBy(xpath = "//input[@placeholder='Confirm email']")
	private WebElement user_confirmEmail_textBox;

	@FindBy(xpath = "//div[@class='access_level']//option")
	private List<WebElement> user_accessLevelDropdown_list;

	@FindBy(xpath = "//button[text()=' Add User ']")
	private WebElement user_newAddUser_button;

	@FindBy(xpath = "//span[contains(text(),'First name is')]")
	private WebElement user_firstName_errMsg;

	@FindBy(xpath = "//span[contains(text(),'Last name is')]")
	private WebElement user_lastName_errMsg;

	@FindBy(xpath = "//span[contains(text(),'Email is required.')]")
	private WebElement user_email_errMsg;

	@FindBy(xpath = "//span[contains(text(),'Confirm email')]")
	private WebElement user_confirmEmail_errMsg;

	@FindBy(xpath = "//p[contains(text(),' Please fill')]")
	private WebElement user_fillForm_errMsg;

	public UserPage(WebDriver driver) {
		super(driver);
	}

	public WebElement getUser_tab() {
		return user_tab;
	}

	public WebElement getUser_profileName() {
		return user_profileName;
	}

	public List<WebElement> getUser_profileName_dropDown_list() {
		return user_profileName_dropDown_list;
	}

	public WebElement getUser_addUser_button() {
		return user_addUser_button;
	}

	public List<WebElement> getuser_firstNameSalutation_list() {
		return user_firstNameSalutation_list;
	}

	public WebElement getUser_firstName_textBox() {
		return user_firstName_textBox;
	}

	public WebElement getUser_email_textBox() {
		return user_email_textBox;
	}

	public WebElement getuser_confirmEmail_textBox() {
		return user_confirmEmail_textBox;
	}

	public List<WebElement> getUser_accessLevelDropdown_list() {
		return user_accessLevelDropdown_list;
	}

	public WebElement getUser_newAddUser_button() {
		return user_newAddUser_button;
	}

	public WebElement getUser_firstName_errMsg() {
		return user_firstName_errMsg;
	}

	public WebElement getUser_lastName_errMsg() {
		return user_lastName_errMsg;
	}

	public WebElement getuser_email_errMsg() {
		return user_email_errMsg;
	}

	public WebElement getUser_confirmEmail_errMsg() {
		return user_confirmEmail_errMsg;
	}

	public WebElement getUser_fillForm_errMsg() {
		return user_fillForm_errMsg;
	}
	
	public void clickElementFromList(List<WebElement> listElement, String sName) {
		for(WebElement wEle : listElement) {
			if(wEle.getText().trim().contains(sName))
				wEle.click();
		}
	}
	
	

}
