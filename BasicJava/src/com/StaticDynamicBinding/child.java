package com.StaticDynamicBinding;

class parent{
	
	void walk() {
		
		System.out.println("Parent walks");
	}
	
}

class child extends parent{
	
	void walk() {
		
		System.out.println("Boy walks");
	}
	
	public static void main(String[] args) {
		
		parent pa2=new child();
		parent pa=new parent();
		pa.walk();
		pa2.walk();
		
		
		
	}
}
