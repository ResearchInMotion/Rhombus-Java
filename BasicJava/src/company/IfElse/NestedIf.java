package company.IfElse;

import java.util.Scanner;

public class NestedIf {
	
public static void main(String args[]) {
	
	Scanner scn = new Scanner(System.in);
	
	System.out.println("Please enter a number");
	
	float number =scn.nextFloat();
	
	
	
	
	
	if(number<100) {
		System.out.println("number is smaller than 100");
	}
		if(number>100) {
			System.out.println("number is greater than 100");
			
		}
		
		System.out.println("number is "+number);
		
}

}
