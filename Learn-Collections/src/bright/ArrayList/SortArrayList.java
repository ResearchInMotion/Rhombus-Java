package bright.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
	
	public static void main(String args[]) {
		
		ArrayList<Integer> our=new ArrayList<Integer>();
		our.add(23);
		our.add(87);
		our.add(34);
		our.add(21);
		our.add(89);
		
		System.out.println("before sorting");
		
		for(Integer ir:our) {
			
			System.out.println("values are " + ir);
			
		}
		
		Collections.sort(our);
		
		System.out.println("After sorting");
		
		for(Integer ir:our) {
			
			System.out.println("values are " + ir);
			
		}
		
		
		
	}

}
