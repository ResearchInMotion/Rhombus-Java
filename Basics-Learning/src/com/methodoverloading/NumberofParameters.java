package com.methodoverloading;

class MainClass{
	
	void display(int c){
		
		System.out.println(c);
	}
	
	void display(int c,String name){
		System.out.println(c+" "+name);
	}
	
}

class NumberofParameters{
	
	public static void main(String[] args) {
		
		MainClass mc=new MainClass();
		mc.display(45);
		mc.display(34, "Sahil");
		
	}
}
