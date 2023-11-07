package addToCart;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtitiles.BaseClassUtility;
import genericUtitiles.ITestListenerUtility;

@Listeners(ITestListenerUtility.class)

public class DWS_Remove_Destop_List_07_Test extends BaseClassUtility {

	@Test

	public   void removeDestopfromComaparelist() throws InterruptedException {
		removepage.getComputerLink().click();
		removepage.getDesktopLinklink().click();
		removepage.getClickedproduct1().click();
		removepage.getAddtocomparelist().click();
		Thread.sleep(3000);
		removepage.getComputerLink().click();
		removepage.getDesktopLinklink().click();
		removepage.getClickedproduct2().click();
		removepage.getAddtocomparelist().click();
		Thread.sleep(3000);
		removepage.getRemoveProduct().click();
		removepage.getRemoveProduct().click();

	}
}