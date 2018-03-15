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
public class ArrayToString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        char arr[]={'s','a','h','i','l'};
        
        for (int i=0;i<arr.length;i++){
            System.out.println("The elements are "+arr[i]);
        }
        
        for(char val:arr){
            System.out.println("The for loops value are "+val);
        }
        
        String hello=new String(arr);
        
        System.out.println(hello);
        // TODO code application logic here
    }
    
}
