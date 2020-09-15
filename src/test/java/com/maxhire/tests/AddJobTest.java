package com.maxhire.tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.maxhire.pages.AddJobPage;
import com.maxhire.pages.LoginPage;

public class AddJobTest extends BaseTest {

	@BeforeTest
	public void login() throws InterruptedException {
		Thread.sleep(4000);
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login(username, password);
		Thread.sleep(3000);
		loginPage.verifyLoginPageTitle("maxhire");
		
	}
	
	@Test
	public void addJob() throws InterruptedException
	{
		AddJobPage addJob=new AddJobPage(driver);
		addJob.addNewJob();
		Thread.sleep(2000);
		addJob.jobDetails("Miss", "2", "1458", "Intern");
		addJob.employmentType("Full time");
		addJob.selectOwner(0);
		addJob.salaryDetails("INR", "4", "Annually");
		addJob.department("IT Services");
		addJob.clientManager("Apple");
		addJob.priorityResume();
		addJob.address("bangalore", "KA", "514236", "India");
		addJob.selectHiringManager("Supriya Annam");
		addJob.selectRecruiter("Supriya Annam");
		addJob.jobDescription("desc");
		addJob.submit();
		addJob.messages();
		
		

	}

}
