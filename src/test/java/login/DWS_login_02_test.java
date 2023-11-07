package login;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtitiles.BaseClassUtility;
import genericUtitiles.ExcelUtllity;
import genericUtitiles.ITestListenerUtility;
@Listeners(ITestListenerUtility.class)

public class DWS_login_02_test extends BaseClassUtility {
	
	@Test(dataProvider = "data",dataProviderClass = ExcelUtllity.class)
	public void Login_to_applicatio_with_valid_cerdentials(String email,String password ) {
		LoginPage.getLoginlink().click();
		logger.log(Status.INFO, "User click on login link");
		LoginPage.getEmailTF().sendKeys(email);
		logger.log(Status.INFO, "User Entered Email address");
		LoginPage.getPasswordTF().sendKeys(password);
		logger.log(Status.INFO,  "password");
		LoginPage.getLoginButton().click();
	

}
}
