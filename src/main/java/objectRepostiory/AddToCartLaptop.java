package objectRepostiory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartLaptop {

	

	public AddToCartLaptop(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//a[contains(text(),'14.1-inch Laptop')]")
	private WebElement productLink;

	@FindBy(id="add-to-cart-button-31")
	private WebElement clickAddButton;



	public WebElement getProductLink() {
		return productLink;
	}


	public WebElement getClickAddButton() {
		return clickAddButton;
	}



}
