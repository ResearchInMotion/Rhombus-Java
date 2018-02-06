package com.array;

import java.util.Scanner;

public class ScannerJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the values you want to enter ");
		int a=sc.nextInt();
		
		int[] arr=new int[a];
		
		System.out.println("Enter the elements in array");
		
		int total=0;
		
		for(int i=0;i<a;i++) {
			
			arr[i]=sc.nextInt();
			
			total+=arr[i];
			
			
		}
		
		System.out.println("The total of your input array is "+total);
		
		
		
		
		
	}

}
