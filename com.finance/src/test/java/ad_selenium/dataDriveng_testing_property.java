package ad_selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class dataDriveng_testing_property {
public static void mai(String [] args) throws IOException {
	
	//get the java representation object
	FileInputStream fis=new FileInputStream("C:\\Users\\Gurup\\OneDrive\\Desktop\\commondata.properties");
	
	//using property class load all the key
	Properties po=new Properties();
	po.load(fis);
	//get the value based on the keyp
	System.out.println(po.getProperty("browser"));
	
}
	
}
