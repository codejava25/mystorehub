package Google;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Youtube {
	 public static void main(String[]args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.navigate().to("https://www.google.co.in/");
		  driver.findElement(By.name("q")).sendKeys("YouTube");
		  Thread.sleep(3000);
		  driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
		  Thread.sleep(3000);
		  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		  Thread.sleep(3000);
	      driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div[1]/a/h3")).click();
	     // Actions ac = new Actions(driver);
	      //ac.moveToElement(driver.findElement(By.name("search_query"))).perform();
	      Thread.sleep(3000);
	      driver.findElement(By.name("search_query")).sendKeys("jesus songs");
	      driver.findElement(By.name("search_query")).sendKeys(Keys.ENTER);
	      Thread.sleep(3000);
	      //driver.findElement(By.xpath("//*[@id=\"mouseover-overlay\"]")).click();
	      Actions ac = new Actions(driver);
	      ac.moveToElement(driver.findElement(By.name("//*[@id=\\\"mouseover-overlay\\\"]"))).perform();
	  }
}
