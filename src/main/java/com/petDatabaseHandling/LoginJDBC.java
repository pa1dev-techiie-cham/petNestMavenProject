package com.petDatabaseHandling;

import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//import com.dataModels.Login;
import com.dataModels.User;

public class LoginJDBC {
////	private Connection stmt;
////	private Connection con;
//	public  void PetNestUser(Login login) {
//		try {
////			Class.forName("com.mysql.cj.jdbc.Driver");
////		System.out.println("Drivers Esthablish");
////		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/petdatabase","root","1234");
////		System.out.println("Connection established");
////		System.out.println("Creating Statemnet");
////		Statement stmt= con.createStatement();
////		String sql = "INSERT INTO LoginData(Email, Password) VALUES ('" + login.getEmail() + "', '" + login.getPassword() + "')";
////		stmt.execute(sql);
////		System.out.println("Data inserted succesfully");
////		stmt.close();
////		con.close();
//		RegistrationJDBC robj=new RegistrationJDBC();
//		Connection c=robj.connectTopetDB();
//		
//	}
//		catch(Exception e) 
//		{
//			System.out.println("Exception"+e.getLocalizedMessage());
//		}
//	}
	public void postLoginDetails(Connection c,User u) throws SQLException {
		Statement stmt= c.createStatement();
		String sql = "INSERT INTO LoginData(Email, Password) VALUES ('" + u.getEmail() + "', '" + u.getPassword() + "')";
		stmt.execute(sql);
		System.out.println("login data saved successfully");
		stmt.close();
	}
}
