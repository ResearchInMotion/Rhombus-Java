package bright.Treemap;

import java.util.SortedMap;
import java.util.TreeMap;

public class SubTreeMap {

	public static void main(String[] args) {
		
		TreeMap<String, String> me = new TreeMap<>();
		
		me.put("Sahil", "Nagpal");
		me.put("Nikki", "Nagpal");
		me.put("Manju", "Nagpal");
		
		System.out.println(me);
		
		
		
		SortedMap<String, String> smap= me.subMap("Sahil", "Manju");
		// TODO Auto-generated method stub

	}

}
