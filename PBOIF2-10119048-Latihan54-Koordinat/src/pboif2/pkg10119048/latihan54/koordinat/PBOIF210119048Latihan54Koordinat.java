/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119048.latihan54.koordinat;

/**
 *
 * @author SystemOs
 */
public class PBOIF210119048Latihan54Koordinat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WarnaKoordinat koordinat = new WarnaKoordinat(10,4,"Jingga");
        
        System.out.println("Warna Koordinat : " + koordinat.getNamaWarna());
        System.out.println("Koordinat Sumbu x : " + koordinat.getX() + ", y : " + koordinat.getY());
    }
    }