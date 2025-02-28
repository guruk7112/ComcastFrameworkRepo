package practice.testng;

import java.util.Random;

import org.testng.annotations.Test;

public class InvocationCount_testNG_Test {

	@Test(invocationCount=5)     // using for loop result will not be proper total test run will be one
	public void createOrderTest() {
		System.out.println("execute create order  ");
	}
	@Test(enabled=false)       // it will not participate in execution using  (enabled = false)
	public void billingAnOrderTest() {
		System.out.println("execute billing an order "); 
	}
}
