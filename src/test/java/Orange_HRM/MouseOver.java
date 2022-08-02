package Orange_HRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
  public static void main(String[]args) {
	  System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://183.82.103.245/nareshit");
	  System.out.println(driver.getTitle());
	  driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	  driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	  driver.findElement(By.name("Submit")).click();
	  System.out.println("Login Completed");
	 // driver.switchTo().frame("rightMenu");
	  Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
		driver.findElement(By.linkText("Add Employee")).click();
	  //driver.findElement(By.xpath("//input[@value='Add']"));
	  //driver.findElement(By.id("txtEmpFirstName")).sendKeys("Hephzibah");
	  //driver.findElement(By.id("txtEmpLastName")).sendKeys("keerthi");
	  //driver.findElement(By.id("btnEdit")).click();
	 // driver.switchTo().defaultContent();
	  driver.findElement(By.linkText("Logout")).click();
	  driver.close();
  }
}
