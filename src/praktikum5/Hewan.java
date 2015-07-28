/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum5;

/**
 *
 * @author nhawa
 */
public class Hewan {
    public String nama;
    public String alamat;
    public int tinggiBadan;
    public float beratBadan;
    
    public void cetakOrang(){
        System.out.println(nama+", "+alamat+", "+tinggiBadan+", "+beratBadan);
    }
    
    public static void main(String[] args){
        Hewan objorang = new Hewan();
        objorang.nama = "anwar sandi";
        objorang.alamat= "antang";
        objorang.tinggiBadan= 167;
        objorang.beratBadan=(float) 45.44;
        objorang.cetakOrang();
        
        Hewan objorang2 = new Hewan();
        objorang2.nama = "nuwa nawa";
        objorang2.alamat= "daya";
        objorang2.tinggiBadan= 167;
        objorang2.beratBadan= 45.44f;
        objorang2.cetakOrang();
    }
    
}
