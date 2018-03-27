package Functions;

import java.util.Scanner;

public class InputCalculator {
	
	int addition(){
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Please enter the number one ");
		
		int number1=scn.nextInt();
		
		System.out.println("Please enter the second number ");
		
		int number2=scn.nextInt();
		
		int number3=number2+number1;
		
		return number3;
		
	}
	
	
	public static void main(String[] args) {
		
		InputCalculator ic=new InputCalculator();
		System.out.println("The Addition is "+ic.addition());
		
	}

}
