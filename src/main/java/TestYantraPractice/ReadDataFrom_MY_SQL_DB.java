package TestYantraPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class ReadDataFrom_MY_SQL_DB {
	
	public static void main(String[] args) throws Throwable {
		Driver driverRef=new Driver();
		DriverManager.registerDriver(driverRef);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Students","root","root");
		Statement start = con.createStatement();
		String query="select * from students_info";
		ResultSet result = start.executeQuery(query);
		while(result.next()) {
			System.out.println(result.getInt(1)+"\t"+ result.getString(2)+"\t"+ result.getString(3)+"\t"+ result.getString(4));
		}
		con.close();
		
	}

}
