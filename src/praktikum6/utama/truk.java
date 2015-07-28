/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum6.utama;

import praktikum6.mesin;
import praktikum6.rangka;
import praktikum6.utama.Mobil ;

/**
 *
 * @author nhawa
 */
public class truk extends Mobil{
    public truk(){
        
    }
    
    public void tongkang(){
        mesin = new mesin();
        stater();
        
        nama = "truk";
        
        System.out.println("Tongkang");
    }
    
    public static void main(String args[]){
        truk truck =new truk();
        truck.tongkang();
    }
}
