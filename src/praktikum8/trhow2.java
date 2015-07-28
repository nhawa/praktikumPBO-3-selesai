/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum8;

import java.io.IOException;

/**
 *
 * @author nhawa
 */
public class trhow2 {
    
    public static void metode1() throws IOException{
        throw new IOException();
    }
    
    public static void metode2() throws IOException{
        try{
            metode1();
        }
        catch (IOException e){
            throw e;
        }
    }
    
    public static void metode3(){
        
    }
}
