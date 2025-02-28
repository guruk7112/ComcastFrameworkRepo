package practice.contact.text;

import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class generilc_utility_ContactWIthSupportDate {
	public static void main(String[] args) throws Exception {

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
		Row ro = sh.getRow(4);
		String lastname = ro.getCell(2).toString() + ran1;
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

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get(URL);

		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.id("submitButton")).click();

		// navigate to organization module
		driver.findElement(By.linkText("Contacts")).click();

		// click on creat organization button
		driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();

		// enter all the details and create new organization
		Date date = new Date();

		SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");
		String actdate = sim.format(date);

		Calendar call = sim.getCalendar();
		call.add(Calendar.DAY_OF_MONTH, 30);

		String AfterdateRequire = sim.format(call.getTime());

		driver.findElement(By.name("lastname")).sendKeys(lastname);

		driver.findElement(By.name("support_start_date")).clear();
		driver.findElement(By.name("support_start_date")).sendKeys(actdate);

		driver.findElement(By.name("support_end_date")).clear();
		driver.findElement(By.name("support_end_date")).sendKeys(AfterdateRequire);

		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		
	String startdate=driver.findElement(By.id("dtlview_Support Start Date")).getText();
	if(startdate.equals(actdate)) {
		System.out.println(actdate+"information is verified==pass");
	}else {
		System.out.println(actdate+"is not verified==fail");
	}
	String enddate=driver.findElement(By.id("dtlview_Support End Date")).getText();
	if(enddate.equals(AfterdateRequire)) {
		System.out.println(AfterdateRequire+"is verifed==pass");
	}else {
		System.out.println(AfterdateRequire+"is verified==fail");
	}      //2025-02-13information is verified==pass
	        // 2025-03-15is verifed==pas
	}
}
