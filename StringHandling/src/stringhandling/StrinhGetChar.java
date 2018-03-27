/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringhandling;

/**
 *
 * @author nex4vgv
 */
public class StrinhGetChar {
    
    
    public static void main(String[] args) {
        
        String name=new String("Sahil Nagpal");
        
        char[] naam=new char[7];
        
        try{
        
        name.getChars(0,2, naam, 0);
            System.out.println(naam);
        
    }catch ( Exception ex) {
         System.out.println("Raised exception...");
    
}
    }
}
 
