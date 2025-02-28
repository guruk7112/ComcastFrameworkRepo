package ad_selenium;

import java.util.Random;

public class Generate_Random_Number {
public static void main(String [] args) {
	
	
	Random ran=new Random();
	int random=ran.nextInt(1000);
	
	
	
	System.out.println(random);
}
} 
