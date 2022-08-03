package com.hrms.testCases;

import org.testng.annotations.Test;

import com.hrms.pageObjects.LoginPage;

public class TC_LoginTest_001  extends BaseClass {
	@Test
	public void loginTest() {
		driver.get(URL);
		
		LoginPage lp= new LoginPage(driver);
		lp.setUserName(username);
		
		lp.setPassword(password);
		
		lp.clickSubmit();
	   if(driver.getTitle().equals("OrangeHRM")){
		   System.out.println("Title matched");
		   
	   }
	   else {
		   System.out.println("Title Not matched"); 
		   System.out.println(driver.getTitle());
	   }
	}

}
