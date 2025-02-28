package practice.testng;

import org.testng.annotations.Test;

public class TestNG_DependsOnMetod_Test {

	@Test
	public void createOrderTest() {
	System.out.println("execute create order");
}
	@Test (dependsOnMethods="createOrderTest")
	public void billingAnOrderTest() {
		System.out.println("Execute billing an order");
	}
}