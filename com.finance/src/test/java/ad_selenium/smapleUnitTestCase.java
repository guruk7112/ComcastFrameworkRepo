package ad_selenium;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.protocol.Resultset;
import com.mysql.jdbc.Driver;

public class smapleUnitTestCase {

	@Test
	public void projecttest() throws Exception {
		String expect="Mani";
		
		boolean flag=false;
		//load/ register the db driver
		Driver ref=new Driver();
		DriverManager.registerDriver(ref);
		//connect to database
		Connection conn=DriverManager.getConnection("jdbc:mysql://49.249.28.281:3333/ninza_hrm","root","root");
		System.out.println("==done==");
		
		//create sql statement
	  Statement stat= conn.createStatement();
	  //execute select query and get result
	  ResultSet result=stat.executeQuery("select * from project");
	  while (result.next()){
		  String act=result.getString(4);
		  if(expect.equals(act)) {
			  flag=true;
			  System.out.println(expect+"is available");
		  }
		  
	  }
	 if(flag==false) {
		 System.out.println(expect+"is not available ");
	 }
	 //close the connection
	 conn.close();
		
	}
}
