package com.moviebooking.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.moviebooking.model.MovieBooking;
import com.moviebooking.reglogin.ConnectionUtil;

public class MoviesDao {
	public static List<MovieBooking> findAllMovies() throws SQLException
	{
		List<MovieBooking> list=new ArrayList<MovieBooking>();
		Connection connection=ConnectionUtil.getConnection();
		PreparedStatement statement=null;
		ResultSet result=null;
		String query="select * from movies_list";
		statement=connection.prepareStatement(query);
		result=statement.executeQuery();
		String name=null;
		int price=0;
		int id=0;
		MovieBooking movies=null;
		while(result.next())
		{
			movies=new MovieBooking();
			name=result.getString("movie_name");
			price=result.getInt("ticket_price");
			id=result.getInt("id");
			movies.setMovieName(name);
			movies.setPrice(price);
			movies.setId(id);
			list.add(movies);
		}
		return list;
		
	
		
	}

}
