package com.maxhire.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class EditCandidatePage extends BasePage {

	@FindBy(xpath="//input[@placeholder='First Name']")
	private WebElement edCan_firstName_input;
	
	@FindBy(xpath="//input[@placeholder='Middle Name']")
	private WebElement edCan_middleName_input;
	
	@FindBy(xpath="//input[@placeholder='Last Name']")
	private WebElement edCan_lastName_input;
	
	@FindBy(xpath="//input[@placeholder='Primary Email']")
	private WebElement edCan_primaryEmail_input;
	
	@FindBy(xpath="//input[@placeholder='Confirm Primary Email']")
	private WebElement edCan_confirmEmail_input;
	
	@FindBy(xpath="//input[@placeholder='Primary Phone']")
	private WebElement edCan_phoneNO_input;
	
	@FindBy(xpath="//input[@placeholder='Confirm Primary Phone']")
	private WebElement edCan_confirmPhnNO_input;
	
	@FindBy(xpath="//input[@placeholder='Alternate Email']")
	private WebElement edCan_alternateEmail_input;
	
	@FindBy(xpath="//input[@placeholder='Alternate Phone']")
	private WebElement edCan_alternatePhoneNo_input;
	
	@FindBy(xpath="//textarea[@placeholder='Full Address']")
	WebElement edCan_fullAddress_input;
	
	@FindBy(xpath="//input[@placeholder='City']")
	WebElement edCan_city_input;
	
	@FindBy(xpath="//input[@placeholder='Zip Code']")
	WebElement edCan_zipCode_input;
	
	@FindBy(xpath="//input[@placeholder='State']")
	WebElement edCan_state_input;
	
	@FindBy(xpath="//input[@placeholder='Type Country']")
	WebElement edCan_country_input;
	
	@FindBy(xpath="//div[@class='custom-control custom-switch']")
	private WebElement edCan_relocate_toggleBtn;
	
	@FindBy(xpath="//input[@placeholder='URL: http://www.something.com']")
	private WebElement edCan_profileUrl_input;
	
	@FindBy(xpath="//input[@placeholder='Add Key Skills']")
	private WebElement edCan_keySkills_input;
	
	@FindBy(xpath="//input[@placeholder='Notice Period']")
	private WebElement edCan_noticeperiod_input;
	
	@FindBy(xpath="//input[@placeholder='Type Currency']")
	private WebElement edCan_currency_autoDropDown;
	
	@FindBy(xpath="//input[@placeholder='Current Package']")
	private WebElement edCan_Cpackage_input;
	
	@FindBy(xpath="//input[@placeholder='Expected Package']")
	private WebElement edCan_Epackage_input;
	
	@FindBy(xpath="//select[@class='width_50 custom-select custom-select-sm']")
	private WebElement edCan_common_dropDown;
	
	@FindBy(xpath="//span[contains(text(),'ramesh c')]")
	private WebElement edCan_candidateEditDetails_link;
	
	@FindBy(xpath ="//div[@style='color: green;']")
	private WebElement edCan_saveChanges_icon;

	@FindBy(xpath = "//div[@style='color: red;']")
	private WebElement edCan_cancelChanges_icon;
	
	@FindBy(xpath="//div[@placeholder='Enter text...']")
	private WebElement edCan_comments_input;
	
	@FindBy(xpath="//input[@placeholder='Assign Job']")
	private WebElement edCan_addEditJobs_input;
	
	@FindBy(xpath="//input[@placeholder='Time Zone']")
	private WebElement edCan_timeZone_autoDropDown;
	
	@FindBy(xpath="//input[@placeholder='Time: Eg, 9am to 5pm']")
	private WebElement edCan_time_input;
	
	@FindBy(xpath="//input[@placeholder='Select Available Date']")
	private WebElement edCan_selectAvailableDate_calander;
	
	@FindBy(xpath="//input[@id='files']")
	private WebElement edCan_chooseDocuments_filePath;
	
	@FindBy(xpath="//div[@class='card-body']/div[14]//select[2]")
	private WebElement edCan_sourceBy_dropDown;
	
	//candidate job assignment
	
	@FindBy(xpath="//button[@class='btn btn-outline-success btn-sm rounded-pill']")
	private WebElement edCan_candidateStage_button;
	
	@FindBy(xpath="//div[@placeholder='Enter text...']")
	private WebElement edCan_enterText_input;
	
	@FindBy(xpath="//select[@class='custom-select custom-select-sm']")
	private WebElement edCan_selectStage_dropdown;
	
	@FindBy(xpath="//button[@class='btn btn-primary btn-sm']")
	private WebElement edCan_updateStage_button;
	
	
	//candidate history
	
	@FindBy(xpath="//select[@class='history_dropdown custom-select custom-select-sm']")
	private WebElement edCan_candidateHistory_drodown;
	
	//Edit candid fields
	
	@FindBy(xpath="//div[contains(text(),'Candidate Name:')]")
	private WebElement edCan_candidateName_fieldName;
	
	@FindBy(xpath="//div[contains(text(),'Primary Email:')]")
	private WebElement edCan_PrimaryEmail_fieldName;
	
	@FindBy(xpath="//div[contains(text(),'Primary Phone:')]")
	private WebElement edCan_primaryPhone_fieldName;
	
	@FindBy(xpath="//div[contains(text(),'Alternate Email:')]")
	private WebElement edCan_altEmail_fieldName;
	
	@FindBy(xpath="//div[contains(text(),'Alternate Phone:')]")
	private WebElement edCan_altPhone_fieldName;
	
	@FindBy(xpath="//div[contains(text(),'Date of Birth:')]")
	private WebElement edCan_dob_fieldName;
	
	@FindBy(xpath="//div[contains(text(),'Address:')]")
	private WebElement edCan_addressfieldName;
	
	@FindBy(xpath="//div[contains(text(),'Status:')]")
	private WebElement edCan_status_fieldName;
	
	@FindBy(xpath="//div[contains(text(),'Can Relocate:')]")
	private WebElement edCan_relocate_fieldName;
	
	@FindBy(xpath="//div[contains(text(),'Owner:')]")
	private WebElement edCan_owner_fieldName;
	
	@FindBy(xpath="//div[contains(text(),'Profile URL:')]")
	private WebElement edCan_profilrUrl_fieldName;
	
	@FindBy(xpath="//div[contains(text(),'Key Skills:')]")
	private WebElement edCan_skills_fieldName;
	
	@FindBy(xpath="//div[contains(text(),'Ratings:')]")
	private WebElement edCan_ratings_fieldName;
	
	@FindBy(xpath="//div[contains(text(),'Source & Sourced By:')]")
	private WebElement edCan_source_fieldName;
	
	@FindBy(xpath="//div[contains(text(),'Notice Period:')]")
	private WebElement edCan_noticePeriod_fieldName;
	
	@FindBy(xpath="//div[contains(text(),'Current Package:')]")
	private WebElement edCan_currentPackage_fieldName;
	
	@FindBy(xpath="//div[contains(text(),'Expected Package:')]")
	private WebElement edCan_expectedPackage_fieldName;
	
	@FindBy(xpath="//div[contains(text(),'Joining Date:')]")
	private WebElement edCan_joningDate_fieldName;
	
	@FindBy(xpath="//div[contains(text(),'Best Time To Call:')]")
	private WebElement edCan_timeTocall_fieldName;
	
	@FindBy(xpath="//div[contains(text(),'Comments:')]")
	private WebElement edCan_comments_fieldName;
	
	@FindBy(xpath="//div[@class='ps ps--active-y']/div[@class='card-body']/div[21]/div[1]/div[1]/div[1]")
	private WebElement edCan_addEditJobs_fieldName;
	
	@FindBy(xpath="//div[@class='ps ps--active-y']/div[@class='card-body']/div[22]/div[1]/div[1]/div[1]")
	private WebElement edCan_addEditDocuments_fieldName;
	
	
	@FindBy(xpath="//div[@class='card-body']/div[1]/div[1]/div[1]/div[2]")
	private WebElement edCan_nameEdit_icon;
	
	@FindBy(xpath="//div[@class='card-body']/div[2]/div[1]/div[1]/div[2]")
	private WebElement edCan_emailEdit_icon;
	
	@FindBy(xpath="//div[@class='card-body']/div[3]/div[1]/div[1]/div[2]")
	private WebElement edCan_phoneEdit_icon;
	
	@FindBy(xpath="//div[@class='card-body']/div[4]/div[1]/div[1]/div[2]")
	private WebElement edCan_altEmailEdit_icon;
	
	@FindBy(xpath="//div[@class='card-body']/div[5]/div[1]/div[1]/div[2]")
	private WebElement edCan_altPhoneEdit_icon;
	
	@FindBy(xpath="//div[@class='card-body']/div[6]/div[1]/div[1]/div[2]")
	private WebElement edCan_dobEdit_icon;
	
	@FindBy(xpath="//div[@class='card-body']/div[7]/div[1]/div[1]/div[2]")
	private WebElement edCan_addressEdit_icon;
	
	@FindBy(xpath="//div[@class='card-body']/div[8]/div[1]/div[1]/div[2]")
	private WebElement edCan_statusEdit_icon;
	
	@FindBy(xpath="//div[@class='card-body']/div[9]/div[1]/div[1]/div[2]")
	private WebElement edCan_relocateEdit_icon;
	
	@FindBy(xpath="//div[@class='card-body']/div[10]/div[1]/div[1]/div[2]")
	private WebElement edCan_ownerEdit_icon;
	
	@FindBy(xpath="//div[@class='card-body']/div[11]/div[1]/div[1]/div[2]")
	private WebElement edCan_profileEdit_icon;
	
	@FindBy(xpath="//div[@class='card-body']/div[12]/div[1]/div[1]/div[2]")
	private WebElement edCan_skillsEdit_icon;
	
	@FindBy(xpath="//div[@class='card-body']/div[13]/div[1]/div[1]/div[2]")
	private WebElement edCan_ratingEdit_icon;
	
	@FindBy(xpath="//div[@class='card-body']/div[14]/div[1]/div[1]/div[2]")
	private WebElement edCan_sourceEdit_icon;
	
	@FindBy(xpath="//div[@class='card-body']/div[15]/div[1]/div[1]/div[2]")
	private WebElement edCan_noticePeriodEdit_icon;
	
	@FindBy(xpath="//div[@class='card-body']/div[16]/div[1]/div[1]/div[2]")
	private WebElement edCan_currentpackageEdit_icon;
	
	@FindBy(xpath="//div[@class='card-body']/div[17]/div[1]/div[1]/div[2]")
	private WebElement edCan_expPackageEdit_icon;
	
	@FindBy(xpath="//div[@class='card-body']/div[18]/div[1]/div[1]/div[2]")
	private WebElement edCan_joiningDateEdit_icon;
	
	@FindBy(xpath="//div[@class='card-body']/div[19]/div[1]/div[1]/div[2]")
	private WebElement edCan_timeToCallEdit_icon;
	
	@FindBy(xpath="//div[@class='card-body']/div[20]/div[1]/div[1]/div[2]")
	private WebElement edCan_commentsEdit_icon;
	
	@FindBy(xpath="//div[@class='card-body']/div[21]/div[1]/div[1]/div[2]")
	private WebElement edCan_addEditEdit_icon;
	
	@FindBy(xpath="//div[@class='card-body']/div[22]/div[1]/div[1]/div[2]")
	private WebElement edCan_addEditDocEdit_icon;
	
	@FindBy(xpath="//div[@class='multiselect__tags']")
	private WebElement edCan_multiSelect_dropdown;
	
	@FindBy(xpath="//input[@placeholder='Add specialized skills']")
	private WebElement edCan_specializedSkills_input;
	
	
	@FindBy(xpath="//input[@placeholder='Select Birth Date']")
	private WebElement edCan_birthDate_date;
	
	@FindBy(xpath="//input[@placeholder='Select Joining Date']")
	private WebElement edCan_joiningDate_date;
	
	
	
	public WebElement getEdCan_candidateName_fieldName() {
		return edCan_candidateName_fieldName;
	}

	public WebElement getEdCan_PrimaryEmail_fieldName() {
		return edCan_PrimaryEmail_fieldName;
	}

	public WebElement getEdCan_primaryPhone_fieldName() {
		return edCan_primaryPhone_fieldName;
	}

	public WebElement getEdCan_altEmail_fieldName() {
		return edCan_altEmail_fieldName;
	}

	public WebElement getEdCan_altPhone_fieldName() {
		return edCan_altPhone_fieldName;
	}

	public WebElement getEdCan_dob_fieldName() {
		return edCan_dob_fieldName;
	}

	public WebElement getEdCan_addressfieldName() {
		return edCan_addressfieldName;
	}

	public WebElement getEdCan_status_fieldName() {
		return edCan_status_fieldName;
	}

	public WebElement getEdCan_relocate_fieldName() {
		return edCan_relocate_fieldName;
	}

	public WebElement getEdCan_owner_fieldName() {
		return edCan_owner_fieldName;
	}

	public WebElement getEdCan_profilrUrl_fieldName() {
		return edCan_profilrUrl_fieldName;
	}

	public WebElement getEdCan_skills_fieldName() {
		return edCan_skills_fieldName;
	}

	public WebElement getEdCan_ratings_fieldName() {
		return edCan_ratings_fieldName;
	}

	public WebElement getEdCan_source_fieldName() {
		return edCan_source_fieldName;
	}

	public WebElement getEdCan_noticePeriod_fieldName() {
		return edCan_noticePeriod_fieldName;
	}

	public WebElement getEdCan_currentPackage_fieldName() {
		return edCan_currentPackage_fieldName;
	}

	public WebElement getEdCan_expectedPackage_fieldName() {
		return edCan_expectedPackage_fieldName;
	}

	public WebElement getEdCan_joningDate_fieldName() {
		return edCan_joningDate_fieldName;
	}

	public WebElement getEdCan_timeTocall_fieldName() {
		return edCan_timeTocall_fieldName;
	}

	public WebElement getEdCan_comments_fieldName() {
		return edCan_comments_fieldName;
	}

	public WebElement getEdCan_addEditJobs_fieldName() {
		return edCan_addEditJobs_fieldName;
	}

	public WebElement getEdCan_addEditDocuments_fieldName() {
		return edCan_addEditDocuments_fieldName;
	}

	public WebElement getEdCan_nameEdit_icon() {
		return edCan_nameEdit_icon;
	}

	public WebElement getEdCan_emailEdit_icon() {
		return edCan_emailEdit_icon;
	}

	public WebElement getEdCan_phoneEdit_icon() {
		return edCan_phoneEdit_icon;
	}

	public WebElement getEdCan_altEmailEdit_icon() {
		return edCan_altEmailEdit_icon;
	}

	public WebElement getEdCan_altPhoneEdit_icon() {
		return edCan_altPhoneEdit_icon;
	}

	public WebElement getEdCan_dobEdit_icon() {
		return edCan_dobEdit_icon;
	}

	public WebElement getEdCan_addressEdit_icon() {
		return edCan_addressEdit_icon;
	}

	public WebElement getEdCan_statusEdit_icon() {
		return edCan_statusEdit_icon;
	}

	public WebElement getEdCan_relocateEdit_icon() {
		return edCan_relocateEdit_icon;
	}

	public WebElement getEdCan_ownerEdit_icon() {
		return edCan_ownerEdit_icon;
	}

	public WebElement getEdCan_profileEdit_icon() {
		return edCan_profileEdit_icon;
	}

	public WebElement getEdCan_skillsEdit_icon() {
		return edCan_skillsEdit_icon;
	}

	public WebElement getEdCan_ratingEdit_icon() {
		return edCan_ratingEdit_icon;
	}

	public WebElement getEdCan_sourceEdit_icon() {
		return edCan_sourceEdit_icon;
	}

	public WebElement getEdCan_noticePeriodEdit_icon() {
		return edCan_noticePeriodEdit_icon;
	}

	public WebElement getEdCan_currentpackageEdit_icon() {
		return edCan_currentpackageEdit_icon;
	}

	public WebElement getEdCan_expPackageEdit_icon() {
		return edCan_expPackageEdit_icon;
	}

	public WebElement getEdCan_joiningDateEdit_icon() {
		return edCan_joiningDateEdit_icon;
	}

	public WebElement getEdCan_timeToCallEdit_icon() {
		return edCan_timeToCallEdit_icon;
	}

	public WebElement getEdCan_commentsEdit_icon() {
		return edCan_commentsEdit_icon;
	}

	public WebElement getEdCan_addEditEdit_icon() {
		return edCan_addEditEdit_icon;
	}

	public WebElement getEdCan_addEditDocEdit_icon() {
		return edCan_addEditDocEdit_icon;
	}

	public WebElement getEdCan_candidateHistory_drodown() {
		return edCan_candidateHistory_drodown;
	}

	public WebElement getEdCan_candidateStage_button() {
		return edCan_candidateStage_button;
	}

	
	public WebElement getEdCan_enterText_input() {
		return edCan_enterText_input;
	}

	
	public WebElement getEdCan_selectStage_dropdown() {
		return edCan_selectStage_dropdown;
	}

	
	public WebElement getEdCan_updateStage_button() {
		return edCan_updateStage_button;
	}

	
	public WebElement getEdCan_addEditJobs_input() {
		return edCan_addEditJobs_input;
	}

	public WebElement getEdCan_comments_input() {
		return edCan_comments_input;
	}

	
	public WebElement getedCan_firstName_input() {
		return edCan_firstName_input;
	}
	
	public WebElement getedCan_middleName_input() {
		return edCan_middleName_input;
	}

	public WebElement getedCan_lastName_input() {
		return edCan_lastName_input;
	}

	public WebElement getedCan_primaryEmail_input() {
		return edCan_primaryEmail_input;
	}

	public WebElement getedCan_confirmEmail_input() {
		return edCan_confirmEmail_input;
	}

	public WebElement getedCan_phoneNO_input() {
		return edCan_phoneNO_input;
	}

	public WebElement getedCan_confirmPhnNO_input() {
		return edCan_confirmPhnNO_input;
	}

	public WebElement getedCan_alternateEmail_input() {
		return edCan_alternateEmail_input;
	}

	public WebElement getedCan_alternatePhoneNo_input() {
		return edCan_alternatePhoneNo_input;
	}

	public WebElement getedCan_fullAddress_input() {
		return edCan_fullAddress_input;
	}

	public WebElement getedCan_city_input() {
		return edCan_city_input;
	}

	public WebElement getedCan_zipCode_input() {
		return edCan_zipCode_input;
	}

	public WebElement getedCan_state_input() {
		return edCan_state_input;
	}

	public WebElement getedCan_country_input() {
		return edCan_country_input;
	}

	public WebElement getedCan_relocate_toggleBtn() {
		return edCan_relocate_toggleBtn;
	}

	public WebElement getedCan_profileUrl_input() {
		return edCan_profileUrl_input;
	}

	public WebElement getedCan_keySkills_input() {
		return edCan_keySkills_input;
	}

	public WebElement getedCan_noticeperiod_input() {
		return edCan_noticeperiod_input;
	}

	public WebElement getedCan_currency_autoDropDown() {
		return edCan_currency_autoDropDown;
	}

	public WebElement getedCan_Cpackage_input() {
		return edCan_Cpackage_input;
	}

	public WebElement getedCan_Epackage_input() {
		return edCan_Epackage_input;
	}
	
	public WebElement getedCan_common_dropDown() {
		return edCan_common_dropDown;
	}

	public WebElement getEdCan_candidateEditDetails_link() {
		return edCan_candidateEditDetails_link;
	}
	
	public WebElement getEdCan_saveChanges_icon() {
		return edCan_saveChanges_icon;
	}

	public WebElement getEdCan_cancelChanges_icon() {
		return edCan_cancelChanges_icon;
	}
	
	public WebElement getEdCan_timeZone_autoDropDown() {
		return edCan_timeZone_autoDropDown;
	}

	public WebElement getEdCan_time_input() {
		return edCan_time_input;
	}

	public WebElement getEdCan_selectAvailableDate_calander() {
		return edCan_selectAvailableDate_calander;
	}
	

	public WebElement getEdCan_chooseDocuments_filePath() {
		return edCan_chooseDocuments_filePath;
	}
	
	
	public WebElement getEdCan_sourceBy_dropDown() {
		return edCan_sourceBy_dropDown;
	}

	public WebElement getEdCan_multiSelect_dropdown() {
		return edCan_multiSelect_dropdown;
	}

	
	public WebElement getEdCan_specializedSkills_input() {
		return edCan_specializedSkills_input;
	}

	
	public WebElement getEdCan_birthDate_date() {
		return edCan_birthDate_date;
	}

	public WebElement getEdCan_joiningDate_date() {
		return edCan_joiningDate_date;
	}

		public EditCandidatePage(WebDriver driver) {
		super(driver);
	}
	
	public void candidateDetails()
	{
		bas_candidateDetailsPage_link.click();

	}
	
	public void editCandidate()
	{
		getEdCan_candidateEditDetails_link().click();
	}
	public void candidateName(String firstname,String middlename,String lastname,String type) throws InterruptedException
	{
		Actions action=new Actions(driver);
		WebElement name=getEdCan_candidateName_fieldName();
		action.moveToElement(name).build().perform();
		WebElement editIcon=getEdCan_nameEdit_icon();
		action.moveToElement(editIcon).click().build().perform();
		getedCan_common_dropDown().click();
		Select title= new Select(getedCan_common_dropDown());
		title.selectByVisibleText(type);
		getedCan_firstName_input().clear();
		getedCan_firstName_input().sendKeys(firstname);
		getedCan_middleName_input().clear();
		getedCan_middleName_input().sendKeys(middlename);
		getedCan_lastName_input().clear();
		getedCan_lastName_input().sendKeys(lastname);
		getEdCan_saveChanges_icon().click();
		getEdCan_cancelChanges_icon().click();
	}
	
	public void emailDetails(String pemail,String cemail ) throws InterruptedException
	{
		Actions action=new Actions(driver);
		WebElement email=getEdCan_PrimaryEmail_fieldName();
		action.moveToElement(email).build().perform();
		WebElement editIcon=getEdCan_emailEdit_icon();
		action.moveToElement(editIcon).click().build().perform();	
		getedCan_primaryEmail_input().clear();
		getedCan_primaryEmail_input().sendKeys(pemail);
		getedCan_confirmEmail_input().clear();
		getedCan_confirmEmail_input().sendKeys(cemail);
		Thread.sleep(3000);
		getEdCan_saveChanges_icon().click();
		//getEdCan_cancelChanges_icon().click();
		
	}
	
	
	public void phoneDetails(String phntype,String phoneno,String cnfmphnno) throws InterruptedException
	{
		Actions action=new Actions(driver);
		WebElement phone=getEdCan_primaryPhone_fieldName();
		action.moveToElement(phone).build().perform();
		WebElement editIcon=getEdCan_phoneEdit_icon();
		action.moveToElement(editIcon).click().build().perform();	
		getedCan_common_dropDown().click();
		Select phoneType= new Select(getedCan_common_dropDown());
		phoneType.selectByVisibleText(phntype);
		getedCan_phoneNO_input().clear();
		getedCan_phoneNO_input().sendKeys(phoneno);
		getedCan_confirmPhnNO_input().clear();
		getedCan_confirmPhnNO_input().sendKeys(cnfmphnno);
		getEdCan_saveChanges_icon().click();
		//getEdCan_cancelChanges_icon().click();
		
	}
	
	public void altEmail(String altemail)
	{
		Actions action=new Actions(driver);
		WebElement altEmail=getEdCan_altEmail_fieldName();
		action.moveToElement(altEmail).build().perform();
		WebElement editIcon=getEdCan_altEmailEdit_icon();
		action.moveToElement(editIcon).click().build().perform();	
		getedCan_alternateEmail_input().clear();
		getedCan_alternateEmail_input().sendKeys(altemail);
		getEdCan_saveChanges_icon().click();
		//getEdCan_cancelChanges_icon().click();
	}
		
	public void altPhone(String altphn,String altphoneno) throws InterruptedException
	{
		Actions action=new Actions(driver);
		WebElement altPhone=getEdCan_altPhone_fieldName();
		action.moveToElement(altPhone).build().perform();
		WebElement editIcon=getEdCan_altPhoneEdit_icon();
		action.moveToElement(editIcon).click().build().perform();	
		getedCan_common_dropDown().click();
		Select altPhnType=new Select(getedCan_common_dropDown());
		altPhnType.selectByVisibleText(altphn);
		getedCan_alternatePhoneNo_input().clear();
		getedCan_alternatePhoneNo_input().sendKeys(altphoneno);
		Thread.sleep(3000);
		getEdCan_saveChanges_icon().click();
		//getEdCan_cancelChanges_icon().click();
		
	}
	public void addressDetails(String address,String city,String zipcode,String state,String country) throws InterruptedException
	{
		
		Actions action=new Actions(driver);
		WebElement addressDetails=getEdCan_addressfieldName();
		action.moveToElement(addressDetails).build().perform();
		WebElement editIcon=getEdCan_addressEdit_icon();
		action.moveToElement(editIcon).click().build().perform();	
		getedCan_fullAddress_input().clear();
		getedCan_fullAddress_input().sendKeys(address);
		getedCan_city_input().clear();
		getedCan_city_input().sendKeys(city);
		getedCan_zipCode_input().clear();
		getedCan_zipCode_input().sendKeys(zipcode);
		getedCan_state_input().clear();
		getedCan_state_input().sendKeys(state);
		getedCan_country_input().clear();
		getedCan_country_input().sendKeys(country);
		getEdCan_saveChanges_icon().click();
		//getEdCan_cancelChanges_icon().click();
		
	}
	
	public void DOB(String field, String date) throws Exception
	{
		Actions action=new Actions(driver);
		WebElement birthDate=getEdCan_dob_fieldName();
		action.moveToElement(birthDate).build().perform();
		WebElement editIcon=getEdCan_dobEdit_icon();
		action.moveToElement(editIcon).click().build().perform();	
		getEdCan_birthDate_date().click();
		selectDate(field, date);
		getEdCan_saveChanges_icon().click();
		//getEdCan_cancelChanges_icon().click();
		
	}
	
	public void status(String candidstatus) throws InterruptedException
	{
		
		Actions action=new Actions(driver);
		WebElement candidatestatus=getEdCan_status_fieldName();
		action.moveToElement(candidatestatus).build().perform();
		WebElement editIcon=getEdCan_statusEdit_icon();
		action.moveToElement(editIcon).click().build().perform();	
		Thread.sleep(3000);
		getedCan_common_dropDown().click();
		Select status =new Select(getedCan_common_dropDown());
		status.selectByVisibleText(candidstatus);
		getEdCan_saveChanges_icon().click();
		//getEdCan_cancelChanges_icon().click();
		
		
		}
	public void relocate() throws InterruptedException
	{
		Actions action=new Actions(driver);
		WebElement relocate=getEdCan_relocate_fieldName();
		action.moveToElement(relocate).build().perform();
		WebElement editIcon=getEdCan_relocateEdit_icon();
		action.moveToElement(editIcon).click().build().perform();	
		getedCan_relocate_toggleBtn().click();
		getEdCan_saveChanges_icon().click();
		//getEdCan_cancelChanges_icon().click();
		
		
	}
	
	public void selectOwner(String Owner) throws InterruptedException
	{
		Actions action=new Actions(driver);
		WebElement selectOwner=getEdCan_owner_fieldName();
		action.moveToElement(selectOwner).build().perform();
		WebElement editIcon=getEdCan_ownerEdit_icon();
		action.moveToElement(editIcon).click().build().perform();	
		getedCan_common_dropDown().click();
		Select owner=new Select(getedCan_common_dropDown());
		owner.selectByVisibleText(Owner);
		Thread.sleep(3000);
		getEdCan_saveChanges_icon().click();
		//getEdCan_cancelChanges_icon().click();
		
		}
	public void profileURL(String profile)
	{
		Actions action=new Actions(driver);
		WebElement profileUrl=getEdCan_profilrUrl_fieldName();
		action.moveToElement(profileUrl).build().perform();
		WebElement editIcon=getEdCan_profileEdit_icon();
		action.moveToElement(editIcon).click().build().perform();	
		getedCan_profileUrl_input().clear();
		getedCan_profileUrl_input().sendKeys(profile);
		getEdCan_saveChanges_icon().click();
		//getEdCan_cancelChanges_icon().click();
		
		}
	
	public void keySkills(String skills)
	
	{
		Actions action=new Actions(driver);
		WebElement keySkills=getEdCan_skills_fieldName();
		action.moveToElement(keySkills).build().perform();
		WebElement editIcon=getEdCan_skillsEdit_icon();
		action.moveToElement(editIcon).click().build().perform();	
		getEdCan_multiSelect_dropdown().click();
		getEdCan_specializedSkills_input().sendKeys(skills);
		//getEdCan_saveChanges_icon().click();
		getEdCan_cancelChanges_icon().click();
		
		}
	
	public void ratings(String ratings)
	{
		Actions action=new Actions(driver);
		WebElement candidateRatings=getEdCan_ratings_fieldName();
		action.moveToElement(candidateRatings).build().perform();
		WebElement editIcon=getEdCan_ratingEdit_icon();
		action.moveToElement(editIcon).click().build().perform();	
		getedCan_common_dropDown().click();
		Select rating=new Select(getedCan_common_dropDown());
		rating.selectByVisibleText(ratings);
		//getEdCan_saveChanges_icon().click();
		getEdCan_cancelChanges_icon().click();
		
		}
	public void source(String source, String sourceBy) throws InterruptedException
	{
		
		Actions action=new Actions(driver);
		WebElement sourceAndBy=getEdCan_source_fieldName();
		action.moveToElement(sourceAndBy).build().perform();
		WebElement editIcon=getEdCan_sourceEdit_icon();
		action.moveToElement(editIcon).click().build().perform();	
		getedCan_common_dropDown().click();
		Select src=new Select(getedCan_common_dropDown());
		src.selectByVisibleText(source);
		Thread.sleep(5000);
		getEdCan_sourceBy_dropDown().click();
		Select srcby=new Select(getEdCan_sourceBy_dropDown());
		srcby.selectByVisibleText(sourceBy);
		getEdCan_saveChanges_icon().click();
		//getEdCan_cancelChanges_icon().click();
		
		
	}
	public void noticePeriod(String noticeperiod) throws InterruptedException
	{
		Actions action=new Actions(driver);
		WebElement noticePeriod =getEdCan_noticePeriod_fieldName();
		action.moveToElement(noticePeriod).build().perform();
		WebElement editIcon=getEdCan_noticePeriodEdit_icon();
		action.moveToElement(editIcon).click().build().perform();	
		getedCan_noticeperiod_input().clear();
		getedCan_noticeperiod_input().sendKeys(noticeperiod);
		getEdCan_saveChanges_icon().click();
		//getEdCan_cancelChanges_icon().click();
		
		
	}
	
	public void currentPackage(String currency,String cpackage)
	{

		Actions action=new Actions(driver);
		WebElement currentPackage =getEdCan_currentPackage_fieldName();
		action.moveToElement(currentPackage).build().perform();
		WebElement editIcon=getEdCan_currentpackageEdit_icon();
		action.moveToElement(editIcon).click().build().perform();	
		WebElement cur=getedCan_currency_autoDropDown();
		cur.click();
		cur.sendKeys(currency);
		cur.sendKeys(Keys.ENTER);
		getedCan_Cpackage_input().sendKeys(cpackage);
		getEdCan_saveChanges_icon().click();
		//getEdCan_cancelChanges_icon().click();
			
		
	}
	
	public void expPackage(String epackage)
	{
		Actions action=new Actions(driver);
		WebElement expectedPackage =getEdCan_expectedPackage_fieldName();
		action.moveToElement(expectedPackage).build().perform();
		WebElement editIcon=getEdCan_expPackageEdit_icon();
		action.moveToElement(editIcon).click().build().perform();	
		getedCan_Epackage_input().clear();
		getedCan_Epackage_input().sendKeys(epackage);
		getEdCan_saveChanges_icon().click();
		//getEdCan_cancelChanges_icon().click();
			
	}
	public void joiningDate(String field, String date) throws Exception
	{
		Actions action=new Actions(driver);
		WebElement joiningDate =getEdCan_joningDate_fieldName();
		action.moveToElement(joiningDate).build().perform();
		WebElement editIcon=getEdCan_joiningDateEdit_icon();
		action.moveToElement(editIcon).click().build().perform();	
		getEdCan_joiningDate_date().click();
		selectDate(field, date);
		Thread.sleep(2000);
		getEdCan_saveChanges_icon().click();
		//getEdCan_cancelChanges_icon().click();
		
	}
	public void timeToCall(String timeZone,String time,String field, String date) throws Exception
	{
		Actions action=new Actions(driver);
		WebElement bestTime =getEdCan_timeTocall_fieldName();
		action.moveToElement(bestTime).build().perform();
		WebElement editIcon=getEdCan_timeToCallEdit_icon();
		action.moveToElement(editIcon).click().build().perform();	
		WebElement zone=getEdCan_timeZone_autoDropDown();
		zone.click();
		zone.sendKeys(timeZone);
		getEdCan_time_input().sendKeys(time);
		getEdCan_selectAvailableDate_calander().click();
		Thread.sleep(3000);
		selectDate(field, date);
		Thread.sleep(3000);
		getEdCan_saveChanges_icon().click();
		//getEdCan_cancelChanges_icon().click();
		

	}
	
	public void enterComments(String comment) throws InterruptedException
	{
		Actions action=new Actions(driver);
		WebElement comments =getEdCan_comments_fieldName();
		action.moveToElement(comments).build().perform();
		WebElement editIcon=getEdCan_commentsEdit_icon();
		action.moveToElement(editIcon).click().build().perform();	
		getEdCan_comments_input().clear();
		 getEdCan_comments_input().sendKeys(comment);
		 getEdCan_saveChanges_icon().click();
		 getEdCan_cancelChanges_icon().click();
			
	}
	public void addEditJobs(String assignjob)
	{
		Actions action=new Actions(driver);
		WebElement addEditJob =getEdCan_addEditJobs_fieldName();
		action.moveToElement(addEditJob).build().perform();
		WebElement editIcon=getEdCan_addEditEdit_icon();
		action.moveToElement(editIcon).click().build().perform();	
		getEdCan_addEditJobs_input().click();
		getEdCan_addEditJobs_input().sendKeys(assignjob);
		getEdCan_addEditJobs_input().sendKeys(Keys.ENTER);
		getEdCan_saveChanges_icon().click();
		//getEdCan_cancelChanges_icon().click();
		
	}
	
	public void addEditDocuments(String filePath)
	{
		Actions action=new Actions(driver);
		WebElement addEditDoc =getEdCan_addEditDocuments_fieldName();
		action.moveToElement(addEditDoc).build().perform();
		WebElement editIcon=getEdCan_addEditDocEdit_icon();
		action.moveToElement(editIcon).click().build().perform();	
		WebElement attachDoc=getEdCan_chooseDocuments_filePath();
		attachDoc.sendKeys(filePath);
		getEdCan_saveChanges_icon().click();
		//getEdCan_cancelChanges_icon().click();
		
	}
	
	public void candidateJobAssignment(String enterText,String candidateStage) throws InterruptedException
	{
		Thread.sleep(10000);
		getEdCan_candidateStage_button().click();
		Thread.sleep(3000);
		getEdCan_enterText_input().sendKeys(enterText);
		Thread.sleep(3000);
		Select stage=new Select(getEdCan_selectStage_dropdown());
		stage.selectByVisibleText(candidateStage);
		Thread.sleep(3000);
		getEdCan_updateStage_button().click();
		Thread.sleep(3000);
	
	}
	
	public void candidateHistory(String title) throws InterruptedException
	{
		Thread.sleep(6000);
		getEdCan_candidateHistory_drodown().click();
		Select jobTitle=new Select(getEdCan_candidateHistory_drodown());
		Thread.sleep(2000);
		jobTitle.selectByValue(title);
		Thread.sleep(3000);
	}
	
	public void pages()
	{
		pageNavigation();
		
	}
	
	public void comments(String text,String participant)
	{
			commentsTab(text,participant);
	}
	
	public void deleteCandidate() throws InterruptedException
	{
		deleteRecords();
	}
	
	public void filters(String filterOptions,String subOptions,String keyword,String field, String date) throws Exception
	{
		
		filterTheRecords(filterOptions,subOptions,keyword,field,date);
	
	}
	
}

	

