package ad_selenium;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class db {
public static void main(String [] args) throws Exception {
	
	Driver driver=new Driver();
	DriverManager.registerDriver(driver);
	
	Connection conn=DriverManager.getConnection("jdbc:mysql://49.249.28.218:3333/ninza_hrm","root","root");
	
	 Statement stat= conn.createStatement();
	 
	ResultSet result= stat.executeQuery("select * from project");
	
	
	System.out.println(result.getString(2)+"\td"+result.getString(3));
}
}
