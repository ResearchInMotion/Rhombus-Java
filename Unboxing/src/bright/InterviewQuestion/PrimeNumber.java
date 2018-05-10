package bright.InterviewQuestion;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Boolean isPrime=true;
		
		
		System.out.println("Please enter a number : ");
		
		Scanner scn = new Scanner(System.in);
		
		int number=scn.nextInt();
		
		for(int i=2;i<10;i++){
			
			if(number%i==0){
				
				isPrime=false;
				
			}
			break;
		}
		
		
		if(isPrime){
			System.out.println("Yes , Prime Number");
		}else{
			System.out.println("Not a Prime Number");
		}
		
				
		
		
		
		
		
	}
}
