package sequence;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select {
private static final boolean WebElement = false;

public static void main(String [] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/books");
	
	//identify the web element
	WebElement sort=driver.findElement(By.name("products-orderby"));
	
	//create an object of select class
	Select objsel=new Select(sort);
	
	//select by visible text
	objsel.selectByVisibleText("Name: A to Z");
	
//	WebElement  display=driver.findElement(By.id("products-pagesize"));
//	Select objsel1=new Select(display);
//	objsel1.selectByValue("https://demowebshop.tricentis.com/books?orderby=5&pagesize=4");   nosuchElementException
//

	WebElement  display=driver.findElement(By.id("products-pagesize"));
	Select objsel1=new Select(display);
	objsel1.selectByVisibleText("8");
	
	//select by index
	WebElement grid=driver.findElement(By.id("products-viewmode"));
	Select obj2=new Select(grid);
	obj2.selectByIndex(1);
	
	// get all options
	//When there are tomany retrive using getoption() for text use gettext()
	List<WebElement> sort1=objsel.getOptions();
	for(WebElement value:sort1) {
		System.out.println(value.getText());
		
		WebElement display1=driver.findElement(By.id("products-pagesize"));
		Select objs=new Select(display1);
		List<WebElement> oway=objs.getOptions();
		for(WebElement numberdrop:oway) {
			System.out.println(numberdrop.getText());
			
		
		}
	}
	
}
}
