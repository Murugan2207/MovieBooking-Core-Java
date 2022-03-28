package com.moviebooking.model;

import java.util.Scanner;

public class Payment {
	
	
	static Scanner sc=new Scanner(System.in);
	public static String takeCaptcha() {
		int a = (int)(Math.random()*(9000-100+1)+100);  
		String b=String.valueOf(a);
		return b;
	}
	
	
	public static int captchaVerification() {
		String captcha=takeCaptcha();
		System.out.println(captcha);
		System.out.println("Enter the captcha");
		String input=sc.next();
		if(input.equals(captcha)) {
			return 0;
		}
		else {
			captchaVerification();
		}
		return 1;
	}
	
	

}
