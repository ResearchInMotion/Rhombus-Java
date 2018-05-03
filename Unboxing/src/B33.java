import java.util.Scanner;

public class B33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("The number is : ");
		
		int num1=scn.nextInt();
		
		System.out.println("The number2 is : ");
		
		int num2=scn.nextInt();
		
		
		System.out.println("The numbers are: ");
		for (int i=num1;i<num2;i++){
			
			System.out.println(i);
		}
		

	}

}
