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
public class StringRegExMatch {
    
    public static void main(String[] args) {
        
        String name=new String("Lord krishsna and Ram");
        
        System.out.println(name.matches("(.*)krishsna(.*)"));
        System.out.println(name.matches("(.*)Lod"));
        
    }
    
}
