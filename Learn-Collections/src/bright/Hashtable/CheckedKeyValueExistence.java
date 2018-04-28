package bright.Hashtable;

import java.util.Hashtable;

public class CheckedKeyValueExistence {
	
	
	public static void main(String[] args) {
		
		Hashtable<String, String> vals = new Hashtable<>();
		vals.put("21", "Sahil");
		vals.put("23", "nikki");
		vals.put("26", "paradise");
		
		boolean value=vals.contains("Para");
		
		System.out.println("Contains or not "+value);
		
		
		
		
	}

}
