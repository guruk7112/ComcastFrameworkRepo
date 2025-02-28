package sequence;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class into {
public static void main(String [] args) throws InterruptedException {
	 WebDriver driver=new ChromeDriver();
	 
	 //to axcess web browser
	 driver.get("https://demowebshop.tricentis.com/register");
	 
	 //to maximize  the browser
	 driver.manage().window().minimize();
	 
	 //to minimize the browser
	 driver.manage().window().maximize();
	 
	 //basic validation methods
	 //return type is string
	 
	 //fetch the title of the current web page 
	 String title=driver.getTitle();
	 System.out.println(title);
	 
	 // we can get the source code of the web page
	 String sourcecode=driver. getPageSource();
	 System.out.println(sourcecode);
	 
	 //helps to fetch the current url of the webpage
	 String url=driver.getCurrentUrl();
	 System.out.println(url);
	 
	 //navigation operation on web elements
	 //the return type is navigate
	 
	// to get axcess of anothe webpage
	 //driver.navigate().to("https://www.lunarclient.com/");
	 
	 //to goback to previous webpage
	 driver.navigate().back();
	 
	 //to refresh the current webpage
	 driver.navigate().refresh();
	 
	 //to go to next weibpage
	 driver.navigate().forward();
	 
   driver.get("https://demowebshop.tricentis.com/register")	 ;
	 //locaters are used to find the web elements
	 //there are 8 web elements
	 
	 //find element using name locator
	WebElement searchfield= driver.findElement(By.name("q"));
	searchfield.sendKeys("mobiles");
	
	driver.navigate().back();
	
	//find element using id locator
	 WebElement search=driver.findElement(By.id("small-searchterms"));
	 search.sendKeys("mobiles");
	 
	 driver.findElement(By.name("q")).click();
	 
	 
	 
	 driver.navigate().back();
	 
	 
	 
	 
}
}
