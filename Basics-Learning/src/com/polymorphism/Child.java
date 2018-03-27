package com.polymorphism;

class Animal{
	
	void sound(){
		
		System.out.println("The sound is different");
	}
}

class Horse extends Animal{
	
	@Override
	
	
	void sound(){
		
		System.out.println("Hehehe");
	}
}

public class Child extends Animal{
	
	@Override
	
	void sound(){
		
		System.out.println("Hahaha");
	}
	
	
	public static void main(String[] args) {
		
		Animal an=new Horse();
		
		an.sound();
	}
}

