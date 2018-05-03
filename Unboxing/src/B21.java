import java.util.Arrays;
import java.util.Scanner;

public class B21 {
	
	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the size of array : ");
		
		int size=scn.nextInt();
		
		int [] arr=new int[size];
		
		System.out.println("Enter the elements in array ");
		
		for(int i =0;i<size;i++){
			
			arr[i]=scn.nextInt();
			
		}
		
		System.out.println("The elements are : ");
		
		for( int i =0 ; i <arr.length;i++){
			
			System.out.println(arr[i]);
		}
		
		System.out.println("After the sort ");
		
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++){
			
			System.out.println(arr[i]);
		}
	}

}
