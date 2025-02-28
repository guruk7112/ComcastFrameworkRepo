package testng_features_basic;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample_test {
	
	@Test
	public void demo(){  //test case
		System.out.println("test case , test steps");
		//test steps
	}
	
	@Test
	public void zc1() {
		Reporter.log("test 1");
	}
	
	@Test
	public void registertest() {
		System.out.println("executing register test case ");
	}
	@Test
	public void logintest() {
		System.out.println("Executing login test case");
	}
	@Test
	public void searchtest() {
		System.out.println("executing searcg test case");
	}
}
