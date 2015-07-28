/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 *
 * @author nhawa
 */
public class checkexception {
    public static void main (String args[]){
        try{
            FileInputStream file = new FileInputStream("home/asd.txt");
        }
        catch(FileNotFoundException e){
            System.out.println("terjadi exepsi file not found");
        }
    }
}
