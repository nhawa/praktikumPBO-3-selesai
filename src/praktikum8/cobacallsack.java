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
public class cobacallsack {
    public void metode1(){
        int a[] = new int[2];
        System.out.println("akses element ke 3 : "+a[3]);
        System.out.println("tdk tercetak");
    }
    
    public void metode2(){
        try{
            metode1();
            System.out.println("tdk tercetak");
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("terjadi eksepsi index out of bounds");
        }
        
        System.out.println("setelah terjadi eksepsi");
            
    }
    
    public static void main(String args[]){
        new cobacallsack().metode2();
    }
}


