package bright.InterviewQuestion;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int fact = 1;
		
		System.out.println("Enter the number : ");
		
		Scanner scn = new Scanner(System.in);
		
		int number=scn.nextInt();
		
		for(int i=number;i>1;i--){
			fact=fact*i;
		}
		
		System.out.println(fact);
		
		

	}

}
