import java.util.Scanner;

public class B79 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("enter the number : ");
		
		int number = scn.nextInt();
		
		
		
		int reverse = 0,digit;
		
		while(number!=0){
		
		digit=number % 10;
		
		reverse=reverse*10+digit;
		
		number = number/10;
		}
		
		System.out.println(reverse);
	
//	
		

	}

}
