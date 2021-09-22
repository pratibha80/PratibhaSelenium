package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class ReadDatafrom_MYSQL_DB {
	public static void main(String[] args) throws Throwable {
		
		//step 1 : register/load the mysql database
		Driver driverRef=new Driver();
		DriverManager.registerDriver(driverRef);
		
		
		//step 2 : get  connect to database
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Students","root","root");
		
		
		//step 3 : create SQL Statement 
		Statement start=con.createStatement();
		String query=" select * from students_info";
		
		
		// step 4 : execute statement/query
		ResultSet result=start.executeQuery(query);
		
		while(result.next()) {
			System.out.println(result.getInt(1)+"\t"+result.getString(2)+"\t"+result.getString(3)+"\t"+result.getString(4));
			
		}
		
		//step 5 : close the connection
		con.close();
		
		
		
		
		
	}
	

}
