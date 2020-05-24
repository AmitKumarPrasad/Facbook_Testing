package POM_FaceBookPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.DataProvider;

import POM_Config.configuration;
import POM_Util.testUtil;

public class UploadPhotoPage {

	WebDriver driver;
	/*public UploadPhotoPage(WebDriver driver){ // creating a costructor for page object factory
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}*/
	

	public UploadPhotoPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	@FindBy (xpath=configuration.uploadphoto)
	public WebElement editprofileimage;
	
	public void ClickOnUploadPhoto() throws FindFailed, InterruptedException 
	{
		editprofileimage.click();
		
		Thread.sleep(1000L);
		
		Screen screen = new Screen();
		
        Pattern Img1= new Pattern("C:\\Users\\Administrator\\Pictures\\facebook\\Capture.PNG");
	    Pattern Img2 = new Pattern("C:\\Users\\Administrator\\Pictures\\facebook\\Open.PNG");
		
		screen.wait(Img1,20);

		//Path of the file which we want to upload
		//screen.type(Img1, "C:\\Users\\Laxmi Computers\\screenshort\\Rani.png");

		Thread.sleep(3000L);
		screen.type(Img1,"C:\\Users\\Administrator\\Pictures\\facebook\\d711f0c0bb279bc05152d62e6b681a99.jpg");
		screen.click(Img2);
		
		Thread.sleep(1000L);
		
		
}

	
	}


