package bright.Hashset;

import java.util.HashSet;
import java.util.Iterator;

public class Hashingset {

	public static void main(String[] args) {
		
		HashSet<String> str=new HashSet<String>();
		str.add("Sahil");
		str.add("nikki");
		str.add("jimmy");
		str.add("komal");
		
		
		
		//iteration
		
		Iterator itr=str.iterator();
		while(itr.hasNext()) {
			System.out.println("The iterator is"+itr.next());
		}
		
		for(String st:str) {
			System.out.println("The without is"+st);
		}
		
		
		
		
		// TODO Auto-generated method stub
		
		

	}

}
