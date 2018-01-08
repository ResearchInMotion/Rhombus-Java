package bright.LinkedList;

import java.util.*;

public class Linklist {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> ln=new LinkedList<Integer>();
			ln.add(23);
			ln.add(32);
			ln.add(12);
			ln.add(453);
			ln.add(2, 43);
			ln.addFirst(678);
			ln.addLast(98);
			
		int count=0;
		while(ln.size()>count) {
			System.out.println("The elements are "+ln.get(count));
			count++;
		}
		
		System.out.println(ln.get(2));
		
		ArrayList<Integer> iu=new ArrayList<Integer>();
		iu.add(28);
		iu.add(87);
		
		
		ln.addAll(iu);
		
		System.out.println("The values is now"+ln);
		
		Object tr=ln.clone();
		System.out.println(tr);
		
		Object ob=ln.poll();
		System.out.println("Poll"+ob);
		System.out.println(ln);
		
	}

}
