package bright.InterviewQuestion;

import java.util.Scanner;

public class StringPalindrome {
	
	
	public static void main(String[] args) {
		
		String original,reverse="";
		
		System.out.println("Please enter the string : ");
		
		Scanner scn = new Scanner(System.in);
		
		original=scn.nextLine();
		
		System.out.println("The original string is "+original);
		
		for(int i=original.length()-1;i>=0;i--){
			
			reverse=reverse+original.charAt(i);
			
		}
		
		if(original.equalsIgnoreCase(reverse)){
			
			System.out.println("Palindrome");
			
		}else{
			
			System.out.println("Not Palindrome");
		}
		
		
		
	
		
	}

}
