package POM_Config;

public class configuration {
 
	//Testsite
	public static final String testsite="https://www.facebook.com/";
	public static final String browser="firefox";
	
	//Facebook loginPages
	
	public static final String username="//*[@id='email']";
	public static final String password="//*[@id='pass']";
	public static final String login="//input[@value='Log In']";
	
	//Facebook profilePage
	public static final String profile="//*[contains(@id, 'navItem')]";
	
	//Facebook EditProfilPage
	public static final String Editprofile="//a[contains(@class, '_156p _1o5e')]";
	
	//Facebook UploadPhotoProfilPage
	public static final String uploadphoto="//a[@aria-label='Upload Photo']";
	
	//Facebook SaveButtonPage
	public static final String savebutton="//button[@class='_4jy0 _4jy3 _4jy1 _51sy selected _42ft']";
	
}
