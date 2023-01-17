package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {

	private final static String URL = "jdbc:mysql://localhost:3306/desk";
	private final static String USER = "root";
	private final static String PASSWORD = "0810";
	
	public static void TestCon() throws SQLException{
		Connection c = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver found");
			System.out.println("Connecting...");
			c = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (Exception e) {
			System.out.println("Cannot connect the database");
		}finally {
			if(c != null) {
				c.close();
			}
		}
	}
	
}
