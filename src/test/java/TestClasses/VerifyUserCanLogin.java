package TestClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.BaseClass1;
import PomClass.HomePage;
import PomClass.LoginPage;

public class VerifyUserCanLogin {
	WebDriver driver;
	LoginPage lP ;
	HomePage hp;
	
	@BeforeClass
	public void beforeClass() throws IOException
	{
		driver = BaseClass1.getDriver("chrome");
	}
		
	@BeforeMethod
	public void beforeMethod()
	{
	     lP = new LoginPage(driver);
		 hp = new HomePage(driver);
	}
	
	@Test
	public  void testClass(){
		lP.EntreEmail();
		lP.entrePassword();
		lP.clickLogin();
		
	    hp.clickOnProfileText();
	}
	
	@AfterMethod
	public void afterMethod()
	{
	  
	}
	
	
	@AfterClass
	public void afterClass()
	{
		driver.quit();
	}	

}
