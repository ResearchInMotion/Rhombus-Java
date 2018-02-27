package com.staticc.methods;

public class StaticVariable {
	
	static int age;
	static String name;
	static float val;
	
	
	 static void display() {
		
		System.out.println("The value of age is "+age);
		System.out.println("The value of name is "+name);
		System.out.println("The value of val is "+val);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		display();

	}

}
