package POM_FaceBookTestCases;

import org.sikuli.script.FindFailed;

import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POM_Core.testCore;
import POM_FaceBookPages.SaveButtonPage;

import POM_Util.testUtil;

public class Tc_05_SaveButtonTest extends testCore {

	 @BeforeTest
		public void isSkip()
		{
			if(!testUtil.isExecutable("Tc_04_UploadPhotoTest")){
				throw new SkipException("Skipping the testcase as runmode is set to No");
			}
		
		}
	 
	 @Test
	  public void Click_SaveButton() throws InterruptedException, FindFailed {
		  Thread.sleep(3000L);
			SaveButtonPage sb=new SaveButtonPage(driver);
		    sb.getsavebutton();
		  }
		  
}

