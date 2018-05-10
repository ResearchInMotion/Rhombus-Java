package bright.InterviewQuestion;

public class PrimeFunction {
	
	
	public void PrimeCheck(int number){
		
		Boolean isPrime=true;
		
		for(int i=2;i<10;i++){
			
			if(number%i==0){
				isPrime=false;
			}
			
			break;
		}
		
		if(isPrime){
			System.out.println("Prime");
		}else{
			System.out.println("Not Prime");
		}
		
	}
	
	public static void main(String[] args) {
		
		PrimeFunction pm = new PrimeFunction();
		pm.PrimeCheck(11);
		
	}

}
