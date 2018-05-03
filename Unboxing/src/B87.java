import java.util.Scanner;

public class B87 {

	
	public static void main(String[] args) {
		
		
		System.out.println("Please enter the numbers : ");
		
		Scanner scn = new Scanner(System.in);
		
		int numbers = scn.nextInt();
		
		int[] arr = new int[numbers];
		
		System.out.println("Please enter the numbers for which you want to print the tables : ");
		
		for(int i=0;i<numbers;i++){
			
			arr[i]=scn.nextInt();
		}
		
	System.out.println("For First number : ");
		
		for(int i=0;i<10;i++){
			
			
			System.out.println(arr[0]*i);
		
			
			
		}
		
		System.out.println("For Second number : ");
		
		for(int i=0;i<10;i++){
			
			
			
			System.out.println(arr[1]*i);
			
			
			
		}
		
		System.out.println("For third number : ");

		for(int i=0;i<10;i++){
	
	
			
			System.out.println(arr[2]*i);
	
	
		}
		
		
//		for(int i=0;i<10;i++){
//			
//			for(int j=0;j<arr.length;j++){
//				
//				
//				
//			}
//			
//			System.out.println((arr.length-1)*i);
//		}
		
		
		
}
	
}
