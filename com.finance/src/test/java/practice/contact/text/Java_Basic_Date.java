package practice.contact.text;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Java_Basic_Date {
public static void main(String [] args) {
	
	Date date=new Date();
	
	SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd");
	String form=sim.format(date);
	System.out.println(form);
	
	
	Calendar call=sim.getCalendar();
	call.add(Calendar.DAY_OF_MONTH,30);
	
	String dateRequire=sim.format(call.getTime());
	System.out.println(dateRequire);
}
}
