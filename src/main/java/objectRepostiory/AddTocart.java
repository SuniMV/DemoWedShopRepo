package objectRepostiory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddTocart {
	public AddTocart(WebDriver driver) {
		PageFactory.initElements(driver, this);


	}

	@FindBy(xpath ="//a[contains(text(),'Books')]")
	private WebElement  BooksLink;

	@FindBy(xpath = "//input[@value='Add to cart']")
	private WebElement AddTocartButton;

	public WebElement getBooksLink() {
		return BooksLink;
	}

	public WebElement getAddTocartButton() {
		return AddTocartButton;
	}



}
