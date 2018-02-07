package com.array;

import java.util.Scanner;

public class ArrayLinearSearch {

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the length of the array ");
		
		int size=sc.nextInt();
		
		int[]arr=new int[size];
		
		System.out.println("Please enter the elements in your array");
		
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Please enter the element to search ");
		
		int target=sc.nextInt();
		
		for(int i=0;i<arr.length;i++) {
			
				if(arr[i]==target) {
				
				System.out.println("Element found " +i);
				
				break;
			}
			
		}
		
		
		
		
	}
}
