package practice;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class ReadDataDb_non_Select {
	
	public static void main(String[] args) throws Throwable {
		Driver driverRef=new Driver();
		DriverManager.registerDriver(driverRef);
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Students","root","root");
		
		Statement start=con.createStatement();
		String query="insert into students_info (regno, firstname, middlename, lastname) values('12', 'Neelam','Mishra', 'Tiwari')";
		
		int result=start.executeUpdate(query);
		if(result==1) {
			System.out.println("user is created");
		}else {
			System.out.println("user is not created");
		}
		
		con.close();
		
		
		
		
		
	}

}
