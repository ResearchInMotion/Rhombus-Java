package com.UnboxQuestions;

import java.util.Scanner;

public class A22 {

	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("The number is ");
		
		int num=scn.nextInt();
		
		if(num%2==0){
			
			System.out.println("The square is "+Math.pow(num, 2));
		}else{
			
			System.out.println("The cube is "+Math.pow(num, 3));
		}
		
		
				
				
		// TODO Auto-generated method stub

	}

}
