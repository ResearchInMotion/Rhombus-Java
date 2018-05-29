
public class F7_1 {
	
	
	public void swap(int num1,int num2){
		
		 int temp=0;
		
		temp=num1;
		num1=num2;
		num2=temp;
		
		
		
		System.out.println("After swap x = "+num1+" , y is :  "+num2);
		
		
		
	}
	
	public static void main(String[] args) {
		
		F7_1 f= new F7_1();
		f.swap(45, 76);
		
	}

}
