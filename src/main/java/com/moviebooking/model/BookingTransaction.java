package com.moviebooking.model;

import java.util.Scanner;

public class BookingTransaction {
	BookingTransaction transaction=new BookingTransaction();
	public static void transaction() {
		
		System.out.println("Please select the mode of payment");
		System.out.println("1.UPI");
		System.out.println("2.Debit/Credit Card");
		Scanner sc3=new Scanner(System.in);
		int e=sc3.nextInt();
		if(e==1) {
			System.out.println("Enter your UPI Id");
			Scanner sc4=new Scanner(System.in);
			String upiId=sc4.next();
			if (upiId.contains("@")) {
				int captcha=Payment.captchaVerification();
				if(captcha==0) 
				System.out.println("Payment Successful");
			sc4.close();
				}
		}
		else if(e==2) {
			System.out.println("Enter your 16 Digit card Number");
			Scanner sc5=new Scanner(System.in);
			String card=sc5.next();
			if (card.length()==16){
				int captcha=Payment.captchaVerification();
				//int a=sc5.nextInt();
				if(captcha==0) 
				System.out.println("Payment Successful");
			}
			
			
		}
		
	}

}
