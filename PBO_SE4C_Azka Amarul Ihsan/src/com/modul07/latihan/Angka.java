/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modul07.latihan;

/**
 *
 * @author Windows 10
 */
public class Angka {

    int hitung(int x) {
        int y = 20;
        int jumlah = x + y;
        return jumlah;
    }

    //overloading
    double hitung(int x, double y) {
        double jumlah = x * y;
        return jumlah;
    }

    //overloading
    String hitung() {
        double jumlah = hitung(20) + hitung(10, 0.5);
        String Total = buatString(jumlah);
        return Total;
    }

    String buatString(double x) {
        return "Total : " + x;
    }

    public static void main(String[] args) {
        Angka angka = new Angka();
        System.out.println(angka.hitung());
    }
}
