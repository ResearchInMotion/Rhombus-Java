package bright.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class IterateLinkedlist {
	
	public static void main(String[] args) {
		
		LinkedList<String> str=new LinkedList<String>();
		
		str.add("Sahil");
		str.add("highfive");
		str.add("jiya");
		str.add("nikki");
		
		System.out.println("The collection is "+str);
		
		for(int i=0;i<str.size();i++) {
			
			System.out.println("The elements using for loop are "+str.get(i));
		}
		
		for(String st:str) {
			System.out.println("The elements using for each loop is "+st);
		}
		
		int count=0;
		while(str.size()>count) {
			System.out.println("The elements using while loop is "+str.get(count));
			count++;
		}
		
		Iterator itr=str.iterator();
		while(itr.hasNext()) {
			System.out.println("The values using iterator is "+itr.next());
		}
		
	}

}
