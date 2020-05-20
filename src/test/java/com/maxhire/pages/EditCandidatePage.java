package com.maxhire.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditCandidatePage extends BasePage {
		
	@FindBy(xpath="//input[@placeholder='Primary Email']")
	private WebElement edCan_primaryEmail_input;
	
	@FindBy(xpath="//div[@id='primary_phone']//select")
	private WebElement edCan_mobileType_dropDown;
	
	@FindBy(xpath="//textarea[@placeholder='Full Address']")
	private WebElement edCan_fullAddress_input;
	
	@FindBy(xpath="////input[@placeholder='City']")
	private WebElement edCan_city_input;
	
	@FindBy(xpath="//input[@placeholder='Zip Code']")
	private WebElement edCan_zipCode_input;
	
	@FindBy(xpath="////input[@placeholder='State']")
	private WebElement edCan_state_input;
	
	@FindBy(xpath="//input[@placeholder='Type Country']")
	private WebElement edCan_country_input;
	
	@FindBy(xpath="//input[@placeholder='Alternate Email']")
	private WebElement edCan_alternateEmail_input;
	
	@FindBy(xpath="//div[@id='secondary_phone']//select")
	private WebElement edCan_phoneType_dropDown;
	
	@FindBy(xpath="////input[@placeholder='Alternate Phone']")
	private WebElement edCan_alternatePhoneNo_input;
	
	@FindBy(xpath="//input[@placeholder='Select Birth Date']")
	private WebElement edCan_birthDate_calanderSelect;
	
	@FindBy(xpath="//div[@id='owner']//select")
	private WebElement edCan_owner_dropDown;
	
	@FindBy(xpath="//div[@id='source']//select")
	private WebElement edCan_source_dropDown;
	
	@FindBy(xpath="//input[@placeholder='Current Package']")
	private WebElement edCan_currentPackage_input;
	
	@FindBy(xpath="//div[@id='ratings']//select")
	private WebElement edCan_ratings_dropDown;
	
	@FindBy(xpath="//input[@placeholder='Select Available Date']")
	private WebElement edCan_availableDate_calanderSelect;
	
	@FindBy(xpath="//input[@placeholder='Time: Eg, 9am to 5pm']")
	private WebElement edCan_time_input;
	
	@FindBy(xpath="//input[@placeholder='Time Zone']")
	private WebElement edCan_timeZone_autoDropDown;
	
	@FindBy(xpath="//textarea[@placeholder='Comments']")
	private WebElement edCan_comments_input;
	
	@FindBy(xpath="//input[@placeholder='www.something.com']")
	private WebElement edCan_profileUrl_input;
	
	@FindBy(xpath="//div[@id='sourced_by']//select")
	private WebElement edCan_sourcedBy_dropDown;
	
	@FindBy(xpath="//input[@placeholder='Expected Package']")
	private WebElement edCan_expectedPackage_input;
	
	@FindBy(xpath="//label[@class='custom-control-label']")
	private WebElement edCan_reLocate_select;
	
	@FindBy(xpath="//input[@placeholder='Select Joining Date']")
	private WebElement edCan_joiningDate_calanderSelect;
	
	@FindBy(xpath="//span[contains(text(),'Add')]")
	private WebElement edCan_addEditJob_button;
	//add/edit cross check required/not
	
	@FindBy(xpath="//div[@class='multiselect__tags']")
	private WebElement edCan_assignJob_dropdown;
	
	@FindBy(xpath="//button[contains(text(),'Save Jobs')]")
	private WebElement edCan_saveJobs_button;
	
	@FindBy(xpath="//input[@id='files']")
	private WebElement edCan_chooseFiles_button;
	
	@FindBy(xpath="//button[contains(text(),'Upload')]")
	private WebElement edCan_Upload_button;
	
	@FindBy(xpath="//tr[@class='attachment-row']//td[2]//*[local-name()='svg']")
	private WebElement edCan_downloadIcon_icon;
	
	@FindBy(xpath="//tr[@class='attachment-row']//td[3]//*[local-name()='svg']")
	private WebElement edCan_cancelIcon_icon;
	
	@FindBy(xpath="//button[@value='back']")
	private WebElement edCan_back_button;
	
	public EditCandidatePage(WebDriver driver) {
		super(driver);
	}
	
}
