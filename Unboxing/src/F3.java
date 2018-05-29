import java.util.*;


public class F3 {
	
	public int areaofcircle(int radius){
		
		int area=(int) (Math.PI*Math.pow(radius, 2));
		
		System.out.println("The area is "+area);
		
		return area;
	}
	
	public static void main(String[] args) {
		
		F3 f = new F3();
		f.areaofcircle(5);
		
	}

}
