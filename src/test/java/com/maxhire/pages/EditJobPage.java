package com.maxhire.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class EditJobPage extends BasePage {
	
	@FindBy(xpath="//input[@placeholder='Job Title']")
	private WebElement edJob_jobTitle_input;
	
	@FindBy(xpath="//input[@placeholder='Request ID']")
	private WebElement edJob_requestId_inut;
	
	@FindBy(xpath="//input[@placeholder='Client Manager']")
	private WebElement edJob_clientManager_input;
	
	@FindBy(xpath="//input[@placeholder='City']")
	private WebElement edjob_city_input;
	
	@FindBy(xpath="//input[@placeholder='State']")
	private WebElement edJob_state_input;
	
	@FindBy(xpath="//input[@placeholder='Zip']")
	private WebElement edJob_zip_input;
	
	@FindBy(xpath="//input[@placeholder='Type Country']")
	private WebElement edJob_country_input;
	
	@FindBy(xpath="//input[@placeholder='Number of Openings']")
	private WebElement edJob_noOfOpening_input;
	
	@FindBy(xpath="//div[@class='custom-control custom-switch']")
	private WebElement edJob_commonToggle_toggleBtn;
	
	@FindBy(xpath="//input[@placeholder='Currency']")
	private WebElement edJob_currency_autoDropDown;
	
	@FindBy(xpath="//input[@placeholder='Offered Salary']")
	private WebElement edJob_offeredSalary_input;
	
	@FindBy(xpath="//select[@class='custom-select custom-select-sm']")
	private WebElement edJob_jobType_dropDown;
	
	@FindBy(xpath="//select[@class='width_50 custom-select custom-select-sm']")
	private WebElement edJob_common_dropdown;

	@FindBy(xpath="//input[@placeholder='Select Hiring Manager']")
	private WebElement edJob_manager_dropDown;
	
	@FindBy(xpath="//select[@class='custom-select custom-select-sm']")
	private WebElement edJob_salaryTye_dropdown;
	
	@FindBy(xpath="//span[contains(text(),'testing')]")
	private WebElement edJob_jobDetailsEdit_link;
	
	@FindBy(xpath="//input[@placeholder='Select Recruiter']")
	private WebElement edJob_recruiter_dropDown;
		
	@FindBy(xpath ="//div[@style='color: green;']")
	private WebElement edJob_saveChanges_icon;

	@FindBy(xpath = "//div[@style='color: red;']")
	private WebElement edJob_cancelChanges_icon;
	
	@FindBy(xpath="//div[@class='multiselect__tags']")
	private WebElement edJob_mulitiSelect_dropDown;
	
 	//job description edit
	
	@FindBy(xpath="//div[@class='card-header']//div//div[@class='grid-floating-icon']")
	private WebElement edJob_jobDescEdit_icon;
	
	@FindBy(xpath="//div[@placeholder='Enter text...']")
	private WebElement edJob_jobDescText_input;
	
	@FindBy(xpath="//div[@class='card-header']//div[2]")
	private WebElement edJob_jobDescSave_icon;
	
	@FindBy(xpath="//div[@class='card-header']//div[3]")
	private WebElement edJob_jobDescCancel_icon;

	
	//Edit job fields
	
	@FindBy(xpath="//div[contains(text(),'Status:')]")
	private WebElement edJob_status_fieldName;
	
	@FindBy(xpath="//div[contains(text(),'Job Title (Req ID):')]")
	private WebElement edJob_title_fieldName;
	
	@FindBy(xpath="//div[contains(text(),'Client Manager:')]")
	private WebElement edJob_clientMgr_fieldName;
	
	@FindBy(xpath="//div[contains(text(),'Job Location:')]")
	private WebElement edJob_jobLocation_fieldName;
	
	@FindBy(xpath="//div[contains(text(),'Hiring Manager:')]")
	private WebElement edJob_hiringMgr_fieldName;
	
	@FindBy(xpath="//div[contains(text(),'Recruiter:')]")
	private WebElement edJob_recruiter_fieldName;
	
	@FindBy(xpath="//div[contains(text(),'Number of Openings:')]")
	private WebElement edJob_numberOfOpenings_fieldName;
	
	@FindBy(xpath="//div[contains(text(),'High Priority:')]")
	private WebElement edJob_highPriority_fieldName;
	
	@FindBy(xpath="//div[contains(text(),'Resume Required:')]")
	private WebElement edJob_resumeRequired_fieldName;
	
	@FindBy(xpath="//div[contains(text(),'Salary')]")
	private WebElement edJob_salary_fieldName;
	
	@FindBy(xpath="//div[contains(text(),'Job Type:')]")
	private WebElement edJob_jobType_fieldName;
	
	@FindBy(xpath="//div[contains(text(),'Employment Type:')]")
	private WebElement edJob_employmentType_fieldName;
	
	@FindBy(xpath="//div[contains(text(),'Owner:')]")
	private WebElement edJob_owner_fieldName;
	
	@FindBy(xpath="//div[contains(text(),'Department:')]")
	private WebElement edJob_department_fieldName;
	
	@FindBy(xpath="//div[@class='card max-card']//div//div[@class='grid-floating-icon']")
	private WebElement edJob_editIcon_icon;
	
	@FindBy(xpath="//div[@class='ps ps--active-y']//div[1]//div[1]//div[1]//div[2]")
	private WebElement edJob_statusEdit_icon;
	
	@FindBy(xpath="//div[@class='ps ps--active-y']//div[2]//div[1]//div[1]//div[2]")
	private WebElement edJob_titleEdit_icon;
	
	@FindBy(xpath="//div[@class='ps ps--active-y']//div[3]//div[1]//div[1]//div[2]")
	private WebElement edJob_clientMgrEdit_icon;
	
	@FindBy(xpath="//div[@class='ps ps--active-y']//div[4]//div[1]//div[1]//div[2]")
	private WebElement edJob_loactionEdit_icon;
	
	@FindBy(xpath="//div[@class='ps ps--active-y']//div[5]//div[1]//div[1]//div[2]")
	private WebElement edJob_hireMgrEdit_icon;
	
	@FindBy(xpath="//div[@class='ps ps--active-y']//div[6]//div[1]//div[1]//div[2]")
	private WebElement edJob_RecruiterEdit_icon;
	
	@FindBy(xpath="//div[@class='ps ps--active-y']//div[7]//div[1]//div[1]//div[2]")
	private WebElement edJob_openingsEdit_icon;
	
	@FindBy(xpath="//div[@class='ps ps--active-y']//div[8]//div[1]//div[1]//div[2]")
	private WebElement edJob_priorityEdit_icon;
	
	@FindBy(xpath="//div[@class='ps ps--active-y']//div[9]//div[1]//div[1]//div[2]")
	private WebElement edJob_resumeEdit_icon;
	
	@FindBy(xpath="//div[@class='ps ps--active-y']//div[10]//div[1]//div[1]//div[2]")
	private WebElement edJob_salaryEdit_icon;
	
	@FindBy(xpath="//div[@class='ps ps--active-y']//div[11]//div[1]//div[1]//div[2]")
	private WebElement edJob_jobTypeEdit_icon;
	
	@FindBy(xpath="//div[@class='ps ps--active-y']//div[12]//div[1]//div[1]//div[2]")
	private WebElement employmentEdit_icon;
	
	@FindBy(xpath="//div[@class='ps ps--active-y']//div[13]//div[1]//div[1]//div[2]")
	private WebElement ownerEdit_icon;
	
	@FindBy(xpath="//div[@class='ps ps--active-y']//div[14]//div[1]//div[1]//div[2]")
	private WebElement departmentEdit_icon;
	

	public WebElement getEdJob_manager_dropDown() {
		return edJob_manager_dropDown;
	}

	public WebElement getEdJob_statusEdit_icon() {
		return edJob_statusEdit_icon;
	}

	public WebElement getEdJob_titleEdit_icon() {
		return edJob_titleEdit_icon;
	}

	public WebElement getEdJob_clientMgrEdit_icon() {
		return edJob_clientMgrEdit_icon;
	}

	public WebElement getEdJob_loactionEdit_icon() {
		return edJob_loactionEdit_icon;
	}

	public WebElement getEdJob_hireMgrEdit_icon() {
		return edJob_hireMgrEdit_icon;
	}

	public WebElement getEdJob_RecruiterEdit_icon() {
		return edJob_RecruiterEdit_icon;
	}

	public WebElement getEdJob_openingsEdit_icon() {
		return edJob_openingsEdit_icon;
	}

	public WebElement getEdJob_priorityEdit_icon() {
		return edJob_priorityEdit_icon;
	}

	public WebElement getEdJob_resumeEdit_icon() {
		return edJob_resumeEdit_icon;
	}

	public WebElement getEdJob_salaryEdit_icon() {
		return edJob_salaryEdit_icon;
	}

	public WebElement getEdJob_jobTypeEdit_icon() {
		return edJob_jobTypeEdit_icon;
	}

	public WebElement getEmploymentEdit_icon() {
		return employmentEdit_icon;
	}

	public WebElement getOwnerEdit_icon() {
		return ownerEdit_icon;
	}

	public WebElement getDepartmentEdit_icon() {
		return departmentEdit_icon;
	}

	public WebElement getEdJob_jobDescCancel_icon() {
		return edJob_jobDescCancel_icon;
	}

	public WebElement getEdJob_jobDescEdit_icon() {
		return edJob_jobDescEdit_icon;
	}


	public WebElement getEdJob_jobDescText_input() {
		return edJob_jobDescText_input;
	}

	
	public WebElement getEdJob_jobDescSave_icon() {
		return edJob_jobDescSave_icon;
	}

	public WebElement getEdJob_commonToggle_toggleBtn() {
		return edJob_commonToggle_toggleBtn;
	}

	public WebElement getEdJob_jobTitle_input() {
		return edJob_jobTitle_input;
	}
	
	public WebElement getEdJob_requestId_inut() {
		return edJob_requestId_inut;
	}
	
	public WebElement getEdJob_clientManager_input() {
		return edJob_clientManager_input;
	}


	public WebElement getEdjob_city_input() {
		return edjob_city_input;
	}
	
	public WebElement getEdJob_state_input() {
		return edJob_state_input;
	}


	public WebElement getEdJob_zip_input() {
		return edJob_zip_input;
	}


	public WebElement getEdJob_country_input() {
		return edJob_country_input;
	}


	public WebElement getEdJob_noOfOpening_input() {
		return edJob_noOfOpening_input;
	}


	public WebElement getEdJob_highPriority_toggleBtn() {
		return edJob_commonToggle_toggleBtn;
	}


	public WebElement getEdJob_currency_autoDropDown() {
		return edJob_currency_autoDropDown;
	}


	public WebElement getEdJob_offeredSalary_input() {
		return edJob_offeredSalary_input;
	}


	public WebElement getEdJob_jobType_dropDown() {
		return edJob_jobType_dropDown;
	}

	public WebElement getEdJob_common_dropdown() {
		return edJob_common_dropdown;
	}
	public WebElement getEdJob_managerRecruiter_dropDown() {
		return edJob_manager_dropDown;
	}
	
	public WebElement getEdJob_salaryTye_dropdown() {
		return edJob_salaryTye_dropdown;
	}
	
	public WebElement getEdJob_jobDetailsEdit_link() {
		return edJob_jobDetailsEdit_link;
	}
	
		
	public WebElement getEdJob_recruiter_dropDown() {
		return edJob_recruiter_dropDown;
	}
	
	public WebElement getEdJob_saveChanges_icon() {
		return edJob_saveChanges_icon;
	}

	public WebElement getEdJob_cancelChanges_icon() {
		return edJob_cancelChanges_icon;
	}

	public WebElement getEdJob_status_fieldName() {
		return edJob_status_fieldName;
	}

	public WebElement getEdJob_title_fieldName() {
		return edJob_title_fieldName;
	}

	public WebElement getEdJob_clientMgr_fieldName() {
		return edJob_clientMgr_fieldName;
	}

	public WebElement getEdJob_jobLocation_fieldName() {
		return edJob_jobLocation_fieldName;
	}

	public WebElement getEdJob_hiringMgr_fieldName() {
		return edJob_hiringMgr_fieldName;
	}

	public WebElement getEdJob_recruiter_fieldName() {
		return edJob_recruiter_fieldName;
	}

	public WebElement getEdJob_numberOfOpenings_fieldName() {
		return edJob_numberOfOpenings_fieldName;
	}

	public WebElement getEdJob_highPriority_fieldName() {
		return edJob_highPriority_fieldName;
	}

	public WebElement getEdJob_resumeRequired_fieldName() {
		return edJob_resumeRequired_fieldName;
	}

	public WebElement getEdJob_salary_fieldName() {
		return edJob_salary_fieldName;
	}

	public WebElement getEdJob_jobType_fieldName() {
		return edJob_jobType_fieldName;
	}

	public WebElement getEdJob_employmentType_fieldName() {
		return edJob_employmentType_fieldName;
	}

	public WebElement getEdJob_owner_fieldName() {
		return edJob_owner_fieldName;
	}

	public WebElement getEdJob_department_fieldName() {
		return edJob_department_fieldName;
	}
	

	public WebElement getEdJob_mulitiSelect_dropDown() {
		return edJob_mulitiSelect_dropDown;
	}

	public EditJobPage(WebDriver driver) {
		super(driver);
	}
	
	
//functions 
	public void jobDetails()
	{
		bas_jobDetailsPage_link.click();
	}
	
	public void editJobDetails()
	{
		getEdJob_jobDetailsEdit_link().click();
	}
	
		
	public void jobStatus(String status) throws Exception
	{
		Actions action=new Actions(driver);
		WebElement jobStatus=getEdJob_status_fieldName();
		action.moveToElement(jobStatus).build().perform();
		WebElement editIcon=getEdJob_statusEdit_icon();
		action.moveToElement(editIcon).click().build().perform();
		getEdJob_common_dropdown().click();
		Select Status =new Select(getEdJob_common_dropdown());
		Status.selectByVisibleText(status);
		getEdJob_saveChanges_icon().click();
		//getEdJob_cancelChanges_icon().click();
	}
	
	public void jobTitle(String title,String reqId) throws InterruptedException
	{
		
		Actions action= new Actions(driver);
		WebElement jobTitle=getEdJob_title_fieldName();
		action.moveToElement(jobTitle).build().perform();
		WebElement editIcon=getEdJob_titleEdit_icon();
		action.moveToElement(editIcon).click().build().perform();
		getEdJob_jobTitle_input().clear();
		getEdJob_jobTitle_input().sendKeys(title);
		getEdJob_requestId_inut().clear();
		getEdJob_requestId_inut().sendKeys(reqId);
		Thread.sleep(2000);
		getEdJob_saveChanges_icon().click();
		//getEdJob_cancelChanges_icon().click();
}
	
	public void clientManager(String client) throws Exception
	{
		Actions action=new Actions(driver);
		WebElement manager=getEdJob_clientMgr_fieldName();
		action.moveToElement(manager).build().perform();
		WebElement editIcon=getEdJob_clientMgrEdit_icon();
		action.moveToElement(editIcon).click().build().perform();
		getEdJob_clientManager_input().clear();
		getEdJob_clientManager_input().sendKeys(client);
		Thread.sleep(2000);
		getEdJob_saveChanges_icon().click();
		//getEdJob_cancelChanges_icon().click();
		
	}
	
	public void jobLocation(String city,String state,String zip,String country) throws Exception
	{
		Actions action=new Actions(driver);
		WebElement location=getEdJob_jobLocation_fieldName();
		action.moveToElement(location).build().perform();
		WebElement editIcon=getEdJob_loactionEdit_icon();
		action.moveToElement(editIcon).click().build().perform();
		getEdjob_city_input().clear();
		getEdjob_city_input().sendKeys(city);
		getEdJob_state_input().clear();
		getEdJob_state_input().sendKeys(state);
		getEdJob_zip_input().clear();
		getEdJob_zip_input().sendKeys(zip);
		getEdJob_country_input().clear();
		getEdJob_country_input().sendKeys(country);
		Thread.sleep(3000);
		getEdJob_saveChanges_icon().click();
		//getEdJob_cancelChanges_icon().click();
		
		}
	
	public void hiringManager(String hiremanager) throws InterruptedException
	{
		Actions action=new Actions(driver);
		WebElement hireMgr=getEdJob_hiringMgr_fieldName();
		action.moveToElement(hireMgr).build().perform();
		WebElement editIcon=getEdJob_hireMgrEdit_icon();
		action.moveToElement(editIcon).click().build().perform();
		getEdJob_mulitiSelect_dropDown().click();
		//getEdJob_manager_dropDown().click();
		Thread.sleep(3000);
		getEdJob_manager_dropDown().sendKeys(hiremanager);
		getEdJob_manager_dropDown().sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		getEdJob_saveChanges_icon().click();
		//getEdJob_cancelChanges_icon().click();
	}
	
	public void recruiter(String Recruiter) throws InterruptedException
	{
		
		Actions action=new Actions(driver);
		WebElement recruiter=getEdJob_recruiter_fieldName();
		action.moveToElement(recruiter).build().perform();
		WebElement editIcon=getEdJob_RecruiterEdit_icon();
		action.moveToElement(editIcon).click().build().perform();
		getEdJob_mulitiSelect_dropDown().click();
		//driver.findElement(By.xpath("//i[@class='multiselect__tag-icon']")).click();
		getEdJob_recruiter_dropDown().click();
		getEdJob_recruiter_dropDown().sendKeys(Recruiter);
		getEdJob_recruiter_dropDown().sendKeys(Keys.ENTER);
		Thread.sleep(3000);

		getEdJob_saveChanges_icon().click();
		//getEdJob_cancelChanges_icon().click();
		
		}
	
	public void openings(String openings) throws Exception
	{
		Actions action=new Actions(driver);
		WebElement position=getEdJob_numberOfOpenings_fieldName();
		action.moveToElement(position).build().perform();
		WebElement editIcon=getEdJob_openingsEdit_icon();
		action.moveToElement(editIcon).click().build().perform();
		getEdJob_noOfOpening_input().clear();
		getEdJob_noOfOpening_input().sendKeys(openings);
		Thread.sleep(3000);
		getEdJob_saveChanges_icon().click();
		//getEdJob_cancelChanges_icon().click();
	}
	
	public void priority() throws Exception
	{
		Actions action=new Actions(driver);
		WebElement priority=getEdJob_highPriority_fieldName();
		action.moveToElement(priority).build().perform();
		WebElement editIcon=getEdJob_priorityEdit_icon();
		action.moveToElement(editIcon).click().build().perform();
		getEdJob_commonToggle_toggleBtn().click();
		Thread.sleep(3000);
		getEdJob_saveChanges_icon().click();
		//getEdJob_cancelChanges_icon().click();
		
		
	}
		
	public void resume() throws InterruptedException
	{
		Actions action=new Actions(driver);
		WebElement resume=getEdJob_resumeRequired_fieldName();
		action.moveToElement(resume).build().perform();
		WebElement editIcon=getEdJob_resumeEdit_icon();
		action.moveToElement(editIcon).click().build().perform();
		getEdJob_commonToggle_toggleBtn().click();
		Thread.sleep(3000);
		getEdJob_saveChanges_icon().click();
		//getEdJob_cancelChanges_icon().click();
		
	}
	public void salary(String Currency,String Salary,String salType) throws InterruptedException
	{
		
		Actions action=new Actions(driver);
		WebElement sal=getEdJob_salary_fieldName();
		action.moveToElement(sal).build().perform();
		WebElement editIcon=getEdJob_salaryEdit_icon();
		action.moveToElement(editIcon).click().build().perform();
		WebElement currency=getEdJob_currency_autoDropDown();
		currency.click();
		getEdJob_currency_autoDropDown().clear();
		currency.sendKeys(Currency);
		currency.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		currency.sendKeys(Keys.TAB);
		WebElement offsal=getEdJob_offeredSalary_input();
		offsal.click();
		offsal.clear();
		offsal.sendKeys(Salary);
		Thread.sleep(3000);
		getEdJob_salaryTye_dropdown().click();
		Thread.sleep(3000);
		Select saltype=new Select(getEdJob_salaryTye_dropdown());
		saltype.selectByVisibleText(salType);
		Thread.sleep(3000);
		getEdJob_saveChanges_icon().click();
		//getEdJob_cancelChanges_icon().click();
		
			}
	
	public void jobType(String jobtype) throws InterruptedException
	{
		Actions action=new Actions(driver);
		WebElement jobType=getEdJob_jobType_fieldName();
		action.moveToElement(jobType).build().perform();
		WebElement editIcon=getEdJob_jobTypeEdit_icon();
		action.moveToElement(editIcon).click().build().perform();
		getEdJob_common_dropdown().click();
		Select type=new Select(getEdJob_common_dropdown());
		type.selectByVisibleText(jobtype);
		Thread.sleep(3000);

		getEdJob_saveChanges_icon().click();
		//getEdJob_cancelChanges_icon().click();
		
	}
	
	public void employementType(String etype) throws InterruptedException
	{
		Actions action=new Actions(driver);
		WebElement employement=getEdJob_employmentType_fieldName();
		action.moveToElement(employement).build().perform();
		Thread.sleep(3000);
		WebElement editIcon=getEmploymentEdit_icon();
		action.moveToElement(editIcon).click().build().perform();
		Thread.sleep(3000);
		getEdJob_common_dropdown().click();
		Select emptype=new Select(getEdJob_common_dropdown());
		emptype.selectByVisibleText(etype);
		Thread.sleep(3000);
		getEdJob_saveChanges_icon().click();
		//getEdJob_cancelChanges_icon().click();
		
	}
	
	public void owner(String Owner) throws InterruptedException
	{
		Actions action=new Actions(driver);
		WebElement owner=getEdJob_owner_fieldName();
		action.moveToElement(owner).build().perform();
		WebElement editIcon=getOwnerEdit_icon();
		action.moveToElement(editIcon).click().build().perform();
		getEdJob_common_dropdown().click();
		Select own=new Select(getEdJob_common_dropdown());
		own.selectByVisibleText(Owner);
		Thread.sleep(3000);
		getEdJob_saveChanges_icon().click();
		//getEdJob_cancelChanges_icon().click();
		
		
	}

	public void department(String department) throws InterruptedException
	{
		
		Actions action=new Actions(driver);
		WebElement departments=getEdJob_department_fieldName();
		action.moveToElement(departments).build().perform();
		WebElement editIcon=getDepartmentEdit_icon();
		action.moveToElement(editIcon).click().build().perform();
		getEdJob_common_dropdown().click();
		Select depart=new Select(getEdJob_common_dropdown());
		depart.selectByVisibleText(department);
		Thread.sleep(3000);
		getEdJob_saveChanges_icon().click();
		//getEdJob_cancelChanges_icon().click();
		
		
	}
	
	public void deleteJob() throws InterruptedException
	{
		deleteRecords();
	}
			
	public void filters(String filterOptions,String subOptions,String keyword,String field, String date) throws Exception
	{
		
		filterTheRecords(filterOptions,subOptions,keyword,field,date);
		
		}
	
	public void refreshPage() throws InterruptedException
	{
		refresh();
		
	}
	
	public void comments(String text,String participant)
	{
		
		commentsTab(text,participant);
	}
	
	
	public void jobDescription(String enterText) throws InterruptedException
	{
		Thread.sleep(5000);
		getEdJob_jobDescEdit_icon().click();
		getEdJob_jobDescText_input().sendKeys(Keys.CLEAR);
		getEdJob_jobDescText_input().sendKeys(enterText);
		getEdJob_jobDescSave_icon().click();
		//getEdJob_jobDescCancel_icon().click();
		Thread.sleep(3000);
	}
	
	public void pageSection()
	{
		pageNavigation();
		
	}

	}
	



