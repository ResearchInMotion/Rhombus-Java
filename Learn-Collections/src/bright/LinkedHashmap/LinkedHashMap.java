package bright.LinkedHashmap;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class LinkedHashMap {

	public static void main(String[] args) {
		
		
		java.util.LinkedHashMap<Integer, String> vals = new java.util.LinkedHashMap<>();
		
		vals.put(1, "Sahil");
		vals.put(12,"like");
		vals.put(2, "check");
		
		Set set = vals.entrySet();
		
		Iterator itr = set.iterator();
		
		while(itr.hasNext()) {
			Map.Entry me = (Map.Entry)itr.next();
			
			System.out.println(me.getKey()+" "+me.getValue());
		}
	}
	
}
