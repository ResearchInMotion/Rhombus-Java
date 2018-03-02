package com.constructors;

public class ParameterizedConstructor {
	
	int age;
	String name;
	
	public ParameterizedConstructor(int age,String name) {
		
		this.age=age;
		this.name=name;
}
	void getinfo() {
		
		System.out.println("The name is "+ name +" age is:" + age );
	}
	
	public static void main(String[] args) {
		
		ParameterizedConstructor pc=new ParameterizedConstructor(23, "Sahil");
		ParameterizedConstructor pc2=new ParameterizedConstructor(34, "Pta nahi");
		
		pc.getinfo();
		pc2.getinfo();
	}

}
