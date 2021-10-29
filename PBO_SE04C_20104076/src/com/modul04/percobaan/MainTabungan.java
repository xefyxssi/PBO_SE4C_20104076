/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modul04.percobaan;

/**
 *
 * @author Windows 10
 */
public class MainTabungan {

    public static void main(String[] args) {
        Tabungan saya = new Tabungan("Barca", 12345);
        Tabungan kamu = new Tabungan("Manu", 12467, 15000, 22222);

        saya.setSaldo(10000);
        saya.setPin(111111);

        System.out.println("Saldo awal saya : " + saya.getSaldo());
        System.out.println("Saldo awal kamu : " + kamu.getSaldo());
        System.out.println("Nomor pin saya : " + saya.getPin());
        System.out.println("Nomor pin kamu : " + kamu.getPin());
    }
}
