import java.util.Scanner;

public class B22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Please enter a number : ");
		
		int choice = scn.nextInt();
		
		if(choice == 1){
			System.out.println("Sunday");
		}else if( choice ==2){
			
			System.out.println("Monday");
		}else if( choice ==3){
			
			System.out.println("Tuesday");
		}else if( choice ==4){
			
			System.out.println("Wednesday");
		}else if( choice ==5){
			
			System.out.println("Thursday");
		}else if( choice ==6){
			
			System.out.println("Friday");
		}else if( choice ==7){
			
			System.out.println("Saturday");
		}

	}

}
