package com.moviebooking.reglogin;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.moviebooking.DAO.MoviesDao;
import com.moviebooking.model.BookingTransaction;
import com.moviebooking.model.MovieBooking;


public class MovieList {
	public static void allMovies() throws SQLException
	{
		List<MovieBooking> movies=MoviesDao.findAllMovies();
		
		
		System.out.println("movieId            \t"+"MovieName              \t"+"TicketPrice   \t");
		for(MovieBooking movie:movies)
		{
			System.out.println(movie.getId()+"                      "+movie.getMovieName()+"                    "+movie.getPrice()+"                    ");
		}
	
	       System.out.println("Please book your movie from above list");
	       Scanner sc=new Scanner(System.in);
	       int c=sc.nextInt();
	       if((c==1)||(c==2)||(c==3)||(c==4)||(c==5)) {
	    	   System.out.println("You selected a movieId:"+c);
	    	   System.out.println("please selected Number of seats ");
	    	   int d=sc.nextInt();
	    	   if(d<=100) {
	    		   System.out.println("You have selected "+d+"seats");
	    		   int total=d*120;
	    		   System.out.println("Total cost of your booking="+total);
	    		   BookingTransaction.transaction();
	    		   System.out.println("Movie booked successfully");
	    	   }
	    	   else {
	    		   System.out.println("you are supposed to select maximum 100seats ");
	    	   }
	    	   
	       }



		}
}

 