package bright.Hashset;

import java.util.*;

public class HashsetToArray {
	
	public static void main(String[] args) {
		
		
		HashSet<String> hset = new HashSet<String>();
		 
	     //add elements to HashSet
	     hset.add("Element1");
	     hset.add("Element2");
	     hset.add("Element3");
	     hset.add("Element4");
	     
	     System.out.println("The hashset is "+hset);
	     
	     String[] arr=new String[hset.size()];
	     hset.toArray(arr);
	     
	     for(String val:arr) {
	     
	     System.out.println("The arrayset is "+val);
	     
	     }
	     
	     Set<String> str=new TreeSet<String>(hset);
	     for(String hsset:str) {
	    	 System.out.println("The values in tree set are "+hsset);
	    	 
	     }
	     
	     List<String> li=new ArrayList<String>(hset);
	     System.out.println("The values in arraylist are : ");
	     for(String kill:li) {
	    	 System.out.println(kill);
	     }
	     
	}

}
