package testng_features_basic;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class before_after_suit_configuration_annotation {

	@BeforeSuite
	public void beforesuit() {
		System.out.println("executing before suite");
	}
	@AfterSuite
	public void aftersuit() {
		System.out.println("executing after suit");
	}
	@Test
	public void tc1() {
		System.out.println("execute tc 1");
	}
	
}
