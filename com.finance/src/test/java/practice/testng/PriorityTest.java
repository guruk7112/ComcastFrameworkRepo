package practice.testng;

import org.testng.annotations.Test;

public class PriorityTest {

	
	@Test (priority=-1)
	public void creatcontactTest() {
		System.out.println("execute create contact with -->HDFC");
	}
	@Test(priority=-2)
	public void modifycontactTest() {
	
		System.out.println("execute modify test case-->HDFC-->ICICI");
	}
	@Test (priority=3)
	public void deleteContactTest() {
		System.out.println("execute delete contactTest-->delete ICICI");
	}
}
