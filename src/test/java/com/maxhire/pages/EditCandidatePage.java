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
	
	/*@FindBy(xpath="//input[@placeholder='Select Birth Date']")
	private WebElement edCan_selectDOB_select;
	
	@FindBy(xpath="//div[@class='vdatetime-popup__year']")
	private WebElement edCan_selectYear_select;
	
	@FindBy(xpath="//div[@class='vdatetime-year-picker__list vdatetime-year-picker__list']//div[contains(text(),'')]")
	private WebElement edCan_yearList_select;
	
	@FindBy(xpath="//div[contains(text(),'Cancel')]")
	WebElement edCan_calCancel_button;
	
	@FindBy(xpath="//div[contains(text(),'Ok')]")
	WebElement edCan_calOk_button;*/
	
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
	
	@FindBy(xpath="//span[contains(text(),'hi name')]")
	private WebElement edCan_candidateEditDetails_link;
	
	@FindBy(xpath="//div[@class='card-body']//div[1]//div[1]//div[1]//div[3]//*[local-name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
	private WebElement edCan_nameSave_icon;
	
	@FindBy(xpath="//div[@class='card-body']//div[1]//div[1]//div[1]//div[4]//*[local-name()='svg']")
	private WebElement edCan_nameCancel_icon;
	
	@FindBy(xpath="//div[@class='ps ps--active-y']//div[2]//div[1]//div[1]//div[3]//*[local-name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
	private WebElement edCan_emailSave_icon;
	
	@FindBy(xpath="//div[@class='ps ps--active-y']//div[2]//div[1]//div[1]//div[4]//*[local-name()='svg']")
	private WebElement edCan_emailCancel_icon;
	
	@FindBy(xpath="//div[3]//div[1]//div[1]//div[3]//*[local-name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
	private WebElement edCan_phoneSave_icon;
	
	@FindBy(xpath="//div[3]//div[1]//div[1]//div[4]//*[local-name()='svg']")
	private WebElement edCan_phoneCancel_icon;
	
	@FindBy(xpath="//div[@class='view-area']//div[4]//div[1]//div[1]//div[3]//*[local-name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
	private WebElement edCan_altEmailSave_icon;
	
	@FindBy(xpath="//div[@class='view-area']//div[4]//div[1]//div[1]//div[4]//*[local-name()='svg']")
	private WebElement edCan_altEmailCancel_icon;
	
	@FindBy(xpath="//div[5]//div[1]//div[1]//div[3]//*[local-name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
	private WebElement edCan_altPhoneSave_icon;
	
	@FindBy(xpath="//div[5]//div[1]//div[1]//div[4]//*[local-name()='svg']")
	private WebElement edCan_altPhoneCancel_icon;
	
	@FindBy(xpath="//div[7]//div[1]//div[1]//div[3]//*[local-name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
	private WebElement edCan_addressSave_icon;
	
	@FindBy(xpath="//div[7]//div[1]//div[1]//div[4]//*[local-name()='svg']")
	private WebElement edCan_addressCancel_icon;
	
	@FindBy(xpath="//div[8]//div[1]//div[1]//div[3]//*[local-name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
	private WebElement edCan_statusSave_icon;
	
	@FindBy(xpath="//div[8]//div[1]//div[1]//div[4]//*[local-name()='svg']")
	private WebElement edCan_statusCancel_icon;
	
	@FindBy(xpath="//div[9]//div[1]//div[1]//div[3]//*[local-name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
	private WebElement edCan_relocateSave_icon;
	
	@FindBy(xpath="//div[9]//div[1]//div[1]//div[4]//*[local-name()='svg']")
	private WebElement edCan_relocateCancel_icon;
	
	@FindBy(xpath="//div[10]//div[1]//div[1]//div[3]//*[local-name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
	private WebElement edCan_ownerSave_icon;
	
	@FindBy(xpath="//div[10]//div[1]//div[1]//div[4]//*[local-name()='svg']")
	private WebElement edCan_ownerCancel_icon;
	
	@FindBy(xpath="//div[11]//div[1]//div[1]//div[3]//*[local-name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
	private WebElement edCan_profileSave_icon;
	
	@FindBy(xpath="//div[11]//div[1]//div[1]//div[4]//*[local-name()='svg']")
	private WebElement edCan_profileCancel_icon;
	
	@FindBy(xpath="//div[12]//div[1]//div[1]//div[3]//*[local-name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
	private WebElement edCan_skillsSave_icon;
	
	@FindBy(xpath="//div[12]//div[1]//div[1]//div[4]//*[local-name()='svg']")
	private WebElement edCan_skillsCancel_icon;
	
	@FindBy(xpath="//div[13]//div[1]//div[1]//div[3]//*[local-name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
	private WebElement edCan_ratingsSave_icon;
	
	@FindBy(xpath="//div[13]//div[1]//div[1]//div[4]//*[local-name()='svg']")
	private WebElement edCan_ratingsCancel_icon;
	
	@FindBy(xpath="//div[14]//div[1]//div[1]//div[3]//*[local-name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
	private WebElement edCan_sourceSave_icon;
	
	@FindBy(xpath="//div[14]//div[1]//div[1]//div[4]//*[local-name()='svg']")
	private WebElement edCan_sourceCancel_icon;
	
	@FindBy(xpath="//div[15]//div[1]//div[1]//div[3]//*[local-name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
	private WebElement edCan_noticePeriodSave_icon;
	
	@FindBy(xpath="//div[15]//div[1]//div[1]//div[4]//*[local-name()='svg']")
	private WebElement edCan_noticePeriodCancel_icon;
	
	@FindBy(xpath="//div[16]//div[1]//div[1]//div[3]//*[local-name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
	private WebElement edCan_cPakageSave_icon;
	
	@FindBy(xpath="//div[16]//div[1]//div[1]//div[4]//*[local-name()='svg']")
	private WebElement edCan_cPackageCancel_icon;
	
	@FindBy(xpath="//div[17]//div[1]//div[1]//div[3]//*[local-name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
	private WebElement edCan_ePackageSave_icon;
	
	@FindBy(xpath="//div[17]//div[1]//div[1]//div[4]//*[local-name()='svg']")
	private WebElement edCan_ePackageCancel_icon;
	
	@FindBy(xpath="//div[@placeholder='Enter text...']")
	private WebElement edCan_comments_input;
	
	@FindBy(xpath="//body/div[@id='app']/div[@class='view-area']/div[@class='details-candidate']/div[@id='__BVID__63']/div[@id='__BVID__63__BV_tab_container_']/div[@id='__BVID__64']/div[@class='container-fluid main-container']/div[@class='row']/div[@class='col col-sm-12 col-md-8 col-lg-8']/div[@class='card max-card']/div[@class='ps ps--active-y']/div[@class='card-body']/div[20]/div[1]/div[1]/div[3]//*[local-name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
	private WebElement edCan_commentsSave_icon;
	
	@FindBy(xpath="//body/div[@id='app']/div[@class='view-area']/div[@class='details-candidate']/div[@id='__BVID__63']/div[@id='__BVID__63__BV_tab_container_']/div[@id='__BVID__64']/div[@class='container-fluid main-container']/div[@class='row']/div[@class='col col-sm-12 col-md-8 col-lg-8']/div[@class='card max-card']/div[@class='ps ps--active-y']/div[@class='card-body']/div[20]/div[1]/div[1]/div[4]//*[local-name()='svg']")
	private WebElement edCan_commentsCancel_icon;
	
	@FindBy(xpath="//input[@placeholder='Assign Job']")
	private WebElement edCan_addEditJobs_input;
	
	@FindBy(xpath="//body/div[@id='app']/div[@class='view-area']/div[@class='details-candidate']/div[@id='__BVID__50']/div[@id='__BVID__50__BV_tab_container_']/div[@id='__BVID__51']/div[@class='container-fluid main-container']/div[@class='row']/div[@class='col col-sm-12 col-md-8 col-lg-8']/div[@class='card max-card']/div[@class='ps ps--active-y']/div[@class='card-body']/div[21]/div[1]/div[1]/div[3]//*[local-name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
	private WebElement edCan_jobsSave_icon;
	
	@FindBy(xpath="//div[21]//div[1]//div[1]//div[4]//*[local-name()='svg']")
	private WebElement edCan_jobCancel_icon;
	
	//candidate page home locators
	
	@FindBy(xpath="//button[@class='btn btn-danger btn-sm']")
	private WebElement edCan_candidateDelete_button;
	
	@FindBy(xpath="//button[@class='btn refresh_btn btn-secondary btn-sm']")
	private WebElement edCan_refresh_button;
	
	@FindBy(xpath="//button[@class='btn btn-info btn-sm']//span[1]")
	private WebElement edCan_filter_icon;
	
	@FindBy(xpath="//select[@class='adjust custom-select custom-select-sm']")
	private WebElement edCan_selectFilterOption_dropDown;
	
	//comments tab in the candidate details page
	@FindBy(xpath="//a[contains(text),='Comments']")
	private WebElement edCan_commentsTab_tab;
	
	@FindBy(xpath="//div[@placeholder='Enter text...']")
	private WebElement edCan_enterComments_input;
	
	@FindBy(xpath="//span[@class='multiselect__placeholder']")
	private WebElement edCan_addParticipants_dropdown;
	
	@FindBy(xpath="//input[@placeholder='Add participants']")
	private WebElement edCan_selectParticipant_list;
	
	@FindBy(xpath="//button[@class='btn btn-primary btn-sm post_button']")
	private WebElement edCan_postComments_button;
	
	
	
	
	//candidate job assignment
	
	@FindBy(xpath="//button[@class='btn btn-outline-success btn-sm rounded-pill']//*[local-name()='svg']")
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

	public WebElement getEdCan_jobsSave_icon() {
		return edCan_jobsSave_icon;
	}

	public WebElement getEdCan_jobCancel_icon() {
		return edCan_jobCancel_icon;
	}

	public WebElement getEdCan_comments_input() {
		return edCan_comments_input;
	}

	public WebElement getEdCan_commentsSave_icon() {
		return edCan_commentsSave_icon;
	}

	
	public WebElement getEdCan_commentsCancel_icon() {
		return edCan_commentsCancel_icon;
	}

	public WebElement getEdCan_ePackageSave_icon() {
		return edCan_ePackageSave_icon;
	}

	public WebElement getEdCan_ePackageCancel_icon() {
		return edCan_ePackageCancel_icon;
	}

	public WebElement getEdCan_cPakageSave_icon() {
		return edCan_cPakageSave_icon;
	}

	public WebElement getEdCan_cPackageCancel_icon() {
		return edCan_cPackageCancel_icon;
	}

	public WebElement getEdCan_noticePeriodSave_icon() {
		return edCan_noticePeriodSave_icon;
	}

	public WebElement getEdCan_noticePeriodCancel_icon() {
		return edCan_noticePeriodCancel_icon;
	}

	public WebElement getEdCan_sourceSave_icon() {
		return edCan_sourceSave_icon;
	}

	
	public WebElement getEdCan_sourceCancel_icon() {
		return edCan_sourceCancel_icon;
	}

	public WebElement getEdCan_ratingsSave_icon() {
		return edCan_ratingsSave_icon;
	}

	public WebElement getEdCan_ratingsCancel_icon() {
		return edCan_ratingsCancel_icon;
	}

	public WebElement getEdCan_skillsSave_icon() {
		return edCan_skillsSave_icon;
	}

	public WebElement getEdCan_skillsCancel_icon() {
		return edCan_skillsCancel_icon;
	}

	public WebElement getEdCan_profileSave_icon() {
		return edCan_profileSave_icon;
	}

	public WebElement getEdCan_profileCancel_icon() {
		return edCan_profileCancel_icon;
	}

	public WebElement getEdCan_ownerSave_icon() {
		return edCan_ownerSave_icon;
	}

	public WebElement getEdCan_ownerCancel_icon() {
		return edCan_ownerCancel_icon;
	}

	public WebElement getEdCan_relocateSave_icon() {
		return edCan_relocateSave_icon;
	}

	public WebElement getEdCan_relocateCancel_icon() {
		return edCan_relocateCancel_icon;
	}

	public WebElement getEdCan_statusSave_icon() {
		return edCan_statusSave_icon;
	}

	public WebElement getEdCan_statusCancel_icon() {
		return edCan_statusCancel_icon;
	}

	public WebElement getEdCan_addressSave_icon() {
		return edCan_addressSave_icon;
	}

	public WebElement getEdCan_addressCancel_icon() {
		return edCan_addressCancel_icon;
	}

	public WebElement getEdCan_altPhoneSave_icon() {
		return edCan_altPhoneSave_icon;
	}

	
	public WebElement getEdCan_altPhoneCancel_icon() {
		return edCan_altPhoneCancel_icon;
	}
	
	public WebElement getEdCan_altEmailSave_icon() {
		return edCan_altEmailSave_icon;
	}

	public WebElement getEdCan_altEmailCancel_icon() {
		return edCan_altEmailCancel_icon;
	}

	public WebElement getEdCan_phoneSave_icon() {
		return edCan_phoneSave_icon;
	}

	public WebElement getEdCan_phoneCancel_icon() {
		return edCan_phoneCancel_icon;
	}
	public WebElement getEdCan_emailSave_icon() {
		return edCan_emailSave_icon;
	}

	public WebElement getEdCan_emailCancel_icon() {
		return edCan_emailCancel_icon;
	}



	public WebElement getEdCan_nameSave_icon() {
		return edCan_nameSave_icon;
	}

	public WebElement getEdCan_nameCancel_icon() {
		return edCan_nameCancel_icon;
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
		WebElement candidatenamef=driver.findElement(By.xpath("//div[contains(text(),'hey')]"));
		action.doubleClick(candidatenamef).perform();
		getedCan_common_dropDown().click();
		Select title= new Select(getedCan_common_dropDown());
		title.selectByVisibleText(type);
		getedCan_firstName_input().clear();
		getedCan_firstName_input().sendKeys(firstname);
		getedCan_middleName_input().clear();
		getedCan_middleName_input().sendKeys(middlename);
		getedCan_lastName_input().clear();
		getedCan_lastName_input().sendKeys(lastname);
		getEdCan_nameSave_icon().click();
		//getEdCan_nameCancel_icon().click();
		Thread.sleep(3000);
	}
	
	public void emailDetails(String pemail,String cemail )
	{
		Actions action=new Actions(driver);
		WebElement emailf=driver.findElement(By.xpath("//div[contains(text(),'asdf12@gmail.com')]"));
		action.doubleClick(emailf).perform();
		getedCan_primaryEmail_input().clear();
		getedCan_primaryEmail_input().sendKeys(pemail);
		getedCan_confirmEmail_input().clear();
		getedCan_confirmEmail_input().sendKeys(cemail);
		 getEdCan_emailSave_icon().click();
		 //getEdCan_emailCancel_icon().click();

		
	}
	
	public void phoneDetails(String phntype,String phoneno,String cnfmphnno) throws InterruptedException
	{
		Actions action=new Actions(driver);
		WebElement phonef=driver.findElement(By.xpath("//div[contains(text(),'8596859674')]"));
		action.doubleClick(phonef).perform();
		getedCan_common_dropDown().click();
		Select phoneType= new Select(getedCan_common_dropDown());
		phoneType.selectByVisibleText(phntype);
		getedCan_phoneNO_input().clear();
		getedCan_phoneNO_input().sendKeys(phoneno);
		getedCan_confirmPhnNO_input().clear();
		getedCan_confirmPhnNO_input().sendKeys(cnfmphnno);
		getEdCan_phoneSave_icon().click();
		//getEdCan_phoneCancel_icon().click();
		Thread.sleep(3000);
		
		
	}
	public void altEmail(String altemail)
	{
		Actions action=new Actions(driver);
		WebElement emailf=driver.findElement(By.xpath("//div[contains(text(),'ert45@gmail.com')]"));
		action.doubleClick(emailf).perform();
		getedCan_alternateEmail_input().clear();
		getedCan_alternateEmail_input().sendKeys(altemail);
		getEdCan_altEmailSave_icon().click();
		//getEdCan_altEmailCancel_icon().click();
	}
		
	public void altPhone(String altphn,String altphoneno)
	{
		Actions action=new Actions(driver);
		WebElement phonef=driver.findElement(By.xpath("//div[contains(text(),'7412587412')]"));
		action.doubleClick(phonef).perform();
		getedCan_common_dropDown().click();
		Select altPhnType=new Select(getedCan_common_dropDown());
		altPhnType.selectByVisibleText(altphn);
		getedCan_alternatePhoneNo_input().clear();
		getedCan_alternatePhoneNo_input().sendKeys(altphoneno);
		getEdCan_altPhoneSave_icon().click();
		//getEdCan_altPhoneCancel_icon().click();
		

	}
	public void addressDetails(String address,String city,String zipcode,String state,String country) throws InterruptedException
	{
		
		Actions action=new Actions(driver);
		WebElement addressf=driver.findElement(By.xpath("//div[7]//div[2]//div[1]//div[1]"));
		action.doubleClick(addressf).perform();
		Thread.sleep(3000);
		getedCan_fullAddress_input().clear();
		getedCan_fullAddress_input().sendKeys(address);
		Thread.sleep(3000);
		getedCan_city_input().clear();
		getedCan_city_input().sendKeys(city);
		Thread.sleep(3000);
		getedCan_zipCode_input().clear();
		getedCan_zipCode_input().sendKeys(zipcode);
		Thread.sleep(3000);
		getedCan_state_input().clear();
		getedCan_state_input().sendKeys(state);
		Thread.sleep(3000);
		getedCan_country_input().clear();
		getedCan_country_input().sendKeys(country);
		Thread.sleep(3000);
		getEdCan_addressSave_icon().click();
		//getEdCan_addressCancel_icon().click();
		Thread.sleep(3000);
		
		
	}
	
	public void status(String candidstatus) throws InterruptedException
	{
		Actions action=new Actions(driver);
		WebElement statusf=driver.findElement(By.xpath("//div[8]//div[2]//div[1]//div[1]"));
		action.doubleClick(statusf).perform();
		Thread.sleep(3000);
		getedCan_common_dropDown().click();
		Select status =new Select(getedCan_common_dropDown());
		status.selectByVisibleText(candidstatus);
		getEdCan_statusSave_icon().click();
		 getEdCan_statusCancel_icon().click();	
		}
	public void relocate() throws InterruptedException
	{
		Actions action=new Actions(driver);
		WebElement statusf=driver.findElement(By.xpath("//div[9]//div[2]//div[1]//div[1]"));
		action.doubleClick(statusf).perform();
		getedCan_relocate_toggleBtn().click();
		Thread.sleep(3000);
		getEdCan_relocateSave_icon().click();
		//getEdCan_relocateCancel_icon().click();
		}
	
	public void selectOwner(String Owner) throws InterruptedException
	{
		Actions action=new Actions(driver);
		WebElement ownerf=driver.findElement(By.xpath("//div[contains(text(),'Supriya Annam')]"));
		action.doubleClick(ownerf).perform();
		getedCan_common_dropDown().click();
		Select owner=new Select(getedCan_common_dropDown());
		owner.selectByVisibleText(Owner);
		Thread.sleep(3000);
		getEdCan_ownerSave_icon().click();
		//getEdCan_ownerCancel_icon().click();
		Thread.sleep(3000);
		
		}
	public void profileURL(String profile)
	{
		Actions action=new Actions(driver);
		WebElement  profilef=driver.findElement(By.xpath("//div[contains(text(),'vs.com')]"));
		action.doubleClick(profilef).perform();
		getedCan_profileUrl_input().clear();
		getedCan_profileUrl_input().sendKeys(profile);
		getEdCan_profileSave_icon().click();
		//getEdCan_profileCancel_icon().click();
		
		}
	
	public void keySkills(String skills)
	
	{
		Actions action=new Actions(driver);
		WebElement skillsf=driver.findElement(By.xpath("//div[contains(text(),'selenium,cucumber')]"));
		action.doubleClick(skillsf).perform();
		getedCan_keySkills_input().clear();
		getedCan_keySkills_input().sendKeys(skills);
		getEdCan_skillsSave_icon().click();
		//getEdCan_skillsCancel_icon().click();

		}
	
	public void ratings(String ratings)
	{
		Actions action=new Actions(driver);
		WebElement skillsf=driver.findElement(By.xpath("//div[contains(text(),'Average')]"));
		action.doubleClick(skillsf).perform();
		getedCan_common_dropDown().click();
		Select rating=new Select(getedCan_common_dropDown());
		rating.selectByVisibleText(ratings);
		getEdCan_ratingsSave_icon().click();
		//getEdCan_ratingsCancel_icon().click();
		
		}
	public void source(String source, String sourceBy) throws InterruptedException
	{
		
		Actions action=new Actions(driver);
		WebElement sourcef=driver.findElement(By.xpath("//div[14]//div[2]//div[1]//div[1]"));
		action.doubleClick(sourcef).perform();
		getedCan_common_dropDown().click();
		Select src=new Select(getedCan_common_dropDown());
		src.selectByVisibleText(source);
		Thread.sleep(5000);
		//getedCan_common_dropDown().sendKeys(Keys.TAB);
		Thread.sleep(5000);
		getedCan_common_dropDown().click();
		Select srcby=new Select(getedCan_common_dropDown());
		srcby.selectByVisibleText(sourceBy);
		//getEdCan_sourceSave_icon().click();
		getEdCan_sourceCancel_icon().click();
		Thread.sleep(5000);
		
		
	}
	public void noticePeriod(String noticeperiod) throws InterruptedException
	{
		Actions action=new Actions(driver);
		WebElement noticeperiodf=driver.findElement(By.xpath("//div[15]//div[2]//div[1]//div[1]"));
		action.doubleClick(noticeperiodf).perform();
		getedCan_noticeperiod_input().clear();
		getedCan_noticeperiod_input().sendKeys(noticeperiod);
		getEdCan_noticePeriodSave_icon().click();
		//getEdCan_noticePeriodCancel_icon().click();
		Thread.sleep(5000);
		
		
	}
	
	public void currentPackage(String currency,String cpackage)
	{

		Actions action=new Actions(driver);
		WebElement cPackagef=driver.findElement(By.xpath("//div[contains(text(),'10')]"));
		action.doubleClick(cPackagef).perform();
		WebElement cur=getedCan_currency_autoDropDown();
		cur.click();
		cur.sendKeys(currency);
		cur.sendKeys(Keys.ENTER);
		getedCan_Cpackage_input().sendKeys(cpackage);
		//getEdCan_cPakageSave_icon().click();
		getEdCan_cPackageCancel_icon().click();
			
		
	}
	
	public void expPackage(String epackage) {
		// TODO Auto-generated method stub
		Actions action=new Actions(driver);
		WebElement ePackagef=driver.findElement(By.xpath("//div[17]//div[2]//div[1]//div[1]"));
		action.doubleClick(ePackagef).perform();
		getedCan_Epackage_input().clear();
		getedCan_Epackage_input().sendKeys(epackage);
		getEdCan_ePackageSave_icon().click();
		//getEdCan_ePackageCancel_icon().click();
			
	}
	public void joiningDate()
	{
		
	}
	public void timeToCall()
	{
	}
	public void enterComments(String comment) throws InterruptedException
	{
		Actions action=new Actions(driver);
		WebElement commentsf=driver.findElement(By.xpath("//p[@class='card-text']"));
		action.doubleClick(commentsf).perform();
		getEdCan_comments_input().clear();
		 getEdCan_comments_input().sendKeys(comment);
		//getEdCan_commentsSave_icon().click();
		getEdCan_commentsCancel_icon().click();
		Thread.sleep(3000);
		
	}
	public void addEditJobs(String assignjob)
	{
		Actions action=new Actions(driver);
		WebElement jobf=driver.findElement(By.xpath("//div[contains(text(),'Edit field to add/delete assigned job')]"));
		action.doubleClick(jobf).perform();
		getEdCan_addEditJobs_input().click();
		getEdCan_addEditJobs_input().sendKeys(assignjob);
		getEdCan_addEditJobs_input().sendKeys(Keys.ENTER);
		getEdCan_jobsSave_icon().click();
		getEdCan_jobCancel_icon().click();
		

	}
	
	public void addEditDocuments()
	{
		Actions action =new Actions(driver);
		WebElement documentsf=driver.findElement(By.xpath("//div[contains(text(),'Edit field to add/delete documents')]"));
		action.doubleClick(documentsf).perform();
		
		
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
		jobTitle.selectByValue(title);
		Thread.sleep(3000);
	}
}

	

