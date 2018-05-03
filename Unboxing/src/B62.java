import java.util.Scanner;
import java.lang.Math;

public class B62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isPrime=true;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("The number is : ");
		
		int num=scn.nextInt();
		
		
		double sqrt=Math.sqrt(num);
		
		
		for(int i=2;i<10;i++){
		if(sqrt%i==0){
			
			isPrime=false;
		}
		break;
	}
		
		if(isPrime){
			System.out.println(sqrt + " Is Prime");
		}else{
			System.out.println(sqrt + " Is not Prime");
		}
		

	}

}
