package ad_selenium;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class create_organization_test {

	
	@Test
	public void createOrgtest() throws Exception  {
	
	JSONParser parser=new JSONParser();
	Object obj=parser.parse("C:\\Users\\Gurup\\OneDrive\\Desktop\\appCommondata.JSON");
	
	JSONObject map =(JSONObject)obj;
	
String browser= map.get("browser").toString();
String un= map.get("username").toString();             // we can use to toString()
String pwd= map.get("password").toString();
String url= map.get("url").toString();


//Scanner s=new Scanner(System.in);
//System.out.println(" enter the browser");
//String br=s.next();

WebDriver driver;


if(browser.equals("chrome")) {
	driver=new ChromeDriver();
}else if(browser.equals("firefox")) {
	driver=new FirefoxDriver();
}else if(browser.equals("edge")) {
	driver=new EdgeDriver();
}else {
	driver=new ChromeDriver();
}	
//driver=new ChromeDriver();      //imp
	driver.get(url);
	
	driver.findElement(By.name("user_name")).sendKeys(un);
	driver.findElement(By.name("user_password")).sendKeys(pwd);
	driver.findElement(By.id("submitButton")).click();
	
	driver.findElement(By.linkText("Organizations")).click();
}
} 
