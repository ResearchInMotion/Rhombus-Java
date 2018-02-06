package company.IfElse;

import java.util.Scanner;

public class ifelseif {
	
	public static void main(String args[]) {
		
		Scanner scn=new Scanner(System.in);
			
		System.out.println("Please enter a number");
		
		int number=scn.nextInt();
		
		if(number<100 && number>1 ) {
			System.out.println("number is between 2 digit");
		}
		else if(number<1000 && number>100 ) {
			System.out.println("number is between 3 digit");
		}
		else if(number<10000 && number>1000 ) {
			System.out.println("number is between 4 digit");
		}
		else if(number<100000 && number>10000 ) {
			System.out.println("number is between 5 digit");
		}
		else if(number<1000000 && number>100000 ) {
			System.out.println("number is between 6 digit");
		}
		
			
		// TODO Auto-generated method stub

	}

}
