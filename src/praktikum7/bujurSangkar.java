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
public class bujurSangkar extends bentuk{
    private float sisi;
    
    public bujurSangkar(){
        sisi = 5;
    }
    
    public float hitungLuas(){
        return sisi*sisi;
    }
    
    public void tulis(){
        System.out.println("Bujur Sangkar");
    }
}
