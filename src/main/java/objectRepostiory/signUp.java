package objectRepostiory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signUp {

	public signUp(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
	@FindBy(linkText ="Register")
	private WebElement registrationLink;

	@FindBy(id="gender-female")
	private WebElement Gender;

	@FindBy(id = "FirstName")
	private WebElement firstName;

	@FindBy(id ="LastName")
	private WebElement lastName;

	@FindBy(id = "Email")
	private WebElement registerEmail;

	@FindBy(id = "Password")
	private WebElement registerPassword;

	@FindBy(id = "ConfirmPassword")
	private WebElement registerconfirmPassword;

	@FindBy(id = "register-button")
	private WebElement regerationButton;

	public WebElement getRegistrationLink() {
		return registrationLink;
	}



	public WebElement getGender() {
		return Gender;
	}



	public WebElement getFirstName() {
		return firstName;
	}



	public WebElement getLastName() {
		return lastName;
	}



	public WebElement getRegisterEmail() {
		return registerEmail;
	}



	public WebElement getRegisterPassword() {
		return registerPassword;
	}



	public WebElement getRegisterconfirmPassword() {
		return registerconfirmPassword;
	}


	public WebElement getRegerationButton() {
		return regerationButton;
	}





} 
