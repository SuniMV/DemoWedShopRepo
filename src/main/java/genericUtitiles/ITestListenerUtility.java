package genericUtitiles;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.internal.annotations.ITest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class ITestListenerUtility extends BaseClassUtility implements ITestListener {

	ExtentReports report;
	//ExtentTest logger;

	public void onTestStart(ITestResult result) {
		logger = report.createTest(result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		logger.log(Status.PASS, "The test"+result.getName()+" is passed");

	}

	public void onTestFailure(ITestResult result) {
		logger.addScreenCaptureFromPath(ScreenShot.capturingScreenshot(result.getName()));
	}	


	public void onStart(ITestContext context) {
		ExtentSparkReporter reporter=new ExtentSparkReporter("./repo/demo.html");
		reporter.config().setTheme(Theme.STANDARD);
		reporter.config().setDocumentTitle("This is Sample Report Document");
		reporter.config().setReportName("Sunitha");

		report = new ExtentReports();
		report.attachReporter(reporter);

	}

	public void onFinish(ITestContext context) {
		report.flush();	}

}
