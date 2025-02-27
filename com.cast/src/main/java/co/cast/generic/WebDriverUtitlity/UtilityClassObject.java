package co.cast.generic.WebDriverUtitlity;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

public class UtilityClassObject {
	                         // to axcess static methdos
	//to share Extends test 
public static ThreadLocal<ExtentTest> test =new ThreadLocal<ExtentTest>();

//to share driver object
public static ThreadLocal<WebDriver> driver=new ThreadLocal<WebDriver>();

public static ExtentTest getTest() {                     //use getters and setters
	return test.get();
}
public static void setTest(ExtentTest actTest) {
	test.set(actTest);
}
public static WebDriver getdriver() {
	return driver.get();
	}
public static void setDriver(WebDriver actDriver) {
	driver.set(actDriver);
}
}