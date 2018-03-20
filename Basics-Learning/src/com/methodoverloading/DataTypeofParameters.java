package com.methodoverloading;

class Main1Class{
	
	void display(int value){
		
		System.out.println(value);
	}
	
	
	void display(String value){
		
		System.out.println(value);
	}
}
	
class DataTypeofParameters{
	
	public static void main(String[] args) {
		
		Main1Class mc=new Main1Class();
		mc.display(45);
		mc.display("Sahil");
		
	}
	
}
	
