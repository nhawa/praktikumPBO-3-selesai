/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum6;

/**
 *
 * @author nhawa
 */
public class rangka {
    private final Ban ban;
    public rangka()    {
        ban = new Ban();
        System.out.println("konstruktor rangka");
    }
}
class Ban{
    public Ban(){
        System.out.println("Konstruktor Ban");
    }
}
