package POM_FaceBookTestCases;

import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POM_Core.testCore;
import POM_FaceBookPages.EditProfilePage;
import POM_Util.testUtil;

public class Tc_03_EditProfileTest extends testCore {

	  @BeforeTest
			public void isSkip()
			{
				if(!testUtil.isExecutable("Tc_03_EditProfileTest")){
					throw new SkipException("Skipping the testcase as runmode is set to No");
				}
			}
	  
	  @Test
	  public void Edit_Profile() throws InterruptedException {
		  Thread.sleep(1000L);
		  try{
			  Thread.sleep(1000L);
		  }catch(InterruptedException e){
			  e.printStackTrace();
		  }
		  EditProfilePage ep=new EditProfilePage(driver);
		  ep.ClickOneditprofile();
			  
		  }
	  }

