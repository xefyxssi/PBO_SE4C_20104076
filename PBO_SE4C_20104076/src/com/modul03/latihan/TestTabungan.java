/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modul03.latihan;

/**
 *
 * @author Windows 10
 */
public class TestTabungan {

    public static void main(String[] args) {
        Tabungan t = new Tabungan(5000);
        System.out.println("");
        System.out.println("Saldo awal Tabungan" + t.saldo);
        int jumlah = 15000;
        t.ambilUang(jumlah);
        System.out.println("Jumlah uang yang diambil:15000 ");
        System.out.println("Saldo Tabungan Anda Sekarang adalah" + t.saldo);

    }
}
