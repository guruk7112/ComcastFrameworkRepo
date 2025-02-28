package ad_selenium;

public class generatie_alphaNumeric_data {
public static void main(String [] args) {
	int n=20;
	
	//chose a charecter random from this string 
	String alphanumeric="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz";
	
	//create string buffer size of alphanumericstirng
	StringBuilder sb=new StringBuilder(n);
	
	for(int i=0;i<n;i++) {
	
	
	//generate a random number between 0 and alpha string variable length
	int index=(int)(alphanumeric.length()*Math.random());
	
	//add charecter one by one in end of sb
	sb.append(alphanumeric.charAt(index));
	}
	System.out.println(sb);
	
	
}
}
