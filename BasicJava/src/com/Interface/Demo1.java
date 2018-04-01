/**
 * 
 */
package com.Interface;

/**
 * @author sahilnagpal
 *
 */
interface inf1{
	void method1();
}

interface inf2 extends inf1{
	void method2();
}

class Demo1 implements inf2{

	@Override
	public void method1() {
		
		System.out.println("Here we go");
		
	}

	@Override
	public void method2() {
		System.out.println("here we are ");
		
	}
	
	public static void main(String[] args) {
		
		inf2 i=new Demo1();
		i.method1();
		i.method2();
	}
	
}
