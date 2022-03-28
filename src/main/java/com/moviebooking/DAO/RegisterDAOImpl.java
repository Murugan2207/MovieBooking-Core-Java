package com.moviebooking.DAO;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;

import com.moviebooking.reglogin.ConnectionUtil;
import com.moviebooking.reglogin.Register;
	public class RegisterDAOImpl implements RegisterDAO{
		@Override
		public void register(Register register) throws Exception {
					
			Connection connection=null;
			connection=ConnectionUtil.getConnection();
			
			    String sql="INSERT INTO Movieuser_list(NAME,email,phoneno,PASSWORD) VALUE(?,?,?,?)";
			    PreparedStatement statement=connection.prepareStatement(sql);
			    statement.setString(1,register.getName());
			    statement.setString(2,register.getEmail());
			    statement.setString(3,register.getPhoneNo());
			    statement.setString(4,register.getPassword());
			  
			
			    int rows=statement.executeUpdate();
			    if(rows==1) {
			    	System.out.println("Register successful");
			    }
			    else {
			    	System.out.println("Register Again");
			    }
			    
			  
			    statement.close();
			    connection.close();
			  
			    		
		}

		
	}


