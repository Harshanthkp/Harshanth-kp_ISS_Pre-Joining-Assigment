/*
This program demonstrates the deletion of specific records from a table with the help of jdbc and sql queries.
*/

package jdbcISS;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
public class Delete {
	public static void main(String[] args) {
	       Connection conn = null;
	      Statement stmt = null;
	       try {
	          try {
	             Class.forName("com.mysql.cj.jdbc.Driver");
	          } catch (Exception e) {
	             System.out.println(e);
	          }
	          conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/students", "root", "root");
	          System.out.println("Connection is created successfully:");
	          stmt = (Statement) conn.createStatement();
	          String query1 = "delete from class " +
	          "where sid=14";
	          stmt.executeUpdate(query1);
	          System.out.println("Record is deleted from the table successfully..................");
	       } catch (SQLException excep) {
	          excep.printStackTrace();
	       } catch (Exception excep) {
	          excep.printStackTrace();
	       } finally {
	          try {
	             if (stmt != null)
	             conn.close();
	          } catch (SQLException se) {}
	          try {
	             if (conn != null)
	             conn.close();
	          } catch (SQLException se) {
	             se.printStackTrace();
	          }
	       }
	       System.out.println("Please check it in the MySQL Table. Record is now deleted.......");
	    }
}

