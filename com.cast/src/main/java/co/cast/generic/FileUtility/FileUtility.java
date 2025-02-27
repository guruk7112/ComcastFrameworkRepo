package co.cast.generic.FileUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class FileUtility {
public String getDataFromPropertiesFile(String key) throws Exception {
	FileInputStream fis=new FileInputStream("C:\\Users\\Gurup\\eclipse-workspace\\com.cast\\ConfigAppData\\commondata.properties");
	Properties po=new Properties();
	po.load(fis);
	String data=po.getProperty(key);
	
	return data;
}
}
