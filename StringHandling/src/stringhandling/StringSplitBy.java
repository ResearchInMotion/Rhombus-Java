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
public class StringSplitBy {
    
    
    public static void main(String[] args) {
        
        String name="Sahil is a bad boy";
        
        for (String val : name.split(" ")){
            
            System.out.println(val);
            
        }
        
    }
}
