package com.methodoverriding;


class Child{
	
	void display(){
		
		System.out.println("Please eat child apple");
	}
}

class MethodOverriding extends Child{
	
	void display(){
		
		System.out.println("Please eat parent apple");
	}
	
//	void print(){
//		
//		display();
//		super.display();
//	}
	
	public static void main(String[] args) {
		
		MethodOverriding mr=new MethodOverriding();
//		mr.print();
		
		mr.display();
		
	}
}

