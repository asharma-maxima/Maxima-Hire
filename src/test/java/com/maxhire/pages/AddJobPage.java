package com.maxhire.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AddJobPage extends BasePage{
	
	@FindBy(xpath="//input[@placeholder='Enter Job Title']")
	private WebElement job_Title_input;
	
	@FindBy(xpath="//input[@placeholder='No. of openings']")
	private WebElement job_Openings_input;
	
	@FindBy(xpath="//input[@placeholder='Enter Required ID']")
	private WebElement job_requiredID_input;
	
	@FindBy(xpath="//div[text()='Job Type']//following-sibling::select")
	private WebElement job_jobType_dropDown;
	
	@FindBy(xpath="//div[text()='Employment Type']//following-sibling::select")
	private WebElement job_employmentType_dropDown;
	
	@FindBy(xpath="//div[text()='Owner']//following-sibling::select")
	private WebElement job_Owner_dropDown;
	
	@FindBy(xpath="//input[@placeholder='Currency']")
	private WebElement job_Currency_input;
	
	@FindBy(xpath="//input[@placeholder='Offered Salary']")
	private WebElement job_offeredSalary_input;
	
	@FindBy(xpath="//div[@for='salary_type']//following-sibling::select")
	private WebElement job_salaryType_dropDown;
	
	@FindBy(xpath="//div[text()='Department']//following-sibling::select")
	private WebElement job_Department_dropDown;
	
	@FindBy(xpath="//label[contains(text(),'High Priority')]")
	private WebElement job_highPriority_checkBox;
	
	@FindBy(xpath="//input[@placeholder='Enter Client Manager']")
	private WebElement job_clientManager_input;
	
	@FindBy(xpath="//label[contains(text(),'Resume Required')]")
	private WebElement job_resumeRequired_checkBox;
	
	@FindBy(xpath="//input[@placeholder='City name']")
	private WebElement job_City_input;
	
	@FindBy(xpath="//input[@placeholder='State name']")
	private WebElement job_State_input;
	
	@FindBy(xpath="//input[@placeholder='Zip code']")
	private WebElement job_zipcode_input;
	
	@FindBy(xpath="//input[@placeholder='Type Country']")
	private WebElement job_country_input;
	
	@FindBy(xpath="//input[@placeholder='Select Hiring Manager']")
	private WebElement job_hiringManager_dropDown;
	
	@FindBy(xpath="//input[@placeholder='Select Recruiter']")
	private WebElement job_Recruiter_dropDown;
	
	@FindBy(xpath="//textarea[@placeholder='Job description, if any!']")
	private WebElement job_Description_input;
	
	@FindBy(xpath="//button[@class='btn btn-primary btn-sm']")
	private WebElement job_Submit_button;
	
	@FindBy(xpath = "//div[text()='SUCCESS']")
	private WebElement job_success_message;

	@FindBy(xpath = "//div[contains(text(),'Created successfully!')]")
	private WebElement job_jobCreatedSuccessfully_message;
	
	@FindBy(xpath="//div/div/span[contains(text(),'Select Hiring Manager')]")
	private WebElement job_selectHiringManager_dropDown;

	@FindBy(xpath = "//div/div/span[contains(text(),'Select Recruiter')]")
	private WebElement job_selectRecruiter_dropDown;

	

	
	public WebElement getJob_selectHiringManager_dropDown() {
		return job_selectHiringManager_dropDown;
	}

	public WebElement getJob_selectRecruiter_dropDown() {
		return job_selectRecruiter_dropDown;
	}

	public WebElement getJob_Title_input() {
		return job_Title_input;
	}

	public WebElement getJob_Openings_input() {
		return job_Openings_input;
	}

	public WebElement getJob_requiredID_input() {
		return job_requiredID_input;
	}
	
	public WebElement getJob_jobType_dropDown() {
		return job_jobType_dropDown;
	}

	public WebElement getJob_employmentType_dropDown() {
		return job_employmentType_dropDown;
	}

	public WebElement getJob_Owner_dropDown() {
		return job_Owner_dropDown;
	}
	
	public WebElement getJob_Currency_input() {
		return job_Currency_input;
	}

	public WebElement getJob_offeredSalary_input() {
		return job_offeredSalary_input;
	}

	public WebElement getJob_salaryType_dropDown() {
		return job_salaryType_dropDown;
	}

	public WebElement getJob_Department_dropDown() {
		return job_Department_dropDown;
	}

	public WebElement getJob_highPriority_checkBox() {
		return job_highPriority_checkBox;
	}

	public WebElement getJob_clientManager_input() {
		return job_clientManager_input;
	}

	public WebElement getJob_resumeRequired_checkBox() {
		return job_resumeRequired_checkBox;
	}

	public WebElement getJob_City_input() {
		return job_City_input;
	}

	public WebElement getJob_State_input() {
		return job_State_input;
	}

	public WebElement getJob_zipcode_input() {
		return job_zipcode_input;
	}

	public WebElement getJob_country_input() {
		return job_country_input;
	}

	public WebElement getJob_hiringManager_dropDown() {
		return job_hiringManager_dropDown;
	}

	public WebElement getJob_Recruiter_dropDown() {
		return job_Recruiter_dropDown;
	}

	public WebElement getJob_Description_input() {
		return job_Description_input;
	}

	public WebElement getJob_Submit_button() {
		return job_Submit_button;
	}

	public WebElement getJob_success_message() {
		return job_success_message;
	}

	public WebElement getJob_jobCreatedSuccessfully_message() {
		return job_jobCreatedSuccessfully_message;
	}
	
	public void addNewJob()
	{
		
		bas_add_button.click();

		bas_addJob_icon.click();
	}
	public void jobDetails(String title,String openings,String id,String jobType) throws InterruptedException
	{
		getJob_Title_input().sendKeys(title);
		getJob_Openings_input().sendKeys(openings);
		getJob_requiredID_input().sendKeys(id);
		getJob_jobType_dropDown().click();
		Select jobTypeSelect = new Select(getJob_jobType_dropDown());
		jobTypeSelect.selectByVisibleText(jobType);
		
	}
		
	public void employmentType(String emptype)
	{
		getJob_employmentType_dropDown().click();
		Select employmentTypeSelect = new Select(getJob_employmentType_dropDown());
		employmentTypeSelect.selectByVisibleText(emptype);
		
	}
		
	public void selectOwner(int owner)
	{
		getJob_Owner_dropDown().click();
		Select ownerSelect = new Select(getJob_Owner_dropDown());
		ownerSelect.selectByIndex(owner);
		
	}
	
	public void salaryDetails(String currency,String offeredSalary,String salaryType)
	{
		getJob_Currency_input().sendKeys(currency);
		getJob_Currency_input().sendKeys(Keys.ENTER);
		getJob_offeredSalary_input().sendKeys(offeredSalary);
		getJob_salaryType_dropDown().click();
		Select salaryTypeSelect = new Select(getJob_salaryType_dropDown());
		salaryTypeSelect.selectByVisibleText(salaryType);
		
	}
	public void department(String department)
	{
		getJob_Department_dropDown().click();
		Select departmentSelect = new Select(getJob_Department_dropDown());
		departmentSelect.selectByVisibleText(department);
		
	}
	public void clientManager(String clientMgr)
	{
		getJob_clientManager_input().sendKeys(clientMgr);		
	}
	public void priorityResume()
	{
		getJob_highPriority_checkBox().click();
		getJob_resumeRequired_checkBox().click();

	}
	public void address(String city,String state,String zipcode,String country )
	{
		getJob_City_input().sendKeys(city);
		getJob_State_input().sendKeys(state);
		getJob_zipcode_input().sendKeys(zipcode);
		getJob_country_input().sendKeys(country);
		

	}
	
	public void selectHiringManager(String hireManager)
	{
		getJob_selectHiringManager_dropDown().click();
		getJob_hiringManager_dropDown().sendKeys(hireManager);
		getJob_hiringManager_dropDown().sendKeys(Keys.ENTER);
		
	}
		
	public void selectRecruiter(String recruiter)
	{
		
		getJob_selectRecruiter_dropDown().click();
		getJob_Recruiter_dropDown().sendKeys(recruiter);
		getJob_Recruiter_dropDown().sendKeys(Keys.ENTER);
		
	}
	
	public void jobDescription(String description)
	{
		getJob_Description_input().sendKeys(description);
	}
	
	public void submit()
	{
		
		getJob_Submit_button().click();
		
	}
	
	public void messages()
	{
		Assert.assertTrue(job_success_message.isDisplayed());
		Assert.assertTrue(job_jobCreatedSuccessfully_message.isDisplayed());
		System.out.println("=====Submitted New Job Successfully=====");
		
	}

	public AddJobPage(WebDriver driver) {
		super(driver);
		
	}
	
	
	
	
		
	
	
	
	
	
	}




