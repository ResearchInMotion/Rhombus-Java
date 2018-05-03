import java.util.Scanner;

public class B4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the size of Array : ");
		
		int size = scn.nextInt();
		
		int[] arr=new int[size];
		
		int max=arr[0];
		int evenmax=arr[0];
		
		System.out.println("Enter the elements ");
		
		for(int i=0;i<size;i++){
			
			arr[i]=scn.nextInt();
			
		}
		
		System.out.println("The numbers you have entered : ");
		
		for(int i =0;i<arr.length;i++){
			
			System.out.println(arr[i]);
		}
		
		System.out.println("The even numbers are : ");
		for(int i=0;i<arr.length;i++){
			
			if(arr[i]%2==0){
				
				System.out.println(arr[i]);
			}
				
				
			}
		
		
		
		
		System.out.println("The odd numbers are : ");
		for(int j=0;j<arr.length;j++){
			
			if(arr[j]%2!=0){
				
				System.out.println(arr[j]);
				
			}
		}
				

	}

}
