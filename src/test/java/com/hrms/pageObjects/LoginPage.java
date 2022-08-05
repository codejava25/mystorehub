package com.hrms.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver Idriver;
	
	 public LoginPage(WebDriver rdriver){
		Idriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(name="txtUserName")
	WebElement loginName;
	@FindBy(name="txtPassword")
	WebElement password;
	@FindBy(name="Submit")
	WebElement btnlogin;
	
	public void setUserName(String uname) {
		loginName.sendKeys(uname);
	}
	public void setPassword(String pwd) {
		password.sendKeys(pwd);
	}
	public void clickSubmit() {
		btnlogin.click();
	}
}
