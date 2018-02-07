package com.array;

import java.util.Arrays;

public class ArraysSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,22,3,44,51,66};
	
		for(int i=0;i<arr.length;i++) {
			
			System.out.println("The arrays is "+arr[i]);
		}
		
		Arrays.sort(arr);
		
		for(int i =0;i<arr.length;i++) {

		System.out.println("The sorted is "+arr[i]);
		
		
		

		}
	}

}
