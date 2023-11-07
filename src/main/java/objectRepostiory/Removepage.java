package objectRepostiory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Removepage {

	public Removepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(partialLinkText ="Computers")
	private WebElement computerLink;

	@FindBy(partialLinkText = "Desktops")
	private WebElement desktopLinklink;

	@FindBy(xpath = "//a[text()='Build your own cheap computer']")
	private WebElement clickedproduct1;

	@FindBy(xpath = "//input[@value='Add to compare list']")
	private WebElement addtocomparelist;

	@FindBy(xpath ="//a[text()='Build your own computer']" )
	private WebElement clickedproduct2;

	@FindBy(xpath = "//input[@value='Remove']")
	private WebElement removeProduct;
	

	public WebElement getRemoveProduct() {
		return removeProduct;
	}

	public WebElement getComputerLink() {
		return computerLink;
	}


	public WebElement getDesktopLinklink() {
		return desktopLinklink;
	}


	public WebElement getClickedproduct1() {
		return clickedproduct1;
	}



	public WebElement getAddtocomparelist() {
		return addtocomparelist;
	}



	public WebElement getClickedproduct2() {
		return clickedproduct2;
	}




}


