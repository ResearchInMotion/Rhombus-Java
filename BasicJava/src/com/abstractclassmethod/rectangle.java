package com.abstractclassmethod;

abstract class shape{
	
	abstract void shape();
}

class circle extends shape{
	
	void shape() {
		
		System.out.println("The shape is circle");
	}
}

class rectangle extends shape{
	
	void shape() {
		
		System.out.println("The shape is rectangle");
	}
	
	public static void main(String[] args) {
		
		shape sh=new rectangle();
		sh.shape();
		
	}
}
