package com.polymorphism;

class Car{
	
	void sound(){
		
		System.out.println("The sound of car");
	}
}

class truck extends Car{
	
	void sound(){
		
		System.out.println("The sound of truck");
	}
}

class cycle extends truck{
	
	void sound(){
		
		System.out.println("The sound of cycle");
	}
}

class AnotherChild extends cycle{
	
	void sound(){
		
		System.out.println("The sound is ");
	}
	
	public static void main(String[] args) {
		
		Car ac= new truck();
		ac.sound();
	}
}