package company.constructor;

public class parameterizedtwo {
	
	
		
		int number;
		String name;
		
		parameterizedtwo(int rollnumber , String empname){
			
			this.number=rollnumber;
			this.name=empname;
			

		}
		
		void info() {
			System.out.println("Roll number "+number+" "+"name is"+name);
			
		}
		
		public static void main(String args[]) {
			
			parameterizedtwo pd=new parameterizedtwo(21, "sahil");
			parameterizedtwo pd2=new parameterizedtwo(22, "nikki");
			pd.info();
			pd2.info();
			
			
		}


}
