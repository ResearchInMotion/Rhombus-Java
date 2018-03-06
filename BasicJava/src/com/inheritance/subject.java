package com.inheritance;

class subject1 {
	
	String subject1="maths";
	String subject2="Science";
	
	void work() {
		
		System.out.println("These are the subjects");
	}

}

public class subject extends subject1{
	
	String anotherSubject="Maths";
	
	public static void main(String args[]) {
		
		subject sb=new subject();
		System.out.println("The subject name is "+sb.subject1);
		System.out.println("The subject name is "+sb.subject2);
		System.out.println(sb.anotherSubject);
		sb.work();
	}
	
}


