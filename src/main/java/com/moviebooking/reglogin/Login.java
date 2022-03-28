package com.moviebooking.reglogin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Login {
	
	public static void login()throws Exception{
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the email");
		String email=sc.next();
		
		System.out.println("Enter the password");
		String password=sc.next();
		
		Connection connection=null;
		 PreparedStatement statement=null;
		connection=ConnectionUtil.getConnection();
		
		String query="SELECT email,PASSWORD FROM Movieuser_list WHERE email=?";
		
		statement=connection.prepareStatement(query);
		statement.setString(1, email);
		
		ResultSet rs=statement.executeQuery();
		 String userMail=null;
		 String userPassword=null;
		 
		 while (rs.next()) {
			 
		 	 userMail=rs.getString("email");
			 userPassword=rs.getString("password");
			 if (userMail == null) {
					System.err.println("No records found - please register");
				} else if (userPassword.equals(password)) {
					System.out.println("**(:Welcome to ABC Cinemas:)**"+'\n'+"We are happy to Have you:)"+'\n'+"The Movies Available are....");
					MovieList.allMovies();
				}
				else {
					System.err.println("Invalid Data");
				}
				sc.close();
			 
		 }
		
		
		
	}
}


