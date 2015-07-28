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
public class prak_1_0 {
    public static void main(String[] args) {
       int skor = 88;
       char grade;
       
        if (skor>=90) {
            grade ='A';
        }
        else if (skor>=80) {
            grade='B';
        }
        else if (skor>=70) {
            grade='C';
        }
        else if (skor>=60) {
            grade='D';
        }
        else {
            grade='E';
        }
        System.out.println("Grade = "+grade);
    }
}
