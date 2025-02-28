package sequence;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class dielansequence {
public static void main(String []args) throws InterruptedException {
	
	Thread.sleep(2000);
	//launch browser 
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//	//set position of the browser 
//	driver.manage().window().setPosition(new Point(200,200));             
//	//set size of the browser
//	driver.manage().window().setSize(new Dimension(150,150));               
//	//minimze the browser
//	driver.manage().window().minimize();                                  
//	//maximize the browser 
//	driver.manage().window().maximize();                                   
//	//select and launch the app
//	driver.get("https://demoapps.qspiders.com/ui?scenario=1");             
//	//navigate previous page
//	driver.navigate().back();                                              
//	//navigate next page
//	driver.navigate().forward();                                            
//	//navigate reload the current page
//	driver.navigate().refresh();                                            
//	//navigate to another web appliation
//	driver.navigate().to("https://demoapps.qspiders.com/");                 
//	// preference given to 1 st element
//	driver.findElement(By.xpath("//div[@title='Learn More']")).click();    
//	//locator id
//	driver.findElement(By.id("email")).sendKeys("dielan@gmial.com");       Thread.sleep(1000);
//	//locator name
//	driver.findElement(By.name("password")).sendKeys("yoki");               Thread.sleep(1000);
//	//locate tagname
//	driver.findElement(By.tagName("svg")).click();                         Thread.sleep(1000);
//	//locator xpath
//	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("dielan");  Thread.sleep(1000);
//	//links <a>
//	driver.navigate().to("https://demoapps.qspiders.com/ui/link/linkNew?sublist=1");
//	try{//locator linktext
//	driver.findElement(By.linkText("Contact Us")).click();
//	//locator partial text
//	driver.findElement(By.partialLinkText("Policy")).click(); }
//	catch(Exception e) {}
//	//new page 
	driver.navigate().to("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	//actions mouse drag and drop  object creation
	
	
	Actions action=new Actions(driver);
	//finding source element to drag
	WebElement d=driver.findElement(By.id("box3"));
	//finding target element to drop
	WebElement t=driver.findElement(By.id("box103"));
	action.dragAndDrop(d, t).perform();
	
	//getters
    String nine=driver.findElement(By.className("dragableBox")).getText();
	System.out.println(nine);
	
	String guru=driver.findElement(By.id("box101")).getAttribute("class");
	System.out.println(guru);
	
	String nini=driver.findElement(By.xpath("//img")).getCssValue("color");
			System.out.println(nini);
			//findElements
//	driver.get("https://demowebshop.tricentis.com/register");
//	List<WebElement> dr=driver.findElements(By.name("Gender"));
//	for(int i=1;i<=dr.size();i++) {
// String radio=	dr.get(i).getText();
// System.out.println(radio);
//	}
	driver.navigate().to("https://demoapps.qspiders.com/ui/shadow?sublist=0");
	//shadow host <open>
 	driver.findElement(By.partialLinkText("Shadow")).click();
	driver.findElement(By.xpath("(//section[contains(text(),'Shadow')])[2]")).click();
	
	driver.findElement(By.xpath("//form/div[1]")).sendKeys("dielan");
	
	//driver.findElement(By.xpath(""))
}
}
