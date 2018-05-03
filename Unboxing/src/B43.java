import java.util.Scanner;

public class B43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int fact=1;
	
		Scanner scn = new Scanner(System.in);
		
		System.out.println("The number is : ");
		
		int num=scn.nextInt();
		
		for(int i=num;i>0;i--){
			 fact=fact*i;
			
		}
		
		System.out.println(fact);
	}

}
