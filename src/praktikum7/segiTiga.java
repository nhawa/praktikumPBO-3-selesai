/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum7;

/**
 *
 * @author nhawa
 */
public abstract class segiTiga extends bentuk{
    protected float alas;
    protected float tinggi;
    
    public segiTiga(){
        alas = 5;
        tinggi = 9;
    }
    
    public float hitungLuas(){
        return(alas*tinggi)/2;
    }
}
