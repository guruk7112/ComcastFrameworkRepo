package ad_selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class assignment_property_file_with_random_number2 {
@Test
public void createorgtest() throws IOException {
	
	//read data from command line

	String URL=System.getProperty("url");
	String un=System.getProperty("username");
	String pwd=System.getProperty("password");
	String Browser=System.getProperty("browser");
	

//generate random number
Random random=new Random();
int ranint=random.nextInt(1000);


//read testscript data from excel
FileInputStream fas=new FileInputStream("C:\\Users\\Gurup\\OneDrive\\Desktop\\dielan\\org.xlsx");
Workbook wb=WorkbookFactory.create(fas);
Sheet sh=wb.getSheet("org");
Row row=sh.getRow(1);
String orgname=row.getCell(2).toString()+ ranint; //concatination
wb.close();
       

WebDriver driver=null;

if(Browser.equals("chrome")) {
	driver=new ChromeDriver();
}else if(Browser.equals("firefox")) {
	driver=new FirefoxDriver();
}else if(Browser.equals("edge")) {
	driver=new EdgeDriver();
}else {
		driver=new ChromeDriver();
	}
// 1 login to app 
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
         driver.get(URL);

driver.findElement(By.name("user_name")).sendKeys("admin");
driver.findElement(By.name("user_password")).sendKeys("admin");
driver.findElement(By.id("submitButton")).click();

// 2 navigate to organization model 
driver.findElement(By.linkText("Organizations")).click();

// 3 click on "create organization button " 
driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();

// 4 enter all the details and create organization
driver.findElement(By.name("accountname")).sendKeys(orgname);
driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();

// 5 logout 
Actions action=new Actions(driver);
action.moveToElement(driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"))).perform();
driver.findElement(By.linkText("Sign Out")).click();





	
}


}

