package sequence;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select_multiSelector {
public static void main(String [] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/books");
	
	//TO CHECK DROP DOWN IS MULTI SELECTOR OR NOT

	//FIND ELEMENT
	WebElement  sort=driver.findElement(By.name("products-orderby"));
	Select obj=new Select(sort);
	System.out.println(obj.isMultiple());
	
	WebElement  sort1=driver.findElement(By.name("products-pagesize"));
	Select obj1=new Select(sort1);
	System.out.println(obj1.isMultiple());
	
	obj1.selectByVisibleText("4");
	Thread.sleep(1000);
	obj1.selectByVisibleText("8");
	Thread.sleep(1000);
	obj1.selectByVisibleText("12");  
	//StalesuchElementException
	

}
}
