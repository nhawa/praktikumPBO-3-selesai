/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum3;

/**
 *
 * @author nhawae
 */
public class bitwise {
     public static void main(String[] args) {
         byte angka1 =10;
         byte angka2 = -80;
         System.out.println(~angka1);
         System.out.println(~angka2);
         
         System.out.println(angka1 & 5);
         System.out.println(angka2 | 5);
         System.out.println(angka2 ^ 5);
         System.out.println(angka1 >> 2);
         System.out.println(angka2 >> 5);
         System.out.println(angka1 << 3);
         System.out.println(angka1 >>> 5);
         System.out.println(angka2 >>> 5);
     }
}
