package practice.contact.text;

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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class create_contace_Test {
public static void main(String [] args) throws Exception {
	FileInputStream fis=new FileInputStream("C:\\Users\\Gurup\\OneDrive\\Desktop\\commondata1.properties");
	Properties po=new Properties();
	po.load(fis);
	
	String Brower=po.getProperty("browser");
	String URL=po.getProperty("url");
	String USERNAME=po.getProperty("username");
	String PASSWORD=po.getProperty("password");
	System.out.println(URL);
	
	Random ran=new Random();
	int ranint=ran.nextInt(100);
	
	FileInputStream fas=new FileInputStream("C:\\Users\\Gurup\\OneDrive\\Desktop\\dielan\\org.xlsx");
		Workbook wb=WorkbookFactory.create(fas);
	Sheet sh=wb.getSheet("contact");
	Row  ro=sh.getRow(1);
	String lastname=ro.getCell(2).toString() + ranint;
	wb.close();
	
	WebDriver driver=null;
	if(Brower.equals("chrome")) {
		driver=new ChromeDriver();
	}else if(Brower.equals("firefox")) {
		driver=new FirefoxDriver();
	}else if(Brower.equals("edge")) {
		driver=new EdgeDriver();
	}else {
		driver=new ChromeDriver();
	}
			
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get(URL);
	
	driver.findElement(By.name("user_name")).sendKeys(USERNAME);
	driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
	driver.findElement(By.id("submitButton")).click();
	//navigate to contact module 
	driver.findElement(By.linkText("Contacts")).click();
	//click on create contact button
	driver.findElement(By.xpath("//*[@title='Create Contact...']")).click();
	
	driver.findElement(By.name("lastname")).sendKeys(lastname);
   driver.findElement(By.xpath("//input[@title='Save [Alt+S]']"));
	
  //verify the 

String actls= driver.findElement(By.id("dtlview_Last Name")).getText();
if(actls.equals(lastname)) {
	System.out.println(lastname+"is pressent ==pass");
}else {
	System.out.println(lastname+"is absent ==fails");
}


driver.quit();
}
}
