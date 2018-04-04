package com.StringHandling;

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Collections;

public class ReverseStringIterator {
	

		public static void main(String[] args) {
			
			
			String name="Sahil";
			
			char[] vals=name.toCharArray();
			
			List<Character> li= new ArrayList<>();
			
			for(char c:vals){
				li.add(c);
			}
			
			Collections.reverse(li);
			
			ListIterator lii=li.listIterator();
			while(lii.hasNext()){
				System.out.print(lii.next());
			}
			
				
			}
		}
		
	


