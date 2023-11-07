package signUp;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtitiles.BaseClassUtility;
import genericUtitiles.ITestListenerUtility;
import objectRepostiory.signUp;

@Listeners(ITestListenerUtility.class)
public class DWS_Register_02  extends BaseClassUtility {
	@Test
	
	public void Register_with_valid_cerdentials() {
		
		
		signUp.getRegistrationLink().click();
		logger.log(Status.INFO, "User click on Registration link");
		signUp.getGender().sendKeys("gender-female");
		logger.log(Status.INFO, "User click on gender");
		signUp.getFirstName().sendKeys("sunitha");
		logger.log(Status.INFO, "User entered Firstname");
		signUp.getLastName().sendKeys("Thirumal");
		logger.log(Status.INFO, "User entered lastname");
		signUp.getRegisterEmail().sendKeys("sunimv@gmail.com");
		logger.log(Status.INFO, "User entered email address");
		signUp.getRegisterPassword().sendKeys("12345678");
		logger.log(Status.INFO, "User entered password");
		signUp.getRegisterconfirmPassword().sendKeys("12345678");
		logger.log(Status.INFO, "User entered confirmpassword");
		signUp.getRegerationButton().click();
	}

}
