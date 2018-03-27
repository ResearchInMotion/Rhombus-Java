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
public class StringContentEqualBoolean {
    
    
    public static void main(String[] args) {
        
        
        String name="Sahil";
        String name2="Sahil";
       
        StringBuffer sc=new StringBuffer("Shil");
        
        Boolean b=name.contentEquals(name2);
        
        Boolean b1=name2.contentEquals(sc);
        
        Boolean b2=name.contentEquals(sc);
        
        
        System.out.println(b);
        System.out.println(b1);
        System.out.println(b2);
        
        
                
    }
    
}
