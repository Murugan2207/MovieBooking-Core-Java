package com.moviebooking.reglogin;
import java.util.Scanner;

import com.moviebooking.DAO.RegisterDAO;
import com.moviebooking.DAO.RegisterDAOImpl;
public class RegisterValidation {

		public static void userRegister() throws Exception {
			// TODO Auto-generated method stub
			Register register=new Register();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your Name: ");
			String name=sc.next();
			register.setName(name);
			System.out.println("Enter your Email: ");
			String email=sc.next();
			register.setEmail(email);
			System.out.println("Enter your Phone Number: ");
			String phoneNo=sc.next();
			register.setPhoneNo(phoneNo);
			System.out.println("Enter the Password: ");
			String Password=sc.next();
			register.setPassword(Password);
			sc.close();
		
		
			RegisterDAO registerDAO=new RegisterDAOImpl();
			registerDAO.register(register);
			
		}










	}


