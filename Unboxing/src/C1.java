
public class C1 {
	
	
	public static void main(String[] args) {
		
		String Name="Infinity War is a good movie";
		
		
		int count =0;
		
	
			
		for(int i=0;i<Name.length();i++){
			
			
			if(Character.isWhitespace(Name.charAt(i))){
				count+=1;
			}
				
			
			
		}
		
		System.out.println(count);
			
			
	
		
	
		
		
		
		
	}

}
