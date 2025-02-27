package co.cast.DataBaseUtitlity;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class DatabaseUtility {
	
	Connection conn;// declared globally to close the connection in other method
	public void getDbConnection(String url,String username,String password) throws Throwable {
		
		try { //exceptioin hadling mechanisum for if connection is not happend we need to handle
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);		
   conn=DriverManager.getConnection(url, username, password); 
		}catch(Exception e) { }
	}
	
	public void getDbConnection() throws Throwable {
		
		try { //exceptioin hadling mechanisum for if connection is not happend we need to handle
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);		
   conn=DriverManager.getConnection("jdbc:mysql://49.249.28.281:3333/ninza_hrm","root","root"); 
		}catch(Exception e) { }
	}
	
	public void closeDbconnection() throws SQLException{
		try {
		conn.close();	           
		}catch(Exception e) {}     //if connection is not happend handle the exception
	}
	
	public ResultSet executeSelectQuery(String query) throws SQLException {
		ResultSet result=null;
		try {
	Statement stat=	conn.createStatement();
	 result=stat.executeQuery(query);
		}catch(Exception e) {}
return result;      
	}
	
	public int  executeNonSelectQuery(String query) throws Exception {
		int result=0;
		try {
		Statement stat=conn.createStatement();
		result =stat.executeUpdate(query);
		}catch(Exception e) {}
return result;
	}	
}
