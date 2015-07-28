/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum4;

/**
 *
 * @author nhawa
 */
public class prak_1_2 {
    public static void main(String[] args) {
        int bulan = 8;
        String namabulan;        
        switch (bulan){
            case 1: namabulan ="januari";break;
            case 2: namabulan ="februari";break;
            case 3: namabulan ="mai";break;
            case 4: namabulan ="april";break;
            case 5: namabulan ="juni";break;
            case 6: namabulan ="juli";break;
            case 7: namabulan ="agustus";break;
            case 8: namabulan ="oktober";break;
            case 9: namabulan ="september";break;
            case 10: namabulan ="oktober";break;
            case 11: namabulan ="November";break;
            case 12: namabulan ="desember";break;
            default : namabulan ="bulan tidak ketemu";break;
        }
        
        System.out.println(namabulan);
    }
    
}
