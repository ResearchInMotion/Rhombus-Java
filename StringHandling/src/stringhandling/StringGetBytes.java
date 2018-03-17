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
import java.io.*;
public class StringGetBytes {

   public static void main(String args[]) {
      String Str1 = new String("Welcome to Tutorialspoint.com");
      
      try {
         String Str2 = new String( Str1.getBytes( "UTF-8" ));
         System.out.println("Returned Value " + Str2 );
         Str2 = new String (Str1.getBytes( "ISO-8859-1" ));
         System.out.println("Returned Value " + Str2 );
      } catch ( UnsupportedEncodingException e) {
         System.out.println("Unsupported character set");
      }
   }
}