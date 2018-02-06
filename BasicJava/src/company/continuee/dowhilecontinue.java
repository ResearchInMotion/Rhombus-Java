package company.continuee;

public class dowhilecontinue {
	
	public static void main(String args[]) {
		
		int j=0;
		
		do{
			
			if(j==7) {
				
				j++;
				continue;
				
			}
			
			System.out.println("value of j"+j);
			j++;
			
		}while(j<10);
	}

}
