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
public class StringRegionMatches {
    
    public static void main(String[] args) {
        
        String name=new String("Sahil Nagpal");
        
        String god_name="lord krishna";
        
        String check1="lord";
        
       // System.out.println(name.regionMatches(true, 0, check1, 0, 5));
        
        System.out.println(god_name.regionMatches(true, 0, check1, 0, 4));
        
        

                
    }
    
}
