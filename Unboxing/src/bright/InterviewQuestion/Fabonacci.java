package bright.InterviewQuestion;

import java.util.Scanner;

public class Fabonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num1 =0;
		int num2=1;
		
		System.out.println("Please enter the size :- " );
		
		Scanner scn = new Scanner(System.in);
		
		int size= scn.nextInt();
		
		System.out.print(num1+" "+num2);
		
		
		for(int i=2;i<size;i++){
			
			int num3=num1+num2;
			
			System.out.print(" "+num3);
			
			num1=num2;
			num2=num3;
			
			
			
			
		
			
			
		}
		

	}

}
