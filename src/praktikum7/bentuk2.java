/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum7;

import praktikum7.bentuk;
import praktikum7.bujurSangkar;
import praktikum7.segiTigaSamaKaki;
import praktikum7.SegiTigaSamaSisi;
/**
 *
 * @author nhawa
 */
public class bentuk2 {
    public static void cetakBangun(bentuk b) {
        System.out.println(b.hitungLuas());  
        b.tulis();
        b.geser(2, 2);
    }
    
    public static void main(String[] args) {
        cetakBangun(new bujurSangkar());
        cetakBangun(new segiTigaSamaKaki());
        cetakBangun(new SegiTigaSamaSisi());
    }
}
