package bright.Hashtable;

import java.util.*;
import java.util.Enumeration;

public class Hashtable {
	
	
	public static void main(String[] args) {
		
		Enumeration names;
		
		String key;
		
		java.util.Hashtable<String, String> hashtab= new java.util.Hashtable<String,String>();
		
		hashtab.put("Sahil", "21");
		hashtab.put("Nikki", "23");
		hashtab.put("Barkha", "28");
		
		names=hashtab.keys();
		
		while(names.hasMoreElements()) {
			key = (String)names.nextElement();
			System.out.println("The key is "+key+ " Value is "+hashtab.get(key));
		}
		
		
		
		
	}

}
