package com.inheritance;

class AAA{
	
	public void method() {
		
		System.out.println("hello sir");
	}
}

class BBB extends AAA{
	
	public void metho1() {
		
		System.out.println("hello sir");
	}
}

class CCC extends AAA{
	
	public void method2() {
		
		System.out.println("hello sir");
	}
}

class hierarchicalInheritence extends AAA{
	
	public void method3() {
		
		System.out.println("hello champ");
	}
	
	public static void main(String[] args) {
		
		BBB b=new BBB();
		CCC c=new CCC();
		hierarchicalInheritence h=new hierarchicalInheritence();
		
		b.method();
		c.method();
		h.method();
	}
}
