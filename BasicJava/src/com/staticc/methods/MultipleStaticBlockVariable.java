package com.staticc.methods;

public class MultipleStaticBlockVariable {
	
	static int num;
	static String name;
	
	
	
	static {
		
		System.out.println("Static block/variables one");
		
		num=90;
		name="Sahil";
	}
	
	static {
		
		System.out.println("Static block/variables two");
		
		num=89;
		name="killer";
		
	}
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("The number is "+num);
		System.out.println("The name is "+name);
		
	}
	
	
	

}
