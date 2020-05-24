package POM_FaceBookPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import POM_Config.configuration;

public class FaceBookLoginPage {

	//POM-Page ObjecT Model
	//1.Page Object Factory
	//2.Page Object Pattern
	
	
	//Constructor Create in compulsory in another page class 4 line
	
	    WebDriver driver;
	   
	    public FaceBookLoginPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	//1.using Page Object Factory
	@FindBy(xpath=configuration.username)           //xpath of usenname
	public WebElement username ;
	
	@FindBy(xpath=configuration.password)            //xpath of password
	public WebElement password  ;
	
	@FindBy(xpath=configuration.login)   //xpath of login
	public WebElement login ;
	
	
	    
	/* //2.using Page Object Pattern
	    By username=By.xpath("//*[@id='email']");
	    By password=By .xpath("//*[@id='pass']");
	    By login=By.xpath("//input[@value='Log In']");*/
	    
	    
	
	
	//2.using Page Object Pattern option 2
	public WebElement email()
	{
		return username;
	}
	    
	public WebElement password()
	{
		return password;
	}
	    
	public WebElement login()
	{
		return login;
	}
	
	    
	    
	    
  /*//method and reference create option 1
	public void Enterusername()
	{
		
		username.sendKeys("7410113240");
	}
	
	public void Enterpassword()
	{
		password.sendKeys("rani8421@");
	}
	
	
	public void CilckonSignInButton ()
	{
		login.click();
	}*/
	
	
	
}


