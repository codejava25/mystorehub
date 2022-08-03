package com.hrms.testCases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public String URL = "http://183.82.103.245/nareshit/login.php";
	public String username="nareshit";
	public String password="nareshit";
	public static WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","D:\\driver\\chromedriver.exe");
		driver= new ChromeDriver();
		
        
	}
	@AfterClass
    public void tearDown() {
    	driver.quit();
    }
}
