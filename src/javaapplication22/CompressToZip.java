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
public class CompressToZip implements Compress{

    public CompressToZip() {
    }
    
    @Override
    public void compress(String text){
        System.out.println("Text file ("+text+") compressed with zip");
    }
    
}
