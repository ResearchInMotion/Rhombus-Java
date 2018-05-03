import java.util.Scanner;

public class B9 {
	
	
	 public static void main(String[] args) {
		
		 Scanner scn = new Scanner(System.in);
		 
		 
		 System.out.println("Please enter the Marks : ");
		 
		 int marks1=scn.nextInt();
		 System.out.println("Please enter the Marks : ");
		 
		 int marks2=scn.nextInt();
		 System.out.println("Please enter the Marks : ");
		 
		 int marks3=scn.nextInt();
		 System.out.println("Please enter the Marks : ");
		 
		 int marks4=scn.nextInt();
		 System.out.println("Please enter the Marks : ");
		 
		 int marks5=scn.nextInt();
		 
		 int total = marks1+marks2+marks3+marks4+marks5;
		 int per=(total/5);
		 
		 System.out.println("The total marks is "+total);
		 System.out.println("The percentage is "+per);
		 
		 
		 if(per>60 && per<100){
			 
			 System.out.println("First Division");
		 }else if(per>50 && per<59){
			 System.out.println("Second Division");
		 }else if(per>40 && per<49){
			 System.out.println("third Division");
		 }else{
			 System.out.println("Failed");
		 }
		 
	}

}
