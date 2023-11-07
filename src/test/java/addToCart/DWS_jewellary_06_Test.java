package addToCart;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtitiles.BaseClassUtility;
import genericUtitiles.ITestListenerUtility;

@Listeners(ITestListenerUtility.class)

public class DWS_jewellary_06_Test extends BaseClassUtility {
	@Test
	
	
	public void jewellerypricerange()throws InterruptedException {
		jewellerypage.getJewellaryLink().click();
		Thread.sleep(3000);
		jewellerypage.getPriceRangefilter().click();
		Thread.sleep(3000);
		jewellerypage.getJproduct().click();
		
	}

}
