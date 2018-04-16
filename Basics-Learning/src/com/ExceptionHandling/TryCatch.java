package com.ExceptionHandling;

public class TryCatch {
	
	public static void main(String[] args) {
		
	
	
	int num,num2;
	
	try{
		
		num=90;
		num2=0;
		num2=num/num2;
		System.out.println(num2);
		
}
//	catch(ArithmeticException e){
//		
//		System.out.println("You are dividing a number by zero");
//		
//	}
	catch(Exception e){
		
		System.out.println("Here we see an exception ");
	}
}
}
