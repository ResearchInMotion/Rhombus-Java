package com.Static;

public class StaticMethod {
	
	static int addition(int a , int b ){
		
		int c;
		c=a+b;
		
		System.out.println(c);
		return c;
		
	}
	
	public static void main(String[] args) {
		
		
		System.out.println(addition(45, 67));
		addition(45, 2);
		
	}

}
