package com.inheritance;

 class AA{
	
	public void method() {
		System.out.println("Check");
	}
}


 class BB extends AA{
	
	public void method1() {
		System.out.println("Check");
	}
}
 
 
 class C extends BB{
	 
	 public void method2() {
			System.out.println("Check");
		}
	 
	 public static void main(String[] args) {
		C c=new C();
		c.method();
		c.method1();
		c.method2();
	}
 }

