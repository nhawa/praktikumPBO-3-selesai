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
public class prak_1_3 {
    public static void main(String[] args) {
        int bulan = 2;
        int tahun = 2016;
        int jumlahhari = 0;
        
        switch (bulan){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                jumlahhari =31;break;
            case 4:
            case 6:
            case 9:
            case 11:
                jumlahhari = 30; break;
            case 2:
                if (((tahun % 4 == 0) && !(tahun % 100 == 0)) || (tahun % 400 == 0))
                    jumlahhari=29;
                else
                    jumlahhari=28;
                break;
            default : System.out.println("bulan salah");break;
                
        }
        
        System.out.println("Jumlah hari = "+jumlahhari);
    }
    
}
