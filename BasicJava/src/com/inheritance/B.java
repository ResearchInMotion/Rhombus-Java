package com.inheritance;



 class A{
	
	public void methodA() {
		
		System.out.println("Hello sahil");
	}
}

public class B extends A{
	
	public void methodB() {
		
		System.out.println("hello sahil2");
	}
	
	public static void main(String[] args) {
		
		B obj=new B();
		obj.methodA();
		obj.methodB();
	}

}
