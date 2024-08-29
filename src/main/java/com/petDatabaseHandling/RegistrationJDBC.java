package com.petDatabaseHandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.dataModels.Pet;
import com.dataModels.User;

public class RegistrationJDBC {
	private Connection con;
	 public Connection connectTopetDB() {
		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		    } 
		 catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/petnestdatabase", "root", "1234");
			} 
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return con;
	 }
	 public boolean postUserDetails(User user,Connection con) {
		 String UserInsertSqlQuery="insert into Users (fullName,email,password,phoneNumber) values (?,?,?,?)";
		 try {
			PreparedStatement p=con.prepareStatement(UserInsertSqlQuery);
			System.out.println(" i am  post users details "+user.getFullname());
			p.setString(1, user.getFullname());
			p.setString(2, user.getEmail());
			p.setString(3, user.getPassword());
			p.setString(4, user.getPhonenumber());
			p.executeUpdate();
			System.out.println("user data successfully inserted");
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	 }
	 public boolean postPetDetails(Pet pet,Connection con,User user) {
		 String PetInsertSqlQuery="insert into Pets (email,petName,petType,petGender,petPrice,petDescription,petImage) values (?,?,?,?,?,?,?)";
		 try {
				PreparedStatement p=con.prepareStatement(PetInsertSqlQuery);
				p.setString(1,user.getEmail());
				p.setString(2,pet.getPetName());
				p.setString(3,pet.getPetType());
				p.setString(4,pet.getPetGender());
				p.setInt(5,pet.getPetPrice());
				p.setString(6,pet.getPetDesc());
				p.setBlob(7,pet.getPetImage());
				p.executeUpdate();
				System.out.println("pet data successfully inserted");
				return true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 return false;
	 }
	 public User isUserPresent(Connection c,String email,String password) {
		 String fetchUsers="select email,password,fullName from Users";
		 User u=new User();
		 try {
//			 Statement st=c.createStatement();
				 Statement st=c.createStatement();
			 
			//PreparedStatement p=con.prepareStatement(fetchUsers);
			ResultSet r=st.executeQuery(fetchUsers);
			while(r.next()) {
				if(email.equals(r.getString(1))) {
					u.setEmail(email);
					System.out.println("seted email"+u.getEmail());
					u.setPassword(r.getString(2));
					u.setFullname(r.getString(3));
					return u;
				}
			}
		} catch(NullPointerException e) {
			 System.out.println("isUserPresent(Connection c,String email,String Password) method may be called with connection object that is null");
		 }
		 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;
	 }
	 public boolean isEmailAlreadyExist(Connection c,String email) {
		 String emailCheck="select email from Users where email=?";
		 PreparedStatement pt=null;
		 ResultSet r=null;
		 try {
			pt=c.prepareStatement(emailCheck);
			pt.setString(1,email);
			r=pt.executeQuery();
			if(r.next()) {
				return true;
			}
			else {
				return false;
			}
		}catch(NullPointerException e) {
			System.out.println("null pointer exeception inn .RegistrationJDBC.isEmailAlreadyExist");
		}
		 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(pt!=null) pt.close();
				if(r!=null) r.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		System.out.println("something went wrong");
		return false;
	 }
}
