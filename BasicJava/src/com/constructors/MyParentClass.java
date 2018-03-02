package com.constructors;

class MyParentClass {
	   MyParentClass(){
		System.out.println("MyParentClass Constructor");
	   }
	}
	class MyChildClass extends MyParentClass{
	   MyChildClass() {
		System.out.println("MyChildClass Constructor");
	   }
	
	public static void main(String[] args) {
		
		System.out.println("Hi");
	}
}