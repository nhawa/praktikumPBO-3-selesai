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
public class Tumbuhan {
    public void tanam(){
        System.out.println("tanam 1");
    }
    
    public void tanam(String nama){
        System.out.println("tanam 1");
    }
    
    public void tanam(int jumlah){
        System.out.println("tanam 3");
    }
    
    public String tanam(String nama, int jumlah){
        return "tanam 4";
    }
    
    public static void main(String args[]){
        Tumbuhan Tumbuhan = new Tumbuhan();
        Tumbuhan.tanam();
        Tumbuhan.tanam("saur");
        Tumbuhan.tanam(4);
       System.out.println(Tumbuhan.tanam("asdasd",3)); 
    }
}
