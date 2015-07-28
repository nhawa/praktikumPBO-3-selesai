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
public class hewan2 {
    public static int JUMLAH=0;
    public String spesies;
    
    public static void tambahHewan(){
        JUMLAH++;
    }
    
    public static void main(String[] args){
        hewan2 objhewan = new hewan2();
        objhewan.spesies = "kucing";
        hewan2.tambahHewan();
        System.out.println(hewan2.JUMLAH);
        
        hewan2 objhewan2 = new hewan2();
        objhewan2.spesies = "kucing";
        hewan2.tambahHewan();
        System.out.println(hewan2.JUMLAH);
        
        System.out.println(objhewan.JUMLAH);
        System.out.println(objhewan2.JUMLAH);
        
    }
    
}
