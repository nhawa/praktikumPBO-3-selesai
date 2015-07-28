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
public class Tumbuhan2 {
    private String namaSpesies;
    private int lebarDaun;
    
    private Tumbuhan2(){
        namaSpesies = "adasdasd";
        lebarDaun = 23;
    }
    
    private Tumbuhan2(String nama, int lebar){
        namaSpesies = nama;
        lebarDaun = lebar;
    }
    
    public void cetakTumbuhan(){
        System.out.println(namaSpesies+", "+lebarDaun);
    }
    
    public static void main(String args[]){
        Tumbuhan2 tumbuhan;
        tumbuhan = new Tumbuhan2();
        tumbuhan.cetakTumbuhan();
        tumbuhan = new Tumbuhan2("buah",23);
        tumbuhan.cetakTumbuhan();
    }
}
