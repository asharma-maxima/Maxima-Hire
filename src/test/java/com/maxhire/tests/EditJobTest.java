package com.maxhire.tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.maxhire.pages.EditJobPage;
import com.maxhire.pages.LoginPage;

public class EditJobTest extends BaseTest {


	@BeforeTest
	public void login() throws InterruptedException {
		Thread.sleep(4000);
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login(username, password);
		Thread.sleep(3000);
		loginPage.verifyLoginPageTitle("maxhire");
		
	}
	
	@Test
	
	public void EdJob() throws Exception
	{
	
		EditJobPage EdJob=new EditJobPage(driver);
		EdJob.jobDetails();
		//EdJob.editJobDetails();
		Thread.sleep(3000);
		//EdJob.jobStatus("Hold");
		//EdJob.jobTitle("development", "741");
		//EdJob.clientManager("SSC1");
		//EdJob.jobLocation("vizag", "AP","745869", "India");
		//EdJob.hiringManager("Supriya Annam");
		//EdJob.recruiter("Supriya Annam");
		//EdJob.openings("3");
		//EdJob.priority();
		//EdJob.resume();
		//EdJob.salary("INR", "5", "Monthly");
		//EdJob.jobType("Intern");
		//EdJob.owner("Supriya Annam");
		//EdJob.department("Product Development");
		//EdJob.deleteJob();
		//EdJob.filters("1", "istartswith", "sel");
		//EdJob.commentsTab("add job", "Supriya Annam");
		//EdJob.jobDescription("description");
		EdJob.refresh();

		
		

		
	}
	

}
