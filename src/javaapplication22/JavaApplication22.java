/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication22;

/**
 *
 * @author Konstantinos
 */
public class JavaApplication22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String text = "Bye Bye World";
        
        Compress a = new CompressToZip();
        Context editor = new Context(a);
        
        editor.contextCompress(text);
        
    }
    
}
