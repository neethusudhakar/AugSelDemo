package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {
	
	public LoginPage(){
		//This is Constructor: starting point for java
		PageFactory.initElements(driver, this);	
	}
	
	@CacheLookup
	@FindBy(id="username")
	WebElement eleUserName;
	
	@CacheLookup
	@FindBy(id="password")
	WebElement elePassword;
	
	@FindBy(className="decorativeSubmit")
	WebElement eleLogin;
	
	public LoginPage enterUserName(String userName) {
		clearAndType(eleUserName, userName);
		return this;	
	}
	
	public LoginPage enterPassword(String password) {
		clearAndType(elePassword, password);
		return this;	
	}

	public HomePage clickLogin() {
	click(eleLogin);
	return new HomePage();
	
}

}
