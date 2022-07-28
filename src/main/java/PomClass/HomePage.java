package PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityClass.UtilClass1;

public class HomePage extends UtilClass1{
WebDriver driver ;
	
	@FindBy(xpath="//div[text()='Ashutosh Hanmantrao Kurulekar']")
	private WebElement profileName;

	@FindBy(xpath="(//li[@class='_2NOVgj'])[1]")
	private WebElement myProfileText;

	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public boolean getProfileName() throws InterruptedException
	{
		Thread.sleep(1000);
		explicitWait(driver, profileName);
		String pName = (profileName.getText());
		
		if(pName.equals("Ashutosh Hanmantrao Kurulekar")){
			return true ;
		}
		else{ 
			return false;
		}}
		
	public void moveToProfileName()
	{
		Actions act = new Actions(driver);
		act.moveToElement(profileName).perform();
	}

	public void clickOnProfileText()
	{
		WebElement element = explicitWait(driver, myProfileText);
		element.click();
	}


}
