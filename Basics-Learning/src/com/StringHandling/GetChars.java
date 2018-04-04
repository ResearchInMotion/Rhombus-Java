package com.StringHandling;

public class GetChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="Sahil";
		char [] arr= new char[7];
		
		name.getChars(0, 3, arr, 0);
		System.out.println(arr);
		
		
		
	}

}
