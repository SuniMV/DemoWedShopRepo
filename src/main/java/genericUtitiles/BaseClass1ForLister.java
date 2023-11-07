package genericUtitiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass1ForLister {

	public static WebDriver driver;
	public static TakeScreenShotUtility uti;

@BeforeMethod
	public static void demo() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		uti=new TakeScreenShotUtility(driver);
	}
	
}