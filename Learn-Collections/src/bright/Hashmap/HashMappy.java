package bright.Hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMappy {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hmap=new HashMap<>();
		hmap.put(1, "Sahil");
		hmap.put(2,"Nikki");
		hmap.put(3, "Vimal");
		hmap.put(4, "manju");
		
		Set set=hmap.entrySet();
		Iterator itr=set.iterator();
		
		while(itr.hasNext()){
			
			Map.Entry ment=(Map.Entry)itr.next();
			System.out.println("The key is " + ment.getKey() + " The value is " + ment.getValue());
			
			
			
			
			
		}
		
		System.out.println("The second value is "+hmap.get(2));

	}

}
