package com.UnboxQuestions;

import java.util.Scanner;

public class J2 {
	
	int Ecode;
	String Ename;
	double BasicSalary;
	float HRA;
	float TA;
	float DA;
	float GrossSalary;
	float IT;
	float PF;
	float NetSalary;
	
	void input(){
		
		Scanner scn = new Scanner(System.in);
		
		 Ecode=scn.nextInt();
		 
		 Ename=scn.next();
		 
		 BasicSalary=scn.nextDouble();
		 
	}
	
	void calculation(){
		
		HRA=(float) (0.40*BasicSalary);
		DA=(float) (0.20*BasicSalary);
		TA=(float) (0.10*BasicSalary);
		GrossSalary=(float) (BasicSalary+HRA+DA+TA);
		
		IT=(float)0.20*GrossSalary;
		PF=(float)0.10* GrossSalary;
		NetSalary=(float)GrossSalary-(IT+PF);
		
		}
	
	void Display(){
		
		System.out.println(Ecode);
		System.out.println(Ename);
		System.out.println(BasicSalary);
		System.out.println(HRA);
		System.out.println(DA);
		System.out.println(TA);
		System.out.println(GrossSalary);
		System.out.println(IT);
		System.out.println(PF);
		System.out.println(NetSalary);
		
	}
	
	
public static void main(String[] args) {
	
	J2 j=new J2();
	j.input();
	j.calculation();
	j.Display();
	
}
	

}
