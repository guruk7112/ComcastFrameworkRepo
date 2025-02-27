package practiceTest;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class SampleReportTest {
	
	public ExtentReports report;
	@BeforeSuite
	public void configBs() {

		//spark report configuration
		ExtentSparkReporter spark=new ExtentSparkReporter("./AdvanceReport/report.html"); // automaticaly creat folder
		spark.config().setDocumentTitle("CRM test suite result");
	spark.config().setReportName("CRM report");
	spark.config().setTheme(Theme.STANDARD);

	// system and environment information and create test
	 report=new ExtentReports();
	report.attachReporter(spark);
	report.setSystemInfo("OS", "WIndows-10");
	report.setSystemInfo("BROWSER", "CHROME-100");
	}
	@AfterSuite
	public void configAs() {
		report.flush();
	}
		
@Test 
public void createContactTest() {
	
	WebDriver driver=new ChromeDriver();
	driver.get("http://localhost:8888");
	
TakesScreenshot ts=(TakesScreenshot)driver;
String filepath=ts.getScreenshotAs(OutputType.BASE64);

// extents test class is mandetory to generate a log

ExtentTest test=report.createTest("createContactTest");


	test.log(Status.INFO,"login to App");
	test.log(Status.INFO,"navigate to contact page");
	test.log(Status.INFO,"create contact");
	if("HDDFC".equals("HDFC")) {
		test.log(Status.PASS,"contact is created");
	}else {
		test.log(Status.FAIL,"contact is not created");
	}
	test.addScreenCaptureFromBase64String(filepath,"ErrorFile");
	driver.close();

}
}
