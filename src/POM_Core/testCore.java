package POM_Core;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


import POM_Config.configuration;
import POM_Util.ExcelReader;
import POM_Util.TestConfig;
import POM_Util.monitoringMail;
import POM_Util.testUtil;



public class testCore {
	public static WebDriver driver=null;
	public static ExcelReader excel=null;
	
	@BeforeSuite
	public void init() throws IOException{
		if(driver==null){
			
			if((configuration.browser).equalsIgnoreCase("firefox")){
			
				System.setProperty("webdriver.gecko.driver", "D:\\JARs\\firefox_setup\\geckodriver.exe");
				driver=new FirefoxDriver();
				
		       // app_logs.debug("Launching firefox Browser");
		         
	     }else if((configuration.browser).equalsIgnoreCase("ie")){
			
		    System.setProperty("webdriver.ie.driver", "D:\\EduSol\\Selenium Jar Files\\Selenium Webdrivers\\IEDriverServer.exe");
			 driver=new InternetExplorerDriver();
			
		    //app_logs.debug("Launching ie browser");
			
		 }else if((configuration.browser).equalsIgnoreCase("chrome")){
			
			System.setProperty("webdriver.chrome.driver", "D:\\JARs\\chromeSelinium\\chrome81\\chromedriver.exe");
			driver=new ChromeDriver();
		   //app_logs.debug("Launching chrome browser");
			
		
		}
		}
	driver.get(configuration.testsite);
	//app_logs.debug("Opening faceBook login page");
	driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);

	}
	

/*@AfterSuite
public void QuitDriver() throws MessagingException {
 
// if (driver!=null)
	//app_logs.debug("Sending Mail");
	
	  testUtil.zip(System.getProperty("user.dir")+"\\screenshot");
	  monitoringMail mail = new monitoringMail();
	  try{
		  mail.sendMail(TestConfig.server, TestConfig.from, TestConfig.to, TestConfig.subject, TestConfig.messageBody, TestConfig.attachmentPath, TestConfig.attachmentName);
			
		} catch(AddressException e){
			// TODO Auto-generated catch block
			 e.printStackTrace();
		 }
	  System.out.println("Sending Mail Successfully.......");
    // driver.close();
}*/
}


