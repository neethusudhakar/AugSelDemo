package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods  {
	
	public HomePage(){
		//This is Constructor: starting point for java
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(className="decorativeSubmit")
	WebElement eleLogin;
	
	@CacheLookup
	@FindBy(linkText="CRM/SFA")
	WebElement eleCrmsfa;

	public LoginPage clickLogout() {
		click(eleLogin);
		return new LoginPage();
	}
	
	
	public MyHomePage clickCRMSFA() {
		click(eleCrmsfa);
		return new MyHomePage();
	}

}
