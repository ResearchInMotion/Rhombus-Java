import java.util.Scanner;

public class C14 {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the string : ");
		
		String name=scn.next();
		
		// with string builder
		
		StringBuilder sb= new StringBuilder();
		sb.append(name);
		sb.reverse();
		
		System.out.println("The reverse is "+sb);
		
		
		// with char[]
		
		char[] go= name.toCharArray();
		
		System.out.println("The reverse is ");
		
		for(int i=go.length-1;i>=0;i--){
			
			System.out.println(go[i]);
		}
		
		
		// third method
		
		System.out.println("the reverse is ");
		
		for(int i =name.length()-1;i>=0;i--){
			
			System.out.println(name.charAt(i));
		}
		
		
		
	}

}
