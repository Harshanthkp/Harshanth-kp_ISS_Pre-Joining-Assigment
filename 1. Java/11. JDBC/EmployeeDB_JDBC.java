/*
This program demonstrates about an employee database working including all the queries to access the database using jdbc and mysql.
*/

package jdbcISS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Employee {
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/employee";
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
			System.out.println("---EMPLOYEE EXCHANGE OFFICE---\n");
			System.out.println(
					"a : Display all Employee details\nb : Insert Values\nc : Update Salary \nd: DELETE\n-> exit");
			Scanner input = new Scanner(System.in);
			while (true) {
				System.out.print("\nYour Choice: ");
				char ch = input.next().charAt(0);
				switch (ch) {
				case 'a':
					System.out.println("\na)----------Display All details----------");
					sql = "SELECT * FROM emp";
					rs = stmt.executeQuery(sql);
					while (rs.next()) {
						String no = rs.getString("empno");
						String name = rs.getString("name");
						String dep = rs.getString("dep");
						String addr = rs.getString("addr");
						String pin = rs.getString("pin");
						int sal = rs.getInt("sal");
						String loc = rs.getString("loc");
						String email = rs.getString("email");

						System.out.println("emp no: " + no + "\n" + "name: " + name + "\n" + "department: " + dep + "\n"
								+ "address" + addr + "\n" + "pincode" + pin + "\n" + "salary" + sal + "\n"
								+ "location: " + loc + "\n" + "email: " + email + "\n");
					}
					break;
				case 'b':
					sql = "INSERT INTO EMP VALUES('A1','achu','manager','chennai','641005',100000,'egmore','ach@mail.com')";
					stmt.executeUpdate(sql);
					sql = "INSERT INTO EMP VALUES('A2','dani','manager','chennai','641005',200000,'egmore','dani@mail.com')";
					stmt.executeUpdate(sql);
					System.out.println("VALUES INSERTED SUCCESSFULLY !!!\n\n");
					break;

				case 'c':
					System.out.println("\nc)----------Update--------------");
					sql = "UPDATE emp set sal = sal +1000;";
					int updt = stmt.executeUpdate(sql);
					System.out.println("Values are updated.\nTable after updating: ");
					sql = "SELECT * from emp;";
					rs = stmt.executeQuery(sql);
					while (rs.next()) {
						String no = rs.getString("empno");
						String name = rs.getString("name");
						String dep = rs.getString("dep");
						String addr = rs.getString("addr");
						String pin = rs.getString("pin");
						int sal = rs.getInt("sal");
						String loc = rs.getString("loc");
						String email = rs.getString("email");

						System.out.println("emp no: " + no + "\n" + "name: " + name + "\n" + "department: " + dep + "\n"
								+ "address" + addr + "\n" + "pincode" + pin + "\n" + "salary" + sal + "\n"
								+ "location: " + loc + "\n" + "email: " + email + "\n");

					}
					break;
				case 'd':
					System.out.println("\nd)----------Delete Values----------");
					sql = "DELETE from emp where name='dani'";
					stmt.executeUpdate(sql);
					sql = "SELECT * from emp;";
					rs = stmt.executeQuery(sql);
					while (rs.next()) {
						String no = rs.getString("empno");
						String name = rs.getString("name");
						String dep = rs.getString("dep");
						String addr = rs.getString("addr");
						String pin = rs.getString("pin");
						int sal = rs.getInt("sal");
						String loc = rs.getString("loc");
						String email = rs.getString("email");

						System.out.println("emp no: " + no + "\n" + "name: " + name + "\n" + "department: " + dep + "\n"
								+ "address" + addr + "\n" + "pincode" + pin + "\n" + "salary" + sal + "\n"
								+ "location: " + loc + "\n" + "email: " + email + "\n");
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
