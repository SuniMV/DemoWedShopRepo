package addToCart;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtitiles.BaseClassUtility;
import objectRepostiory.EmailPage;

@Listeners(genericUtitiles.ITestListenerUtility.class)

public class DWS_Send_Email_08_Test extends  BaseClassUtility {
	@Test
	

	public void sendingEmail_to_friend() throws InterruptedException {


		emailPage.getProductLink().click();
		logger.log(Status.INFO, "User clicked on the product");
		
		emailPage.getEmailFriend().click();
		logger.log(Status.INFO, "Use clicked on email a friend");
		
		emailPage.getFriendEmailTextField().sendKeys("abc@gmail.com");
		logger.log(Status.INFO, "User send mail to you friend email address");
		
		emailPage.getYourEmailAddress().sendKeys("sunimv@gmail.com");
		logger.log(Status.INFO, "use send your email address");
		
		emailPage.getPersonalMessageTextField().sendKeys("hello");
		logger.log(Status.INFO, "user send text message to friend");
		
		emailPage.getSendMail().click();
		
		Thread.sleep(3000);
		String errorMag =emailPage.getErrorMessage().getText();
		System.out.println(errorMag);




	}
}
