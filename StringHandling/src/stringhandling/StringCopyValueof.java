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
public class StringCopyValueof {
    
    public static void main(String[] args) {
        
        char[] val={'a','b','c'};
        String str="";
        str=str.copyValueOf(val);
        
        System.out.println(str);
    }
    
}
