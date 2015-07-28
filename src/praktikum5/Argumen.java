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
public class Argumen {
    public static void passingPrimitif(int i){
        i = 5 ;
    }
    
    public static void passingObject(titik t){
        t.X = 4;
        t.Y = 5;
    }
    public static void main(String[] args){
        int i = 5;
        passingPrimitif(i);
        System.out.println(i);
        
        titik t = new titik();
        passingObject(t);
        System.out.println(t.X+", "+t.Y);
    }
}
class titik {
    
    public int X;
    public int Y;
    
    public titik() {
        X=0;
        Y=0;
    }
}
