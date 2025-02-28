package ad_selenium;

import java.io.FileInputStream;
import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class read_data_form_JSON {
public static void main(String [] args) throws Exception {
	
	//step 1 : parse json Physical file into java object using json parse class
	JSONParser parser=new JSONParser();
	Object obj=parser.parse(new FileReader("C:\\Users\\Gurup\\OneDrive\\Desktop\\appCommondata.JSON"))    ;           //we can also use FIleInputStream
	
	//step 2: to convert java object to json object using down casting 
	JSONObject map =(JSONObject)obj;
	
	//step 3 : get the value from json file by using key
	System.out.println(map.get("url"));
	System.out.println(map.get("username"));
	System.out.println(map.get("password"));
	System.out.println(map.get("browser"));
	System.out.println(map.get("timeout"));
}
}
