package com.StaticDynamicBinding;


// expample of static binding 
// depends on the method type - static , final and private
// since these method are not overriden

class human{
	
	public static void walk() { //here we use the static method which cause the static binding.
		
		System.out.println("The human walks ");
		
	}
	
}

class Boy extends human{
	
	public static void walk() {
		
		System.out.println("The boy walks ");
	}
	
	public static void main(String[] args) {
		
		human hu=new Boy();
		
		human hu2=new human();
		
		hu.walk();
		hu2.walk();
		
		
	}
}
