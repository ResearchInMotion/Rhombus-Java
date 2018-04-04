package com.StringHandling;

import java.util.Scanner;

public class ReverseofString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Please enter your string : ");
		
		Scanner scn = new Scanner(System.in);
		
		String UsersString=scn.nextLine();
		
		
		System.out.println("Please enter your string : ");
		
		Scanner scn2 = new Scanner(System.in);
		
		String UsersString2=scn.nextLine();
		
		StringBuilder sb= new StringBuilder();
		sb.append(UsersString);
		System.out.println(sb.reverse());
		
		
		char[] vals=UsersString2.toCharArray();
		for(int i=vals.length-1;i>=0;i--){
			System.out.print(vals[i]);
		}
		
		
		

	}

}
