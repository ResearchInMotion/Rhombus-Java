package com.StringHandling;

public class CopyValueCharAt {

	public static void main(String[] args) {
		
		
		char[] vals={'a','b','c','d','e','f','g','e'};
		// TODO Auto-generated method stub
		
		String value="";
		value=value.copyValueOf(vals, 0, 4);
		System.out.println(value);

	}

}
