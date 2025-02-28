package sequence;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElements {
public static void main(String [] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/register");
	
	//checking elements action 
	List<WebElement> radio=driver.findElements(By.xpath("//input[@name='Gender']"));
	System.out.println(radio);
	
	//for(int i=0;i<=radio.size()-1;i++) {
		//System.out.println(i);    0/p 0,1
	//	radio.get(i).click();
	//}
	//get all the links on webpage
	List<WebElement> links=driver.findElements(By.xpath("//a"));
	//iterate all the links
	for(int i=0;i<=links.size()-1;i++) {
	String text=	links.get(i).getText();
	System.out.println(text);
	}
	
	//to get url links
	for(int i=0;i<=links.size()-1;i++) {
		String link=links.get(i).getAttribute("href");
		System.out.println(link);
	}
	for(WebElement element:links) {
		element.click();
		System.out.println(element.isSelected());
	}
	
	
}
}
