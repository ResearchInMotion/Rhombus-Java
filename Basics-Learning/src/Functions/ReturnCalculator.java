package Functions;

public class ReturnCalculator {
	
	
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
		
		 ReturnCalculator rc=new ReturnCalculator();
		 System.out.println(rc.Addition(56, 78));
		 System.out.println(rc.Division(45, 9));
		 System.out.println(rc.Multiplication(56, 89));
		 System.out.println(rc.Subtraction(56, 2));
	}
	

}
