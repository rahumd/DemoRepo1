package com.frm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.frm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//PAgeFactory or Object REpos
	
	@FindBy(xpath="//input[@name='username']")
			WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement submit;
	
	@FindBy(xpath="//button[contains(text(),'Sign Up')]")
	WebElement signup;
	
	@FindBy(xpath="//img[contains(@class,'img-responsive')]")
	WebElement crmLogo;
	
	
	//Initiliazing PAge factory
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	//Actions/methods
	public String validatePageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateCRMImage() {
		return crmLogo.isDisplayed();
	}
	
	public HomePage login(String uname,String pwd) {
		username.sendKeys(uname);
		username.sendKeys(pwd);
		submit.click();
		
		return new HomePage();
	}
	
	
	
}
