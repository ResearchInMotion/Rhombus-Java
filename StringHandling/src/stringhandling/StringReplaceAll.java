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
public class StringReplaceAll {
    
    public static void main(String[] args) {
        
        String name="Sahil Nagpal";
        String name2=new String("Sahil");
        
        System.out.println("After the chnage in string "+name.replace('a', 'b'));
        
        System.out.println(name2);
        
        String newname=name2.replaceAll(name2, "ram");
        
        System.out.println("After the replace all "+name2.replaceAll(name2, "RAm"));
        
        System.out.println(newname);
        
                
    }
            
    
}
