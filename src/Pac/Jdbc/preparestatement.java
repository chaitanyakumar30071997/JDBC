package Pac.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class preparestatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver");
		Connection conobj = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "admin", "chaitanya@123");

		String sql= "insert into reg (id,name,email,phone) values (?,?,?,?)";
		PreparedStatement  ps=conobj.prepareStatement(sql);
		ps.setInt(1,7);
		ps.setString(2,"sai");
		ps.setString(3,"sai@gmail.com");
		ps.setString(4,"7984755");
		
		ps.executeUpdate();
		conobj.close();
        
    	
			

	}

}
