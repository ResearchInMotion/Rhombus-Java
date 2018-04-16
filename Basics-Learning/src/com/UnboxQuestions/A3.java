package com.UnboxQuestions;

import java.util.Scanner;

public class A3 {
	
	public static void main(String[] args) {
		
		System.out.println("Please enter the number : ");
		
		Scanner scn = new Scanner(System.in);
		
		int num=scn.nextInt();
		
		int cube=(int) Math.pow(num, 3);
		
		System.out.println(cube);
		
		
	}

}
