package com.constructors;

public class ParametrizedConstructor2 {
	
	int var;
	
	public ParametrizedConstructor2() {
	
		this.var=10;
	}	
	
	public ParametrizedConstructor2(int num) {
		
		this.var=num;
	}
	
	public int getvalue() {
		
		return var;
	}
	
	public static void main(String[] args) {
		
		ParametrizedConstructor2 pc=new ParametrizedConstructor2();
		ParametrizedConstructor2 pc2=new ParametrizedConstructor2(45);
		System.out.println("the values is "+pc.getvalue());
		System.out.println("the value is "+pc2.getvalue());
		
	}
}


