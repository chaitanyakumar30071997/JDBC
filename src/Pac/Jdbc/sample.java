package Pac.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class sample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		 Class.forName("com.mysql.jdbc.Driver");
		 Connection conobj = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "admin", "chaitanya@123");
		 Statement stmt = conobj.createStatement();

			ResultSet rs = stmt.executeQuery("  select * from reg");

			while (rs.next()) {
				System.out.println(rs.getInt(1) + "::" + rs.getString(2) + ": " + rs.getString(3));
			}
		 
	}

}
