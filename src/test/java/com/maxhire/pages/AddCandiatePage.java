package com.maxhire.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
	
	public class AddCandiatePage extends BasePage {
		
		@FindBy(xpath="//input[@id='file']")
		WebElement can_chooseFile_Button;
		
		@FindBy(xpath="//div[contains(text(),'First Name')]//following-sibling::select")
		WebElement can_Title_dropDown;
		
		@FindBy(xpath="//input[@placeholder='First Name']")
		WebElement can_firstName_Input;
		
		@FindBy(xpath="//input[@placeholder='Middle Name']")
		WebElement can_middleName_Input;
		
		@FindBy(xpath="//input[@placeholder='Last Name']")
		WebElement can_lastName_Input;
		
		@FindBy(xpath="//input[@placeholder='URL: http://www.something.com']")
		WebElement can_Profile_Input;
		
		@FindBy(xpath="//div[contains(text(),'Owner')]//following-sibling::select")
		WebElement can_Owner_dropDown;
		
		@FindBy(xpath="//input[@placeholder='Select Birth Date']")
		WebElement can_dateOfBirth_calanderSelect;
		
		@FindBy(xpath="//input[@placeholder='Primary Email']")
		WebElement can_primaryEmail_Input;
		
		@FindBy(xpath="//input[@placeholder='Confirm Primary Email']")
		WebElement can_confirmPrimaryEmail_Input;
		
		@FindBy(xpath="//div[contains(text(),'Primary Phone')]//following-sibling::select")
		WebElement can_phoneType_dropDown;
		
		@FindBy(xpath="//input[@placeholder='Primary Phone']")
		WebElement can_primaryPhoneNo_Input;
		
		@FindBy(xpath="//input[@placeholder='Confirm Primary Phone']")
		WebElement can_confirmPrimaryNo_Input;
		
		@FindBy(xpath="//input[@placeholder='Alternate Email']")
		WebElement can_alternateEmail_Input;
		
		@FindBy(xpath="//div[contains(text(),'Alternate Phone')]//following-sibling::select")
		WebElement can_alternatePhoneType_dropDown;
		
		@FindBy(xpath="//input[@placeholder='Alternate Phone']")
		WebElement can_alternatePhoneNo_Input;
		
		@FindBy(xpath="//textarea[@placeholder='Full Address']")
		WebElement can_Address_Input;
		
		@FindBy(xpath="//input[@placeholder='City']")
		WebElement can_City_Input;
		
		@FindBy(xpath="//input[@placeholder='State']")
		WebElement can_State_Input;
		
		@FindBy(xpath="//input[@placeholder='Type Country']")
		WebElement can_Country_Input;
		
		@FindBy(xpath="//input[@placeholder='Zip Code']")
		WebElement can_zipCode_Input;
		
		@FindBy(xpath="//label[@class='custom-control-label']")
		WebElement can_relocate_Button;
		
		@FindBy(xpath="//input[@placeholder='Select Available Date']")
		WebElement can_bestTimeToCall_calanderSelect;
		
		@FindBy(xpath="//input[@placeholder='Time: Eg, 9am to 5pm']")
		WebElement can_Time_Input;
		
		@FindBy(xpath="//input[@placeholder='Time Zone']")
		WebElement can_timeZone_autoDropDown;
		
		@FindBy(xpath="//input[@placeholder='Current Employer']")
		WebElement can_currentEmployer_Input;
		
		@FindBy(xpath="//input[@placeholder='Select Joining Date']")
		WebElement can_joiningDate_calanderSelect;
		
		@FindBy(xpath="//input[@placeholder='Type Currency']")
		WebElement can_Currency_autoDropDown;
		
		@FindBy(xpath="//input[@placeholder='Current Package']")
		WebElement can_currentPackage_Input;
		
		@FindBy(xpath="//input[@placeholder='Expected Package']")
		WebElement can_expectedPackage_Input;
		
		@FindBy(xpath="//input[@placeholder='Notice Period']")
		WebElement can_noticePeriod_Input;
		
		@FindBy(xpath="//div[contains(text(),'Ratings')]//following-sibling::select")
		WebElement can_Ratings_dropDown;
		
		@FindBy(xpath="//div[contains(text(),'Source')]//following-sibling::select")
		WebElement can_Source_dropDown;
		
		@FindBy(xpath="//div[contains(text(),'Sourced by')]//following-sibling::select")
		WebElement can_sourcedBy_dropDown;
		
		@FindBy(xpath="//div[@class='multiselect__tags']")
		WebElement can_jobType_dropDown;
		
		@FindBy(xpath="//a[contains(text(),'Attach Multiple Documents')]")
		WebElement can_attachDocuments_button;
		
		@FindBy(xpath="//a[contains(text(),'Comments')]")
		WebElement can_Comments_Input;
		
		@FindBy(xpath="//button[@class='btn btn-primary btn-sm']")
		WebElement can_Submit_Input;
		
		public AddCandiatePage(WebDriver driver) {
			super(driver);		
		
		}

	}


