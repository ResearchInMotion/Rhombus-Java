
public class C3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count =0;
		String name="Sahil nagpal is good boy";
		
		String str[]=name.split(" ");
		System.out.println("No of words "+str.length);
		
		
		  for (int i=0;i<str.length;i++){
			  
			  
			  
	            System.out.println("No of letters in "+i+" word "+str[i].length());
	            
	            
	            
	        }
		  
		  for(int j=0;j<name.length();j++){
			  
			  if(Character.isWhitespace(name.charAt(j))){
					
				}else{
					count+=1;
				}
			  
			  
		  }
		  System.out.println("The word count is "+count);
		
	}

}
