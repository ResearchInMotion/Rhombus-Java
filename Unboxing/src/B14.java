import java.util.Scanner;

public class B14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Number 1 :");
		
		int num1=scn.nextInt();
		
		System.out.println("Number 1 :");
		
		int num2=scn.nextInt();
		
		if(num1%num2==0){
			System.out.println("The first number is multiple of second ");
		}else{
			System.out.println("Not a multiple");
		}
		
		

	}

}
