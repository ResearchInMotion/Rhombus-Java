package com.array;

public class MaximumValueInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {1,5,32,2,3,5,789};
		
		
		int max=arr[0];
		for(int i=0; i<arr.length;i++) {
			
			if(arr[i]>max) max=arr[i];
		}
		
		System.out.println("the maximum is "+max);
		
		
		
	}

}
