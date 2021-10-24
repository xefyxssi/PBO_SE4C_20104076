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
public class Tabungan {

    int saldo;

    Tabungan(int saldo) {
        this.saldo = saldo;
    }

    public void ambilUang(int saldo) {
        this.saldo = this.saldo - saldo;
    }
}


