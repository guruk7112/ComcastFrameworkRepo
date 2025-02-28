package practice.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.comcast.crm.generic.WebDriverutilty.JavaUtility;
import com.comcast.crm.generic.fileutility.ExcelUtility;
import com.comcast.crm.generic.fileutility.FileUtility;
import com.comcast.crm.object.utility.Login;

public class perform {

	@Test

		 public void createContact() throws Exception {
		FileUtility fu = new FileUtility();
		ExcelUtility ex = new ExcelUtility();
		JavaUtility ju = new JavaUtility();

		String browser = fu.getDataFromPropertiesFile("browser");
		String url = fu.getDataFromPropertiesFile("url");
		String pwd = fu.getDataFromPropertiesFile("password");
		String un = fu.getDataFromPropertiesFile("username");

		WebDriver driver = null;
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equals("edge")) {
			driver = new EdgeDriver();
		} else {
			driver = new ChromeDriver();
		}

		String lastname = ex.getDataFromExcel("contact", 7, 3) + ju.getRandomNumber();
		Login lp = new Login(driver);
		lp.loginToApp(url, un, pwd);

//	HomePage hp=new HomePage(driver);
//	hp.getLink().click();
//	
//	newContactPage nc=new newContactPage(driver);
//	nc.lastsave(lastname);

	}
}
