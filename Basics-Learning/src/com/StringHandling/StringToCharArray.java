package com.StringHandling;

import java.util.Locale;

public class StringToCharArray {
	
	public static void main(String[] args) {
		
		String name="Sahil";
		String name1="$";
		String space=" Sahil    ";
		
		char[] values=new char[5];
		
		values=name.toCharArray();
		
//		System.out.println(values);
//		
//		for(int i=0;i<values.length;i++){
//			System.out.println(values[i]);
//		}
		
		
		String lower=name.toLowerCase();
		String higher=name.toUpperCase();
		
		String locale=name1.toLowerCase();
		String locale2=name1.toUpperCase(Locale.ENGLISH);
		
		System.out.println(lower);
		System.out.println(higher);

		System.out.println(locale);
		System.out.println(locale2);
		
		System.out.println(space.trim());
		
		
		
	}

}
