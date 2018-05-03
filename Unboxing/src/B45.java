import java.util.Scanner;

public class B45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean isprime=true;

		Scanner scn = new Scanner(System.in);
		
		System.out.println("The number is : ");
		
		int num=scn.nextInt();
		
		
		for (int i =2;i<10;i++){
			
			if(num%i==0){
				isprime=false;
			} break;
			
		}
		
		if(isprime){
			System.out.println(num + " is a prime number");
		}else{
			System.out.println(num + " is not a prime number");
		}
		
		
		
		
	}

}
