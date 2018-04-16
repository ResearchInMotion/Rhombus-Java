package com.UnboxQuestions;

import java.util.Scanner;

public class B8 {
	

	

	public static void main(String[] args) {
		
		
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("The salary is : ");
		
		double salary=scn.nextDouble();
		
		if((salary>5000) && (salary<10000)){
			
			int DA=(int) (salary*0.5);
			int HRA=(int) (salary*0.10);
					
			
			
			System.out.println("JI");
			
			System.out.println(DA);
			System.out.println(HRA);
	
			
			}else if((salary>10001) && (salary<15000)){
				
				System.out.println("HI");
				
				int DA=(int) (salary*0.8);
				int HRA=(int) (salary*0.15);
				
				System.out.println(DA);
				System.out.println(HRA);
			
	
			
			}
		
		
		
		
		
		
		

	}

}
