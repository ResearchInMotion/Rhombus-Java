package bright.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArraysNcopies {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> tr=new ArrayList<Integer>(Collections.nCopies(10, 5));
		for(int i=0;i<tr.size();i++) {
			
			System.out.println("The elements are "+tr.get(i));
			
		}
		
	}

}
