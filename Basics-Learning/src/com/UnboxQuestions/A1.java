package com.UnboxQuestions;

import java.util.Scanner;

public class A1 {
	
	static int roll_no,marks,phone;
	static String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Please enter a roll number :");
		roll_no=scn.nextInt();
		
		System.out.println("Please enter a name : ");
		name=scn.next();
		
		System.out.println("Please enter Marks : ");
		marks=scn.nextInt();
		
		System.out.println("Please enter a phone : ");
		phone=scn.nextInt();
		
		System.out.println("The roll number is "+roll_no);
		System.out.println("The name is "+name);
		System.out.println("The marks is "+marks);
		System.out.println("The phone is "+phone);
		
		
		
		
		
		
		
		
		

	}

}
