
public class F7 {
	
	public void swap(int num1,int num2){
		
		num1=num1^num2;
		num2=num1^num2;
		num1=num1^num2;
		
		
		System.out.println("After swap x = "+num1+" , y is :  "+num2);
		
		
		
	}
	
	public static void main(String[] args) {
		
		
		F7 f= new F7();
		f.swap(34, 45);
	}
	
	

}
