package bright.Hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashySort {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hmap=new HashMap<>();
		hmap.put(2, "udaan");
		hmap.put(1, "Akshay kumar");
		hmap.put(5, "A");
		hmap.put(6, "B");
		hmap.put(43, "jimmy");
		
		
		
		Set s=hmap.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			
			Map.Entry mento=(Map.Entry)itr.next();
			System.out.println("Before sorting the key is " +mento.getKey()+ " The value is " +mento.getValue());
			
		}
			
			
			
			
			}

}
