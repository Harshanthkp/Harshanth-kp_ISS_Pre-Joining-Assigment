// This program demonstrates about the connection with the mysql server with the username and password access.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBconnection {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/students";
		String username = "root";
		String password = "root";
		String query = "SELECT * FROM class group by number having count(*)<2";

		Connection con = DriverManager.getConnection(url, username, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		System.out.println("id\tnumber");
		try {
			while(rs.next()) {
				String id = rs.getString("sid");
				String number = rs.getString("number");
				System.out.println(id+ "\t" + number);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}