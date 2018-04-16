package com.UnboxQuestions;

import java.util.Scanner;

public class A15 {
	
	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Num 1 :");
		
		int num1=scn.nextInt();
		
		System.out.println("Num 2 :");
		
		int num2=scn.nextInt();
		
		if(num1>num2){
			
			System.out.println("Num1 is high");
		}else{
			System.out.println("Num2 is high");
		}
		
	}

}
