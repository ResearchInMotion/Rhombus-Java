package Functions;

public class Calculator {
	
	
	void Addition(int a,int b){
		int c=a+b;
		
		System.out.println(c);
	}
	void Subtraction(int a,int b){
		int c=a-b;
		
		System.out.println(c);
	}
	void Division(int a,int b){
		int c=a/b;
		
		System.out.println(c);
	}
	void Multiplication(int a,int b){
		int c=a*b;
		
		System.out.println(c);
	}
	
	
	public static void main(String[] args) {
		
		Calculator c=new Calculator();
		c.Addition(34, 67);
		c.Division(67, 45);
		c.Multiplication(45, 6);
		c.Subtraction(56, 4);
		
	}

}
