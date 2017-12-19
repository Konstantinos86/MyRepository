/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication22;

/**
 *
 * @author Fotis
 */
public class Context {
    
    private Compress comp;

    public Context(Compress comp) {
        this.comp = comp;
    }
    
    public Context() {
    }
    
    public void contextCompress(String text){
        comp.compress(text);
    }
    
    
    
}
