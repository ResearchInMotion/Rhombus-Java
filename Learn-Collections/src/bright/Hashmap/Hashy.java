package bright.Hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashy {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hs=new HashMap<Integer,String>();
		hs.put(1, "sahil");
		hs.put(2, "nikki");
		hs.put(3, "manju");
		hs.put(4, "Vimal");
		
		
		Set set=hs.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			
			Map.Entry mentry = (Map.Entry)itr.next();
			System.out.println("The key is "+mentry.getKey()+" the value is :"+mentry.getValue());
			
			
		}
		
		// TODO Auto-generated method stub

	}

}
