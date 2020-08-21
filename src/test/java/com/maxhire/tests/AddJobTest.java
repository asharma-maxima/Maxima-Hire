package com.maxhire.tests;

import org.testng.Assert;
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
		Thread.sleep(3000);
		addJob.addNewJob();
		Thread.sleep(3000);
		addJob.jobDetails("Miss", "2", "1458", "Intern");
		Thread.sleep(3000);
		addJob.employmentType("Full time");
		Thread.sleep(3000);
		addJob.selectOwner(0);
		Thread.sleep(3000);
		addJob.salaryDetails("INR", "4", "Annually");
		Thread.sleep(3000);
		addJob.department("IT Services");
		Thread.sleep(3000);
		addJob.clientManager("Apple");
		Thread.sleep(3000);
		addJob.priorityResume();
		Thread.sleep(3000);
		addJob.address("bangalore", "KA", "514236", "India");
		Thread.sleep(3000);
		addJob.selectHiringManager("Supriya Annam");
		Thread.sleep(3000);
		addJob.selectRecruiter("Supriya Annam");
		Thread.sleep(3000);
		addJob.jobDescription("desc");
		Thread.sleep(3000);
		addJob.submit();
		Thread.sleep(3000);
		addJob.messages();	
	}

}
