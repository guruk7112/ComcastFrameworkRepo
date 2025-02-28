package practice.contact.text;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class generic_utility_CreateContactWithOrgTest_Integration_test_case {
public static void main(String [] args) throws Exception {

	FileInputStream fis = new FileInputStream("C:\\Users\\Gurup\\OneDrive\\Desktop\\commondata1.properties");
	Properties po = new Properties();
	po.load(fis);

	String BROWSER = po.getProperty("browser");
	String URL = po.getProperty("url");
	String USERNAME = po.getProperty("username");
	String PASSWORD = po.getProperty("password");

	Random ran = new Random();
	int ran1 = ran.nextInt(500);

	FileInputStream fas = new FileInputStream("C:\\Users\\Gurup\\OneDrive\\Desktop\\dielan\\org.xlsx");
	Workbook wb = WorkbookFactory.create(fas);
	Sheet sh = wb.getSheet("contact");
	Row ro = sh.getRow(7);
	String orgname = ro.getCell(2).toString() + ran1;
	String contactlastname=ro.getCell(2).toString();
	wb.close();

	WebDriver driver =null;
	if (BROWSER.equals("chrome")) {
		driver = new ChromeDriver();
	} else if (BROWSER.equals("firefox")) {
		driver = new FirefoxDriver();
	} else if (BROWSER.equals("edge")) {
		driver = new EdgeDriver();
	} else {
		driver = new ChromeDriver();
	}
	//login to app
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get(URL);
	
	driver.findElement(By.name("user_name")).sendKeys(USERNAME);
	driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
	driver.findElement(By.id("submitButton")).click();

	// navigate to organization module
	driver.findElement(By.linkText("Organizations")).click();

	// click on creat organization button
	driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
	
	//enter all the details and create new organization 
	driver.findElement(By.name("accountname")).sendKeys(orgname);
	driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	
	String header=driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
	if(header.contains(orgname)) {
		System.out.println(orgname+"header verified==pass");
	}else {
		System.out.println(orgname+"header verified==fail");
	}
	
	//navigate to contact module 
	driver.findElement(By.linkText("Contacts")).click();
	//click on create contact button
	driver.findElement(By.xpath("//*[@title='Create Contact...']")).click();
	
	//enter all the details and create new contact
	driver.findElement(By.name("lastname")).sendKeys(contactlastname);
	driver.findElement(By.xpath("//input[@name='account_name']/following-sibling::img")).click();
	
	//switch to child 
	Set<String> set=driver.getWindowHandles();
	Iterator<String> it=set.iterator();
	while(it.hasNext()) {
		String windowid=it.next();
		driver.switchTo().window(windowid);
		
	String actualUrl=	driver.getCurrentUrl();
	if(actualUrl.contains("module=Accounts")) {
		break;
	}     }
	
	driver.findElement(By.name("search_text")).sendKeys(orgname);
	driver.findElement(By.name("search")).click();
	
	//converting dynamic xpath to runtime
	//driver.findElement(By.xpath("//a[text()='faceBook0.4']")).click(); \\value changes dynamically
	driver.findElement(By.xpath("//a[text()='"+orgname+"']")).click();
	
	//switch to parrent window
	Set<String> set1=driver.getWindowHandles();
	Iterator<String> it1=set1.iterator();
	while(it1.hasNext()) {
		String windowid1=it1.next();
		driver.switchTo().window(windowid1);
		
	String actualUrl=	driver.getCurrentUrl();
	if(actualUrl.contains("Contacts&action")) {
		break;
	} }
	
   driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	
  //verify the header phone number info expected result
    header = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
    System.out.println(header);
   if(header.contains(contactlastname)) {
	   System.out.println(contactlastname+" verified ==pass");
   }else {
	   System.out.println(contactlastname+"verified ==fail");
   }
   String  inti=driver.findElement(By.id("mouseArea_Organization Name")).getText();  //important
   if(inti.trim().equals(orgname)) {
	   System.out.println(orgname+" verified ==pass");
   }else {
	   System.out.println(orgname+"verified == fail");
   }	
}
} 
