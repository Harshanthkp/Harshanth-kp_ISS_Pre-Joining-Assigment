/*
This program demonstrates all varieties of mysql queries applied to an jdbc program such as selecting distinct, dropping, counting, updating, deleting specific and updation.
*/

package jdbcISS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class connection {
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/lab10";
	static final String USER = "root";
	static final String PASS = "root";

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
//System.out.println("Creating statement...");
			stmt = conn.createStatement();
			String sql;
			ResultSet rs;
			System.out.println("---Options---");
			System.out.println(
					"a : View Manager names\nb : Different Designations of Employee\nc : Update Manager to MGR\nd : Delete\ne : Drop Employee table and exit\nf : exit");
			Scanner input = new Scanner(System.in);
			while (true) {
				System.out.print("\nYour Choice: ");
				char ch = input.next().charAt(0);
				switch (ch) {
				case 'a':
					System.out.println("\na)----------All Managers----------");
					sql = "SELECT * FROM Employee where desig = 'Manager'";
					rs = stmt.executeQuery(sql);
					while (rs.next()) {
						System.out.println(rs.getInt("id") + " - " + rs.getString("name"));
					}
					break;
				case 'b':
					sql = "SELECT distinct desig from employee;";
					rs = stmt.executeQuery(sql);
					System.out.println("\nb)----------Designations----------");
					while (rs.next()) {
						System.out.println(rs.getString("desig"));
					}
					break;
				case 'c':
					System.out.println("\nc)----------Update Manager to MGR----------");
					sql = "UPDATE employee set desig = 'MGR' where desig = 'Manager';";
					int updt = stmt.executeUpdate(sql);
					System.out.println("Values are updated.\nTable after upadating: ");
					sql = "SELECT * from employee;";
					rs = stmt.executeQuery(sql);
					while (rs.next()) {
						int id = rs.getInt("id");
						String name = rs.getString("name");
						String desig = rs.getString("desig");
						System.out.print("ID: " + id);
						System.out.print(", Name: " + name);
						System.out.print(", Designation: " + desig);
						System.out.println();
					}
					break;
				case 'd':
					System.out.println("\nd)----------Delete Clerk records----------");
					sql = "DELETE from employee where desig = 'Clerk';";
					int count = stmt.executeUpdate(sql);
					System.out.println(
							"Number of rows deleted : " + count + "\nValues are updated.\nTable after upadating: ");
					sql = "SELECT * from employee;";
					rs = stmt.executeQuery(sql);
					while (rs.next()) {
						int id = rs.getInt("id");
						String name = rs.getString("name");
						String desig = rs.getString("design");
						System.out.print("ID: " + id);
						System.out.print(", Name: " + name);
						System.out.print(", Designation: " + desig);
						System.out.println();
					}
					break;
				case 'e':
					System.out.println("\ne)----------Drop Employee----------");
					sql = "SELECT COUNT(*) from INFORMATION_SCHEMA.tables where table_schema = 'lab10' and table_name = 'employee'";
					rs = stmt.executeQuery(sql);
					if (rs.next()) {
						int c = rs.getInt("count(*)");
						if (c != 0) {
							sql = "Drop table Employee";
							stmt.executeUpdate(sql);
							System.out.println("Table exists and is dropped.");
						} else {
							System.out.println("Table does not exist.");
						}
						System.out.println("Exiting...");
					}
					break;
				default:
					break;
				}
				if (ch == 'e' || ch == 'f') {
					break;
				}
			}
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			}
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
	}
}