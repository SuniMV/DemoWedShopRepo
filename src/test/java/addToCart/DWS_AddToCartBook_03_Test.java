package addToCart;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtitiles.BaseClassUtility;
import genericUtitiles.ITestListenerUtility;
import objectRepostiory.AddTocart;

@Listeners(ITestListenerUtility.class)
public class DWS_AddToCartBook_03_Test extends BaseClassUtility {
	
	@Test(groups = "IT")
	
	public void Add_books_To_Cart() {
		
		addTocart.getBooksLink().click();
		logger.log(Status.INFO, "User click on Books link");
		addTocart.getAddTocartButton().click();
		logger.log(Status.INFO, "User added the books to cart");
	}
	

}
