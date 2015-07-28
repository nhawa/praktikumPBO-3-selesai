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

public abstract class bentuk{
    protected int x;
    protected int y;

    public void geser(int x, int y){
        this.x = x;
        this.y = y;
        System.out.println("x = "+x+", y = "+y);
    }

    public abstract float hitungLuas();
    public abstract void tulis();
}
