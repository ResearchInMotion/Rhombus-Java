import java.util.Scanner;

public class B91 {
	
	public static void main(String[] args) {
		
		
		
		
		
		Scanner scn = new Scanner(System.in);
		
		String primenumbers = "";
		
		 System.out.println("Enter the value of value:");
		 
	      int value = scn.nextInt();
	      
	      scn.close();
	      
	      for(int i=1;i<=value;i++)
	      {
	    	  
	    	  int counter = 0 ;
	    	  
	    	  for(int num=i;num>=1;num--){
	    		  
	    		  if(i%num==0)
	    		  {
	    			  
	    			  counter+=1;
	    		  }
	    		  
	    	  }
	    	  
	    	  if(counter==2)
	    	  {
	    		  
	    		  primenumbers=primenumbers + i + " ";
	    	  }
	      }
	      
	      System.out.println(primenumbers);
		
	}

}
