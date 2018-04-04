package com.UnboxQuestions;

import java.util.Scanner;

public class J1 {
	
	String name;
	int roll_no;
	int marks1;
	int marks2;
	int marks3;
	int marks4;
	int marks5;
	
	int total;
	double percentage;
	
	
	public void input(){
		
		
		System.out.print("Please enter the roll number : ");
		Scanner scn=new Scanner(System.in); 
		roll_no=scn.nextInt();
		
		System.out.print("Please enter the name : ");
		 name=scn.next();
		
		System.out.println("Please enter the marks in subjects : ");
		 marks1=scn.nextInt();
		System.out.println("Please enter the marks in subjects : ");
		 marks2=scn.nextInt();
		System.out.println("Please enter the marks in subjects : ");
		 marks3=scn.nextInt();
		System.out.println("Please enter the marks in subjects : ");
		 marks4=scn.nextInt();
		System.out.println("Please enter the marks in subjects : ");
		 marks5=scn.nextInt();
		
	}
	
	public void calculate(){
		
	
		total=marks1+marks2+marks3+marks4+marks5;
		
		percentage=(total/5);
		
		
		}
	
	void show(){
		
		System.out.println("The total marks is "+total);
		System.out.println("The percentage is "+percentage);
		
		}
	
	public static void main(String[] args) {
		
		J1 j=new J1();
		j.input();
		j.calculate();
		j.show();
	}

}
