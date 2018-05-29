package bright.InterviewQuestion;

import java.util.Scanner;

public class delete {
	
	public static void main(String[] args) {
		
		int num=0;
		int num2=1;
		
		
		
		Scanner scn = new Scanner(System.in);
		
		int size=scn.nextInt();
		
		System.out.print(num+" "+num2);
		
		for (int i=2;i<size;i++){
			
			int num3=num+num2;
			
			
			
			num=num2;
			num2=num3;
	
			System.out.print(" "+num3);
			
			
			
		}
		
		
	}

}
