package POM_FaceBookTestCases;



import org.sikuli.script.FindFailed;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import POM_Core.testCore;
import POM_FaceBookPages.EditProfilePage;
import POM_FaceBookPages.UploadPhotoPage;
import POM_Util.testUtil;

public class Tc_04_UploadPhotoTest extends testCore{

	  @BeforeTest
		public void isSkip()
		{
			if(!testUtil.isExecutable("Tc_04_UploadPhotoTest")){
				throw new SkipException("Skipping the testcase as runmode is set to No");
			}
		
		}

	/* @Test(dataProvider="getData")
	  public void Upload_Photo(String path) throws IOException {
	    try {
		  Thread.sleep(1000L);
		  UploadPhotoPage up=new UploadPhotoPage(driver);
		  up.ClickOnUploadPhoto(path);
		   }catch(Throwable t){
		  testUtil.captureScreenshot("Tc_04_UploadPhotoTest");
		   Assert.assertTrue(false,t.getMessage());
		   //app_logs.debug("Zip file created "); 
	  }
	  
	 }*/
	 
	/* @DataProvider
	 public static Object[][] getData()
	 {

	 return testUtil.getData("Tc_04_UploadPhotoTest");
	 
	 
	 }*/
	  
	  
	  @Test  
	  public void Upload_Photo() throws InterruptedException, FindFailed{
		  Thread.sleep(3000L);
		  UploadPhotoPage up=new UploadPhotoPage(driver);
		  up.ClickOnUploadPhoto();
	  }
	  
	 }





	  
	  
	
	