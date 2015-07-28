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
public class Orang {
    public static void main(String[] args) {
        Orang objorang = new Orang();
        Hewan objhewan = null;
        if (objorang instanceof Orang) {
            System.out.println("objek orang adalah instant dari class Orang");
        }
        if (objhewan == null) {
            System.out.println("objek hewan belum di instansi");
        }
        
    }

    private static class Hewan {

        public Hewan() {
        }
    }
    
}
