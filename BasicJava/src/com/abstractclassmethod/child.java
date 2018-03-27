package com.abstractclassmethod;

abstract class Animal{
	
	abstract void sound();
}

class child extends Animal{
	
	void sound() {
		
		System.out.println("The sound is this");
	}
	
	public static void main(String[] args) {
		
		Animal an=new child(); 
		an.sound();
			
		
			
			
		
	}
}