package com.hrms.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewEmployee {
	WebDriver idriver;
	public AddNewEmployee(WebDriver rdriver) {
		idriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}

// added	
	
	@FindBy(xpath = "//input[@value='Add'][@type='button']")
	WebElement addemp;
	@FindBy(name= "txtEmpFirstName")
	WebElement txtFN;
	@FindBy(xpath = "//input[@id='txtEmpLastName']")
	WebElement txtLN;
	@FindBy(id = "txtEmpMiddleName")
	WebElement txtMN;
	@FindBy(name = "txtEmpNickName")
	WebElement txtNN;
	
	@FindBy(id = "photofile")
	WebElement phfile;
	@FindBy(id = "btnEdit")
	WebElement btnedit;
	
	public void enterFrame() {
		idriver.switchTo().frame("rightMenu");
	}
	
	public void addEmployee() {
		addemp.click();
	}
	public void setFirstName() {
		txtFN.sendKeys("naga");	
	}
	public void setLastName() {
		txtLN.sendKeys("Kongala");	
	}
	public void setMiddleName() {
		txtMN.sendKeys("raju");	
	}
	public void setNickName() {
		txtNN.sendKeys("Raj");	
	}
	
	public void photiFile() {
		
		phfile.sendKeys("D:\\IMG.jpg");	
	}
	public void submit() {
		btnedit.click();	
	}
	public void exitFrame() {
		idriver.switchTo().defaultContent();
	}
}
