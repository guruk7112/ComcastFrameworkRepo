package ad_selenium;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.mysql.jdbc.Driver;

public class new_project_GUI_Db {
public static void main(String [] args) throws Exception {
	
	//create projcetr GUI using selenium code
	String projectname="fb_101";
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().window().maximize();
	driver.get("http://49.249.28.218:8091");
	

	
	//driver.findElement(By.id("username")).sendKeys("rmgyantra",Keys.ENTER);
	//driver.findElement(By.id("inputPassword")).sendKeys("rmgy@9999",Keys.ENTER);
	driver.findElement(By.id("username")).sendKeys("rmgyantra");
	driver.findElement(By.id("inputPassword")).sendKeys("rmgy@9999");
	driver.findElement(By.xpath("//button[text()='Sign in']")).click();
	driver.get("http://49.249.28.218:8091/dashboard/projects");
	
	driver.findElement(By.linkText("Projects")).click();
	driver.findElement(By.xpath("//span[text()='Create Project']")).click();
	
	driver.findElement(By.cssSelector("input[name='projectName']")).sendKeys(projectname);
	driver.findElement(By.cssSelector("input[name='createdBy']")).sendKeys("miiilan");
	Thread.sleep(2000);
	Select sel=new Select(driver.findElement(By.xpath("(//select[@name='status'])[2]")));
	//driver.findElement(By.name("status")).click();
	sel.selectByVisibleText("Created");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	//verify the project in DB/backend using jdbc
	boolean flag=false;
	//load/ register the db driver
	Driver ref=new Driver();
	DriverManager.registerDriver(ref);
	//connect to database
	Connection conn=DriverManager.getConnection("jdbc:mysql://49.249.28.218:3333/project","root","root");
	System.out.println("==done=="); // "jdbc: mysql : //ip adress or localhost: 3838/database name " , "username","password"
	
	//create sql statement
  Statement stat= conn.createStatement();
  //execute select query and get result
  ResultSet result=stat.executeQuery("select * from project");
  while (result.next()){
	  String act=result.getString(4);
	  if(projectname.equals(act)) {
		  flag=true;
		  System.out.println(projectname+"is available");
	  }
	  
  }
 if(flag==false) {
	 System.out.println(projectname+"is not available ");
 }
 //close the connection
 conn.close();
	
	
}

}
