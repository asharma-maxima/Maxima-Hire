package com.maxhire.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditCandidatePage {
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@placeholder='Primary Email']")
	WebElement edCan_primaryEmail_Input;
	
	@FindBy(xpath="//div[@id='primary_phone']//select")
	WebElement edCan_mobileType_dropDown;
	
	@FindBy(xpath="//textarea[@placeholder='Full Address']")
	WebElement edCan_fullAddress_Input;
	
	@FindBy(xpath="////input[@placeholder='City']")
	WebElement edCan_City_Input;
	
	@FindBy(xpath="//input[@placeholder='Zip Code']")
	WebElement edCan_zipCode_Input;
	
	@FindBy(xpath="////input[@placeholder='State']")
	WebElement edCan_State_Input;
	
	@FindBy(xpath="//input[@placeholder='Type Country']")
	WebElement edCan_Country_Input;
	
	@FindBy(xpath="//input[@placeholder='Alternate Email']")
	WebElement edCan_alternateEmail_Input;
	
	@FindBy(xpath="//div[@id='secondary_phone']//select")
	WebElement edCan_phoneType_dropDown;
	
	@FindBy(xpath="////input[@placeholder='Alternate Phone']")
	WebElement edCan_alternatePhoneNo_Input;
	
	@FindBy(xpath="//input[@placeholder='Select Birth Date']")
	WebElement edCan_birthDate_calanderSelect;
	
	@FindBy(xpath="//div[@id='owner']//select")
	WebElement edCan_Owner_dropDown;
	
	@FindBy(xpath="//div[@id='source']//select")
	WebElement edCan_Source_dropDown;
	
	@FindBy(xpath="//input[@placeholder='Current Package']")
	WebElement edCan_currentPackage_Input;
	
	@FindBy(xpath="//div[@id='ratings']//select")
	WebElement edCan_Ratings_dropDown;
	
	@FindBy(xpath="//input[@placeholder='Select Available Date']")
	WebElement edCan_availableDate_calanderSelect;
	
	@FindBy(xpath="//input[@placeholder='Time: Eg, 9am to 5pm']")
	WebElement edCan_Time_Input;
	
	@FindBy(xpath="//input[@placeholder='Time Zone']")
	WebElement edCan_timeZone_autoDropDown;
	
	@FindBy(xpath="//textarea[@placeholder='Comments']")
	WebElement edCan_Comments_Input;
	
	@FindBy(xpath="//input[@placeholder='www.something.com']")
	WebElement edCan_profileUrl_Input;
	
	@FindBy(xpath="//div[@id='sourced_by']//select")
	WebElement edCan_sourcedBy_dropDown;
	
	@FindBy(xpath="//input[@placeholder='Expected Package']")
	WebElement edCan_expectedPackage_Input;
	
	@FindBy(xpath="//label[@class='custom-control-label']")
	WebElement edCan_Relocate_Select;
	
	@FindBy(xpath="//input[@placeholder='Select Joining Date']")
	WebElement edCan_joiningDate_calanderSelect;
	
	@FindBy(xpath="//span[contains(text(),'Add')]")
	WebElement edCan_addEditJob_Button;
	//add/edit cross check required/not
	
	@FindBy(xpath="//div[@class='multiselect__tags']")
	WebElement edCan_assignJob_dropdown;
	
	@FindBy(xpath="//button[contains(text(),'Save Jobs')]")
	WebElement edCan_saveJobs_Button;
	
	@FindBy(xpath="//input[@id='files']")
	WebElement edCan_chooseFiles_Button;
	
	@FindBy(xpath="//button[contains(text(),'Upload')]")
	WebElement edCan_Upload_Button;
	
	@FindBy(xpath="//tr[@class='attachment-row']//td[2]//*[local-name()='svg']")
	WebElement edCan_downloadIcon_Icon;
	
	@FindBy(xpath="//tr[@class='attachment-row']//td[3]//*[local-name()='svg']")
	WebElement edCan_cancelIcon_Icon;
	
	@FindBy(xpath="//button[@value='back']")
	WebElement edCan_Back_Button;
	
	public EditCandidatePage() {
		
		PageFactory.initElements(driver,EditCandidatePage.class);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
