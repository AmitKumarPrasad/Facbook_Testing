package POM_FaceBookPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import POM_Config.configuration;

public class ProfilePage {

	  WebDriver driver;
	   
	    public ProfilePage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	    
	    @FindBy(xpath=configuration.profile)         
		public WebElement myprofile ;
	    
	    public void ClickonProfile()
	    {
	    	myprofile.click();
	    }
	    
	    
}
