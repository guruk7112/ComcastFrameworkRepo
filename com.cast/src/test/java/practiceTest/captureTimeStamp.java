package practiceTest;

import java.util.Date;

public class captureTimeStamp {
public static void main(String [] args) {
	
	String time=new Date().toString().replace("","_" ).replace(":", "_");
	 //java.util.date package
	System.out.println(time);                   /** Mon Feb 24 10:24:51 IST 2025**/
}
}
