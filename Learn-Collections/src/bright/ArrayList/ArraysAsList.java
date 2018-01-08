package bright.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysAsList {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> ar=new ArrayList<Integer>(
		Arrays.asList(23,21,43,21));
		System.out.println("Elements are :"+ar);
		
	}

}
