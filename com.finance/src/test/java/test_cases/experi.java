package test_cases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class experi {
public static void main(String [] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.google.com/search?q=images&sca_esv=7a46d0ef98a252de&sxsrf=AHTn8zr3UDd3RHVugRnO1RTOqWygYAFlVg:1739255137337&source=hp&biw=1536&bih=731&ei=Ye2qZ_amEtKzvr0P9vi36AM&iflsig=ACkRmUkAAAAAZ6r7cSalcG_PYMKo5okJclH-d-vbPnCh&ved=0ahUKEwi224el_rqLAxXSma8BHXb8DT0Q4dUDCBY&uact=5&oq=images&gs_lp=EgNpbWciBmltYWdlczIIEAAYgAQYsQMyCBAAGIAEGLEDMgsQABiABBixAxiDATIFEAAYgAQyCxAAGIAEGLEDGIMBMg4QABiABBixAxiDARiKBTILEAAYgAQYsQMYgwEyBRAAGIAEMggQABiABBixAzIIEAAYgAQYsQNIhAxQAFipB3AAeACQAQCYAdwBoAGYBaoBBTQuMS4xuAEDyAEA-AEBigILZ3dzLXdpei1pbWeYAgagAvAFwgIEECMYJ5gDAJIHBTMuMi4xoAerIg&sclient=img&udm=2");
	
	for(int i=1;i<=100;i++) {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File img=ts.getScreenshotAs(OutputType.FILE);
		File image=new File("C:\\eclipse\\com.finance\\src\\test\\java\\iamages\\multi.png");
		FileHandler.copy(img, image);
		System.out.println(image);
	}
}
}
