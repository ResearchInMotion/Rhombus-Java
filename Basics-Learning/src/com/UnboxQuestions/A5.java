package com.UnboxQuestions;

import java.util.Scanner;

public class A5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Number : ");
		int num=scn.nextInt();
		
			int circum=(int) (2*Math.PI*Math.pow(num, 2));
			
			System.out.println("The circumfrence is : "+circum);

	}

}
