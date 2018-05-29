package bright.InterviewQuestion;

import java.util.Scanner;

public class realIntegerPalindrome {

	
	public static void main(String[] args) {
		
		System.out.println("Enter the number : ");
		Scanner scn = new Scanner(System.in);
		
		int r,sum=0,number,temp;
		
		number=scn.nextInt();
		
		temp=number;
		
		while(number>0){
			
			r=number%10;
		
			
			sum=(sum*10)+r;
			
			
			
			number=number/10;
	
					
		}
		
		if(temp==sum){
			System.out.println("Pal");
		}else{
			System.out.println("Not Pal");
		}
	}
}
