package com.maxhire.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserPage {
	
	@FindBy(xpath="//span[text()='Users']")
	private WebElement user_tab;
	
	@FindBy(xpath="//a[@class='nav-link dropdown-toggle']//em")
	private WebElement user_profileName;
	
	@FindBy(xpath="//ul[contains(@class,'dropdown-menu dropdown')]//li//a")
	private WebElement user_profileName_dropDown_list;
	
	@FindBy(xpath="//a[text()='Add User']")
	private WebElement user_addUser_button;
	
	@FindBy(xpath="//input[@placeholder='First Name']//preceding::option")
	private WebElement user_firstNameSalutation_list;
	
	@FindBy(xpath="//input[@placeholder='First Name']")
	private WebElement user_firstName_textBox;
	
	@FindBy(xpath="//input[@placeholder='Email']")
	private WebElement user_email_textBox;
	
	@FindBy(xpath="//input[@placeholder='Confirm email']")
	private WebElement user_confirmEmail_textBox;
	
	@FindBy(xpath="//div[@class='access_level']//option")
	private WebElement user_accessLevelDropdown_list;
	
	@FindBy(xpath="//button[text()=' Add User ']")
	private WebElement user_newAddUser_button;
	
	@FindBy(xpath="//span[contains(text(),'First name is')]")
	private WebElement user_firstName_errMsg;
	
	@FindBy(xpath="//span[contains(text(),'Last name is')]")
	private WebElement user_lastName_errMsg;
	
	@FindBy(xpath="//span[contains(text(),'Email is required.')]")
	private WebElement user_email_errMsg;
	
	@FindBy(xpath="//span[contains(text(),'Confirm email')]")
	private WebElement user_confirmEmail_errMsg;
	
	@FindBy(xpath="//p[contains(text(),' Please fill')]")
	private WebElement user_fillForm_errMsg;
	
 
	public UserPage() {
		
	}

}
