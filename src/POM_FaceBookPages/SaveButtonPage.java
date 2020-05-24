package POM_FaceBookPages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.FindFailed;

import POM_Config.configuration;

public class SaveButtonPage {

	WebDriver driver;
	public SaveButtonPage(WebDriver driver){ // creating a costructor for page object factory
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

	@FindBy (xpath=configuration.savebutton)
	public WebElement savebutton;
	
	public void getsavebutton() throws InterruptedException, FindFailed 
	{
		savebutton.click();
		
		Thread.sleep(2000L);
		
	
}
}