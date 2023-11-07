package login;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtitiles.BaseClassUtility;
import genericUtitiles.ITestListenerUtility;

@Listeners(ITestListenerUtility.class)
public class DWS_Login_01_Test extends BaseClassUtility {
	
	@Test
	
	public void Login_to_applicatio_with_valid_cerdentials() {
	LoginPage.getLoginlink().click();
	logger.log(Status.INFO, "User click on login link");
	LoginPage.getEmailTF().sendKeys("selenium");
	logger.log(Status.INFO, "User Entered Email address");
	LoginPage.getPasswordTF().sendKeys("1234");
	logger.log(Status.INFO, "user entered password");
	LoginPage.getLoginButton().click();
		
		
	}

}
