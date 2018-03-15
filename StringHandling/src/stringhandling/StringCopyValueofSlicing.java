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
public class StringCopyValueofSlicing {
    
    public static void main(String[] args) {
        
        char[] vals={'s','a','h','i','l'};
        
        String str="";
        
        str=str.copyValueOf(vals, 0, 2);
        
        
        System.out.println(str);
        
        
        
    }
    
}
