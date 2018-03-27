package com.methodoverloading;


class Main2Class{
	
	void display(int num,String name){
		
		System.out.println(num+" "+name);
	}
	
	void display(String name,int num){
		
		System.out.println(name+" "+num);
	}
}

class SequenceofParameters{
	
	public static void main(String[] args) {
		
		Main2Class mc=new Main2Class();
		mc.display(56, "Sahil");
		mc.display("Sahil", 45);
		
	}
}
