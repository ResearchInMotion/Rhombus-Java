import java.util.Scanner;

public class B82 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num1=0,num2=1,num3;
		
		
		
		Scanner scn = new Scanner(System.in);
		
		
		System.out.println("Length : ");
		int count= scn.nextInt();
		
		System.out.print(num1+" "+num2);
		
		for(int i=2;i<count;i++){
			
			
			num3=num2+num1;
			
			System.out.print(" "+num3);
			
			num1=num2;
			num2=num3;
			
		}
		
		

	}

}
