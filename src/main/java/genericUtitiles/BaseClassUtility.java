package genericUtitiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepostiory.AddToCartLaptop;
import objectRepostiory.AddTocart;
import objectRepostiory.DesktopAdd;
import objectRepostiory.EmailPage;
import objectRepostiory.Jewellerypage;
import objectRepostiory.LoginPage;
import objectRepostiory.PriceComparePage;
import objectRepostiory.Removepage;
import objectRepostiory.signUp;

public class BaseClassUtility  implements IAutoConstants {
	public static WebDriver driver;
	PropertyUtility property;
	public static WebDriverUtility WBUtility;
	public static TakeScreenShotUtility ScreenShot;
	DatabaseUtility DBUtility;
	javaUtility javautililty;
	public static LoginPage LoginPage ;
	public static signUp signUp;
	public static ExtentTest logger;
	public static AddTocart addTocart;
	public static AddToCartLaptop addToCartLaptop;
	public static DesktopAdd desktopAdd;
	public static Jewellerypage jewellerypage;
	public static Removepage removepage;
	public static EmailPage emailPage;
	public static PriceComparePage priceComparePage;

	@BeforeClass(alwaysRun = true)
	public void launchtheBrowserandNavigateToAppliction() {
		property = new PropertyUtility();

		if(BROWSER.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup(); 
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver(options);
		} else if(BROWSER.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}if(BROWSER.equalsIgnoreCase("firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(property.getreadingDataFromPropertyFile("url"));
		WBUtility = new WebDriverUtility(driver);
		ScreenShot = new TakeScreenShotUtility(driver);
		DBUtility = new DatabaseUtility();

		javautililty = new javaUtility();
		LoginPage=new LoginPage(driver);
		 signUp = new signUp(driver);
		  addTocart = new AddTocart(driver);
		  addToCartLaptop = new AddToCartLaptop(driver);
		 desktopAdd = new DesktopAdd(driver);
		 jewellerypage = new Jewellerypage(driver);
		  removepage = new Removepage(driver);
		   emailPage = new EmailPage(driver);
		    priceComparePage = new PriceComparePage(driver);
		  
	}

	@BeforeMethod(alwaysRun = true)
	public void LoginToApplication() {;
	LoginPage = new LoginPage(driver);
	System.out.println("Logged in to Application");
	}
	@AfterMethod(alwaysRun = true)
	public void logoutFromApplication() {
		System.out.println("Logged out from Application");
	}
	public void teardownTheBrowser() {
		driver.quit();
	}
}

