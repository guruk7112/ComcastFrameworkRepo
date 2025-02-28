package practice.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.common.collect.ObjectArrays;

public class createContact_DataProvider_Test {

	@Test(dataProvider="getData")  // all lower case
	public void createContactTest(String firstname , String lastname , long phonenumber) {
		System.out.println("FirstName :"    +firstname+"   LastName : "+lastname);
		
	}
@DataProvider    //uppercase D
public Object[][] getData() {
	//size for number of arguments number of size for fn , ln , number     [3][3]
	Object [][] objarr=new Object[3][3];  //[3]number times [2] number of arguments 
	
	        objarr[0][0]="deepak";
			objarr[0][1]="ht";
			objarr[0][2]=943050489l;
			
			objarr[1][0]="sam";
			objarr[1][1]="hp";
			objarr[1][2]=453456354l;
			
			objarr[2][0]="john ";
			objarr[2][1]="smith";
			objarr[2][2]=453643453l;
	
	return objarr;
	
}
}
