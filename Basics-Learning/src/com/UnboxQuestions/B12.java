package com.UnboxQuestions;

import java.util.Scanner;

public class B12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("The selling price is : ");
	
		int cp=scn.nextInt();
	
		System.out.println("The cost price is : ");
	
		int sp=scn.nextInt();
		
		if(cp<sp){
			System.out.println("You are in loss ");
			
			int price = sp-cp;
			
			System.out.println("And the loss is :"+price);
		}else{
			
			System.out.println("You made a profit");
		}
	
	

	}

}
