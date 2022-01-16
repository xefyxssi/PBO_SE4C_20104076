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
public class Main {

    public static void main(String[] args) {
        Tabungan saya = new Tabungan("Barca", 50410420, 1000000, 12345);
        System.out.println("Nama \t : " + saya.getNama());
        System.out.println("No Rekening \t : " + saya.getNoRekening());
        System.out.println("Saldo \t : " + saya.getSaldo());
        System.out.println("Pin \t : " + saya.getPin());
    }
}
