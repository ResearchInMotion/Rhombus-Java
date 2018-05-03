import java.util.Scanner;

public class B32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		
		int average=0;
		
		int count=0;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("The first number is : ");
		
		int number = scn.nextInt();
		
		System.out.println("The second number is :");
		
		int number1=scn.nextInt();
		
		for(int i=number;i<number1;i++){
			
			if(i%2==0){
				
				sum+=i;
				count++;
			}
		}
		average=sum/ (count);
		System.out.println("Sum is "+sum);
		System.out.println("The average is "+average);

	}

}
