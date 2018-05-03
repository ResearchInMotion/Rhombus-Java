import java.util.Scanner;

public class B46 {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("The number is : ");
		
		int num=scn.nextInt();
		
		String number=String.valueOf(num);
		
		System.out.println("The digits are : ");
		
		for(int i =0;i<number.length();i++){
			
			int j=Character.digit(number.charAt(i), 10);
			
			
			
			if(j%2==0){
				System.out.println(j+" is even ");
			}else{
				System.out.println(j+ " is odd ");
			}
		}
		
		
		
	}

}
