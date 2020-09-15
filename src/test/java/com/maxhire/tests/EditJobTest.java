package com.maxhire.tests;

import org.openqa.selenium.support.ui.Select;
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
		EdJob.editJobDetails();
		EdJob.jobStatus("Active");
		EdJob.jobTitle("testing", "51");
		EdJob.clientManager("SSC1");
		EdJob.jobLocation("vizag", "AP","745869", "India");
		EdJob.hiringManager("sarvesh k");
		EdJob.recruiter("sarvesh k");
		EdJob.openings("3");
		EdJob.priority();
		EdJob.resume();
		EdJob.salary("INR", "5", "Monthly");
		EdJob.jobType("Intern");
		EdJob.employementType("Part time");
		EdJob.owner("sarvesh k");
		EdJob.department("Product Development");
		EdJob.filters("0", "After Date", null,null,"15-March-2020");
		EdJob.commentsTab("add job", "Supriya Annam");
		EdJob.jobDescription("description");
		EdJob.refresh();
		EdJob.deleteJob();

		
		

		
	}
	

}
