package objectRepostiory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Jewellerypage {

	public Jewellerypage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(partialLinkText = "Jewelry")
	private WebElement jewellaryLink;

	@FindBy(xpath = "//a[@href='https://demowebshop.tricentis.com/jewelry?price=0-500']")
	private WebElement priceRangefilter;
	
	@FindBy(xpath = "//div[@class='add-info']")
	private WebElement Jproduct;

	public WebElement getJewellaryLink() {
		return jewellaryLink;
	}

	
	public WebElement getPriceRangefilter() {
		return priceRangefilter;
	}

	
	public WebElement getJproduct() {
		return Jproduct;
	}

	



}
