package company.switchstatement;

public class SwitchStatement {
	
	public static void main(String args[]) {
		
		int number =4;
		
		switch(number+1) {
		
		case 1:
			System.out.println("case 1 is coorect");
			break;
		case 2:
			System.out.println("case 2 is coorect");
			break;
		case 3:
			System.out.println("case 3 is coorect");
			break;
		case 4:
			System.out.println("case 4 is coorect");
			break;
		case 5:
			System.out.println("case 5 is coorect");
			break;
		default:
			System.out.println("case deafult is coorect");
			break;	
		}
	}

}
