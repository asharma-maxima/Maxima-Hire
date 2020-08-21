package com.maxhire.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class UserPage extends BasePage {

	
	@FindBy(xpath="//select[@class='custom-select custom-select-sm']")
	private WebElement user_nameTitle_dropDown;
	
	@FindBy(xpath="//input[@placeholder='First Name']")
	private WebElement user_firstName_input;
	
	@FindBy(xpath="//input[@placeholder='Middle Name']")
	private WebElement user_middleName_input;
	
	@FindBy(xpath="//input[@placeholder='Last Name']")
	private WebElement user_lastName_input;
	
	@FindBy(xpath="//input[@placeholder='Email']")
	private WebElement user_email_input;
	
	@FindBy(xpath="//input[@placeholder='Confirm email']")
	private WebElement user_confirmEmail_input;
	
	@FindBy(xpath="//input[@placeholder='Phone number']")
	private WebElement user_phoneNumber_input;
	
	@FindBy(xpath="//textarea[@placeholder='Full Address']")
	private WebElement user_address_input;
	
	@FindBy(xpath="//input[@placeholder='City']")
	private WebElement user_city_input;
	
	@FindBy(xpath="//input[@placeholder='Zip Code']")
	private WebElement user_zipCode_input;
	
	@FindBy(xpath="//input[@placeholder='State']")
	private WebElement user_state_input;
	
	@FindBy(xpath="//input[@placeholder='Type Country']")
	private WebElement user_country_input;
	
	@FindBy(xpath="//a[contains(text(),'Branch & Department')]")
	private WebElement user_branchDepartment_button;
	
	@FindBy(xpath="//input[@placeholder='Branch']")
	private WebElement user_branch_input;
	
	@FindBy(xpath="//input[@placeholder='Department']")
	private WebElement user_department_input;
	
	@FindBy(xpath="//a[contains(text(),'Welcome Email')]")
	private WebElement user_welcomeEmail_button;
	
	@FindBy(xpath="//label[@class='custom-control-label']")
	private WebElement user_sendWelcomeEmail_checkBox;
	
	@FindBy(xpath="//button[@class='btn btn-primary btn-sm']")
	private WebElement user_addUser_button;
	
	@FindBy(xpath="//div[contains(text(),'Phone')]//following-sibling::select")
	private WebElement user_phoneType_dropDown;
	
	@FindBy(xpath="//div[@class='access_level']//select")
	private WebElement user_accessLevel_dropDown;
	
	
	
	
	
	
	
	
	
 
	public WebElement getUser_nameTitle_dropDown() {
		return user_nameTitle_dropDown;
	}

	public WebElement getUser_accessLevel_dropDown() {
		return user_accessLevel_dropDown;
	}

	public WebElement getUser_phoneType_dropDown() {
		return user_phoneType_dropDown;
	}

	public WebElement getUser_firstName_input() {
		return user_firstName_input;
	}

	public WebElement getUser_middleName_input() {
		return user_middleName_input;
	}

	public WebElement getUser_lastName_input() {
		return user_lastName_input;
	}

	public WebElement getUser_email_input() {
		return user_email_input;
	}

	public WebElement getUser_confirmEmail_input() {
		return user_confirmEmail_input;
	}

	public WebElement getUser_phoneNumber_input() {
		return user_phoneNumber_input;
	}

	public WebElement getUser_address_input() {
		return user_address_input;
	}

	public WebElement getUser_city_input() {
		return user_city_input;
	}

	public WebElement getUser_zipCode_input() {
		return user_zipCode_input;
	}

	public WebElement getUser_state_input() {
		return user_state_input;
	}

	public WebElement getUser_country_input() {
		return user_country_input;
	}

	public WebElement getUser_branchDepartment_button() {
		return user_branchDepartment_button;
	}

	public WebElement getUser_branch_input() {
		return user_branch_input;
	}

	public WebElement getUser_department_input() {
		return user_department_input;
	}

	public WebElement getUser_welcomeEmail_button() {
		return user_welcomeEmail_button;
	}

	public WebElement getUser_sendWelcomeEmail_checkBox() {
		return user_sendWelcomeEmail_checkBox;
	}

	public WebElement getUser_addUser_button() {
		return user_addUser_button;
	}

	public void addUser() throws InterruptedException
	{
		bas_add_button.click();
		bas_addUser_icon.click();
		Thread.sleep(3000);
	}
	public void enterName(String nameTitle,String firstName,String middleName,String lastName)
	{
		getUser_nameTitle_dropDown().click();
		 Select title=new Select(getUser_nameTitle_dropDown());
			title.selectByVisibleText(nameTitle);
			getUser_firstName_input().sendKeys(firstName);
			getUser_middleName_input().sendKeys(middleName);
			getUser_lastName_input().sendKeys(lastName);
			
	}
	public void enterEmail(String email,String confirmEmail)
	{
		getUser_email_input().sendKeys(email);
		getUser_confirmEmail_input().sendKeys(confirmEmail);		
	}
	
	public void phoneNumber(String phnType,String phoneNo)
	{
		getUser_phoneType_dropDown().click();
		Select type=new Select(getUser_phoneType_dropDown());
		type.selectByVisibleText(phnType);
		 getUser_phoneNumber_input().sendKeys(phoneNo);
	}
	public void address(String address,String city,String zipCode,String state,String country)
	{
		getUser_address_input().sendKeys(address);
		getUser_city_input().sendKeys(city);
		getUser_zipCode_input().sendKeys(zipCode);
		 getUser_state_input().sendKeys(state);
		getUser_country_input().sendKeys(country);

	}
	
	public void accessLevel(String accessType) throws InterruptedException
	{
		getUser_accessLevel_dropDown().click();
		Select level=new Select(getUser_accessLevel_dropDown());
		level.selectByVisibleText(accessType);
		Thread.sleep(3000);

	}
	
	public void branchDept(String branch,String department)
	{
		getUser_branchDepartment_button().click();
		getUser_branch_input().sendKeys(branch);
		getUser_department_input().sendKeys(department);

	}
	
	public void welcomeEmail()
	{
		getUser_welcomeEmail_button().click();
		getUser_sendWelcomeEmail_checkBox().click();
	}
	
	public void submitUser()
	{
		getUser_addUser_button().click();
	}
	public UserPage(WebDriver driver) {
		super(driver);
	}

	
}
