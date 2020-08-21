package com.maxhire.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditUserPage extends BasePage {
	@FindBy(xpath="//span[contains(text(),'ikya sol L')]")
	private WebElement edUser_editUserDetails_link;
	
	@FindBy(xpath="//input[@placeholder='First Name']")
	private WebElement edUser_firstName_input;
	
	@FindBy(xpath="//input[@placeholder='Middle Name']")
	private WebElement edUser_middleName_input;
	
	@FindBy(xpath="//input[@placeholder='Last Name']")
	private WebElement edUser_lastName_input;
	
	@FindBy(xpath="//div[@class='card-body']//div[1]//div[1]//div[1]//div[3]//*[local-name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
	private WebElement edUser_nameSave_icon;
	
	@FindBy(xpath="//div[@class='card-body']//div[1]//div[1]//div[1]//div[4]//*[local-name()='svg']")
	private WebElement edUser_nameCancel_icon;
	
	@FindBy(xpath="//input[@placeholder='Username']")
	private WebElement edUser_userName_input;
	
	@FindBy(xpath="//div[@class='ps ps--active-y']//div[2]//div[1]//div[1]//div[3]//*[local-name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
	private WebElement edUser_userNameSave_icon;
	
	@FindBy(xpath="//div[@class='ps ps--active-y']//div[2]//div[1]//div[1]//div[4]//*[local-name()='svg']")
	private WebElement edUser_userNameCancel_icon;
	
	@FindBy(xpath="//input[@placeholder='Email Address']")
	private WebElement edUser_email_input;
	
	@FindBy(xpath="//input[@placeholder='Confirm Email Address']")
	private WebElement edUser_confirmEmail_input;
	
	@FindBy(xpath="//div[3]//div[1]//div[1]//div[3]//*[local-name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
	private WebElement edUser_emailSave_icon;
	
	@FindBy(xpath="//div[3]//div[1]//div[1]//div[4]//*[local-name()='svg']")
	private WebElement edUser_emailCancel_icon;
	
	@FindBy(xpath="//input[@placeholder='Phone number']")
	private WebElement edUser_phoneNumber_input;
	
	@FindBy(xpath="//input[@placeholder='Confirm Phone number']")
	private WebElement edUser_confirmPhoneNumber_input;
	
	@FindBy(xpath="//textarea[@placeholder='Full Address']")
	private WebElement edUser_address_input;
	
	@FindBy(xpath="//input[@placeholder='City']")
	private WebElement edUser_city_input;
	
	@FindBy(xpath="//input[@placeholder='Zip Code']")
	private WebElement edUser_zipCode_input;
	
	@FindBy(xpath="//input[@placeholder='State']")
	private WebElement edUser_state_input;
	
	@FindBy(xpath="//input[@placeholder='Type Country']")
	private WebElement edUser_country_input;
	
	
	
	
	

	public EditUserPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	}



