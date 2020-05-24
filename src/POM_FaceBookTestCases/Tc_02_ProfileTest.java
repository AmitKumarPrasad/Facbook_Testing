package POM_FaceBookTestCases;

import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POM_Core.testCore;
import POM_FaceBookPages.ProfilePage;
import POM_Util.testUtil;

public class Tc_02_ProfileTest extends testCore{

	  @BeforeTest
		public void isSkip()
		{
			if(!testUtil.isExecutable("Tc_02_ProfileTest")){
				throw new SkipException("Skipping the testcase as runmode is set to No");
			}
		}
	  
	  @Test
	  public void Click_Profile() throws InterruptedException
	  {
		  Thread.sleep(3000L);
		  ProfilePage pp=new ProfilePage(driver);
		  pp.ClickonProfile();
	  }
}