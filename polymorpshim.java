/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yhan;

/**
 *
 * @author luck_noo
 */
public class Main {

    public static void main(String[] args) {
       
        Yhan yhan = new Yhan();
        
        yhan.setNama("Yayan Riadi Nusman");
        
        yhan.setAlamat("BTP");
        
        System.out.println("Nama Saya : " + yhan.getnama());
        System.out.println("Alamat    : " + yhan.getAlamat());
        
    }

}

class Yhan extends Orang {}