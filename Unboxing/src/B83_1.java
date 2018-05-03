
public class B83_1 {
	
	public static void main(String[] args) {
		
		String name="SAHIL";
		
		char[] val = name.toCharArray();
		
		for(int i = val.length-1 ; i>=0;i--){
			
			for(int j=0 ; j<=i;j++){
				
			System.out.print(val[j]);
		}
			System.out.println();
			
			
		}
		
	}

}
