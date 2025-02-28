package ad_selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SeleniumTestReadDataFromRunTime  {

	@Test
public void seleniumTest() throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\Gurup\\OneDrive\\Desktop\\commondata.properties");
		Properties po=new Properties();
		po.load(fis);
		
	String browser=po.getProperty("browser");
	String un=po.getProperty("username"); 
	String pwd=po.getProperty("password");
	String url=po.getProperty("url");
		
		
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
