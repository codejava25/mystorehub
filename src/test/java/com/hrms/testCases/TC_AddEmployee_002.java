package com.hrms.testCases;


import org.testng.Reporter;
import org.testng.annotations.Test;

import com.hrms.pageObjects.AddNewEmployee;
import com.hrms.pageObjects.LoginPage;



public class TC_AddEmployee_002 extends BaseClass{
	@Test
	public void addNewEmpoyee() throws InterruptedException {
		driver.get(URL);
		LoginPage lp= new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		Thread.sleep(3000);
		
		AddNewEmployee aemp=new AddNewEmployee(driver);
				
		aemp.enterFrame();
        System.out.println("Enter into Frame");
        Reporter.log("Enter into Frame");  
        logger.info("Enter into Frame");
        Thread.sleep(3000);
		aemp.addEmployee();
		System.out.println("Clicked Add Button");
		 Reporter.log("Clicked Add Button");
	        logger.info("Clicked Add Button");
		
		Thread.sleep(3000);
		aemp.setFirstName();
		System.out.println("Enter First Name");
		 Reporter.log("Enter First Name");
	        logger.info("Enter First Name");
		
		Thread.sleep(3000);
		
		aemp.setLastName();
		System.out.println("Enter Last Name");
		 Reporter.log("Enter Last Name");
	        logger.info("Enter Last Name");
		Thread.sleep(3000);
		
		aemp.setMiddleName();
		System.out.println("Enter Middle Name");
		 Reporter.log("Enter Middle Name");
	        logger.info("Enter Middle Name");
		
		Thread.sleep(3000);
		
	     aemp.setNickName();
	     System.out.println("Enter Nick Name");
		 Reporter.log("Enter Nick Name");
	        logger.info("Enter Nick Name");
	     Thread.sleep(3000);
	     
		aemp.photiFile();
		System.out.println("Photo Added Succesfully");
		 Reporter.log("Photo Added Succesfully");
	        logger.info("Photo Added Succesfully");
		Thread.sleep(3000);
		
		aemp.submit();
		System.out.println("Clicked on Save");
		 Reporter.log("Clicked on Save");
	        logger.info("Clicked on Save");
		Thread.sleep(3000);
		
		aemp.exitFrame();
		System.out.println("Exit from Frame");
		 Reporter.log("Exit from Frame");
	        logger.info("Exit from Frame");	
	}

	

}
