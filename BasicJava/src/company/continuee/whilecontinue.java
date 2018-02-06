package company.continuee;

public class whilecontinue {
	
	public static void main(String args[]) {
		
		int counter=10;
		
		
		while(counter>=0) {
			
			if(counter==6) {
				
				counter--;
				continue;
				
				
			}
			
			System.out.println("vaue"+counter);
			counter--;
		}
	}

}
