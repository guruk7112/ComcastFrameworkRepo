package testng_features_basic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class before_after_suit_test_class_mehtod_configuration_annotation {

	@BeforeSuite
	public void beforesuit() {
		System.out.println("executing before suite");
	}
	@AfterSuite
	public void aftersuit() {
		System.out.println("executing after suit");
	}
	
	@BeforeTest
	public void befortest() {
		System.out.println("execute before test");
		
	}
	@AfterTest
	public void aftertest() {
	 System.out.println("execute after test");
	}
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("executing berfore class");  
	}
	@AfterClass
	public void afterclass() {
		System.out.println("executing after class");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("execute before method");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("execute afer metod");
	}
	@Test
	public void tc1() {
		System.out.println("execute tc 1");
	}
	@Test
	public void tc2() {
		System.out.println("executing tc 2");
	}
	
}
