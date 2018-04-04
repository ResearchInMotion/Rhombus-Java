package Logger.Function;

import org.apache.log4j.Logger;

public class CallingMainCalculation {
	
	Logger log=Logger.getLogger(CallingMainCalculation.class);
	
	public static void main(String[] args) throws InterruptedException {
		
		MainCalculator mc= new MainCalculator();
		
		System.out.println("The output is "+mc.Addition());
		System.out.println("The output is "+mc.Subtract());
		System.out.println("The output is "+mc.Multiplication());
		
		
		
		
		
	}

}
