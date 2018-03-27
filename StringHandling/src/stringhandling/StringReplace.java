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
public class StringReplace {
    
    public static void main(String[] args) {
        
        String name=new String("Sahil Nagpal");
        
        System.out.print("Returned value is : ");
        System.out.println(name.replace('a', 'z'));
        
        String death="Death does not like to cheated";
        death=death.replace('a', 'z');
        System.out.println(death);
        
                
                
        
    }
    
}
