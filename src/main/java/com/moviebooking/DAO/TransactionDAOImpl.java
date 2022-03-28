package com.moviebooking.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.moviebooking.model.BookingTransaction;
import com.moviebooking.reglogin.ConnectionUtil;

public class TransactionDAOImpl {
	
	
	public static void transaction(BookingTransaction transaction)throws Exception {
		Connection connection=null;
		connection=ConnectionUtil.getConnection(); 
		
		String sql="INSERT INTO transaction_details(NAME,email,movie_booked,payment_type,total_amount) VALUES (?,?,?,?,?);";
	    PreparedStatement statement=connection.prepareStatement(sql);
	  
		String upiId =null;
		String movie_booked=null;
		String payment_type=null;
		
		String total_amount=null;
		statement.setString(1,upiId );
		
		ResultSet rs=statement.executeQuery();
		
		 String userPassword=null;
	  
	
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
