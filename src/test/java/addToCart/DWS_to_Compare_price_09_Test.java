package addToCart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtitiles.BaseClassUtility;
import genericUtitiles.ITestListenerUtility;
@Listeners(ITestListenerUtility.class)
public class DWS_to_Compare_price_09_Test extends BaseClassUtility {
	@Test
	
	public void priceComparing() {
		
		priceComparePage.getJewellaryPriceLink().click();
		logger.log(Status.INFO, "User Jewellery link");
		priceComparePage.getAllPrice().click();
		logger.log(Status.INFO, "user click on the price range");
		
		List<WebElement> Prices = driver.findElements(By.xpath("//div[@class='prices']"));
		for(WebElement JeALLPrice:Prices) {
			String p = JeALLPrice.getText().substring(0, 3);
			int val = Integer.parseInt(p);
					if(val<=500) {
						System.out.println("testcase is passed"+JeALLPrice.getText());
					}else {
						System.out.println("test is failed");
					}
		}
		
	}

}
