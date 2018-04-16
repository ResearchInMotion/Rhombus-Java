package com.UnboxQuestions;

public class B32 {

	public static void main(String[] args) {
		
		int num1=1;
		int num2=10;
		
		int sum=0;
		int size=Math.abs(num1*num2);
		int average;
		
		for(int i=num1;i<num2;i++){
			System.out.println(i);
			
			sum+=i;
		}
		
		System.out.println("Sum is"+sum);
		
		System.out.println("The size is "+size);
		
		average=sum/size;
		
		System.out.println("The average is "+average);
		
		// TODO Auto-generated method stub

	}

}
