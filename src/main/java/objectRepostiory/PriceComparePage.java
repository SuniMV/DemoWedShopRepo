package objectRepostiory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PriceComparePage {

	public PriceComparePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(partialLinkText = "Jewelry")
	private WebElement JewellaryPriceLink;

	@FindBy(xpath = "//span[text()=0.00]")
	private WebElement allPrice;

	public WebElement getJewellaryPriceLink() {
		return JewellaryPriceLink;
	}



	public WebElement getAllPrice() {
		return allPrice;
	}




}
