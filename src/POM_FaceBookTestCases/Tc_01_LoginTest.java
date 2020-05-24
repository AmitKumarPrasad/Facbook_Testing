package POM_FaceBookTestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import POM_Core.testCore;
import POM_FaceBookPages.FaceBookLoginPage;
import POM_Util.testUtil;

public class Tc_01_LoginTest extends testCore {
    @BeforeTest
	public void isSkip()
	{
		if(!testUtil.isExecutable("Tc_01_LoginTest")){
			throw new SkipException("Skipping the testcase as runmode is set to No");
		}
	}
	
	/*@Test
	public void doLogin()
	{
	FaceBookLoginPage fb=new FaceBookLoginPage(driver);
	fb.email().sendKeys("7410113240");
 	fb.password().sendKeys("rani8421@");
 	fb.login().click();*/
 	
     @Test(dataProvider="getData")
      public void doLogin(String email,String password) throws IOException {
      try{
    	 //app_logs.debug("Executing login Test");
    	  FaceBookLoginPage fb=new FaceBookLoginPage(driver);
    	  fb.email().sendKeys(email);
    	 	fb.password().sendKeys(password);
    	 	fb.login().click();
      }catch(Throwable t){
    	   testUtil.captureScreenshot("Tc_01_LoginTest");
    	   Assert.assertTrue(false,t.getMessage());
    	 	
      }
 }	  
    	  
          //Reading data from the Excel File
        @DataProvider
        public Object[][] getData(){
        	
        	return testUtil.getData("Tc_01_LoginTest");
        
        }
        } 