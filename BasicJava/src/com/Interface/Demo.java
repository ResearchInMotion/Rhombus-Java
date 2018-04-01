/**
 * 
 */
package com.Interface;

/**
 * @author sahilnagpal
 *
 */

// here we have created an interface with three methods which public and the class implementing thet will automatically implemet that (Eclispe featre)
// full abstraction since it does not contain any non abstract or concrete methods.
interface Sahil{
	
	void method1();
	void method2();
	void method3();
	
}

class Demo implements Sahil{

	@Override
	public void method1() {
	
		System.out.println("hello sahil");
		
	}

	@Override
	public void method2() {
		System.out.println("hello sahil nagpal");
		
	}
	
	public void method3() {
		// TODO Auto-generated method stub
		
	}
	
	
	public static void main(String[] args) {
		
		Sahil s=new Demo();
		s.method1();
		s.method2();
		
	}



	
	
}
