package MavenPrograms;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Gmail {
	
	public WebDriver driver;
	
  @Test
  public void register() {
	  

		driver.findElement(By.id("firstname")).sendKeys("Bharath");
		
		driver.findElement(By.id("//*[@id=\"username\"]")).sendKeys("bharath@gmail.com");
		
		driver.findElement(By.name("Passwd")).sendKeys("Bharath@123");
		
		driver.findElement(By.name("ConfirmPasswd")).sendKeys("Bharath@123");
		
		driver.findElement(By.id("//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1"));
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	 WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  
	  
	  
  }

}
