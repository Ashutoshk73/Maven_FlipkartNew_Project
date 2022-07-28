package PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityClass.UtilClass1;

public class ProfilePage extends UtilClass1 {
	WebDriver driver;
	@FindBy(xpath=("//div[@class='_1ruvv2']"))	
	private WebElement profileFullName;


	public ProfilePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	public boolean getFullProfileName(){
		
		 explicitWait(driver, profileFullName);
		
		String pName = (profileFullName.getText());
		if(pName.equals("Ashutosh Hanmantrao Kurulekar"))
		{
			return true ;
		}
		return false;

}}
