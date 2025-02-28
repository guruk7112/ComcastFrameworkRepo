package practice.org;

import java.io.FileInputStream;
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

public class create_organization {
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
	Sheet sh=wb.getSheet("org");
	Row  ro=sh.getRow(4);
	String cll=ro.getCell(2).toString() + ranint;
	String industry=ro.getCell(3).toString();
	String type=ro.getCell(4).toString();
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
	
	driver.findElement(By.linkText("Organizations")).click();
	
	driver.findElement(By.xpath("//*[@title='Create Organization...']")).click();
	
	driver.findElement(By.name("accountname")).sendKeys(cll);
	
	WebElement drop=driver.findElement(By.name("industry"));
	Select sel=new Select(drop);
	sel.selectByVisibleText(industry);
	
	WebElement down=driver.findElement(By.name("accounttype"));
	Select sell1=new Select(down);
	sell1.selectByVisibleText(type);

	driver.findElement(By.name("button")).click();
	
	
	//verify the drop down industry and type info
	
	
	String header=driver.findElement(By.className("dvHeaderText")).getText();

  
  //verify the 
String actualorg= driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
if(actualorg.equals(industry)) {
	System.out.println(industry+"is pressent ==pass");
}else {
	System.out.println(industry+"is absent ==fails");
}
String actype= driver.findElement(By.id("dtlview_Organization Name")).getText();
if(actualorg.equals(type)) {
	System.out.println(type+"is pressent ==pass");
}else {
	System.out.println(type+"is absent ==fails");
}


driver.quit();


}

}