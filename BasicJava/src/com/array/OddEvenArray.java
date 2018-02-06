package com.array;

import java.util.Scanner;

public class OddEvenArray {
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		
		int size=sc.nextInt();
		
		
		int[]arr=new int[size];
		
		System.out.println("Please enter the elements ");
		
		for(int i=0;i<size;i++) {
			
			arr[i]=sc.nextInt();
			
		}
		
		
		System.out.println("The even elments are");
		
		for(int i=0;i<size;i++) {
			
			if(arr[i]%2==0) {
					
				System.out.println("The even elemnts are "+arr[i]);
				}
			
		}
		
		System.out.println("The odd elements are");
		
		for(int i=0;i<size;i++) {
			
			if(arr[i]%2!=0) {
					
				System.out.println("The odd elemnts are "+arr[i]);
				}
			
		}
		
		
		
	}
}


