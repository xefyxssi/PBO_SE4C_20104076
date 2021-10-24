/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modul03.tugas;

/**
 *
 * @author Windows 10
 */
public class TugasTabungan {

    public static void main(String args[]) {
        boolean status;
        Tabungan tabungan = new Tabungan(10000);
        System.out.println("Saldo awal : " + tabungan.getSaldo());
        tabungan.simpanUang(8000);
        System.out.println("Jumlah uang yang disimpan : 8000");
        status = tabungan.ambilUang(7000);
        System.out.print("Jumlah uang yang diambil : 7000");
        {
            if (status) {
                System.out.println(" ok");
            } else {
                System.out.println(" gagal");
            }
            tabungan.simpanUang(1000);
            System.out.println("Jumlah uang yang disimpan : 1000");
            status = tabungan.ambilUang(10000);
            System.out.print("Jumlah uang yang diambil : 10000");
            {
                if (status) {
                    System.out.println(" ok");
                } else {
                    System.out.println(" gagal");
                }
            }
            status = tabungan.ambilUang(2500);
            System.out.print("Jumlah uang yang diambil : 2500");
            {
                if (status) {
                    System.out.println(" ok");
                } else {
                    System.out.println(" gagal");
                }
            }
            tabungan.simpanUang(2000);
            System.out.println("Jumlah uang yang disimpan : 2000");
            System.out.println("Saldo sekarang = "
                    + tabungan.getSaldo());
        }
    }
}
