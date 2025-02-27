package practiceTest;

import java.io.FileReader;
import java.time.Duration;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import co.cast.generic.FileUtility.ExcelUtility;

public class dataprovider {
	ExcelUtility ex=new ExcelUtility();

	@Test(dataProvider="getData")
	public void pricet(String itemname, String product) throws Exception{
		
		RemoteWebDriver driver=new ChromeDriver();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		JSONParser par=new JSONParser();
	Object obj=	par.parse(new FileReader("C:\\Users\\Gurup\\OneDrive\\Desktop\\file.json"));
	
	JSONObject map=(JSONObject)obj;

	String url=(String) map.get("url");
	
	driver.get(url);
	
	driver.findElement(By.className("Pke_EE")).sendKeys(itemname,Keys.ENTER);
	
	String x="//div[@class='"+product+"']/../../../../div/a[2]/div/div";
	
String  price=driver.findElement(By.xpath(x)).getText();
	}
@DataProvider
public Object[][] getData() throws Throwable{
	
int count=ex.getRowCount("cart");

	Object[][] objr=new Object[count][1];
	for(int i=0;i<=count;i++) {
		objr[i][0]=ex.getDataFromExcel("cart", i,1);
		objr[i][1]=ex.getDataFromExcel("cart", i,1);
	}
	
	return objr;
	
	
	
}
	}
	