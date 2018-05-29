package bright.InterviewQuestion;

import java.util.Scanner;

public class BinarySearch {

	  int BinarySearch(int arr[],int low , int high , int number){
		
		if(high>=low){
			
			int mid = low + (high-low)/2;
			
			if(arr[mid]==number){
				return mid;
			}
			else if(arr[mid]>number){
				return BinarySearch(arr, low, mid-1, number);
				
			}
			else{
				BinarySearch(arr, mid+1, high, number);
			}
		}
		
		return -1;
		
		
	}
	  
	  public static void main(String[] args) {
		
	
	  
	 int [] arr={1,2,8,45,65};
	 
	 int n = arr.length;
	 
	 Scanner scn = new Scanner(System.in);
	 
	 System.out.println("Please enter the number to search  : ");
	 
	 int number = scn.nextInt();
	 
	 
	 
	 BinarySearch bs = new BinarySearch();
	int result = bs.BinarySearch(arr, 0, n, number);
	 
	 if(result != -1){
		    System.out.println("The element is on "+result);
	 }
		else{
		    System.out.println("Element not found");
		}
	 
	 

}
}
