package PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityClass.UtilClass1;



public class LoginPage extends UtilClass1 {
	
	WebDriver driver;
	
	@FindBy(xpath=("(//input[@type='text'])[2]"))
    private WebElement Emailid ;
    
    @FindBy(xpath="//input[@type='password']")
	private WebElement password;
    
    @FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement loginButton;
    
    public LoginPage(WebDriver driver){
    PageFactory.initElements(driver, this);
    this.driver = driver;
    }
    
    public void EntreEmail(){
    	Emailid.sendKeys("7387770017");	
    }
    	
    public void entrePassword()
    {
    	password.sendKeys("7387");
    }
		    
	public void clickLogin()
    {
	    loginButton.click();
    	
    }
}
