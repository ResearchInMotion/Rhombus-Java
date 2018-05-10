
package bright.InterviewQuestion;

public class StringPalindromeFunction {
	
	public void Pali(String str){
		
		String  reverse="";
		
		for(int i=str.length()-1;i>=0;i--){
			
			reverse=reverse+str.charAt(i);
		}
		
		if(str.equalsIgnoreCase(reverse)){
			System.out.println("String is palindrome");
		}else{
			System.out.println("Not palindorme");
			
		}
	}
	
	public static void main(String[] args) {
		
		StringPalindromeFunction str=new StringPalindromeFunction();
		str.Pali("boby");
	}
}
