/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum8;

/**
 *
 * @author nhawa
 */
public class exception1 {
    public static void main (String args[]){
        try {
            int a[] = new int[2];
            System.out.println("akses element ke empat : "+a[3]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index out of bounds terjadi exception");
        }
        
        System.out.println("Keluar blok excepsi");
    }
    
}
