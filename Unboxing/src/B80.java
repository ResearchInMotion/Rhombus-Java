import java.util.Scanner;

public class B80 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("enter the number ");
		
		int number = scn.nextInt();
		
		while(number!=0){
		
		sum=sum+number%10;
		
		number=number/10;}
		
		System.out.println(sum);
		
	}

}
