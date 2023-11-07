package addToCart;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtitiles.BaseClassUtility;
import genericUtitiles.ITestListenerUtility;
import objectRepostiory.AddToCartLaptop;

@Listeners(ITestListenerUtility.class)

public class DWS_AddToCart_LapTop_04_Test extends BaseClassUtility {
	
	@Test(groups = "IT")
	
	public void  AddToCart_Laptop_homePage() throws InterruptedException  {
		
		addToCartLaptop.getProductLink().click();
		logger.log(Status.INFO, "User click on products");
		Thread.sleep(3000);
		addToCartLaptop.getClickAddButton().click();
		logger.log(Status.INFO, "User click on addButton");
		Thread.sleep(3000);
		
	}
	

}
