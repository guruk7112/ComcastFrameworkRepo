package co.cast.generic.WebDriverUtitlity;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class JavaUtility {

	public int getRandomNumber() {                     //random number
	Random ranDom=new Random();
	int ranDomNumber=ranDom.nextInt(5000);
	
	return ranDomNumber;
}
	public String getSystemDateYYYYDDMM() {           //get current date 
		
		Date dateobj=new Date();
		SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd");
		String date=sim.format(dateobj);
		
		return date;
	}
	
	public String getRequiredDateYYYYMMDD(int days) {   //get require date  
		SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd");
		
		Calendar cl=sim.getCalendar();
		cl.add(Calendar.DAY_OF_MONTH,days);
		String enddate=sim.format(cl.getTime());
		
		return enddate;
	}
	
	
}