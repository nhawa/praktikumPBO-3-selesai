/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum6.utama;

import praktikum6.utama.Mobil;

/**
 *
 * @author nhawa
 */
public class sedan extends Mobil{
    public String nama;
    
    public sedan(){
        super();
    }
    
    public sedan(String nama){
        super(nama);
    }
    
    public void cetak(String nama){
        super.nama = nama;
        this.nama = "sedan lokal";
        
        System.out.println(nama);
        System.out.println(this.nama);
    }
    
    public static void main(String args[]){
        sedan sedan = new sedan();
        sedan.cetak("sedan");
    }
}
