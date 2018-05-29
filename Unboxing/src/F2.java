import java.util.*;


public class F2 {
	
	public int cube(int number){
		
		int value=(int) (Math.pow(number, 3));
		System.out.println("The Cube is "+value);
		return value;
		
	}
	
	public static void main(String[] args) {
		
		F2 f= new F2();
		f.cube(4);
		
	}

}
