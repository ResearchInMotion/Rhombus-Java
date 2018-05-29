import java.util.*;


public class F1 {

	public static int square(int number){
		
		int square = (int) Math.pow(number, 2);
		System.out.println("The square is "+square);
		return square;
		
	}
	
	public static void main(String[] args) {
		
		F1 f= new F1();
		//System.out.println(f.square(2));
		f.square(2);
		
		
	}
	
}
