package bright.Test;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListCall {
	
	public static void main(String[] args) {
		
		ArrayList<String> st=new ArrayList<String>();
		st.add("sahil");
		st.add("nikki");
		
		for(String su:st) {
			System.out.println("The elements are "+su);
		}
		
		Collections.sort(st);
		
		System.out.println("After sorting");
		for(String agr:st) {
			System.out.println("The elements are "+agr);
		}
		
	}

}
