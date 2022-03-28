package com.moviebooking.reglogin;

import java.util.Scanner;
import com.moviebooking.reglogin.Register;
	public class Home {
	public static void main(String[] args) throws Exception {
		
			
			System.out.println("Welcome to MovieBooking App ");
			System.out.println("1) New User");
			System.out.println("2) Existing User");
			
			Scanner sc = new Scanner(System.in);
			int a=sc.nextInt();
			
			
			if (a==1) {
				System.out.println("Enter the details to register");
				RegisterValidation.userRegister();
			}
			
			else if (a==2) {
				System.out.println("Enter the details to Login");
				Login.login();
			}			
			
			else {
				System.out.println("please enter valid Option");
			}
		}
	

	}
	
