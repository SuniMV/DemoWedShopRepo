package addToCart;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtitiles.BaseClassUtility;
import genericUtitiles.ITestListenerUtility;
import objectRepostiory.DesktopAdd;

@Listeners(ITestListenerUtility.class)
public class DWS_destop_05_Test extends BaseClassUtility {
	@Test(groups = "IT")
	
	
	public void addDestoptoCart()  throws InterruptedException {
		
	desktopAdd.getComputerLink().click();
	desktopAdd.getDesktopLinklink().click();
	desktopAdd.getClickedproduct1().click();
	desktopAdd.getAddtocomparelist().click();
	Thread.sleep(3000);
	desktopAdd.getComputerLink().click();
	desktopAdd.getDesktopLinklink().click();
	desktopAdd.getClickedproduct2().click();
	desktopAdd.getAddtocomparelist().click();
	
	assertTrue(desktopAdd.getClickedproduct1().isDisplayed());
	logger.log(Status.INFO,"Product added to comparelist");
		
	}

}
