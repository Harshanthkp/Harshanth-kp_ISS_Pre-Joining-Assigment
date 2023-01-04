/*
This program demonstrates about all the basic queries of mysql (Create, Insert, Select) with the help of JDBC and mysql.
*/

package jdbcISS;
import java.sql.*;

public class CreateInsertDisplay {
	public static void main(String a[]) throws Exception {
		Connection con;
		Statement r2;
		ResultSet r;
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost/students", "root", "root");
		r2 = con.createStatement();

		r2.executeUpdate("create table student(rollno int,name varchar(50),percen int)");
		r2.executeUpdate("insert into student values(1,'Harshanth',100)");
		r2.executeUpdate("insert into student values(2,'Avishnakp',89)");
		r2.executeUpdate("insert into student values(3,'Rajanravi',70)");

		System.out.println("Rollno\tName\t\tPercentage");
		r = r2.executeQuery("select * from student");
		try {

			while (r.next())
				System.out.println(r.getInt(1) + "\t" + r.getString(2) + "\t\t" + r.getInt(3));

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
