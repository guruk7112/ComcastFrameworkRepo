package ad_selenium;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class read_data_from_DB_select {
public static void main(String [] args) throws SQLException {
	
	Connection conn=null;
	
	try{//step 1 : load /register the database driver
	Driver ref=new Driver();
	DriverManager.registerDriver(ref);
	
	//step 2 :connect to database
 conn=DriverManager.getConnection("jdbc:mysql://49.249.28.218:3333/ninza_hrm","root","root");
System.out.println("==done==");

//step 3 : create sql statement 
Statement stat=conn.createStatement();

//step 4 : execute select query and get result
ResultSet result=stat.executeQuery("select * from project;");
while(result.next()) { //next() to execute till there is null in the table
	System.out.println(result.getString(1)+"\t"+result.getString(2)+"\t"+result.getString(3));
	
	//to check the expected data is available are not 
} 
	} catch(Exception e) {
		System.out.println("handled");
	} finally {
           //step 5 : close the connection
          conn.close();
}
}}
