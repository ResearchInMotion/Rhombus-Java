
public class C6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int countLower=0;
		
		int countHigher=0;
		
		
		String name="Sahil Nagpal is a good Boy";
		
		for(int i=0;i<name.length();i++){
			
			Character c = name.charAt(i);
			
			if(Character.isLowerCase(c)){
				
				countLower+=1;
				
			}else if(Character.isUpperCase(c)){
				
				countHigher+=1;
			}
		}
		
		System.out.println("The upper cases are  : "+countHigher);
		System.out.println("The lower cases are  : "+countLower);

	}

}
