/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum6.utama;

import praktikum6.rangka;
import praktikum6.mesin;
/**
 *
 * @author nhawa
 */
public class Mobil {
    private rangka rangka;
    public mesin mesin;
    private int nomor;
    protected String nama;
    
    public Mobil(String nama){
        this.nama=nama;
    }
    
    public Mobil(){
        rangka = new rangka();
        mesin = new mesin();
        System.out.println("Konstruktor mobil");
    }
    
    public void stater(){
        System.out.println("stater mobil");
    }
    
//    public static void main(String args[]){
//        new Mobil();
//    }
}
