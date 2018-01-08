package bright.ArrayList;

import java.util.ArrayList;

public class AnonymousInnerClass {
	
	public static void main(String[] args) {
		
		ArrayList<String> str=new ArrayList<String>() {{
	
			add("Delhi");
			add("Punjab");
			add("Calcutta");
		}};
			
			for(String sftr:str) {
				
				System.out.println("The elements are "+sftr);
			}
		}
		
	}

