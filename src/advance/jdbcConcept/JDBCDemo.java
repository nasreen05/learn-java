package advance.jdbcConcept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) {
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");		//1. 1st step
			System.out.println("Load successful");
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo?user=root&password=neha@123");  //2nd step
			System.out.println("Connection success");
			
			Statement statement = connection.createStatement();		//3rd step..
			
			statement.execute("INSERT INTO users (pass, email) VALUES ('1122', 'neha@111')");		//4 th step..
			System.out.println("Query execute...");
			
			statement.close();
		} catch (ClassNotFoundException | SQLException e) {
		
			e.printStackTrace();
		}

	}

}
