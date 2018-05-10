package bright.InterviewQuestion;

import java.util.Scanner;

public class IntegerPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Enter the number : ");
		
		Scanner scn = new Scanner(System.in);
		
		String originalnumber , reverse="";
		
		originalnumber=scn.nextLine();
		
		for(int i=originalnumber.length()-1;i>=0;i--){
			reverse=reverse+originalnumber.charAt(i);
		}
		if(originalnumber.equalsIgnoreCase(reverse)){
			System.out.println("Palindrome");
		}else{
			System.out.println("Not palindrome");
		}
		
	}

}
