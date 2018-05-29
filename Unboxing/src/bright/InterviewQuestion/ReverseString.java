package bright.InterviewQuestion;

import java.util.Scanner;

public class ReverseString {
	
	
	public static void main(String[] args) {
		
		String reverse="";
		
		System.out.println("Enter the String : ");
		
		Scanner scn = new Scanner(System.in);
		
		String value=scn.nextLine();
		
		//String Builder
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(value);
		
		sb.reverse();
		
		System.out.println("The reverse is : "+sb);
		
		
		//Char Converting
		
		 char[] values=value.toCharArray();
		 
		 for(int i=values.length-1;i>=0;i--){
			 System.out.println(values[i]);
		 }
		 
		 // Quite Easy
		 
		 for(int i=value.length()-1;i>=0;i--){
			 System.out.print(value.charAt(i));
		 }
		 
		 
		
		
		
		
	
		
		
	}

}
