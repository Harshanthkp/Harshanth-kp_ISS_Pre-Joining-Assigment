/*
This program demonstrates about the insertion of values into a table using jdbc and mysql queries.
*/

package jdbcISS;
import java.io.*;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
  
public class Insertion {
  
    static final String url = "jdbc:mysql://localhost:3306/students";
  
    public static void main(String[] args) throws ClassNotFoundException
    {
        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");
  
            Connection conn = DriverManager.getConnection(url, "root", "root");
  
           Statement stmt = conn.createStatement();
  
           int result = stmt.executeUpdate("insert into class values('1','Good')");
  
         if (result > 0)
                System.out.println("successfully inserted");
  
            else
                System.out.println("unsucessful insertion ");
  
           conn.close();
        }
  
        catch (SQLException e) {
            System.out.println(e);
        }
    }
}