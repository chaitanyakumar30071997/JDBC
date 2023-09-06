package Pac.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc_update_insert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver");
		Connection conobj = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "admin", "chaitanya@123");

		Statement stmt = conobj.createStatement();
		
        //insert databases; execute retinge type boolean values
		//stmt.execute("insert into reg(id,name,email,phone) values(1,'rani','rani@.com','947858');");
		//conobj.close();
		
		//update databases; execute retinge type boolean values
    	//stmt.execute("update reg set name='raja' where id = 1");
        //conobj.close()

		//Delete databases; 
    	stmt.execute("delete from reg where id=1");
        conobj.close();
			

	}

}
