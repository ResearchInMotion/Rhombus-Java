/**
 * 
 */
package bright.Hashtable;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author sahilnagpal
 *
 */


// Use - linked hash map if we want to maintain the inserting order.


// Use - tree map if you we want to sort on the on the basis of key

public class SortingHashTable {
	
	public static void main(String[] args) {
		
		LinkedHashMap<Integer,String	> tab= new LinkedHashMap<Integer,String>();
		
		tab.put(1, "Sahil");
		tab.put(21,"Nikki");
		tab.put(45,"Manju");
		tab.put(2, "vimal");
		
		
		Set set= tab.entrySet();
		
		Iterator itr=set.iterator();
		
		while(itr.hasNext()) {
			Map.Entry me= (Map.Entry)itr.next();
			System.out.println(me.getKey()+" "+me.getValue());
		}
		
		
		
		
		
		TreeMap<Integer , String> vals= new TreeMap<>();
		
		
		vals.put(21, "Nikki");
		vals.put(12, "sahil");
		vals.put(24, "Linkedin");
		vals.put(10, "Chaitanya");
	    vals.put(1, "Ajeet");
	    vals.put(11, "Test");
	    vals.put(9, "Demo");
	    vals.put(3, "Anuj");
	    
	    Set set2= vals.entrySet();
	    
	    Iterator itr2=set2.iterator();
	    
	    while(itr2.hasNext()) {
	    	Map.Entry me= (Map.Entry)itr2.next();
	    	
	    	
	    	
	    	System.out.println(me.getKey()+" "+ me .getValue());
	    }
	    
	    
	    
		
		
		
	}

}
