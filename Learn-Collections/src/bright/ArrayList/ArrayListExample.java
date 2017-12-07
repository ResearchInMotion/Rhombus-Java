package bright.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
	
	
	public static void main(String args[]) {
		
		ArrayList<String> obj=new ArrayList<String>();
		obj.add("Sahil");
		obj.add("manju");
		obj.add("nikki");
		obj.add("vimal");
		
		System.out.println("Names are = " +obj);
		
		System.out.println("Length of objects are = " +obj.size());
		
		System.out.println("***************Add more********");
		
		obj.add("kismat");
		
		System.out.println("Names are =" +obj);
		
		System.out.println("***************Remove more********");
		
		obj.remove(0);
		
		System.out.println("Names are"+obj);
		
		System.out.println("Names are"+obj.contains("jimmy"));
		
		System.out.println("***************Loop********");
		
		for(int i=0;i<obj.size();i++) {
			
			System.out.println("values " + obj.get(i));
		}
		
		System.out.println("***************Loop1********");
		
		for(String words:obj) {
			
			System.out.println("values " + words);
		}
		
		System.out.println("***************Iterator********");
		
		Iterator<String> itr = obj.iterator();
		while(itr.hasNext()) {
			System.out.println("values " +itr.next());
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
