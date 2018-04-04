package Logger.Function;

import org.apache.log4j.Logger;

import Functions.ReturnCalculator;

public class Calculation {
	 int Addition(int a,int b){
		 
		 
			int c=a+b;
			 return c;
			
		}
		 
		 int Subtraction(int a,int b){
			 
			 
				int c=a-b;
				 return c;
				
			}
		 
		 int Multiplication(int a,int b){
			 
			 
				int c=a*b;
				 return c;
				
			}
		 
		 int Division(int a,int b){
			 
			 
				int c=a/b;
				 return c;
				
			}
		 
		
		 
		 
		 public static void main(String[] args) {
			 
			 final Logger log=Logger.getLogger(Calculation.class);
			 
			
			 Calculation rc=new Calculation();
			 
			 log.info("Additon");
			 
			 System.out.println(rc.Addition(56, 78));
			 
			 log.info("Division");
			 
			 System.out.println(rc.Division(45, 9));
			 
			 log.info("Multiplication");
			 
			 System.out.println(rc.Multiplication(56, 89));
			 
			 log.info("Subtraction");
			 
			 System.out.println(rc.Subtraction(56, 2));
		}
	
	

}
