package sequence;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class handling_push_notifications {
public static void main(String [] args) throws InterruptedException {
	
	//create chromoptions class object to avoid notification
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-notifications");
	//we need to pass agr as --disable-notifications 
	
	//pass the ref to driver object constructer
	WebDriver driver=new ChromeDriver(options);
	driver.get("https://www.easemytrip.com");
	Thread.sleep(1000);
	
	
}
}
