package POM_FaceBookPages;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import POM_Config.configuration;



public class EditProfilePage  {

	WebDriver driver;
	public EditProfilePage(WebDriver driver){ // creating a costructor for page object factory
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath=configuration.Editprofile)
	public WebElement editprofileButton;
	
	public void ClickOneditprofile()
	{
		editprofileButton.click();
	}
}