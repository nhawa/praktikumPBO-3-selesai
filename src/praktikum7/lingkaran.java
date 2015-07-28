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
public class lingkaran implements bentukKeliling,bentukLuas{
    private double jariJari;
    
    public lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    
    public double hitungKeliling(){
        return 2*bentukKeliling.PHI*jariJari;
    }
    
    public double hitungLuas(){
        return bentukLuas.PHI*Math.pow(jariJari, 2);
    }
}
