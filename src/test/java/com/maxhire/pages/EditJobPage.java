package com.maxhire.pages;

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
	
	@FindBy(xpath="//span[contains(text(),'selenium testng')]")
	private WebElement edJob_jobDetailsEdit_link;
	
	@FindBy(xpath="//div[@class='ps ps--active-y']//div[2]//div[1]//div[1]//div[3]//*[local-name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
	private WebElement edJob_jobTitleSave_icon;
	
	@FindBy(xpath="//div[@class='ps ps--active-y']//div[2]//div[1]//div[1]//div[4]//*[local-name()='svg']")
	private WebElement edJob_jobTitleCancel_icon;
	
	@FindBy(xpath="//div[3]//div[1]//div[1]//div[3]//*[local-name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
	private WebElement edJob_jobCMSave_icon;
	
	@FindBy(xpath="//div[3]//div[1]//div[1]//div[4]//*[local-name()='svg']")
	private WebElement edJob_jobCMCancel_icon;
	
	@FindBy(xpath="//div[@class='view-area']//div[4]//div[1]//div[1]//div[3]//*[local-name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
	private WebElement edJob_jobLocationSave_icon;
	
	@FindBy(xpath="//div[@class='view-area']//div[4]//div[1]//div[1]//div[4]//*[local-name()='svg']")
	private WebElement edJob_jobLocationCancel_icon;
	
	@FindBy(xpath="//div[7]//div[1]//div[1]//div[3]//*[local-name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
	private WebElement edJob_jobOpeningsSave_icon;
	
	@FindBy(xpath="//div[7]//div[1]//div[1]//div[4]//*[local-name()='svg']")
	private WebElement edJob_jobOpeningsCancel_icon;
	
	@FindBy(xpath="//div[8]//div[1]//div[1]//div[3]//*[local-name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
	private WebElement edJob_jobPrioritySave_icon;
	
	@FindBy(xpath="//div[8]//div[1]//div[1]//div[4]//*[local-name()='svg']")
	private WebElement edJob_jobPriorityCancel_icon;
	
	@FindBy(xpath="//div[9]//div[1]//div[1]//div[3]//*[local-name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
	private WebElement edJob_jobResumeSave_icon;
	
	@FindBy(xpath="//div[9]//div[1]//div[1]//div[4]//*[local-name()='svg']")
	private WebElement edJob_jobResumeCancel_icon;
	
	@FindBy(xpath="//div[10]//div[1]//div[1]//div[3]//*[local-name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
	private WebElement edJob_jobSalarySave_icon;
	
	@FindBy(xpath="//div[10]//div[1]//div[1]//div[4]//*[local-name()='svg']")
	private WebElement edJob_jobSalaryCancel_icon;
	
	@FindBy(xpath="//div[11]//div[1]//div[1]//div[3]//*[local-name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
	private WebElement edJob_jobTypeSave_icon;
	
	@FindBy(xpath="//div[11]//div[1]//div[1]//div[4]//*[local-name()='svg']")
	private WebElement edJob_jobTypeCancel_icon;
	
	@FindBy(xpath="//div[12]//div[1]//div[1]//div[3]//*[local-name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
	private WebElement edJob_jobEmployeeSave_icon;
	
	@FindBy(xpath="//div[12]//div[1]//div[1]//div[4]//*[local-name()='svg']")
	private WebElement edJob_jobEmployeeCancel_icon;
	
	@FindBy(xpath="//div[13]//div[1]//div[1]//div[3]//*[local-name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
	private WebElement edJob_jobOwnerSave_icon;
	
	@FindBy(xpath="//div[13]//div[1]//div[1]//div[4]//*[local-name()='svg']")
	private WebElement edJob_jobOwnerCancel_icon;
	
	@FindBy(xpath="//div[14]//div[1]//div[1]//div[3]//*[local-name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
	private WebElement edJob_jobDepartSave_icon;
	
	@FindBy(xpath="//div[14]//div[1]//div[1]//div[4]//*[local-name()='svg']")
	WebElement edJob_jobDepartCancel_icon;
	
	@FindBy(xpath="//input[@placeholder='Select Recruiter']")
	private WebElement edJob_recruiter_dropDown;
	
	@FindBy(xpath="//div[6]//div[1]//div[1]//div[4]//*[local-name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
	private WebElement edJob_recruiterSave_icon;
	
	@FindBy(xpath="//div[6]//div[1]//div[1]//div[4]//*[local-name()='svg']")
	private WebElement edJob_recruiterCancel_icon;
	
	@FindBy(xpath="//div[@class='card-body']/div[5]/div[1]/div[1]/div[3]//*[local-name()='svg']")
	private WebElement edJob_hireManagerSave_icon;
	
	@FindBy(xpath="//div[5]//div[1]//div[1]//div[4]//*[local-name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
	private WebElement edJob_hireManagerCancel_icon;
	
	@FindBy(xpath ="//div[@class='card-body']//div[1]//div[1]//div[1]//div[3]//*[local-name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
	private WebElement edJob_saveChanges_icon;

	@FindBy(xpath = "//div[@class='card-body']//div[1]//div[1]//div[1]//div[4]//*[local-name()='svg']")
	private WebElement edJob_cancelChanges_icon;
	//
 //comments tab in job details page
 
 	@FindBy(xpath="//a[@class='nav-link']")
	private WebElement edJob_commentsTab_tab;
	
	@FindBy(xpath="//div[@placeholder='Enter text...']")
	private WebElement edJob_enterText_input;
	
	@FindBy(xpath="//input[@placeholder='Add participants']")
	private WebElement edJob_addParticipants_dropDown;
	
	@FindBy(xpath="//button[@class='btn btn-primary btn-sm post_button']")
	private WebElement edJob_postComments_button;
	
	//job description edit
	
	@FindBy(xpath="//div[@class='card-header']//div//div[@class='grid-floating-icon']//*[local-name()='svg']")
	private WebElement edJob_jobDescEdit_icon;
	
	@FindBy(xpath="//div[@placeholder='Enter text...']")
	private WebElement edJob_jobDescText_input;
	
	@FindBy(xpath="//div[@class='card-header']//div[2]//*[local-name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
	private WebElement edJob_jobDescSave_icon;
	
	@FindBy(xpath="//div[@class='card-header']//div[3]//*[local-name()='svg']")
	private WebElement edJob_jobDescCancel_icon;
	
	//delete button/refresh in homepage
	@FindBy(xpath="//button[@class='btn btn-danger btn-sm']")
	private WebElement edJob_deleteJob_button;
	
	@FindBy(xpath="//button[@class='btn refresh_btn btn-secondary btn-sm']")
	private WebElement edJob_refresh_button;
	
	@FindBy(xpath="//button[@class='btn btn-info btn-sm']")
	private WebElement edJob_filter_button;
	
	@FindBy(xpath="//select[@Class='adjust custom-select custom-select-sm']")
	private WebElement edJob_selectFilters_dropDown;
	
	@FindBy(xpath="//input[@placeholder='Enter keyword']")
	private WebElement edJob_enterKeyWord_input;
	
	@FindBy(xpath="//button[@class='btn btn-success btn-sm rounded-pill']")
	private WebElement edJob_applyFilter_button;
	
	@FindBy(xpath="//button[@class='btn btn-info btn-sm rounded-pill']")
	private WebElement edJob_addFilter_button;
	
	@FindBy(xpath="//div[@class='row adjust']//span[2]//select")
	private WebElement edJob_subFilter_dropDown;
	
	
	
	
	
	
	//page section
	
	@FindBy(xpath="//button[@class='btn page_btn radius-left btn-outline-info btn-sm disabled']//*[local-name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
	private WebElement edJob_firstPage_icon;
	
	@FindBy(xpath="//div[@class='mt-3']//button[2]//*[local-name()='svg']")
	private WebElement edJob_previousPage_icon;
	
	@FindBy(xpath="//button[contains(text(),'2')]")
	private WebElement edJob_pageNumber_button;
	
	@FindBy(xpath="//div[@class='mt-3']//button[3]//*[local-name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
	private WebElement edJob_nextpage_icon;
	
	@FindBy(xpath="//button[@class='btn page_btn radius-right btn-outline-info btn-sm']//*[local-name()='svg']")
	private WebElement edJob_lastPage_icon;
	
	@FindBy(xpath="//div[@class='multiselect__tags']")
	private WebElement edJob_multiSelect_dropDown;
	
	
	
	
	
	
	
	
	
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
		
	
	
		
		
		
	
		
		public WebElement getEdJob_subFilter_dropDown() {
		return edJob_subFilter_dropDown;
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


		public WebElement getEdJob_refresh_button() {
		return edJob_refresh_button;
	}

		public WebElement getEdJob_enterKeyWord_input() {
		return edJob_enterKeyWord_input;
	}

		public WebElement getEdJob_filter_button() {
		return edJob_filter_button;
	}

	public WebElement getEdJob_selectFilters_dropDown() {
		return edJob_selectFilters_dropDown;
	}


	public WebElement getEdJob_applyFilter_button() {
		return edJob_applyFilter_button;
	}

	public WebElement getEdJob_addFilter_button() {
		return edJob_addFilter_button;
	}


		public WebElement getEdJob_deleteJob_button() {
		return edJob_deleteJob_button;
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
	
	public WebElement getEdJob_jobTitleSave_icon() {
		return edJob_jobTitleSave_icon;
	}

	public WebElement getEdJob_jobTitleCancel_icon() {
		return edJob_jobTitleCancel_icon;
	}
	
	public WebElement getEdJob_jobLocationSave_icon() {
		return edJob_jobLocationSave_icon;
	}

	public WebElement getEdJob_jobLocationCancel_icon() {
		return edJob_jobLocationCancel_icon;
	}

	public WebElement getEdJob_jobOpeningsSave_icon() {
		return edJob_jobOpeningsSave_icon;
	}

	public WebElement getEdJob_jobOpeningsCancel_icon() {
		return edJob_jobOpeningsCancel_icon;
	}
	
	public WebElement getEdJob_jobPrioritySave_icon() {
		return edJob_jobPrioritySave_icon;
	}

	public WebElement getEdJob_jobPriorityCancel_icon() {
		return edJob_jobPriorityCancel_icon;
	}

	public WebElement getEdJob_jobResumeSave_icon() {
		return edJob_jobResumeSave_icon;
	}

	public WebElement getEdJob_jobResumeCancel_icon() {
		return edJob_jobResumeCancel_icon;
	}
	
	public WebElement getEdJob_jobCMSave_icon() {
		return edJob_jobCMSave_icon;
	}

	public WebElement getEdJob_jobCMCancel_icon() {
		return edJob_jobCMCancel_icon;
	}

	public WebElement getEdJob_jobSalarySave_icon() {
		return edJob_jobSalarySave_icon;
	}

	public WebElement getEdJob_jobSalaryCancel_icon() {
		return edJob_jobSalaryCancel_icon;
	}

	public WebElement getEdJob_jobTypeSave_icon() {
		return edJob_jobTypeSave_icon;
	}

	public WebElement getEdJob_jobTypeCancel_icon() {
		return edJob_jobTypeCancel_icon;
	}
	public WebElement getEdJob_jobEmployeeSave_icon() {
		return edJob_jobEmployeeSave_icon;
	}

	public WebElement getEdJob_jobEmployeeCancel_icon() {
		return edJob_jobEmployeeCancel_icon;
	}

	public WebElement getEdJob_jobOwnerSave_icon() {
		return edJob_jobOwnerSave_icon;
	}

	public WebElement getEdJob_jobOwnerCancel_icon() {
		return edJob_jobOwnerCancel_icon;
	}
	
	public WebElement getEdJob_jobDepartSave_icon() {
		return edJob_jobDepartSave_icon;
	}

	public WebElement getEdJob_jobDepartCancel_icon() {
		return edJob_jobDepartCancel_icon;
	}
	
	public WebElement getEdJob_recruiter_dropDown() {
		return edJob_recruiter_dropDown;
	}
	
	public WebElement getEdJob_recruiterSave_icon() {
		return edJob_recruiterSave_icon;
	}

	public WebElement getEdJob_recruiterCancel_icon() {
		return edJob_recruiterCancel_icon;
	}

	public WebElement getEdJob_hireManagerSave_icon() {
		return edJob_hireManagerSave_icon;
	}

	public WebElement getEdJob_hireManagerCancel_icon() {
		return edJob_hireManagerCancel_icon;
	}
	
	public WebElement getEdJob_saveChanges_icon() {
		return edJob_saveChanges_icon;
	}

	public WebElement getEdJob_cancelChanges_icon() {
		return edJob_cancelChanges_icon;
	}

	public WebElement getEdJob_commentsTab_tab() {
		return edJob_commentsTab_tab;
	}

	public WebElement getEdJob_enterText_input() {
		return edJob_enterText_input;
	}

	
	public WebElement getEdJob_addParticipants_dropDown() {
		return edJob_addParticipants_dropDown;
	}

	
	public WebElement getEdJob_postComments_button() {
		return edJob_postComments_button;
	}

	public WebElement getEdJob_multiSelect_dropDown() {
		return edJob_multiSelect_dropDown;
	}

	












	
	
	
	public EditJobPage(WebDriver driver) {
		super(driver);
	}
	
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
		WebElement Statusf=driver.findElement(By.xpath("//div[@class='grid-text']//span[contains(text(),'ACTIVE')]"));
		action.doubleClick(Statusf).perform();
		getEdJob_common_dropdown().click();
		Select Status =new Select(getEdJob_common_dropdown());
		Status.selectByVisibleText(status);
		Thread.sleep(3000);
		getEdJob_saveChanges_icon().click();
		getEdJob_cancelChanges_icon().click();
		}
	
	public void jobTitle(String title,String reqId) throws InterruptedException
	{
		Actions action=new Actions(driver);
		WebElement titlef=driver.findElement(By.xpath("//div[contains(text(),'789tester (3697896)')]"));
		action.doubleClick(titlef).perform();
		getEdJob_jobTitle_input().clear();
		getEdJob_jobTitle_input().sendKeys(title);
		getEdJob_requestId_inut().clear();
		getEdJob_requestId_inut().sendKeys(reqId);
		Thread.sleep(5000);
		//getEdJob_jobTitleSave_icon().click();
		getEdJob_jobTitleCancel_icon().click();
		Thread.sleep(3000);

}
	
	public void clientManager(String client) throws Exception
	{
		Actions action=new Actions(driver);
		WebElement clientf=driver.findElement(By.xpath("//div[contains(text(),'Ssc')]"));
		action.doubleClick(clientf).perform();
		Thread.sleep(3000);
		getEdJob_clientManager_input().clear();
		getEdJob_clientManager_input().sendKeys(client);
		//getEdJob_jobCMSave_icon().click();
		Thread.sleep(2000);
		getEdJob_jobCMCancel_icon().click();
		Thread.sleep(3000);
	}
	
	public void jobLocation(String city,String state,String zip,String country) throws Exception
	{
		Actions action=new Actions(driver);
		WebElement locationf=driver.findElement(By.xpath("//div[contains(text(),'4 ap')]"));
		action.doubleClick(locationf).perform();
		Thread.sleep(3000);
		getEdjob_city_input().clear();
		getEdjob_city_input().sendKeys(city);
		getEdJob_state_input().clear();
		getEdJob_state_input().sendKeys(state);
		getEdJob_zip_input().clear();
		getEdJob_zip_input().sendKeys(zip);
		getEdJob_country_input().clear();
		getEdJob_country_input().sendKeys(country);
		Thread.sleep(3000);
		getEdJob_jobLocationSave_icon().click();
		//getEdJob_jobLocationCancel_icon().click();
		Thread.sleep(3000);

		}
	
	public void hiringManager(String hiremanager) throws InterruptedException
	{
		Actions action=new Actions(driver);
		WebElement hiremanagerf=driver.findElement(By.xpath("//div[5]//div[2]//div[1]//div[1]"));
		action.doubleClick(hiremanagerf).perform();
		getEdJob_managerRecruiter_dropDown().click();
		getEdJob_managerRecruiter_dropDown().sendKeys(hiremanager);
		getEdJob_hireManagerSave_icon().click();
		getEdJob_hireManagerCancel_icon().click();
		Thread.sleep(3000);
	}
	
	public void recruiter(String Recruiter) throws InterruptedException
	{
		
		Actions action=new Actions(driver);
		WebElement recruiterf=driver.findElement(By.xpath("//div[6]//div[2]//div[1]//div[1]"));
		action.doubleClick(recruiterf).perform();
		driver.findElement(By.xpath("//i[@class='multiselect__tag-icon']")).click();
		getEdJob_recruiter_dropDown().click();
		getEdJob_recruiter_dropDown().sendKeys(Recruiter);
		getEdJob_recruiter_dropDown().sendKeys(Keys.ENTER);
		
		//getEdJob_recruiterSave_icon().click();
		getEdJob_recruiterCancel_icon().click();
		Thread.sleep(3000);
		
		
		}
	
	public void openings(String openings) throws Exception
	{
		Actions action=new Actions(driver);
		WebElement openingsf=driver.findElement(By.xpath("//div[contains(text(),'1')]"));
		action.doubleClick(openingsf).perform();
		getEdJob_noOfOpening_input().clear();
		getEdJob_noOfOpening_input().sendKeys(openings);
		Thread.sleep(3000);
		getEdJob_jobOpeningsSave_icon().click();
		//getEdJob_jobOpeningsCancel_icon().click();
		Thread.sleep(3000);


	}
	
	public void priority() throws Exception
	{
		Actions action=new Actions(driver);
		WebElement priorityf=driver.findElement(By.xpath("//div[8]//div[2]//div[1]//div[1]"));
		action.doubleClick(priorityf).perform();
		getEdJob_commonToggle_toggleBtn().click();
		Thread.sleep(3000);
		//getEdJob_jobPrioritySave_icon().click();
		getEdJob_jobPriorityCancel_icon().click();
		Thread.sleep(5000);
	}
		
	public void resume() throws InterruptedException
	{
		Actions action=new Actions(driver);
		WebElement resumef=driver.findElement(By.xpath("//div[9]//div[2]//div[1]//div[1]"));
		action.doubleClick(resumef).perform();
		getEdJob_commonToggle_toggleBtn().click();
		Thread.sleep(3000);
		//getEdJob_jobResumeSave_icon().click();
		getEdJob_jobResumeCancel_icon().click();
		Thread.sleep(3000);
		
	}
	public void salary(String Currency,String Salary,String salType) throws InterruptedException
	{
		
		Actions action=new Actions(driver);
		WebElement salaryf=driver.findElement(By.xpath("//div[contains(text(),'INR 4')]"));
		action.doubleClick(salaryf).perform();
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
		getEdJob_jobSalarySave_icon().click();
		//getEdJob_jobSalaryCancel_icon().click();
		Thread.sleep(3000);
		}
	
	public void jobType(String jobtype)
	{
		Actions action=new Actions(driver);
		WebElement jobTypef=driver.findElement(By.xpath("//div[contains(text(),'Contract')]"));
		action.doubleClick(jobTypef).perform();
		getEdJob_common_dropdown().click();
		Select type=new Select(getEdJob_common_dropdown());
		type.selectByVisibleText(jobtype);
		//getEdJob_jobTypeSave_icon().click();
		getEdJob_jobTypeCancel_icon().click();
		
	}
	
	public void employementType(String etype)
	{
		Actions action=new Actions(driver);
		WebElement empTypef=driver.findElement(By.xpath("//div[contains(text(),'Full time')]"));
		action.doubleClick(empTypef).perform();
		getEdJob_common_dropdown().click();
		Select emptype=new Select(getEdJob_common_dropdown());
		emptype.selectByVisibleText(etype);
		getEdJob_jobEmployeeSave_icon().click();
		getEdJob_jobEmployeeCancel_icon().click();
		
	}
	
	public void owner(String Owner) throws InterruptedException
	{
		Actions action=new Actions(driver);
		WebElement ownerf=driver.findElement(By.xpath("//div[contains(text(),'Supriya Annam')]"));
		action.doubleClick(ownerf).perform();
		getEdJob_common_dropdown().click();
		Select own=new Select(getEdJob_common_dropdown());
		own.selectByVisibleText(Owner);
		Thread.sleep(3000);
		getEdJob_jobOwnerSave_icon().click();
		//getEdJob_jobOwnerCancel_icon().click();
		Thread.sleep(3000);
		
		
	}

	public void department(String department) throws InterruptedException
	{
		Actions action=new Actions(driver);
		WebElement departmentf=driver.findElement(By.xpath("//div[contains(text(),'Admin Department')]"));
		action.doubleClick(departmentf).perform();
		getEdJob_common_dropdown().click();
		Select depart=new Select(getEdJob_common_dropdown());
		depart.selectByVisibleText(department);
		Thread.sleep(3000);
		//getEdJob_jobDepartSave_icon().click();
		getEdJob_jobDepartCancel_icon().click();
		Thread.sleep(5000);
		
		
	}
	
	public void deleteJob()
	{
		int i=0;
		System.out.println("The selected record to be deleted is" +i+ " st record");
		
		for(int j=0;j<=i;j++)
		{
			driver.findElement(By.xpath("//div[@col-id='job_title']//span[1]/span[2]")).click();
			getEdJob_deleteJob_button().click();
			driver.switchTo().alert().accept();
			//driver.switchTo().alert().dismiss();
			
							
		}
		
			
	}
	
		
	public void filters(String filterOptions,String subOptions,String keyword)
	{
		getEdJob_filter_button().click();
		getEdJob_selectFilters_dropDown().click();
		Select option =new Select(getEdJob_selectFilters_dropDown());
		option.selectByValue(filterOptions);
		getEdJob_subFilter_dropDown().click();
		Select subOption =new Select(getEdJob_subFilter_dropDown());
		subOption.selectByValue(subOptions);
		getEdJob_enterKeyWord_input().sendKeys(keyword);
		getEdJob_applyFilter_button().click();
		getEdJob_addFilter_button().click();
	}
	
	public void refresh() throws InterruptedException
	{
		getEdJob_refresh_button().click();
		Thread.sleep(2000);
	}
	
	public void commentsTab(String text,String participant) throws InterruptedException
	{
		Thread.sleep(10000);
		getEdJob_commentsTab_tab().click();
		Thread.sleep(2000);
		getEdJob_enterText_input().sendKeys(text);
		getEdJob_multiSelect_dropDown().click();
		Thread.sleep(2000);
		getEdJob_addParticipants_dropDown().sendKeys(participant);
		getEdJob_addParticipants_dropDown().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		getEdJob_postComments_button().click();
		Thread.sleep(2000);
	}
	
	public void jobDescription(String enterText) throws InterruptedException
	{
		Thread.sleep(5000);
		getEdJob_jobDescEdit_icon().click();
		getEdJob_jobDescText_input().sendKeys(Keys.CLEAR);
		getEdJob_jobDescText_input().sendKeys(enterText);
		//getEdJob_jobDescSave_icon().click();
		getEdJob_jobDescCancel_icon().click();
		Thread.sleep(3000);

	}
	
	}
	



