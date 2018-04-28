package bright.Hashtable;

import java.util.Hashtable;

public class RemovedOneValue {
	
	public static void main(String[] args) {
		
		
		
		Hashtable<Integer, String> vals = new Hashtable<>();
		vals.put(21, "Sahil");
		vals.put(22, "nikki");
		vals.put(28, "paradise");
		
		System.out.println("Before Removal "+vals);
		
		Object removed = vals.remove(21);
		
		System.out.println("After removal "+ vals);
	}

}
