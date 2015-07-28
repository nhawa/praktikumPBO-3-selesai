/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author nhawa
 */
public class checkexception2 {
    public static void main(String args[]){
        try{
            FileInputStream file = new FileInputStream("home/asd.txt");
            file.close();
        }
        catch(FileNotFoundException e){
            System.out.println("terjadi eksepsi file not founr");
        }
        catch(IOException e){
            System.out.println("exception terjadi");
        }
        
    }
    
}
