package genericUtitiles;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	WebDriver driver;
	JavascriptExecutor js;
	public WebDriverUtility(WebDriver driver) {
		this.driver=driver;
		js=(JavascriptExecutor) driver;
	}
	/**
	 * This method is used to enter the data using javascript executor
	 * @param element
	 * @param data which has to enter to the element
	 *  */
	public void clickOnElement(WebElement element) {
		//JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);

	}

	/**
	 * This method is used to enter the data using javascript executor
	 * @param element
	 * @param data which has to enter to the element.
	 */
	public void enterDataIntoElement(WebElement element, String data) {

		js.executeScript("arguments[0].value='"+data+"'", element);
	}

	/**
	 * This method returns the referenc for Webdriver to achieve explicit wait
	 * @param time to wait 
	 * @return
	 */

	public WebDriverWait explicitWaitReference(int time) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(time));
		return wait;

	}
	/**
	 * this method return the actions class reference
	 * @return
	 */

	public Actions actionReference() {
		Actions action=new Actions(driver);
		return action;
	}
	public void handlingDropdown(WebElement element, String value) {
		Select select=new Select(element);
		try {
			select.selectByVisibleText(value);
		}catch (NoSuchElementException e1) {
			try {
				select.selectByValue(value);	
			}catch (Exception e) {
				//select.selectByIndex(Integer.parseInt(value));
				int val=Integer.parseInt(value);
				select.selectByIndex(val);
			}
		}
	}
	/**
	 * This method is used to perform scrollTo action
	 * @param x
	 * @param y
	 */
	public void scrollToAction(int x, int y) {
		js.executeScript("window.scrollTo("+x+","+y+")");
	}
/**
 * this method is used to perform scrollBy action
 * @param x
 * @param y
 */
	public void scrollByAction(int x,int y) {
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
	/**
	 * This method is used to scroll to the element to increase the element visibilty
	 * if the status is true the window will scroll untill the element reached the top 
	 * if the status is false the window will scroll untill the element reached the buttom
	 * @param element
	 * @param status
	 */
	public void scrollIntoViewAction(WebElement element, Boolean status) {
		js.executeScript("arguments[0].scrollIntoView("+status+")",element);
	}


public void switchingToFrame(int index) {
	driver.switchTo().frame(index);
	
}
public void switchingToFrame(String name) {
	driver.switchTo().frame(name);
}
/**
 * This method is used to switch the driver control from 
 * @param element
 */
public void switchingToFrame(WebElement element) {
	driver.switchTo().frame(element);
}
/**
 * This method is used to swtich the driver control from frame to window
 */
public void switchingBackToMainWindow() {
	driver.switchTo().defaultContent();
}

/**
 * This method is returning the alert reference
 * @return
 */
public Alert returnAlertReference() {
	return driver.switchTo().alert();
}
/**
 * This method is used the driver control from one window to another window
 * @param allWindowId
 * @param expectedTitle
 * @param parentID
 */
public void switchingToWindow(Set<String> allWindowId, String expectedTitle, String parentID) {
	allWindowId.remove(parentID);
	for(String id:allWindowId) {
		driver.switchTo().window(id);
		if(expectedTitle.equalsIgnoreCase(driver.getTitle())) {
			break;
		}
	}
	
}
public void switchingBackToMainWindow(String parentID) {
	driver.switchTo().window(parentID);
	
}

}