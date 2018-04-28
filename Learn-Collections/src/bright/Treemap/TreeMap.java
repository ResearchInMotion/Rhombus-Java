package bright.Treemap;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TreeMap {
	
	public static void main(String[] args) {
		
		java.util.TreeMap<Integer, String> vals = new java.util.TreeMap<>();
		
		vals.put(1, "Sahil");
		vals.put(21, "Check");
		vals.put(12, "Champion");
		vals.put(52, "shuttle");
		
		
		Set set = vals.entrySet();
		
		Iterator itr = set.iterator();
		
		
		while(itr.hasNext()) {
		Map.Entry<Integer,String> me = (Map.Entry<Integer, String>)itr.next();
		System.out.println(me.getKey()+" "+me.getValue() );
		
		
		
		}
		
		
	}

}
