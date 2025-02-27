package practiceTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import co.cast.generic.FileUtility.ExcelUtility;




public class trym   {
	
	ExcelUtility ex=new ExcelUtility();
	@Test(dataProvider="getData")
	public void test(String name, String product) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.ebay.com/?msockid=35a2da988e646c7b1238ce748f1b6d1f");
		
		driver.findElement(By.id("gh-ac")).sendKeys(name,Keys.ENTER);
		
String x="//span[text()='"+product+"']/../../../../div[2]/div[3]/div/div/span"	;
String total =driver.findElement(By.xpath(x)).getText();

System.out.println(total);
		
	}
	@DataProvider
	public Object[][] getData() throws Throwable{
	int  count	=ex.getRowCount("killlakill");
	
		Object obj[][]=new Object[count][2];
		
		for(int i=0;i<count;i++) {
			obj[i][0]=ex.getDataFromExcel("killlakill", i+1, 1);
			obj[i][1]=ex.getDataFromExcel("killlakill", i, 0);
			}
		return obj;
		
	}
	
}
