package bright.InterviewQuestion;

import java.util.Scanner;
import java.lang.Math;

public class ArmstrongNumber {
	
	

	
	public static void main(String[] args) {
		
		int temp,c = 0,a;
		
		System.out.println("Enter the number : ");
		
		Scanner scn = new Scanner(System.in);
		
		int number = scn.nextInt();
		
	temp =number;
	
	while(number>0){
		
		a= number%10;
		number=number/10;
		c=(int) (c+(Math.pow(a,3)));
		
		
	}
	
	if(temp==c){
		
		System.out.println("Armstrong");
	}else{
		System.out.println("Not Armstrong");
	}
	
		

		
		
		
		
		
		
		
	}
}
