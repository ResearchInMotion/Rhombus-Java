import java.util.Scanner;

public class B78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Please enter a number on which you want you to perform the operation : ");
		
		int number = scn.nextInt();
		
		System.out.println("Please enter you choice : ");
		System.out.println("Choice - 1 -> Factorization of a number ");
		System.out.println("Choice - 2 -> Even/Odd ");
		System.out.println("Choice - 3 -> Prime Number ");
		
		while(true){
		
		int choice = scn.nextInt();
		
		if(choice==1){
			
			int fact=1;
			
			for(int i =number ;i>1;i--){
				
				fact=fact*i;
			}
			
			System.out.println("The factorial of "+number +" is "+fact );
		}else if(choice==2){
			
			if(number%2==0){
				System.out.println("The number you have entered is "+number+ " and it is even");
			}else{
				
				System.out.println("The number you have entered is "+number+ " and it is odd");
			}
			
			
		}else if(choice==3){
			
			Boolean isPrime=false;
			
			for(int i=2;i<10;i++){
				
				if(number%i==0){
					isPrime=false;
				}
			}
			
			if(isPrime=true){
				System.out.println("The number you have entered is "+number+ " and it is prime");
			}else{
				
				System.out.println("The number you have entered is "+number+ " and it is not prime");
			}
			
			
			
		}else if(choice==4){
			
			break;
		}

	}

}
	
}
