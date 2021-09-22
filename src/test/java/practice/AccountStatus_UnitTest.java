package practice;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class AccountStatus_UnitTest {
	
	@Test
	public void testAccountType() {
		Connection con=null;
		try {
			Driver driverRef=new Driver();
			DriverManager.registerDriver(driverRef);
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Students","root","root");
			Statement start=con.createStatement();
			String query="select * from Account";
			ResultSet result = start.executeQuery(query);
			while(result.next())
			{
				int accNum = result.getInt("accno");
				System.out.println(accNum);
				if(accNum==123 && result.getString("accountType").equals("Gold")) {
					System.out.println("account type is gold & verified==PASS");
					break;
				}
			}
		}catch (Exception e) {
			System.err.println("account type is not gold ==FAIL");
			}finally {
				
			}
}

}
