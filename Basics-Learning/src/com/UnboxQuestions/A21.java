package com.UnboxQuestions;

import java.util.Scanner;

public class A21 {
	
	void circle(){
		
		int r=98;
		
		System.out.println("The area is "+ Math.PI*Math.pow(r, 2));
		
	}
	
	void circumfrence(){
		
		int r=98;
		
		System.out.println("The circumfrenece "+2*Math.pow(r, 2)*Math.PI);
	}

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("enter your choce " );
		
		int choice=scn.nextInt();
		
		if(choice==1){
			A21 a=new A21();
			a.circle();
		}
		else if(choice==2){
			A21 a=new A21();
			a.circumfrence();
		}
		// TODO Auto-generated method stub
		
		
		
		
		

	}

}
