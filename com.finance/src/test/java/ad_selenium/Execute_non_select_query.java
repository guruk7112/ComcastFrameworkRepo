package ad_selenium;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class Execute_non_select_query {
public static void main(String [] args) throws SQLException {
	Driver ref=new Driver();
	DriverManager.registerDriver(ref);
	
	Connection conn=DriverManager.getConnection("jdbc:mysql//49.249.28.218:3333/ninza_hrm","root","root");
	System.out.println("===done===");
	
	Statement stat=conn.createStatement();
	
	
	int result=stat.executeUpdate("insert into project values ('ty,'67','er')");
	System.out.println(result);
	
}
}

