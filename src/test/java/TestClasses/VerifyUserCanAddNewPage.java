package TestClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.BaseClass1;
import PomClass.HomePage;
import PomClass.ProfilePage;

public class VerifyUserCanAddNewPage {
	WebDriver driver ;
	
	
	 HomePage hP ;
	
	@BeforeClass
	public void beforeClass() throws IOException
	{
		driver = BaseClass1.getDriver("chrome");
	}
		
	@BeforeMethod
	public void beforeMethod()
	{
	  	 hP = new HomePage(driver);
	}
	
	@Test
	public  void testClass(){
		hP.moveToProfileName();
		hP.clickOnProfileText();
		
		ProfilePage pP = new ProfilePage(driver);
		
		Assert.assertTrue(pP.getFullProfileName());
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
