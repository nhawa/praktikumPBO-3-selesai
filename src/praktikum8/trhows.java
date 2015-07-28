/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author nhawa
 */
public class trhows {
    
    public static void metode1() throws FileNotFoundException, ParseException {
        FileInputStream file = new FileInputStream("home/asd.txt");
        SimpleDateFormat.getInstance().parse("1234j");
    }
    
    public static void metode2(){
        try{
            metode1();
        }
        catch(FileNotFoundException e){
            System.out.println("filenotfoun exception");
        }
        catch(ParseException e ){
            System.out.println("parseexception terjadi");
        }
    }
    
    public static void main(String args[]){
        metode2();
    }
}
