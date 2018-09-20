package com.frm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.frm.qa.base.TestBase;
import com.frm.qa.pages.HomePage;
import com.frm.qa.pages.LoginPage;



public class LoginPageTest extends TestBase {
	
	LoginPage loginpage;
	HomePage homepage;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initilization();
		
		loginpage= new LoginPage();
			
	}
	
	
	@Test(priority=1)
	public void loginPageTitleTest() {
		String title = loginpage.validatePageTitle();
		Assert.assertEquals(title, "CRM","Title is incorrect");
	}
	
	@Test(priority=2)
	public void crmLogoImageTest() {
		Boolean flag = loginpage.validateCRMImage();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void loginTest() {
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
