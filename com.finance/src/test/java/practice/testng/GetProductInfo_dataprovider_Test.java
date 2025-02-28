package practice.testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GetProductInfo_dataprovider_Test {

	@Test(dataProvider="getData")
	public void getproductInfoTest(String brandname , String productname) throws Throwable {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.amazon.in");
		
		
		//search product 

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(productname,Keys.ENTER);
		Thread.sleep(2000);
		//capture product info
		String x="//span[text()='"+productname+"']/../../../../div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/a/span/span[2]/span[2]";
String price=driver.findElement(By.xpath(x)).getText();
System.out.println(price);

	}	@DataProvider   
	public Object[][] getData() {
		
		Object [][] objarr=new Object[3][2];  
		
		        objarr[0][0]="iphone";
				objarr[0][1]="Apple iPhone 13 (128GB) - Midnight";    //45,999
				
				objarr[1][0]="iphone";
				objarr[1][1]="Apple iPhone 13 (128GB) - Blue";       //70,999
				
				objarr[2][0]="iphone";
				objarr[2][1]="Apple iPhone 15 (256 GB) - Black";
		
		return objarr;

		
		
		
		
	}
}
