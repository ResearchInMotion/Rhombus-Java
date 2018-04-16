package com.UnboxQuestions;

import java.util.Scanner;

public class A10 {
	
	static int daysinweek=7;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		System.out.println("The days are ");
		int days=scn.nextInt();
		
		int year=days/365;
		days=days%365;
		
		int weeks=days/7;
		days=days%7;
		
		days=days;
		
		
		System.out.println("Years "+year);
		
		
		
		System.out.println("weeks "+weeks);
		
		System.out.println("Days "+days);
		
		
		

	}

}
